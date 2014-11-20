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

package org.tvd.thptty.service.persistence;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.annotation.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.security.permission.InlineSQLHelperUtil;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import org.tvd.thptty.NoSuchMessagesException;
import org.tvd.thptty.model.TYMessages;
import org.tvd.thptty.model.impl.TYMessagesImpl;
import org.tvd.thptty.model.impl.TYMessagesModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the t y messages service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link TYMessagesUtil} to access the t y messages persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ta Van Dung
 * @see TYMessagesPersistence
 * @see TYMessagesUtil
 * @generated
 */
public class TYMessagesPersistenceImpl extends BasePersistenceImpl<TYMessages>
	implements TYMessagesPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = TYMessagesImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_C_G = new FinderPath(TYMessagesModelImpl.ENTITY_CACHE_ENABLED,
			TYMessagesModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByC_G",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_C_G = new FinderPath(TYMessagesModelImpl.ENTITY_CACHE_ENABLED,
			TYMessagesModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByC_G",
			new String[] { Long.class.getName(), Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(TYMessagesModelImpl.ENTITY_CACHE_ENABLED,
			TYMessagesModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TYMessagesModelImpl.ENTITY_CACHE_ENABLED,
			TYMessagesModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countAll", new String[0]);

	/**
	 * Caches the t y messages in the entity cache if it is enabled.
	 *
	 * @param tyMessages the t y messages to cache
	 */
	public void cacheResult(TYMessages tyMessages) {
		EntityCacheUtil.putResult(TYMessagesModelImpl.ENTITY_CACHE_ENABLED,
			TYMessagesImpl.class, tyMessages.getPrimaryKey(), tyMessages);
	}

	/**
	 * Caches the t y messageses in the entity cache if it is enabled.
	 *
	 * @param tyMessageses the t y messageses to cache
	 */
	public void cacheResult(List<TYMessages> tyMessageses) {
		for (TYMessages tyMessages : tyMessageses) {
			if (EntityCacheUtil.getResult(
						TYMessagesModelImpl.ENTITY_CACHE_ENABLED,
						TYMessagesImpl.class, tyMessages.getPrimaryKey(), this) == null) {
				cacheResult(tyMessages);
			}
		}
	}

	/**
	 * Clears the cache for all t y messageses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(TYMessagesImpl.class.getName());
		EntityCacheUtil.clearCache(TYMessagesImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the t y messages.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(TYMessages tyMessages) {
		EntityCacheUtil.removeResult(TYMessagesModelImpl.ENTITY_CACHE_ENABLED,
			TYMessagesImpl.class, tyMessages.getPrimaryKey());
	}

	/**
	 * Creates a new t y messages with the primary key. Does not add the t y messages to the database.
	 *
	 * @param messageId the primary key for the new t y messages
	 * @return the new t y messages
	 */
	public TYMessages create(long messageId) {
		TYMessages tyMessages = new TYMessagesImpl();

		tyMessages.setNew(true);
		tyMessages.setPrimaryKey(messageId);

		return tyMessages;
	}

	/**
	 * Removes the t y messages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the t y messages to remove
	 * @return the t y messages that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a t y messages with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYMessages remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Long)primaryKey).longValue());
	}

	/**
	 * Removes the t y messages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param messageId the primary key of the t y messages to remove
	 * @return the t y messages that was removed
	 * @throws org.tvd.thptty.NoSuchMessagesException if a t y messages with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYMessages remove(long messageId)
		throws NoSuchMessagesException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TYMessages tyMessages = (TYMessages)session.get(TYMessagesImpl.class,
					new Long(messageId));

			if (tyMessages == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + messageId);
				}

				throw new NoSuchMessagesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					messageId);
			}

			return remove(tyMessages);
		}
		catch (NoSuchMessagesException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TYMessages removeImpl(TYMessages tyMessages)
		throws SystemException {
		tyMessages = toUnwrappedModel(tyMessages);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, tyMessages);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.removeResult(TYMessagesModelImpl.ENTITY_CACHE_ENABLED,
			TYMessagesImpl.class, tyMessages.getPrimaryKey());

		return tyMessages;
	}

	public TYMessages updateImpl(org.tvd.thptty.model.TYMessages tyMessages,
		boolean merge) throws SystemException {
		tyMessages = toUnwrappedModel(tyMessages);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, tyMessages, merge);

			tyMessages.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(TYMessagesModelImpl.ENTITY_CACHE_ENABLED,
			TYMessagesImpl.class, tyMessages.getPrimaryKey(), tyMessages);

		return tyMessages;
	}

	protected TYMessages toUnwrappedModel(TYMessages tyMessages) {
		if (tyMessages instanceof TYMessagesImpl) {
			return tyMessages;
		}

		TYMessagesImpl tyMessagesImpl = new TYMessagesImpl();

		tyMessagesImpl.setNew(tyMessages.isNew());
		tyMessagesImpl.setPrimaryKey(tyMessages.getPrimaryKey());

		tyMessagesImpl.setMessageId(tyMessages.getMessageId());
		tyMessagesImpl.setCompanyId(tyMessages.getCompanyId());
		tyMessagesImpl.setGroupId(tyMessages.getGroupId());
		tyMessagesImpl.setActionId(tyMessages.getActionId());
		tyMessagesImpl.setUserId(tyMessages.getUserId());
		tyMessagesImpl.setClassId(tyMessages.getClassId());
		tyMessagesImpl.setSubjectId(tyMessages.getSubjectId());
		tyMessagesImpl.setHappenDate(tyMessages.getHappenDate());

		return tyMessagesImpl;
	}

	/**
	 * Finds the t y messages with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the t y messages to find
	 * @return the t y messages
	 * @throws com.liferay.portal.NoSuchModelException if a t y messages with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYMessages findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the t y messages with the primary key or throws a {@link org.tvd.thptty.NoSuchMessagesException} if it could not be found.
	 *
	 * @param messageId the primary key of the t y messages to find
	 * @return the t y messages
	 * @throws org.tvd.thptty.NoSuchMessagesException if a t y messages with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYMessages findByPrimaryKey(long messageId)
		throws NoSuchMessagesException, SystemException {
		TYMessages tyMessages = fetchByPrimaryKey(messageId);

		if (tyMessages == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + messageId);
			}

			throw new NoSuchMessagesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				messageId);
		}

		return tyMessages;
	}

	/**
	 * Finds the t y messages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the t y messages to find
	 * @return the t y messages, or <code>null</code> if a t y messages with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYMessages fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the t y messages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param messageId the primary key of the t y messages to find
	 * @return the t y messages, or <code>null</code> if a t y messages with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYMessages fetchByPrimaryKey(long messageId)
		throws SystemException {
		TYMessages tyMessages = (TYMessages)EntityCacheUtil.getResult(TYMessagesModelImpl.ENTITY_CACHE_ENABLED,
				TYMessagesImpl.class, messageId, this);

		if (tyMessages == null) {
			Session session = null;

			try {
				session = openSession();

				tyMessages = (TYMessages)session.get(TYMessagesImpl.class,
						new Long(messageId));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (tyMessages != null) {
					cacheResult(tyMessages);
				}

				closeSession(session);
			}
		}

		return tyMessages;
	}

	/**
	 * Finds all the t y messageses where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @return the matching t y messageses
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYMessages> findByC_G(long companyId, long groupId)
		throws SystemException {
		return findByC_G(companyId, groupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the t y messageses where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of t y messageses to return
	 * @param end the upper bound of the range of t y messageses to return (not inclusive)
	 * @return the range of matching t y messageses
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYMessages> findByC_G(long companyId, long groupId, int start,
		int end) throws SystemException {
		return findByC_G(companyId, groupId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the t y messageses where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of t y messageses to return
	 * @param end the upper bound of the range of t y messageses to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching t y messageses
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYMessages> findByC_G(long companyId, long groupId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				companyId, groupId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<TYMessages> list = (List<TYMessages>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_C_G,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_TYMESSAGES_WHERE);

			query.append(_FINDER_COLUMN_C_G_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_G_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(TYMessagesModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				list = (List<TYMessages>)QueryUtil.list(q, getDialect(), start,
						end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_C_G,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_C_G,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first t y messages in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching t y messages
	 * @throws org.tvd.thptty.NoSuchMessagesException if a matching t y messages could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYMessages findByC_G_First(long companyId, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchMessagesException, SystemException {
		List<TYMessages> list = findByC_G(companyId, groupId, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchMessagesException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last t y messages in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching t y messages
	 * @throws org.tvd.thptty.NoSuchMessagesException if a matching t y messages could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYMessages findByC_G_Last(long companyId, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchMessagesException, SystemException {
		int count = countByC_G(companyId, groupId);

		List<TYMessages> list = findByC_G(companyId, groupId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchMessagesException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the t y messageses before and after the current t y messages in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param messageId the primary key of the current t y messages
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next t y messages
	 * @throws org.tvd.thptty.NoSuchMessagesException if a t y messages with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYMessages[] findByC_G_PrevAndNext(long messageId, long companyId,
		long groupId, OrderByComparator orderByComparator)
		throws NoSuchMessagesException, SystemException {
		TYMessages tyMessages = findByPrimaryKey(messageId);

		Session session = null;

		try {
			session = openSession();

			TYMessages[] array = new TYMessagesImpl[3];

			array[0] = getByC_G_PrevAndNext(session, tyMessages, companyId,
					groupId, orderByComparator, true);

			array[1] = tyMessages;

			array[2] = getByC_G_PrevAndNext(session, tyMessages, companyId,
					groupId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TYMessages getByC_G_PrevAndNext(Session session,
		TYMessages tyMessages, long companyId, long groupId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TYMESSAGES_WHERE);

		query.append(_FINDER_COLUMN_C_G_COMPANYID_2);

		query.append(_FINDER_COLUMN_C_G_GROUPID_2);

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

		else {
			query.append(TYMessagesModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(tyMessages);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TYMessages> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Filters by the user's permissions and finds all the t y messageses where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @return the matching t y messageses that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYMessages> filterFindByC_G(long companyId, long groupId)
		throws SystemException {
		return filterFindByC_G(companyId, groupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Filters by the user's permissions and finds a range of all the t y messageses where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of t y messageses to return
	 * @param end the upper bound of the range of t y messageses to return (not inclusive)
	 * @return the range of matching t y messageses that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYMessages> filterFindByC_G(long companyId, long groupId,
		int start, int end) throws SystemException {
		return filterFindByC_G(companyId, groupId, start, end, null);
	}

	/**
	 * Filters by the user's permissions and finds an ordered range of all the t y messageses where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of t y messageses to return
	 * @param end the upper bound of the range of t y messageses to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching t y messageses that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYMessages> filterFindByC_G(long companyId, long groupId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return findByC_G(companyId, groupId, start, end, orderByComparator);
		}

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		if (getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_TYMESSAGES_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_TYMESSAGES_NO_INLINE_DISTINCT_WHERE_1);
		}

		query.append(_FINDER_COLUMN_C_G_COMPANYID_2);

		query.append(_FINDER_COLUMN_C_G_GROUPID_2);

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_TYMESSAGES_NO_INLINE_DISTINCT_WHERE_2);
		}

		if (orderByComparator != null) {
			if (getDB().isSupportsInlineDistinct()) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_TABLE,
					orderByComparator);
			}
		}

		else {
			if (getDB().isSupportsInlineDistinct()) {
				query.append(TYMessagesModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(TYMessagesModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				TYMessages.class.getName(), _FILTER_COLUMN_PK,
				_FILTER_COLUMN_USERID, groupId);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			if (getDB().isSupportsInlineDistinct()) {
				q.addEntity(_FILTER_ENTITY_ALIAS, TYMessagesImpl.class);
			}
			else {
				q.addEntity(_FILTER_ENTITY_TABLE, TYMessagesImpl.class);
			}

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(companyId);

			qPos.add(groupId);

			return (List<TYMessages>)QueryUtil.list(q, getDialect(), start, end);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	/**
	 * Finds all the t y messageses.
	 *
	 * @return the t y messageses
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYMessages> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the t y messageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of t y messageses to return
	 * @param end the upper bound of the range of t y messageses to return (not inclusive)
	 * @return the range of t y messageses
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYMessages> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the t y messageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of t y messageses to return
	 * @param end the upper bound of the range of t y messageses to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of t y messageses
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYMessages> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<TYMessages> list = (List<TYMessages>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TYMESSAGES);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TYMESSAGES.concat(TYMessagesModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<TYMessages>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<TYMessages>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the t y messageses where companyId = &#63; and groupId = &#63; from the database.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByC_G(long companyId, long groupId)
		throws SystemException {
		for (TYMessages tyMessages : findByC_G(companyId, groupId)) {
			remove(tyMessages);
		}
	}

	/**
	 * Removes all the t y messageses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (TYMessages tyMessages : findAll()) {
			remove(tyMessages);
		}
	}

	/**
	 * Counts all the t y messageses where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @return the number of matching t y messageses
	 * @throws SystemException if a system exception occurred
	 */
	public int countByC_G(long companyId, long groupId)
		throws SystemException {
		Object[] finderArgs = new Object[] { companyId, groupId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_C_G,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TYMESSAGES_WHERE);

			query.append(_FINDER_COLUMN_C_G_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_C_G, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Filters by the user's permissions and counts all the t y messageses where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @return the number of matching t y messageses that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	public int filterCountByC_G(long companyId, long groupId)
		throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return countByC_G(companyId, groupId);
		}

		StringBundler query = new StringBundler(3);

		query.append(_FILTER_SQL_COUNT_TYMESSAGES_WHERE);

		query.append(_FINDER_COLUMN_C_G_COMPANYID_2);

		query.append(_FINDER_COLUMN_C_G_GROUPID_2);

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				TYMessages.class.getName(), _FILTER_COLUMN_PK,
				_FILTER_COLUMN_USERID, groupId);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME,
				com.liferay.portal.kernel.dao.orm.Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(companyId);

			qPos.add(groupId);

			Long count = (Long)q.uniqueResult();

			return count.intValue();
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	/**
	 * Counts all the t y messageses.
	 *
	 * @return the number of t y messageses
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

				Query q = session.createQuery(_SQL_COUNT_TYMESSAGES);

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
	 * Initializes the t y messages persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.tvd.thptty.model.TYMessages")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TYMessages>> listenersList = new ArrayList<ModelListener<TYMessages>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TYMessages>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TYMessagesImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST);
	}

	@BeanReference(type = TYClassPersistence.class)
	protected TYClassPersistence tyClassPersistence;
	@BeanReference(type = TYStudentPersistence.class)
	protected TYStudentPersistence tyStudentPersistence;
	@BeanReference(type = TYClassStudentPersistence.class)
	protected TYClassStudentPersistence tyClassStudentPersistence;
	@BeanReference(type = TYClassUserRolePersistence.class)
	protected TYClassUserRolePersistence tyClassUserRolePersistence;
	@BeanReference(type = TYSubjectPersistence.class)
	protected TYSubjectPersistence tySubjectPersistence;
	@BeanReference(type = TYSubjectUserRolePersistence.class)
	protected TYSubjectUserRolePersistence tySubjectUserRolePersistence;
	@BeanReference(type = TYTeacherPersistence.class)
	protected TYTeacherPersistence tyTeacherPersistence;
	@BeanReference(type = TYStudentPointReservePersistence.class)
	protected TYStudentPointReservePersistence tyStudentPointReservePersistence;
	@BeanReference(type = TYStudentPointPersistence.class)
	protected TYStudentPointPersistence tyStudentPointPersistence;
	@BeanReference(type = TYStudentConductPersistence.class)
	protected TYStudentConductPersistence tyStudentConductPersistence;
	@BeanReference(type = TYSubjectClassUserRolePersistence.class)
	protected TYSubjectClassUserRolePersistence tySubjectClassUserRolePersistence;
	@BeanReference(type = TYPrioritySubjectPersistence.class)
	protected TYPrioritySubjectPersistence tyPrioritySubjectPersistence;
	@BeanReference(type = SemesterPersistence.class)
	protected SemesterPersistence semesterPersistence;
	@BeanReference(type = TYMessagesPersistence.class)
	protected TYMessagesPersistence tyMessagesPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_TYMESSAGES = "SELECT tyMessages FROM TYMessages tyMessages";
	private static final String _SQL_SELECT_TYMESSAGES_WHERE = "SELECT tyMessages FROM TYMessages tyMessages WHERE ";
	private static final String _SQL_COUNT_TYMESSAGES = "SELECT COUNT(tyMessages) FROM TYMessages tyMessages";
	private static final String _SQL_COUNT_TYMESSAGES_WHERE = "SELECT COUNT(tyMessages) FROM TYMessages tyMessages WHERE ";
	private static final String _FINDER_COLUMN_C_G_COMPANYID_2 = "tyMessages.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_G_GROUPID_2 = "tyMessages.groupId = ?";
	private static final String _FILTER_SQL_SELECT_TYMESSAGES_WHERE = "SELECT DISTINCT {tyMessages.*} FROM TY_TYMessages tyMessages WHERE ";
	private static final String _FILTER_SQL_SELECT_TYMESSAGES_NO_INLINE_DISTINCT_WHERE_1 =
		"SELECT {TY_TYMessages.*} FROM (SELECT DISTINCT tyMessages.messageId FROM TY_TYMessages tyMessages WHERE ";
	private static final String _FILTER_SQL_SELECT_TYMESSAGES_NO_INLINE_DISTINCT_WHERE_2 =
		") TEMP_TABLE INNER JOIN TY_TYMessages ON TEMP_TABLE.messageId = TY_TYMessages.messageId";
	private static final String _FILTER_SQL_COUNT_TYMESSAGES_WHERE = "SELECT COUNT(DISTINCT tyMessages.messageId) AS COUNT_VALUE FROM TY_TYMessages tyMessages WHERE ";
	private static final String _FILTER_COLUMN_PK = "tyMessages.messageId";
	private static final String _FILTER_COLUMN_USERID = "tyMessages.userId";
	private static final String _FILTER_ENTITY_ALIAS = "tyMessages";
	private static final String _FILTER_ENTITY_TABLE = "TY_TYMessages";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tyMessages.";
	private static final String _ORDER_BY_ENTITY_TABLE = "TY_TYMessages.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TYMessages exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TYMessages exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(TYMessagesPersistenceImpl.class);
}