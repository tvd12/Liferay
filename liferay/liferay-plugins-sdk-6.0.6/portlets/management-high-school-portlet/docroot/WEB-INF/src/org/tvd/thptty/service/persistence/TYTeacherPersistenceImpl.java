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
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import org.tvd.thptty.NoSuchTeacherException;
import org.tvd.thptty.model.TYTeacher;
import org.tvd.thptty.model.impl.TYTeacherImpl;
import org.tvd.thptty.model.impl.TYTeacherModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the t y teacher service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link TYTeacherUtil} to access the t y teacher persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ta Van Dung
 * @see TYTeacherPersistence
 * @see TYTeacherUtil
 * @generated
 */
public class TYTeacherPersistenceImpl extends BasePersistenceImpl<TYTeacher>
	implements TYTeacherPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = TYTeacherImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FETCH_BY_USERID = new FinderPath(TYTeacherModelImpl.ENTITY_CACHE_ENABLED,
			TYTeacherModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_ENTITY,
			"fetchByuserId", new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_COUNT_BY_USERID = new FinderPath(TYTeacherModelImpl.ENTITY_CACHE_ENABLED,
			TYTeacherModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByuserId", new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(TYTeacherModelImpl.ENTITY_CACHE_ENABLED,
			TYTeacherModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TYTeacherModelImpl.ENTITY_CACHE_ENABLED,
			TYTeacherModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countAll", new String[0]);

	/**
	 * Caches the t y teacher in the entity cache if it is enabled.
	 *
	 * @param tyTeacher the t y teacher to cache
	 */
	public void cacheResult(TYTeacher tyTeacher) {
		EntityCacheUtil.putResult(TYTeacherModelImpl.ENTITY_CACHE_ENABLED,
			TYTeacherImpl.class, tyTeacher.getPrimaryKey(), tyTeacher);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID,
			new Object[] { new Long(tyTeacher.getUserId()) }, tyTeacher);
	}

	/**
	 * Caches the t y teachers in the entity cache if it is enabled.
	 *
	 * @param tyTeachers the t y teachers to cache
	 */
	public void cacheResult(List<TYTeacher> tyTeachers) {
		for (TYTeacher tyTeacher : tyTeachers) {
			if (EntityCacheUtil.getResult(
						TYTeacherModelImpl.ENTITY_CACHE_ENABLED,
						TYTeacherImpl.class, tyTeacher.getPrimaryKey(), this) == null) {
				cacheResult(tyTeacher);
			}
		}
	}

	/**
	 * Clears the cache for all t y teachers.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(TYTeacherImpl.class.getName());
		EntityCacheUtil.clearCache(TYTeacherImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the t y teacher.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(TYTeacher tyTeacher) {
		EntityCacheUtil.removeResult(TYTeacherModelImpl.ENTITY_CACHE_ENABLED,
			TYTeacherImpl.class, tyTeacher.getPrimaryKey());

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_USERID,
			new Object[] { new Long(tyTeacher.getUserId()) });
	}

	/**
	 * Creates a new t y teacher with the primary key. Does not add the t y teacher to the database.
	 *
	 * @param teacherId the primary key for the new t y teacher
	 * @return the new t y teacher
	 */
	public TYTeacher create(long teacherId) {
		TYTeacher tyTeacher = new TYTeacherImpl();

		tyTeacher.setNew(true);
		tyTeacher.setPrimaryKey(teacherId);

		return tyTeacher;
	}

	/**
	 * Removes the t y teacher with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the t y teacher to remove
	 * @return the t y teacher that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a t y teacher with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYTeacher remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Long)primaryKey).longValue());
	}

	/**
	 * Removes the t y teacher with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param teacherId the primary key of the t y teacher to remove
	 * @return the t y teacher that was removed
	 * @throws org.tvd.thptty.NoSuchTeacherException if a t y teacher with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYTeacher remove(long teacherId)
		throws NoSuchTeacherException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TYTeacher tyTeacher = (TYTeacher)session.get(TYTeacherImpl.class,
					new Long(teacherId));

			if (tyTeacher == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + teacherId);
				}

				throw new NoSuchTeacherException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					teacherId);
			}

			return remove(tyTeacher);
		}
		catch (NoSuchTeacherException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TYTeacher removeImpl(TYTeacher tyTeacher)
		throws SystemException {
		tyTeacher = toUnwrappedModel(tyTeacher);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, tyTeacher);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		TYTeacherModelImpl tyTeacherModelImpl = (TYTeacherModelImpl)tyTeacher;

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_USERID,
			new Object[] { new Long(tyTeacherModelImpl.getUserId()) });

		EntityCacheUtil.removeResult(TYTeacherModelImpl.ENTITY_CACHE_ENABLED,
			TYTeacherImpl.class, tyTeacher.getPrimaryKey());

		return tyTeacher;
	}

	public TYTeacher updateImpl(org.tvd.thptty.model.TYTeacher tyTeacher,
		boolean merge) throws SystemException {
		tyTeacher = toUnwrappedModel(tyTeacher);

		boolean isNew = tyTeacher.isNew();

		TYTeacherModelImpl tyTeacherModelImpl = (TYTeacherModelImpl)tyTeacher;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, tyTeacher, merge);

			tyTeacher.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(TYTeacherModelImpl.ENTITY_CACHE_ENABLED,
			TYTeacherImpl.class, tyTeacher.getPrimaryKey(), tyTeacher);

		if (!isNew &&
				(tyTeacher.getUserId() != tyTeacherModelImpl.getOriginalUserId())) {
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_USERID,
				new Object[] { new Long(tyTeacherModelImpl.getOriginalUserId()) });
		}

		if (isNew ||
				(tyTeacher.getUserId() != tyTeacherModelImpl.getOriginalUserId())) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID,
				new Object[] { new Long(tyTeacher.getUserId()) }, tyTeacher);
		}

		return tyTeacher;
	}

	protected TYTeacher toUnwrappedModel(TYTeacher tyTeacher) {
		if (tyTeacher instanceof TYTeacherImpl) {
			return tyTeacher;
		}

		TYTeacherImpl tyTeacherImpl = new TYTeacherImpl();

		tyTeacherImpl.setNew(tyTeacher.isNew());
		tyTeacherImpl.setPrimaryKey(tyTeacher.getPrimaryKey());

		tyTeacherImpl.setTeacherId(tyTeacher.getTeacherId());
		tyTeacherImpl.setTeacherDegree(tyTeacher.getTeacherDegree());
		tyTeacherImpl.setTeacherCertificate(tyTeacher.getTeacherCertificate());
		tyTeacherImpl.setUserId(tyTeacher.getUserId());

		return tyTeacherImpl;
	}

	/**
	 * Finds the t y teacher with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the t y teacher to find
	 * @return the t y teacher
	 * @throws com.liferay.portal.NoSuchModelException if a t y teacher with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYTeacher findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the t y teacher with the primary key or throws a {@link org.tvd.thptty.NoSuchTeacherException} if it could not be found.
	 *
	 * @param teacherId the primary key of the t y teacher to find
	 * @return the t y teacher
	 * @throws org.tvd.thptty.NoSuchTeacherException if a t y teacher with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYTeacher findByPrimaryKey(long teacherId)
		throws NoSuchTeacherException, SystemException {
		TYTeacher tyTeacher = fetchByPrimaryKey(teacherId);

		if (tyTeacher == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + teacherId);
			}

			throw new NoSuchTeacherException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				teacherId);
		}

		return tyTeacher;
	}

	/**
	 * Finds the t y teacher with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the t y teacher to find
	 * @return the t y teacher, or <code>null</code> if a t y teacher with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYTeacher fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the t y teacher with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param teacherId the primary key of the t y teacher to find
	 * @return the t y teacher, or <code>null</code> if a t y teacher with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYTeacher fetchByPrimaryKey(long teacherId)
		throws SystemException {
		TYTeacher tyTeacher = (TYTeacher)EntityCacheUtil.getResult(TYTeacherModelImpl.ENTITY_CACHE_ENABLED,
				TYTeacherImpl.class, teacherId, this);

		if (tyTeacher == null) {
			Session session = null;

			try {
				session = openSession();

				tyTeacher = (TYTeacher)session.get(TYTeacherImpl.class,
						new Long(teacherId));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (tyTeacher != null) {
					cacheResult(tyTeacher);
				}

				closeSession(session);
			}
		}

		return tyTeacher;
	}

	/**
	 * Finds the t y teacher where userId = &#63; or throws a {@link org.tvd.thptty.NoSuchTeacherException} if it could not be found.
	 *
	 * @param userId the user id to search with
	 * @return the matching t y teacher
	 * @throws org.tvd.thptty.NoSuchTeacherException if a matching t y teacher could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYTeacher findByuserId(long userId)
		throws NoSuchTeacherException, SystemException {
		TYTeacher tyTeacher = fetchByuserId(userId);

		if (tyTeacher == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("userId=");
			msg.append(userId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchTeacherException(msg.toString());
		}

		return tyTeacher;
	}

	/**
	 * Finds the t y teacher where userId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param userId the user id to search with
	 * @return the matching t y teacher, or <code>null</code> if a matching t y teacher could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYTeacher fetchByuserId(long userId) throws SystemException {
		return fetchByuserId(userId, true);
	}

	/**
	 * Finds the t y teacher where userId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param userId the user id to search with
	 * @return the matching t y teacher, or <code>null</code> if a matching t y teacher could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYTeacher fetchByuserId(long userId, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { userId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_USERID,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_SELECT_TYTEACHER_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				List<TYTeacher> list = q.list();

				result = list;

				TYTeacher tyTeacher = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID,
						finderArgs, list);
				}
				else {
					tyTeacher = list.get(0);

					cacheResult(tyTeacher);

					if ((tyTeacher.getUserId() != userId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID,
							finderArgs, tyTeacher);
					}
				}

				return tyTeacher;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_USERID,
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
				return (TYTeacher)result;
			}
		}
	}

	/**
	 * Finds all the t y teachers.
	 *
	 * @return the t y teachers
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYTeacher> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the t y teachers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of t y teachers to return
	 * @param end the upper bound of the range of t y teachers to return (not inclusive)
	 * @return the range of t y teachers
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYTeacher> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the t y teachers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of t y teachers to return
	 * @param end the upper bound of the range of t y teachers to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of t y teachers
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYTeacher> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<TYTeacher> list = (List<TYTeacher>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TYTEACHER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TYTEACHER;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<TYTeacher>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<TYTeacher>)QueryUtil.list(q, getDialect(),
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
	 * Removes the t y teacher where userId = &#63; from the database.
	 *
	 * @param userId the user id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByuserId(long userId)
		throws NoSuchTeacherException, SystemException {
		TYTeacher tyTeacher = findByuserId(userId);

		remove(tyTeacher);
	}

	/**
	 * Removes all the t y teachers from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (TYTeacher tyTeacher : findAll()) {
			remove(tyTeacher);
		}
	}

	/**
	 * Counts all the t y teachers where userId = &#63;.
	 *
	 * @param userId the user id to search with
	 * @return the number of matching t y teachers
	 * @throws SystemException if a system exception occurred
	 */
	public int countByuserId(long userId) throws SystemException {
		Object[] finderArgs = new Object[] { userId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_USERID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TYTEACHER_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_USERID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the t y teachers.
	 *
	 * @return the number of t y teachers
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

				Query q = session.createQuery(_SQL_COUNT_TYTEACHER);

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
	 * Initializes the t y teacher persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.tvd.thptty.model.TYTeacher")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TYTeacher>> listenersList = new ArrayList<ModelListener<TYTeacher>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TYTeacher>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TYTeacherImpl.class.getName());
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
	private static final String _SQL_SELECT_TYTEACHER = "SELECT tyTeacher FROM TYTeacher tyTeacher";
	private static final String _SQL_SELECT_TYTEACHER_WHERE = "SELECT tyTeacher FROM TYTeacher tyTeacher WHERE ";
	private static final String _SQL_COUNT_TYTEACHER = "SELECT COUNT(tyTeacher) FROM TYTeacher tyTeacher";
	private static final String _SQL_COUNT_TYTEACHER_WHERE = "SELECT COUNT(tyTeacher) FROM TYTeacher tyTeacher WHERE ";
	private static final String _FINDER_COLUMN_USERID_USERID_2 = "tyTeacher.userId = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tyTeacher.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TYTeacher exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TYTeacher exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(TYTeacherPersistenceImpl.class);
}