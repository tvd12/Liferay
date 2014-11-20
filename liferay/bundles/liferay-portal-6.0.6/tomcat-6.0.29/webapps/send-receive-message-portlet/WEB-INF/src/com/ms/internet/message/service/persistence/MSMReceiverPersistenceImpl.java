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

import com.ms.internet.message.NoSuchMReceiverException;
import com.ms.internet.message.model.MSMReceiver;
import com.ms.internet.message.model.impl.MSMReceiverImpl;
import com.ms.internet.message.model.impl.MSMReceiverModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * The persistence implementation for the m s m receiver service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link MSMReceiverUtil} to access the m s m receiver persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author I Am Dung
 * @see MSMReceiverPersistence
 * @see MSMReceiverUtil
 * @generated
 */
public class MSMReceiverPersistenceImpl extends BasePersistenceImpl<MSMReceiver>
	implements MSMReceiverPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = MSMReceiverImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_U = new FinderPath(MSMReceiverModelImpl.ENTITY_CACHE_ENABLED,
			MSMReceiverModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByU",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_U = new FinderPath(MSMReceiverModelImpl.ENTITY_CACHE_ENABLED,
			MSMReceiverModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByU", new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_U_D = new FinderPath(MSMReceiverModelImpl.ENTITY_CACHE_ENABLED,
			MSMReceiverModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByU_D",
			new String[] {
				Long.class.getName(), Date.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_U_D = new FinderPath(MSMReceiverModelImpl.ENTITY_CACHE_ENABLED,
			MSMReceiverModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByU_D",
			new String[] { Long.class.getName(), Date.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(MSMReceiverModelImpl.ENTITY_CACHE_ENABLED,
			MSMReceiverModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(MSMReceiverModelImpl.ENTITY_CACHE_ENABLED,
			MSMReceiverModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countAll", new String[0]);

	/**
	 * Caches the m s m receiver in the entity cache if it is enabled.
	 *
	 * @param msmReceiver the m s m receiver to cache
	 */
	public void cacheResult(MSMReceiver msmReceiver) {
		EntityCacheUtil.putResult(MSMReceiverModelImpl.ENTITY_CACHE_ENABLED,
			MSMReceiverImpl.class, msmReceiver.getPrimaryKey(), msmReceiver);
	}

	/**
	 * Caches the m s m receivers in the entity cache if it is enabled.
	 *
	 * @param msmReceivers the m s m receivers to cache
	 */
	public void cacheResult(List<MSMReceiver> msmReceivers) {
		for (MSMReceiver msmReceiver : msmReceivers) {
			if (EntityCacheUtil.getResult(
						MSMReceiverModelImpl.ENTITY_CACHE_ENABLED,
						MSMReceiverImpl.class, msmReceiver.getPrimaryKey(), this) == null) {
				cacheResult(msmReceiver);
			}
		}
	}

	/**
	 * Clears the cache for all m s m receivers.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(MSMReceiverImpl.class.getName());
		EntityCacheUtil.clearCache(MSMReceiverImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the m s m receiver.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(MSMReceiver msmReceiver) {
		EntityCacheUtil.removeResult(MSMReceiverModelImpl.ENTITY_CACHE_ENABLED,
			MSMReceiverImpl.class, msmReceiver.getPrimaryKey());
	}

	/**
	 * Creates a new m s m receiver with the primary key. Does not add the m s m receiver to the database.
	 *
	 * @param msmReceiverPK the primary key for the new m s m receiver
	 * @return the new m s m receiver
	 */
	public MSMReceiver create(MSMReceiverPK msmReceiverPK) {
		MSMReceiver msmReceiver = new MSMReceiverImpl();

		msmReceiver.setNew(true);
		msmReceiver.setPrimaryKey(msmReceiverPK);

		return msmReceiver;
	}

	/**
	 * Removes the m s m receiver with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the m s m receiver to remove
	 * @return the m s m receiver that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a m s m receiver with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public MSMReceiver remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove((MSMReceiverPK)primaryKey);
	}

	/**
	 * Removes the m s m receiver with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param msmReceiverPK the primary key of the m s m receiver to remove
	 * @return the m s m receiver that was removed
	 * @throws com.ms.internet.message.NoSuchMReceiverException if a m s m receiver with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public MSMReceiver remove(MSMReceiverPK msmReceiverPK)
		throws NoSuchMReceiverException, SystemException {
		Session session = null;

		try {
			session = openSession();

			MSMReceiver msmReceiver = (MSMReceiver)session.get(MSMReceiverImpl.class,
					msmReceiverPK);

			if (msmReceiver == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + msmReceiverPK);
				}

				throw new NoSuchMReceiverException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					msmReceiverPK);
			}

			return remove(msmReceiver);
		}
		catch (NoSuchMReceiverException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected MSMReceiver removeImpl(MSMReceiver msmReceiver)
		throws SystemException {
		msmReceiver = toUnwrappedModel(msmReceiver);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, msmReceiver);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.removeResult(MSMReceiverModelImpl.ENTITY_CACHE_ENABLED,
			MSMReceiverImpl.class, msmReceiver.getPrimaryKey());

		return msmReceiver;
	}

	public MSMReceiver updateImpl(
		com.ms.internet.message.model.MSMReceiver msmReceiver, boolean merge)
		throws SystemException {
		msmReceiver = toUnwrappedModel(msmReceiver);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, msmReceiver, merge);

			msmReceiver.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(MSMReceiverModelImpl.ENTITY_CACHE_ENABLED,
			MSMReceiverImpl.class, msmReceiver.getPrimaryKey(), msmReceiver);

		return msmReceiver;
	}

	protected MSMReceiver toUnwrappedModel(MSMReceiver msmReceiver) {
		if (msmReceiver instanceof MSMReceiverImpl) {
			return msmReceiver;
		}

		MSMReceiverImpl msmReceiverImpl = new MSMReceiverImpl();

		msmReceiverImpl.setNew(msmReceiver.isNew());
		msmReceiverImpl.setPrimaryKey(msmReceiver.getPrimaryKey());

		msmReceiverImpl.setUserId(msmReceiver.getUserId());
		msmReceiverImpl.setMessageId(msmReceiver.getMessageId());
		msmReceiverImpl.setDateRecieved(msmReceiver.getDateRecieved());
		msmReceiverImpl.setMsStatus(msmReceiver.isMsStatus());

		return msmReceiverImpl;
	}

	/**
	 * Finds the m s m receiver with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the m s m receiver to find
	 * @return the m s m receiver
	 * @throws com.liferay.portal.NoSuchModelException if a m s m receiver with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public MSMReceiver findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((MSMReceiverPK)primaryKey);
	}

	/**
	 * Finds the m s m receiver with the primary key or throws a {@link com.ms.internet.message.NoSuchMReceiverException} if it could not be found.
	 *
	 * @param msmReceiverPK the primary key of the m s m receiver to find
	 * @return the m s m receiver
	 * @throws com.ms.internet.message.NoSuchMReceiverException if a m s m receiver with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public MSMReceiver findByPrimaryKey(MSMReceiverPK msmReceiverPK)
		throws NoSuchMReceiverException, SystemException {
		MSMReceiver msmReceiver = fetchByPrimaryKey(msmReceiverPK);

		if (msmReceiver == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + msmReceiverPK);
			}

			throw new NoSuchMReceiverException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				msmReceiverPK);
		}

		return msmReceiver;
	}

	/**
	 * Finds the m s m receiver with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the m s m receiver to find
	 * @return the m s m receiver, or <code>null</code> if a m s m receiver with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public MSMReceiver fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((MSMReceiverPK)primaryKey);
	}

	/**
	 * Finds the m s m receiver with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param msmReceiverPK the primary key of the m s m receiver to find
	 * @return the m s m receiver, or <code>null</code> if a m s m receiver with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public MSMReceiver fetchByPrimaryKey(MSMReceiverPK msmReceiverPK)
		throws SystemException {
		MSMReceiver msmReceiver = (MSMReceiver)EntityCacheUtil.getResult(MSMReceiverModelImpl.ENTITY_CACHE_ENABLED,
				MSMReceiverImpl.class, msmReceiverPK, this);

		if (msmReceiver == null) {
			Session session = null;

			try {
				session = openSession();

				msmReceiver = (MSMReceiver)session.get(MSMReceiverImpl.class,
						msmReceiverPK);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (msmReceiver != null) {
					cacheResult(msmReceiver);
				}

				closeSession(session);
			}
		}

		return msmReceiver;
	}

	/**
	 * Finds all the m s m receivers where userId = &#63;.
	 *
	 * @param userId the user id to search with
	 * @return the matching m s m receivers
	 * @throws SystemException if a system exception occurred
	 */
	public List<MSMReceiver> findByU(long userId) throws SystemException {
		return findByU(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the m s m receivers where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param userId the user id to search with
	 * @param start the lower bound of the range of m s m receivers to return
	 * @param end the upper bound of the range of m s m receivers to return (not inclusive)
	 * @return the range of matching m s m receivers
	 * @throws SystemException if a system exception occurred
	 */
	public List<MSMReceiver> findByU(long userId, int start, int end)
		throws SystemException {
		return findByU(userId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the m s m receivers where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param userId the user id to search with
	 * @param start the lower bound of the range of m s m receivers to return
	 * @param end the upper bound of the range of m s m receivers to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching m s m receivers
	 * @throws SystemException if a system exception occurred
	 */
	public List<MSMReceiver> findByU(long userId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				userId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<MSMReceiver> list = (List<MSMReceiver>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_U,
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

			query.append(_SQL_SELECT_MSMRECEIVER_WHERE);

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

				list = (List<MSMReceiver>)QueryUtil.list(q, getDialect(),
						start, end);
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
	 * Finds the first m s m receiver in the ordered set where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param userId the user id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching m s m receiver
	 * @throws com.ms.internet.message.NoSuchMReceiverException if a matching m s m receiver could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public MSMReceiver findByU_First(long userId,
		OrderByComparator orderByComparator)
		throws NoSuchMReceiverException, SystemException {
		List<MSMReceiver> list = findByU(userId, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("userId=");
			msg.append(userId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchMReceiverException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last m s m receiver in the ordered set where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param userId the user id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching m s m receiver
	 * @throws com.ms.internet.message.NoSuchMReceiverException if a matching m s m receiver could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public MSMReceiver findByU_Last(long userId,
		OrderByComparator orderByComparator)
		throws NoSuchMReceiverException, SystemException {
		int count = countByU(userId);

		List<MSMReceiver> list = findByU(userId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("userId=");
			msg.append(userId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchMReceiverException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the m s m receivers before and after the current m s m receiver in the ordered set where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param msmReceiverPK the primary key of the current m s m receiver
	 * @param userId the user id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next m s m receiver
	 * @throws com.ms.internet.message.NoSuchMReceiverException if a m s m receiver with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public MSMReceiver[] findByU_PrevAndNext(MSMReceiverPK msmReceiverPK,
		long userId, OrderByComparator orderByComparator)
		throws NoSuchMReceiverException, SystemException {
		MSMReceiver msmReceiver = findByPrimaryKey(msmReceiverPK);

		Session session = null;

		try {
			session = openSession();

			MSMReceiver[] array = new MSMReceiverImpl[3];

			array[0] = getByU_PrevAndNext(session, msmReceiver, userId,
					orderByComparator, true);

			array[1] = msmReceiver;

			array[2] = getByU_PrevAndNext(session, msmReceiver, userId,
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

	protected MSMReceiver getByU_PrevAndNext(Session session,
		MSMReceiver msmReceiver, long userId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MSMRECEIVER_WHERE);

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
			Object[] values = orderByComparator.getOrderByValues(msmReceiver);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MSMReceiver> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the m s m receivers where userId = &#63; and dateRecieved = &#63;.
	 *
	 * @param userId the user id to search with
	 * @param dateRecieved the date recieved to search with
	 * @return the matching m s m receivers
	 * @throws SystemException if a system exception occurred
	 */
	public List<MSMReceiver> findByU_D(long userId, Date dateRecieved)
		throws SystemException {
		return findByU_D(userId, dateRecieved, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the m s m receivers where userId = &#63; and dateRecieved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param userId the user id to search with
	 * @param dateRecieved the date recieved to search with
	 * @param start the lower bound of the range of m s m receivers to return
	 * @param end the upper bound of the range of m s m receivers to return (not inclusive)
	 * @return the range of matching m s m receivers
	 * @throws SystemException if a system exception occurred
	 */
	public List<MSMReceiver> findByU_D(long userId, Date dateRecieved,
		int start, int end) throws SystemException {
		return findByU_D(userId, dateRecieved, start, end, null);
	}

	/**
	 * Finds an ordered range of all the m s m receivers where userId = &#63; and dateRecieved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param userId the user id to search with
	 * @param dateRecieved the date recieved to search with
	 * @param start the lower bound of the range of m s m receivers to return
	 * @param end the upper bound of the range of m s m receivers to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching m s m receivers
	 * @throws SystemException if a system exception occurred
	 */
	public List<MSMReceiver> findByU_D(long userId, Date dateRecieved,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				userId, dateRecieved,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<MSMReceiver> list = (List<MSMReceiver>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_U_D,
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

			query.append(_SQL_SELECT_MSMRECEIVER_WHERE);

			query.append(_FINDER_COLUMN_U_D_USERID_2);

			if (dateRecieved == null) {
				query.append(_FINDER_COLUMN_U_D_DATERECIEVED_1);
			}
			else {
				query.append(_FINDER_COLUMN_U_D_DATERECIEVED_2);
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

				if (dateRecieved != null) {
					qPos.add(CalendarUtil.getTimestamp(dateRecieved));
				}

				list = (List<MSMReceiver>)QueryUtil.list(q, getDialect(),
						start, end);
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
	 * Finds the first m s m receiver in the ordered set where userId = &#63; and dateRecieved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param userId the user id to search with
	 * @param dateRecieved the date recieved to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching m s m receiver
	 * @throws com.ms.internet.message.NoSuchMReceiverException if a matching m s m receiver could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public MSMReceiver findByU_D_First(long userId, Date dateRecieved,
		OrderByComparator orderByComparator)
		throws NoSuchMReceiverException, SystemException {
		List<MSMReceiver> list = findByU_D(userId, dateRecieved, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("userId=");
			msg.append(userId);

			msg.append(", dateRecieved=");
			msg.append(dateRecieved);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchMReceiverException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last m s m receiver in the ordered set where userId = &#63; and dateRecieved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param userId the user id to search with
	 * @param dateRecieved the date recieved to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching m s m receiver
	 * @throws com.ms.internet.message.NoSuchMReceiverException if a matching m s m receiver could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public MSMReceiver findByU_D_Last(long userId, Date dateRecieved,
		OrderByComparator orderByComparator)
		throws NoSuchMReceiverException, SystemException {
		int count = countByU_D(userId, dateRecieved);

		List<MSMReceiver> list = findByU_D(userId, dateRecieved, count - 1,
				count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("userId=");
			msg.append(userId);

			msg.append(", dateRecieved=");
			msg.append(dateRecieved);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchMReceiverException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the m s m receivers before and after the current m s m receiver in the ordered set where userId = &#63; and dateRecieved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param msmReceiverPK the primary key of the current m s m receiver
	 * @param userId the user id to search with
	 * @param dateRecieved the date recieved to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next m s m receiver
	 * @throws com.ms.internet.message.NoSuchMReceiverException if a m s m receiver with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public MSMReceiver[] findByU_D_PrevAndNext(MSMReceiverPK msmReceiverPK,
		long userId, Date dateRecieved, OrderByComparator orderByComparator)
		throws NoSuchMReceiverException, SystemException {
		MSMReceiver msmReceiver = findByPrimaryKey(msmReceiverPK);

		Session session = null;

		try {
			session = openSession();

			MSMReceiver[] array = new MSMReceiverImpl[3];

			array[0] = getByU_D_PrevAndNext(session, msmReceiver, userId,
					dateRecieved, orderByComparator, true);

			array[1] = msmReceiver;

			array[2] = getByU_D_PrevAndNext(session, msmReceiver, userId,
					dateRecieved, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected MSMReceiver getByU_D_PrevAndNext(Session session,
		MSMReceiver msmReceiver, long userId, Date dateRecieved,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MSMRECEIVER_WHERE);

		query.append(_FINDER_COLUMN_U_D_USERID_2);

		if (dateRecieved == null) {
			query.append(_FINDER_COLUMN_U_D_DATERECIEVED_1);
		}
		else {
			query.append(_FINDER_COLUMN_U_D_DATERECIEVED_2);
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

		if (dateRecieved != null) {
			qPos.add(CalendarUtil.getTimestamp(dateRecieved));
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(msmReceiver);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MSMReceiver> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the m s m receivers.
	 *
	 * @return the m s m receivers
	 * @throws SystemException if a system exception occurred
	 */
	public List<MSMReceiver> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the m s m receivers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of m s m receivers to return
	 * @param end the upper bound of the range of m s m receivers to return (not inclusive)
	 * @return the range of m s m receivers
	 * @throws SystemException if a system exception occurred
	 */
	public List<MSMReceiver> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the m s m receivers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of m s m receivers to return
	 * @param end the upper bound of the range of m s m receivers to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of m s m receivers
	 * @throws SystemException if a system exception occurred
	 */
	public List<MSMReceiver> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<MSMReceiver> list = (List<MSMReceiver>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_MSMRECEIVER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_MSMRECEIVER;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<MSMReceiver>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<MSMReceiver>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the m s m receivers where userId = &#63; from the database.
	 *
	 * @param userId the user id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByU(long userId) throws SystemException {
		for (MSMReceiver msmReceiver : findByU(userId)) {
			remove(msmReceiver);
		}
	}

	/**
	 * Removes all the m s m receivers where userId = &#63; and dateRecieved = &#63; from the database.
	 *
	 * @param userId the user id to search with
	 * @param dateRecieved the date recieved to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByU_D(long userId, Date dateRecieved)
		throws SystemException {
		for (MSMReceiver msmReceiver : findByU_D(userId, dateRecieved)) {
			remove(msmReceiver);
		}
	}

	/**
	 * Removes all the m s m receivers from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (MSMReceiver msmReceiver : findAll()) {
			remove(msmReceiver);
		}
	}

	/**
	 * Counts all the m s m receivers where userId = &#63;.
	 *
	 * @param userId the user id to search with
	 * @return the number of matching m s m receivers
	 * @throws SystemException if a system exception occurred
	 */
	public int countByU(long userId) throws SystemException {
		Object[] finderArgs = new Object[] { userId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_U,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_MSMRECEIVER_WHERE);

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
	 * Counts all the m s m receivers where userId = &#63; and dateRecieved = &#63;.
	 *
	 * @param userId the user id to search with
	 * @param dateRecieved the date recieved to search with
	 * @return the number of matching m s m receivers
	 * @throws SystemException if a system exception occurred
	 */
	public int countByU_D(long userId, Date dateRecieved)
		throws SystemException {
		Object[] finderArgs = new Object[] { userId, dateRecieved };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_U_D,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_MSMRECEIVER_WHERE);

			query.append(_FINDER_COLUMN_U_D_USERID_2);

			if (dateRecieved == null) {
				query.append(_FINDER_COLUMN_U_D_DATERECIEVED_1);
			}
			else {
				query.append(_FINDER_COLUMN_U_D_DATERECIEVED_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				if (dateRecieved != null) {
					qPos.add(CalendarUtil.getTimestamp(dateRecieved));
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
	 * Counts all the m s m receivers.
	 *
	 * @return the number of m s m receivers
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

				Query q = session.createQuery(_SQL_COUNT_MSMRECEIVER);

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
	 * Initializes the m s m receiver persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ms.internet.message.model.MSMReceiver")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<MSMReceiver>> listenersList = new ArrayList<ModelListener<MSMReceiver>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<MSMReceiver>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(MSMReceiverImpl.class.getName());
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
	private static final String _SQL_SELECT_MSMRECEIVER = "SELECT msmReceiver FROM MSMReceiver msmReceiver";
	private static final String _SQL_SELECT_MSMRECEIVER_WHERE = "SELECT msmReceiver FROM MSMReceiver msmReceiver WHERE ";
	private static final String _SQL_COUNT_MSMRECEIVER = "SELECT COUNT(msmReceiver) FROM MSMReceiver msmReceiver";
	private static final String _SQL_COUNT_MSMRECEIVER_WHERE = "SELECT COUNT(msmReceiver) FROM MSMReceiver msmReceiver WHERE ";
	private static final String _FINDER_COLUMN_U_USERID_2 = "msmReceiver.id.userId = ?";
	private static final String _FINDER_COLUMN_U_D_USERID_2 = "msmReceiver.id.userId = ? AND ";
	private static final String _FINDER_COLUMN_U_D_DATERECIEVED_1 = "msmReceiver.dateRecieved IS NULL";
	private static final String _FINDER_COLUMN_U_D_DATERECIEVED_2 = "msmReceiver.dateRecieved = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "msmReceiver.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No MSMReceiver exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No MSMReceiver exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(MSMReceiverPersistenceImpl.class);
}