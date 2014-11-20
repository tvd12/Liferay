/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.ms.internet.message.service.persistence;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.annotation.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.ms.internet.message.NoSuchMessageException;
import com.ms.internet.message.model.MSMessage;
import com.ms.internet.message.model.impl.MSMessageImpl;
import com.ms.internet.message.model.impl.MSMessageModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the m s message service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link MSMessageUtil} to access the m s message persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author I Am Dung
 * @see MSMessagePersistence
 * @see MSMessageUtil
 * @generated
 */
public class MSMessagePersistenceImpl extends BasePersistenceImpl<MSMessage>
	implements MSMessagePersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = MSMessageImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(MSMessageModelImpl.ENTITY_CACHE_ENABLED,
			MSMessageModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(MSMessageModelImpl.ENTITY_CACHE_ENABLED,
			MSMessageModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countAll", new String[0]);

	/**
	 * Caches the m s message in the entity cache if it is enabled.
	 *
	 * @param msMessage the m s message to cache
	 */
	public void cacheResult(MSMessage msMessage) {
		EntityCacheUtil.putResult(MSMessageModelImpl.ENTITY_CACHE_ENABLED,
			MSMessageImpl.class, msMessage.getPrimaryKey(), msMessage);
	}

	/**
	 * Caches the m s messages in the entity cache if it is enabled.
	 *
	 * @param msMessages the m s messages to cache
	 */
	public void cacheResult(List<MSMessage> msMessages) {
		for (MSMessage msMessage : msMessages) {
			if (EntityCacheUtil.getResult(
						MSMessageModelImpl.ENTITY_CACHE_ENABLED,
						MSMessageImpl.class, msMessage.getPrimaryKey(), this) == null) {
				cacheResult(msMessage);
			}
		}
	}

	/**
	 * Clears the cache for all m s messages.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(MSMessageImpl.class.getName());
		EntityCacheUtil.clearCache(MSMessageImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the m s message.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(MSMessage msMessage) {
		EntityCacheUtil.removeResult(MSMessageModelImpl.ENTITY_CACHE_ENABLED,
			MSMessageImpl.class, msMessage.getPrimaryKey());
	}

	/**
	 * Creates a new m s message with the primary key. Does not add the m s message to the database.
	 *
	 * @param messageId the primary key for the new m s message
	 * @return the new m s message
	 */
	public MSMessage create(long messageId) {
		MSMessage msMessage = new MSMessageImpl();

		msMessage.setNew(true);
		msMessage.setPrimaryKey(messageId);

		return msMessage;
	}

	/**
	 * Removes the m s message with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the m s message to remove
	 * @return the m s message that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a m s message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public MSMessage remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Long)primaryKey).longValue());
	}

	/**
	 * Removes the m s message with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param messageId the primary key of the m s message to remove
	 * @return the m s message that was removed
	 * @throws com.ms.internet.message.NoSuchMessageException if a m s message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public MSMessage remove(long messageId)
		throws NoSuchMessageException, SystemException {
		Session session = null;

		try {
			session = openSession();

			MSMessage msMessage = (MSMessage)session.get(MSMessageImpl.class,
					new Long(messageId));

			if (msMessage == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + messageId);
				}

				throw new NoSuchMessageException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					messageId);
			}

			return remove(msMessage);
		}
		catch (NoSuchMessageException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected MSMessage removeImpl(MSMessage msMessage)
		throws SystemException {
		msMessage = toUnwrappedModel(msMessage);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, msMessage);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.removeResult(MSMessageModelImpl.ENTITY_CACHE_ENABLED,
			MSMessageImpl.class, msMessage.getPrimaryKey());

		return msMessage;
	}

	public MSMessage updateImpl(
		com.ms.internet.message.model.MSMessage msMessage, boolean merge)
		throws SystemException {
		msMessage = toUnwrappedModel(msMessage);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, msMessage, merge);

			msMessage.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(MSMessageModelImpl.ENTITY_CACHE_ENABLED,
			MSMessageImpl.class, msMessage.getPrimaryKey(), msMessage);

		return msMessage;
	}

	protected MSMessage toUnwrappedModel(MSMessage msMessage) {
		if (msMessage instanceof MSMessageImpl) {
			return msMessage;
		}

		MSMessageImpl msMessageImpl = new MSMessageImpl();

		msMessageImpl.setNew(msMessage.isNew());
		msMessageImpl.setPrimaryKey(msMessage.getPrimaryKey());

		msMessageImpl.setMessageId(msMessage.getMessageId());
		msMessageImpl.setMessage(msMessage.getMessage());
		msMessageImpl.setDateCreated(msMessage.getDateCreated());

		return msMessageImpl;
	}

	/**
	 * Finds the m s message with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the m s message to find
	 * @return the m s message
	 * @throws com.liferay.portal.NoSuchModelException if a m s message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public MSMessage findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the m s message with the primary key or throws a {@link com.ms.internet.message.NoSuchMessageException} if it could not be found.
	 *
	 * @param messageId the primary key of the m s message to find
	 * @return the m s message
	 * @throws com.ms.internet.message.NoSuchMessageException if a m s message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public MSMessage findByPrimaryKey(long messageId)
		throws NoSuchMessageException, SystemException {
		MSMessage msMessage = fetchByPrimaryKey(messageId);

		if (msMessage == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + messageId);
			}

			throw new NoSuchMessageException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				messageId);
		}

		return msMessage;
	}

	/**
	 * Finds the m s message with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the m s message to find
	 * @return the m s message, or <code>null</code> if a m s message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public MSMessage fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the m s message with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param messageId the primary key of the m s message to find
	 * @return the m s message, or <code>null</code> if a m s message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public MSMessage fetchByPrimaryKey(long messageId)
		throws SystemException {
		MSMessage msMessage = (MSMessage)EntityCacheUtil.getResult(MSMessageModelImpl.ENTITY_CACHE_ENABLED,
				MSMessageImpl.class, messageId, this);

		if (msMessage == null) {
			Session session = null;

			try {
				session = openSession();

				msMessage = (MSMessage)session.get(MSMessageImpl.class,
						new Long(messageId));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (msMessage != null) {
					cacheResult(msMessage);
				}

				closeSession(session);
			}
		}

		return msMessage;
	}

	/**
	 * Finds all the m s messages.
	 *
	 * @return the m s messages
	 * @throws SystemException if a system exception occurred
	 */
	public List<MSMessage> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the m s messages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of m s messages to return
	 * @param end the upper bound of the range of m s messages to return (not inclusive)
	 * @return the range of m s messages
	 * @throws SystemException if a system exception occurred
	 */
	public List<MSMessage> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the m s messages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of m s messages to return
	 * @param end the upper bound of the range of m s messages to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of m s messages
	 * @throws SystemException if a system exception occurred
	 */
	public List<MSMessage> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<MSMessage> list = (List<MSMessage>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_MSMESSAGE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_MSMESSAGE;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<MSMessage>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<MSMessage>)QueryUtil.list(q, getDialect(),
							start, end);
				}
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_ALL,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_ALL, finderArgs,
						list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the m s messages from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (MSMessage msMessage : findAll()) {
			remove(msMessage);
		}
	}

	/**
	 * Counts all the m s messages.
	 *
	 * @return the number of m s messages
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Object[] finderArgs = new Object[0];

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_MSMESSAGE);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the m s message persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ms.internet.message.model.MSMessage")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<MSMessage>> listenersList = new ArrayList<ModelListener<MSMessage>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<MSMessage>)InstanceFactory.newInstance(
							listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(MSMessageImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST);
	}

	@BeanReference(type = MSMessagePersistence.class)
	protected MSMessagePersistence msMessagePersistence;
	@BeanReference(type = MSMSenderPersistence.class)
	protected MSMSenderPersistence msmSenderPersistence;
	@BeanReference(type = MSMReceiverPersistence.class)
	protected MSMReceiverPersistence msmReceiverPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_MSMESSAGE = "SELECT msMessage FROM MSMessage msMessage";
	private static final String _SQL_COUNT_MSMESSAGE = "SELECT COUNT(msMessage) FROM MSMessage msMessage";
	private static final String _ORDER_BY_ENTITY_ALIAS = "msMessage.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No MSMessage exists with the primary key ";
	private static Log _log = LogFactoryUtil.getLog(MSMessagePersistenceImpl.class);
}