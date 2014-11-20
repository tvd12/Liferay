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
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.CalendarUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.liferay.portlet.social.service.persistence.SocialActivityPersistence;

import com.ms.internet.message.NoSuchMSenderException;
import com.ms.internet.message.model.MSMSender;
import com.ms.internet.message.model.impl.MSMSenderImpl;
import com.ms.internet.message.model.impl.MSMSenderModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * The persistence implementation for the m s m sender service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link MSMSenderUtil} to access the m s m sender persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author I Am Dung
 * @see MSMSenderPersistence
 * @see MSMSenderUtil
 * @generated
 */
public class MSMSenderPersistenceImpl extends BasePersistenceImpl<MSMSender>
	implements MSMSenderPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = MSMSenderImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FETCH_BY_MI = new FinderPath(MSMSenderModelImpl.ENTITY_CACHE_ENABLED,
			MSMSenderModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_ENTITY,
			"fetchByMI", new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_COUNT_BY_MI = new FinderPath(MSMSenderModelImpl.ENTITY_CACHE_ENABLED,
			MSMSenderModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByMI", new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_U = new FinderPath(MSMSenderModelImpl.ENTITY_CACHE_ENABLED,
			MSMSenderModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByU",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_U = new FinderPath(MSMSenderModelImpl.ENTITY_CACHE_ENABLED,
			MSMSenderModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByU", new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_U_D = new FinderPath(MSMSenderModelImpl.ENTITY_CACHE_ENABLED,
			MSMSenderModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByU_D",
			new String[] {
				Long.class.getName(), Date.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_U_D = new FinderPath(MSMSenderModelImpl.ENTITY_CACHE_ENABLED,
			MSMSenderModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByU_D",
			new String[] { Long.class.getName(), Date.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(MSMSenderModelImpl.ENTITY_CACHE_ENABLED,
			MSMSenderModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(MSMSenderModelImpl.ENTITY_CACHE_ENABLED,
			MSMSenderModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countAll", new String[0]);

	/**
	 * Caches the m s m sender in the entity cache if it is enabled.
	 *
	 * @param msmSender the m s m sender to cache
	 */
	public void cacheResult(MSMSender msmSender) {
		EntityCacheUtil.putResult(MSMSenderModelImpl.ENTITY_CACHE_ENABLED,
			MSMSenderImpl.class, msmSender.getPrimaryKey(), msmSender);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MI,
			new Object[] { new Long(msmSender.getMessageId()) }, msmSender);
	}

	/**
	 * Caches the m s m senders in the entity cache if it is enabled.
	 *
	 * @param msmSenders the m s m senders to cache
	 */
	public void cacheResult(List<MSMSender> msmSenders) {
		for (MSMSender msmSender : msmSenders) {
			if (EntityCacheUtil.getResult(
						MSMSenderModelImpl.ENTITY_CACHE_ENABLED,
						MSMSenderImpl.class, msmSender.getPrimaryKey(), this) == null) {
				cacheResult(msmSender);
			}
		}
	}

	/**
	 * Clears the cache for all m s m senders.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(MSMSenderImpl.class.getName());
		EntityCacheUtil.clearCache(MSMSenderImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the m s m sender.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(MSMSender msmSender) {
		EntityCacheUtil.removeResult(MSMSenderModelImpl.ENTITY_CACHE_ENABLED,
			MSMSenderImpl.class, msmSender.getPrimaryKey());

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MI,
			new Object[] { new Long(msmSender.getMessageId()) });
	}

	/**
	 * Creates a new m s m sender with the primary key. Does not add the m s m sender to the database.
	 *
	 * @param msmSenderPK the primary key for the new m s m sender
	 * @return the new m s m sender
	 */
	public MSMSender create(MSMSenderPK msmSenderPK) {
		MSMSender msmSender = new MSMSenderImpl();

		msmSender.setNew(true);
		msmSender.setPrimaryKey(msmSenderPK);

		return msmSender;
	}

	/**
	 * Removes the m s m sender with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the m s m sender to remove
	 * @return the m s m sender that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a m s m sender with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public MSMSender remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove((MSMSenderPK)primaryKey);
	}

	/**
	 * Removes the m s m sender with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param msmSenderPK the primary key of the m s m sender to remove
	 * @return the m s m sender that was removed
	 * @throws com.ms.internet.message.NoSuchMSenderException if a m s m sender with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public MSMSender remove(MSMSenderPK msmSenderPK)
		throws NoSuchMSenderException, SystemException {
		Session session = null;

		try {
			session = openSession();

			MSMSender msmSender = (MSMSender)session.get(MSMSenderImpl.class,
					msmSenderPK);

			if (msmSender == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + msmSenderPK);
				}

				throw new NoSuchMSenderException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					msmSenderPK);
			}

			return remove(msmSender);
		}
		catch (NoSuchMSenderException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected MSMSender removeImpl(MSMSender msmSender)
		throws SystemException {
		msmSender = toUnwrappedModel(msmSender);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, msmSender);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		MSMSenderModelImpl msmSenderModelImpl = (MSMSenderModelImpl)msmSender;

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MI,
			new Object[] { new Long(msmSenderModelImpl.getMessageId()) });

		EntityCacheUtil.removeResult(MSMSenderModelImpl.ENTITY_CACHE_ENABLED,
			MSMSenderImpl.class, msmSender.getPrimaryKey());

		return msmSender;
	}

	public MSMSender updateImpl(
		com.ms.internet.message.model.MSMSender msmSender, boolean merge)
		throws SystemException {
		msmSender = toUnwrappedModel(msmSender);

		boolean isNew = msmSender.isNew();

		MSMSenderModelImpl msmSenderModelImpl = (MSMSenderModelImpl)msmSender;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, msmSender, merge);

			msmSender.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(MSMSenderModelImpl.ENTITY_CACHE_ENABLED,
			MSMSenderImpl.class, msmSender.getPrimaryKey(), msmSender);

		if (!isNew &&
				(msmSender.getMessageId() != msmSenderModelImpl.getOriginalMessageId())) {
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MI,
				new Object[] { new Long(msmSenderModelImpl.getOriginalMessageId()) });
		}

		if (isNew ||
				(msmSender.getMessageId() != msmSenderModelImpl.getOriginalMessageId())) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MI,
				new Object[] { new Long(msmSender.getMessageId()) }, msmSender);
		}

		return msmSender;
	}

	protected MSMSender toUnwrappedModel(MSMSender msmSender) {
		if (msmSender instanceof MSMSenderImpl) {
			return msmSender;
		}

		MSMSenderImpl msmSenderImpl = new MSMSenderImpl();

		msmSenderImpl.setNew(msmSender.isNew());
		msmSenderImpl.setPrimaryKey(msmSender.getPrimaryKey());

		msmSenderImpl.setUserId(msmSender.getUserId());
		msmSenderImpl.setMessageId(msmSender.getMessageId());
		msmSenderImpl.setDateSend(msmSender.getDateSend());

		return msmSenderImpl;
	}

	/**
	 * Finds the m s m sender with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the m s m sender to find
	 * @return the m s m sender
	 * @throws com.liferay.portal.NoSuchModelException if a m s m sender with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public MSMSender findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((MSMSenderPK)primaryKey);
	}

	/**
	 * Finds the m s m sender with the primary key or throws a {@link com.ms.internet.message.NoSuchMSenderException} if it could not be found.
	 *
	 * @param msmSenderPK the primary key of the m s m sender to find
	 * @return the m s m sender
	 * @throws com.ms.internet.message.NoSuchMSenderException if a m s m sender with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public MSMSender findByPrimaryKey(MSMSenderPK msmSenderPK)
		throws NoSuchMSenderException, SystemException {
		MSMSender msmSender = fetchByPrimaryKey(msmSenderPK);

		if (msmSender == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + msmSenderPK);
			}

			throw new NoSuchMSenderException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				msmSenderPK);
		}

		return msmSender;
	}

	/**
	 * Finds the m s m sender with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the m s m sender to find
	 * @return the m s m sender, or <code>null</code> if a m s m sender with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public MSMSender fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((MSMSenderPK)primaryKey);
	}

	/**
	 * Finds the m s m sender with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param msmSenderPK the primary key of the m s m sender to find
	 * @return the m s m sender, or <code>null</code> if a m s m sender with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public MSMSender fetchByPrimaryKey(MSMSenderPK msmSenderPK)
		throws SystemException {
		MSMSender msmSender = (MSMSender)EntityCacheUtil.getResult(MSMSenderModelImpl.ENTITY_CACHE_ENABLED,
				MSMSenderImpl.class, msmSenderPK, this);

		if (msmSender == null) {
			Session session = null;

			try {
				session = openSession();

				msmSender = (MSMSender)session.get(MSMSenderImpl.class,
						msmSenderPK);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (msmSender != null) {
					cacheResult(msmSender);
				}

				closeSession(session);
			}
		}

		return msmSender;
	}

	/**
	 * Finds the m s m sender where messageId = &#63; or throws a {@link com.ms.internet.message.NoSuchMSenderException} if it could not be found.
	 *
	 * @param messageId the message id to search with
	 * @return the matching m s m sender
	 * @throws com.ms.internet.message.NoSuchMSenderException if a matching m s m sender could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public MSMSender findByMI(long messageId)
		throws NoSuchMSenderException, SystemException {
		MSMSender msmSender = fetchByMI(messageId);

		if (msmSender == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("messageId=");
			msg.append(messageId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchMSenderException(msg.toString());
		}

		return msmSender;
	}

	/**
	 * Finds the m s m sender where messageId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param messageId the message id to search with
	 * @return the matching m s m sender, or <code>null</code> if a matching m s m sender could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public MSMSender fetchByMI(long messageId) throws SystemException {
		return fetchByMI(messageId, true);
	}

	/**
	 * Finds the m s m sender where messageId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param messageId the message id to search with
	 * @return the matching m s m sender, or <code>null</code> if a matching m s m sender could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public MSMSender fetchByMI(long messageId, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { messageId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_MI,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_SELECT_MSMSENDER_WHERE);

			query.append(_FINDER_COLUMN_MI_MESSAGEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(messageId);

				List<MSMSender> list = q.list();

				result = list;

				MSMSender msmSender = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MI,
						finderArgs, list);
				}
				else {
					msmSender = list.get(0);

					cacheResult(msmSender);

					if ((msmSender.getMessageId() != messageId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MI,
							finderArgs, msmSender);
					}
				}

				return msmSender;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MI,
						finderArgs);
				}

				closeSession(session);
			}
		}
		else {
			if (result instanceof List<?>) {
				return null;
			}
			else {
				return (MSMSender)result;
			}
		}
	}

	/**
	 * Finds all the m s m senders where userId = &#63;.
	 *
	 * @param userId the user id to search with
	 * @return the matching m s m senders
	 * @throws SystemException if a system exception occurred
	 */
	public List<MSMSender> findByU(long userId) throws SystemException {
		return findByU(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the m s m senders where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param userId the user id to search with
	 * @param start the lower bound of the range of m s m senders to return
	 * @param end the upper bound of the range of m s m senders to return (not inclusive)
	 * @return the range of matching m s m senders
	 * @throws SystemException if a system exception occurred
	 */
	public List<MSMSender> findByU(long userId, int start, int end)
		throws SystemException {
		return findByU(userId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the m s m senders where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param userId the user id to search with
	 * @param start the lower bound of the range of m s m senders to return
	 * @param end the upper bound of the range of m s m senders to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching m s m senders
	 * @throws SystemException if a system exception occurred
	 */
	public List<MSMSender> findByU(long userId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				userId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<MSMSender> list = (List<MSMSender>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_U,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(2);
			}

			query.append(_SQL_SELECT_MSMSENDER_WHERE);

			query.append(_FINDER_COLUMN_U_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				list = (List<MSMSender>)QueryUtil.list(q, getDialect(), start,
						end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_U,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_U,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first m s m sender in the ordered set where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param userId the user id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching m s m sender
	 * @throws com.ms.internet.message.NoSuchMSenderException if a matching m s m sender could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public MSMSender findByU_First(long userId,
		OrderByComparator orderByComparator)
		throws NoSuchMSenderException, SystemException {
		List<MSMSender> list = findByU(userId, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("userId=");
			msg.append(userId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchMSenderException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last m s m sender in the ordered set where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param userId the user id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching m s m sender
	 * @throws com.ms.internet.message.NoSuchMSenderException if a matching m s m sender could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public MSMSender findByU_Last(long userId,
		OrderByComparator orderByComparator)
		throws NoSuchMSenderException, SystemException {
		int count = countByU(userId);

		List<MSMSender> list = findByU(userId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("userId=");
			msg.append(userId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchMSenderException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the m s m senders before and after the current m s m sender in the ordered set where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param msmSenderPK the primary key of the current m s m sender
	 * @param userId the user id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next m s m sender
	 * @throws com.ms.internet.message.NoSuchMSenderException if a m s m sender with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public MSMSender[] findByU_PrevAndNext(MSMSenderPK msmSenderPK,
		long userId, OrderByComparator orderByComparator)
		throws NoSuchMSenderException, SystemException {
		MSMSender msmSender = findByPrimaryKey(msmSenderPK);

		Session session = null;

		try {
			session = openSession();

			MSMSender[] array = new MSMSenderImpl[3];

			array[0] = getByU_PrevAndNext(session, msmSender, userId,
					orderByComparator, true);

			array[1] = msmSender;

			array[2] = getByU_PrevAndNext(session, msmSender, userId,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected MSMSender getByU_PrevAndNext(Session session,
		MSMSender msmSender, long userId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MSMSENDER_WHERE);

		query.append(_FINDER_COLUMN_U_USERID_2);

		if (orderByComparator != null) {
			String[] orderByFields = orderByComparator.getOrderByFields();

			if (orderByFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(msmSender);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MSMSender> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the m s m senders where userId = &#63; and dateSend = &#63;.
	 *
	 * @param userId the user id to search with
	 * @param dateSend the date send to search with
	 * @return the matching m s m senders
	 * @throws SystemException if a system exception occurred
	 */
	public List<MSMSender> findByU_D(long userId, Date dateSend)
		throws SystemException {
		return findByU_D(userId, dateSend, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the m s m senders where userId = &#63; and dateSend = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param userId the user id to search with
	 * @param dateSend the date send to search with
	 * @param start the lower bound of the range of m s m senders to return
	 * @param end the upper bound of the range of m s m senders to return (not inclusive)
	 * @return the range of matching m s m senders
	 * @throws SystemException if a system exception occurred
	 */
	public List<MSMSender> findByU_D(long userId, Date dateSend, int start,
		int end) throws SystemException {
		return findByU_D(userId, dateSend, start, end, null);
	}

	/**
	 * Finds an ordered range of all the m s m senders where userId = &#63; and dateSend = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param userId the user id to search with
	 * @param dateSend the date send to search with
	 * @param start the lower bound of the range of m s m senders to return
	 * @param end the upper bound of the range of m s m senders to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching m s m senders
	 * @throws SystemException if a system exception occurred
	 */
	public List<MSMSender> findByU_D(long userId, Date dateSend, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				userId, dateSend,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<MSMSender> list = (List<MSMSender>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_U_D,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_MSMSENDER_WHERE);

			query.append(_FINDER_COLUMN_U_D_USERID_2);

			if (dateSend == null) {
				query.append(_FINDER_COLUMN_U_D_DATESEND_1);
			}
			else {
				query.append(_FINDER_COLUMN_U_D_DATESEND_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				if (dateSend != null) {
					qPos.add(CalendarUtil.getTimestamp(dateSend));
				}

				list = (List<MSMSender>)QueryUtil.list(q, getDialect(), start,
						end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_U_D,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_U_D,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first m s m sender in the ordered set where userId = &#63; and dateSend = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param userId the user id to search with
	 * @param dateSend the date send to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching m s m sender
	 * @throws com.ms.internet.message.NoSuchMSenderException if a matching m s m sender could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public MSMSender findByU_D_First(long userId, Date dateSend,
		OrderByComparator orderByComparator)
		throws NoSuchMSenderException, SystemException {
		List<MSMSender> list = findByU_D(userId, dateSend, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("userId=");
			msg.append(userId);

			msg.append(", dateSend=");
			msg.append(dateSend);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchMSenderException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last m s m sender in the ordered set where userId = &#63; and dateSend = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param userId the user id to search with
	 * @param dateSend the date send to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching m s m sender
	 * @throws com.ms.internet.message.NoSuchMSenderException if a matching m s m sender could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public MSMSender findByU_D_Last(long userId, Date dateSend,
		OrderByComparator orderByComparator)
		throws NoSuchMSenderException, SystemException {
		int count = countByU_D(userId, dateSend);

		List<MSMSender> list = findByU_D(userId, dateSend, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("userId=");
			msg.append(userId);

			msg.append(", dateSend=");
			msg.append(dateSend);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchMSenderException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the m s m senders before and after the current m s m sender in the ordered set where userId = &#63; and dateSend = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param msmSenderPK the primary key of the current m s m sender
	 * @param userId the user id to search with
	 * @param dateSend the date send to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next m s m sender
	 * @throws com.ms.internet.message.NoSuchMSenderException if a m s m sender with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public MSMSender[] findByU_D_PrevAndNext(MSMSenderPK msmSenderPK,
		long userId, Date dateSend, OrderByComparator orderByComparator)
		throws NoSuchMSenderException, SystemException {
		MSMSender msmSender = findByPrimaryKey(msmSenderPK);

		Session session = null;

		try {
			session = openSession();

			MSMSender[] array = new MSMSenderImpl[3];

			array[0] = getByU_D_PrevAndNext(session, msmSender, userId,
					dateSend, orderByComparator, true);

			array[1] = msmSender;

			array[2] = getByU_D_PrevAndNext(session, msmSender, userId,
					dateSend, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected MSMSender getByU_D_PrevAndNext(Session session,
		MSMSender msmSender, long userId, Date dateSend,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MSMSENDER_WHERE);

		query.append(_FINDER_COLUMN_U_D_USERID_2);

		if (dateSend == null) {
			query.append(_FINDER_COLUMN_U_D_DATESEND_1);
		}
		else {
			query.append(_FINDER_COLUMN_U_D_DATESEND_2);
		}

		if (orderByComparator != null) {
			String[] orderByFields = orderByComparator.getOrderByFields();

			if (orderByFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId);

		if (dateSend != null) {
			qPos.add(CalendarUtil.getTimestamp(dateSend));
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(msmSender);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MSMSender> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the m s m senders.
	 *
	 * @return the m s m senders
	 * @throws SystemException if a system exception occurred
	 */
	public List<MSMSender> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the m s m senders.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of m s m senders to return
	 * @param end the upper bound of the range of m s m senders to return (not inclusive)
	 * @return the range of m s m senders
	 * @throws SystemException if a system exception occurred
	 */
	public List<MSMSender> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the m s m senders.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of m s m senders to return
	 * @param end the upper bound of the range of m s m senders to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of m s m senders
	 * @throws SystemException if a system exception occurred
	 */
	public List<MSMSender> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<MSMSender> list = (List<MSMSender>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_MSMSENDER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_MSMSENDER;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<MSMSender>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<MSMSender>)QueryUtil.list(q, getDialect(),
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
	 * Removes the m s m sender where messageId = &#63; from the database.
	 *
	 * @param messageId the message id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByMI(long messageId)
		throws NoSuchMSenderException, SystemException {
		MSMSender msmSender = findByMI(messageId);

		remove(msmSender);
	}

	/**
	 * Removes all the m s m senders where userId = &#63; from the database.
	 *
	 * @param userId the user id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByU(long userId) throws SystemException {
		for (MSMSender msmSender : findByU(userId)) {
			remove(msmSender);
		}
	}

	/**
	 * Removes all the m s m senders where userId = &#63; and dateSend = &#63; from the database.
	 *
	 * @param userId the user id to search with
	 * @param dateSend the date send to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByU_D(long userId, Date dateSend)
		throws SystemException {
		for (MSMSender msmSender : findByU_D(userId, dateSend)) {
			remove(msmSender);
		}
	}

	/**
	 * Removes all the m s m senders from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (MSMSender msmSender : findAll()) {
			remove(msmSender);
		}
	}

	/**
	 * Counts all the m s m senders where messageId = &#63;.
	 *
	 * @param messageId the message id to search with
	 * @return the number of matching m s m senders
	 * @throws SystemException if a system exception occurred
	 */
	public int countByMI(long messageId) throws SystemException {
		Object[] finderArgs = new Object[] { messageId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_MI,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_MSMSENDER_WHERE);

			query.append(_FINDER_COLUMN_MI_MESSAGEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(messageId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MI, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the m s m senders where userId = &#63;.
	 *
	 * @param userId the user id to search with
	 * @return the number of matching m s m senders
	 * @throws SystemException if a system exception occurred
	 */
	public int countByU(long userId) throws SystemException {
		Object[] finderArgs = new Object[] { userId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_U,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_MSMSENDER_WHERE);

			query.append(_FINDER_COLUMN_U_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_U, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the m s m senders where userId = &#63; and dateSend = &#63;.
	 *
	 * @param userId the user id to search with
	 * @param dateSend the date send to search with
	 * @return the number of matching m s m senders
	 * @throws SystemException if a system exception occurred
	 */
	public int countByU_D(long userId, Date dateSend) throws SystemException {
		Object[] finderArgs = new Object[] { userId, dateSend };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_U_D,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_MSMSENDER_WHERE);

			query.append(_FINDER_COLUMN_U_D_USERID_2);

			if (dateSend == null) {
				query.append(_FINDER_COLUMN_U_D_DATESEND_1);
			}
			else {
				query.append(_FINDER_COLUMN_U_D_DATESEND_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				if (dateSend != null) {
					qPos.add(CalendarUtil.getTimestamp(dateSend));
				}

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_U_D, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the m s m senders.
	 *
	 * @return the number of m s m senders
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

				Query q = session.createQuery(_SQL_COUNT_MSMSENDER);

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
	 * Initializes the m s m sender persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ms.internet.message.model.MSMSender")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<MSMSender>> listenersList = new ArrayList<ModelListener<MSMSender>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<MSMSender>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(MSMSenderImpl.class.getName());
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
	@BeanReference(type = SocialActivityPersistence.class)
	protected SocialActivityPersistence socialActivityPersistence;
	private static final String _SQL_SELECT_MSMSENDER = "SELECT msmSender FROM MSMSender msmSender";
	private static final String _SQL_SELECT_MSMSENDER_WHERE = "SELECT msmSender FROM MSMSender msmSender WHERE ";
	private static final String _SQL_COUNT_MSMSENDER = "SELECT COUNT(msmSender) FROM MSMSender msmSender";
	private static final String _SQL_COUNT_MSMSENDER_WHERE = "SELECT COUNT(msmSender) FROM MSMSender msmSender WHERE ";
	private static final String _FINDER_COLUMN_MI_MESSAGEID_2 = "msmSender.id.messageId = ?";
	private static final String _FINDER_COLUMN_U_USERID_2 = "msmSender.id.userId = ?";
	private static final String _FINDER_COLUMN_U_D_USERID_2 = "msmSender.id.userId = ? AND ";
	private static final String _FINDER_COLUMN_U_D_DATESEND_1 = "msmSender.dateSend IS NULL";
	private static final String _FINDER_COLUMN_U_D_DATESEND_2 = "msmSender.dateSend = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "msmSender.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No MSMSender exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No MSMSender exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(MSMSenderPersistenceImpl.class);
}