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

import org.tvd.thptty.NoSuchClassStudentException;
import org.tvd.thptty.model.TYClassStudent;
import org.tvd.thptty.model.impl.TYClassStudentImpl;
import org.tvd.thptty.model.impl.TYClassStudentModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the t y class student service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link TYClassStudentUtil} to access the t y class student persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ta Van Dung
 * @see TYClassStudentPersistence
 * @see TYClassStudentUtil
 * @generated
 */
public class TYClassStudentPersistenceImpl extends BasePersistenceImpl<TYClassStudent>
	implements TYClassStudentPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = TYClassStudentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_C_C = new FinderPath(TYClassStudentModelImpl.ENTITY_CACHE_ENABLED,
			TYClassStudentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByC_C",
			new String[] {
				Integer.class.getName(), Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_C_C = new FinderPath(TYClassStudentModelImpl.ENTITY_CACHE_ENABLED,
			TYClassStudentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByC_C",
			new String[] { Integer.class.getName(), Long.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_C_S = new FinderPath(TYClassStudentModelImpl.ENTITY_CACHE_ENABLED,
			TYClassStudentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_ENTITY, "fetchByC_S",
			new String[] { Integer.class.getName(), Long.class.getName() });
	public static final FinderPath FINDER_PATH_COUNT_BY_C_S = new FinderPath(TYClassStudentModelImpl.ENTITY_CACHE_ENABLED,
			TYClassStudentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByC_S",
			new String[] { Integer.class.getName(), Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(TYClassStudentModelImpl.ENTITY_CACHE_ENABLED,
			TYClassStudentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TYClassStudentModelImpl.ENTITY_CACHE_ENABLED,
			TYClassStudentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countAll", new String[0]);

	/**
	 * Caches the t y class student in the entity cache if it is enabled.
	 *
	 * @param tyClassStudent the t y class student to cache
	 */
	public void cacheResult(TYClassStudent tyClassStudent) {
		EntityCacheUtil.putResult(TYClassStudentModelImpl.ENTITY_CACHE_ENABLED,
			TYClassStudentImpl.class, tyClassStudent.getPrimaryKey(),
			tyClassStudent);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_S,
			new Object[] {
				new Integer(tyClassStudent.getCourses()),
				new Long(tyClassStudent.getStudentId())
			}, tyClassStudent);
	}

	/**
	 * Caches the t y class students in the entity cache if it is enabled.
	 *
	 * @param tyClassStudents the t y class students to cache
	 */
	public void cacheResult(List<TYClassStudent> tyClassStudents) {
		for (TYClassStudent tyClassStudent : tyClassStudents) {
			if (EntityCacheUtil.getResult(
						TYClassStudentModelImpl.ENTITY_CACHE_ENABLED,
						TYClassStudentImpl.class,
						tyClassStudent.getPrimaryKey(), this) == null) {
				cacheResult(tyClassStudent);
			}
		}
	}

	/**
	 * Clears the cache for all t y class students.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(TYClassStudentImpl.class.getName());
		EntityCacheUtil.clearCache(TYClassStudentImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the t y class student.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(TYClassStudent tyClassStudent) {
		EntityCacheUtil.removeResult(TYClassStudentModelImpl.ENTITY_CACHE_ENABLED,
			TYClassStudentImpl.class, tyClassStudent.getPrimaryKey());

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_S,
			new Object[] {
				new Integer(tyClassStudent.getCourses()),
				new Long(tyClassStudent.getStudentId())
			});
	}

	/**
	 * Creates a new t y class student with the primary key. Does not add the t y class student to the database.
	 *
	 * @param tyClassStudentPK the primary key for the new t y class student
	 * @return the new t y class student
	 */
	public TYClassStudent create(TYClassStudentPK tyClassStudentPK) {
		TYClassStudent tyClassStudent = new TYClassStudentImpl();

		tyClassStudent.setNew(true);
		tyClassStudent.setPrimaryKey(tyClassStudentPK);

		return tyClassStudent;
	}

	/**
	 * Removes the t y class student with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the t y class student to remove
	 * @return the t y class student that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a t y class student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYClassStudent remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove((TYClassStudentPK)primaryKey);
	}

	/**
	 * Removes the t y class student with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tyClassStudentPK the primary key of the t y class student to remove
	 * @return the t y class student that was removed
	 * @throws org.tvd.thptty.NoSuchClassStudentException if a t y class student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYClassStudent remove(TYClassStudentPK tyClassStudentPK)
		throws NoSuchClassStudentException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TYClassStudent tyClassStudent = (TYClassStudent)session.get(TYClassStudentImpl.class,
					tyClassStudentPK);

			if (tyClassStudent == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
						tyClassStudentPK);
				}

				throw new NoSuchClassStudentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					tyClassStudentPK);
			}

			return remove(tyClassStudent);
		}
		catch (NoSuchClassStudentException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TYClassStudent removeImpl(TYClassStudent tyClassStudent)
		throws SystemException {
		tyClassStudent = toUnwrappedModel(tyClassStudent);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, tyClassStudent);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		TYClassStudentModelImpl tyClassStudentModelImpl = (TYClassStudentModelImpl)tyClassStudent;

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_S,
			new Object[] {
				new Integer(tyClassStudentModelImpl.getCourses()),
				new Long(tyClassStudentModelImpl.getStudentId())
			});

		EntityCacheUtil.removeResult(TYClassStudentModelImpl.ENTITY_CACHE_ENABLED,
			TYClassStudentImpl.class, tyClassStudent.getPrimaryKey());

		return tyClassStudent;
	}

	public TYClassStudent updateImpl(
		org.tvd.thptty.model.TYClassStudent tyClassStudent, boolean merge)
		throws SystemException {
		tyClassStudent = toUnwrappedModel(tyClassStudent);

		boolean isNew = tyClassStudent.isNew();

		TYClassStudentModelImpl tyClassStudentModelImpl = (TYClassStudentModelImpl)tyClassStudent;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, tyClassStudent, merge);

			tyClassStudent.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(TYClassStudentModelImpl.ENTITY_CACHE_ENABLED,
			TYClassStudentImpl.class, tyClassStudent.getPrimaryKey(),
			tyClassStudent);

		if (!isNew &&
				((tyClassStudent.getCourses() != tyClassStudentModelImpl.getOriginalCourses()) ||
				(tyClassStudent.getStudentId() != tyClassStudentModelImpl.getOriginalStudentId()))) {
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_S,
				new Object[] {
					new Integer(tyClassStudentModelImpl.getOriginalCourses()),
					new Long(tyClassStudentModelImpl.getOriginalStudentId())
				});
		}

		if (isNew ||
				((tyClassStudent.getCourses() != tyClassStudentModelImpl.getOriginalCourses()) ||
				(tyClassStudent.getStudentId() != tyClassStudentModelImpl.getOriginalStudentId()))) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_S,
				new Object[] {
					new Integer(tyClassStudent.getCourses()),
					new Long(tyClassStudent.getStudentId())
				}, tyClassStudent);
		}

		return tyClassStudent;
	}

	protected TYClassStudent toUnwrappedModel(TYClassStudent tyClassStudent) {
		if (tyClassStudent instanceof TYClassStudentImpl) {
			return tyClassStudent;
		}

		TYClassStudentImpl tyClassStudentImpl = new TYClassStudentImpl();

		tyClassStudentImpl.setNew(tyClassStudent.isNew());
		tyClassStudentImpl.setPrimaryKey(tyClassStudent.getPrimaryKey());

		tyClassStudentImpl.setCourses(tyClassStudent.getCourses());
		tyClassStudentImpl.setStudentId(tyClassStudent.getStudentId());
		tyClassStudentImpl.setClassId(tyClassStudent.getClassId());

		return tyClassStudentImpl;
	}

	/**
	 * Finds the t y class student with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the t y class student to find
	 * @return the t y class student
	 * @throws com.liferay.portal.NoSuchModelException if a t y class student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYClassStudent findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((TYClassStudentPK)primaryKey);
	}

	/**
	 * Finds the t y class student with the primary key or throws a {@link org.tvd.thptty.NoSuchClassStudentException} if it could not be found.
	 *
	 * @param tyClassStudentPK the primary key of the t y class student to find
	 * @return the t y class student
	 * @throws org.tvd.thptty.NoSuchClassStudentException if a t y class student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYClassStudent findByPrimaryKey(TYClassStudentPK tyClassStudentPK)
		throws NoSuchClassStudentException, SystemException {
		TYClassStudent tyClassStudent = fetchByPrimaryKey(tyClassStudentPK);

		if (tyClassStudent == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + tyClassStudentPK);
			}

			throw new NoSuchClassStudentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				tyClassStudentPK);
		}

		return tyClassStudent;
	}

	/**
	 * Finds the t y class student with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the t y class student to find
	 * @return the t y class student, or <code>null</code> if a t y class student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYClassStudent fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((TYClassStudentPK)primaryKey);
	}

	/**
	 * Finds the t y class student with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tyClassStudentPK the primary key of the t y class student to find
	 * @return the t y class student, or <code>null</code> if a t y class student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYClassStudent fetchByPrimaryKey(TYClassStudentPK tyClassStudentPK)
		throws SystemException {
		TYClassStudent tyClassStudent = (TYClassStudent)EntityCacheUtil.getResult(TYClassStudentModelImpl.ENTITY_CACHE_ENABLED,
				TYClassStudentImpl.class, tyClassStudentPK, this);

		if (tyClassStudent == null) {
			Session session = null;

			try {
				session = openSession();

				tyClassStudent = (TYClassStudent)session.get(TYClassStudentImpl.class,
						tyClassStudentPK);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (tyClassStudent != null) {
					cacheResult(tyClassStudent);
				}

				closeSession(session);
			}
		}

		return tyClassStudent;
	}

	/**
	 * Finds all the t y class students where courses = &#63; and classId = &#63;.
	 *
	 * @param courses the courses to search with
	 * @param classId the class id to search with
	 * @return the matching t y class students
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYClassStudent> findByC_C(int courses, long classId)
		throws SystemException {
		return findByC_C(courses, classId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the t y class students where courses = &#63; and classId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param courses the courses to search with
	 * @param classId the class id to search with
	 * @param start the lower bound of the range of t y class students to return
	 * @param end the upper bound of the range of t y class students to return (not inclusive)
	 * @return the range of matching t y class students
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYClassStudent> findByC_C(int courses, long classId, int start,
		int end) throws SystemException {
		return findByC_C(courses, classId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the t y class students where courses = &#63; and classId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param courses the courses to search with
	 * @param classId the class id to search with
	 * @param start the lower bound of the range of t y class students to return
	 * @param end the upper bound of the range of t y class students to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching t y class students
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYClassStudent> findByC_C(int courses, long classId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				courses, classId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<TYClassStudent> list = (List<TYClassStudent>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_C_C,
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

			query.append(_SQL_SELECT_TYCLASSSTUDENT_WHERE);

			query.append(_FINDER_COLUMN_C_C_COURSES_2);

			query.append(_FINDER_COLUMN_C_C_CLASSID_2);

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

				qPos.add(courses);

				qPos.add(classId);

				list = (List<TYClassStudent>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_C_C,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_C_C,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first t y class student in the ordered set where courses = &#63; and classId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param courses the courses to search with
	 * @param classId the class id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching t y class student
	 * @throws org.tvd.thptty.NoSuchClassStudentException if a matching t y class student could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYClassStudent findByC_C_First(int courses, long classId,
		OrderByComparator orderByComparator)
		throws NoSuchClassStudentException, SystemException {
		List<TYClassStudent> list = findByC_C(courses, classId, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("courses=");
			msg.append(courses);

			msg.append(", classId=");
			msg.append(classId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchClassStudentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last t y class student in the ordered set where courses = &#63; and classId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param courses the courses to search with
	 * @param classId the class id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching t y class student
	 * @throws org.tvd.thptty.NoSuchClassStudentException if a matching t y class student could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYClassStudent findByC_C_Last(int courses, long classId,
		OrderByComparator orderByComparator)
		throws NoSuchClassStudentException, SystemException {
		int count = countByC_C(courses, classId);

		List<TYClassStudent> list = findByC_C(courses, classId, count - 1,
				count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("courses=");
			msg.append(courses);

			msg.append(", classId=");
			msg.append(classId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchClassStudentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the t y class students before and after the current t y class student in the ordered set where courses = &#63; and classId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param tyClassStudentPK the primary key of the current t y class student
	 * @param courses the courses to search with
	 * @param classId the class id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next t y class student
	 * @throws org.tvd.thptty.NoSuchClassStudentException if a t y class student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYClassStudent[] findByC_C_PrevAndNext(
		TYClassStudentPK tyClassStudentPK, int courses, long classId,
		OrderByComparator orderByComparator)
		throws NoSuchClassStudentException, SystemException {
		TYClassStudent tyClassStudent = findByPrimaryKey(tyClassStudentPK);

		Session session = null;

		try {
			session = openSession();

			TYClassStudent[] array = new TYClassStudentImpl[3];

			array[0] = getByC_C_PrevAndNext(session, tyClassStudent, courses,
					classId, orderByComparator, true);

			array[1] = tyClassStudent;

			array[2] = getByC_C_PrevAndNext(session, tyClassStudent, courses,
					classId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TYClassStudent getByC_C_PrevAndNext(Session session,
		TYClassStudent tyClassStudent, int courses, long classId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TYCLASSSTUDENT_WHERE);

		query.append(_FINDER_COLUMN_C_C_COURSES_2);

		query.append(_FINDER_COLUMN_C_C_CLASSID_2);

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

		qPos.add(courses);

		qPos.add(classId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(tyClassStudent);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TYClassStudent> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds the t y class student where courses = &#63; and studentId = &#63; or throws a {@link org.tvd.thptty.NoSuchClassStudentException} if it could not be found.
	 *
	 * @param courses the courses to search with
	 * @param studentId the student id to search with
	 * @return the matching t y class student
	 * @throws org.tvd.thptty.NoSuchClassStudentException if a matching t y class student could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYClassStudent findByC_S(int courses, long studentId)
		throws NoSuchClassStudentException, SystemException {
		TYClassStudent tyClassStudent = fetchByC_S(courses, studentId);

		if (tyClassStudent == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("courses=");
			msg.append(courses);

			msg.append(", studentId=");
			msg.append(studentId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchClassStudentException(msg.toString());
		}

		return tyClassStudent;
	}

	/**
	 * Finds the t y class student where courses = &#63; and studentId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param courses the courses to search with
	 * @param studentId the student id to search with
	 * @return the matching t y class student, or <code>null</code> if a matching t y class student could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYClassStudent fetchByC_S(int courses, long studentId)
		throws SystemException {
		return fetchByC_S(courses, studentId, true);
	}

	/**
	 * Finds the t y class student where courses = &#63; and studentId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param courses the courses to search with
	 * @param studentId the student id to search with
	 * @return the matching t y class student, or <code>null</code> if a matching t y class student could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYClassStudent fetchByC_S(int courses, long studentId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { courses, studentId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_C_S,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_TYCLASSSTUDENT_WHERE);

			query.append(_FINDER_COLUMN_C_S_COURSES_2);

			query.append(_FINDER_COLUMN_C_S_STUDENTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(courses);

				qPos.add(studentId);

				List<TYClassStudent> list = q.list();

				result = list;

				TYClassStudent tyClassStudent = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_S,
						finderArgs, list);
				}
				else {
					tyClassStudent = list.get(0);

					cacheResult(tyClassStudent);

					if ((tyClassStudent.getCourses() != courses) ||
							(tyClassStudent.getStudentId() != studentId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_S,
							finderArgs, tyClassStudent);
					}
				}

				return tyClassStudent;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_S,
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
				return (TYClassStudent)result;
			}
		}
	}

	/**
	 * Finds all the t y class students.
	 *
	 * @return the t y class students
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYClassStudent> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the t y class students.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of t y class students to return
	 * @param end the upper bound of the range of t y class students to return (not inclusive)
	 * @return the range of t y class students
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYClassStudent> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the t y class students.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of t y class students to return
	 * @param end the upper bound of the range of t y class students to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of t y class students
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYClassStudent> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<TYClassStudent> list = (List<TYClassStudent>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TYCLASSSTUDENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TYCLASSSTUDENT;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<TYClassStudent>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<TYClassStudent>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the t y class students where courses = &#63; and classId = &#63; from the database.
	 *
	 * @param courses the courses to search with
	 * @param classId the class id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByC_C(int courses, long classId)
		throws SystemException {
		for (TYClassStudent tyClassStudent : findByC_C(courses, classId)) {
			remove(tyClassStudent);
		}
	}

	/**
	 * Removes the t y class student where courses = &#63; and studentId = &#63; from the database.
	 *
	 * @param courses the courses to search with
	 * @param studentId the student id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByC_S(int courses, long studentId)
		throws NoSuchClassStudentException, SystemException {
		TYClassStudent tyClassStudent = findByC_S(courses, studentId);

		remove(tyClassStudent);
	}

	/**
	 * Removes all the t y class students from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (TYClassStudent tyClassStudent : findAll()) {
			remove(tyClassStudent);
		}
	}

	/**
	 * Counts all the t y class students where courses = &#63; and classId = &#63;.
	 *
	 * @param courses the courses to search with
	 * @param classId the class id to search with
	 * @return the number of matching t y class students
	 * @throws SystemException if a system exception occurred
	 */
	public int countByC_C(int courses, long classId) throws SystemException {
		Object[] finderArgs = new Object[] { courses, classId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_C_C,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TYCLASSSTUDENT_WHERE);

			query.append(_FINDER_COLUMN_C_C_COURSES_2);

			query.append(_FINDER_COLUMN_C_C_CLASSID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(courses);

				qPos.add(classId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_C_C, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the t y class students where courses = &#63; and studentId = &#63;.
	 *
	 * @param courses the courses to search with
	 * @param studentId the student id to search with
	 * @return the number of matching t y class students
	 * @throws SystemException if a system exception occurred
	 */
	public int countByC_S(int courses, long studentId)
		throws SystemException {
		Object[] finderArgs = new Object[] { courses, studentId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_C_S,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TYCLASSSTUDENT_WHERE);

			query.append(_FINDER_COLUMN_C_S_COURSES_2);

			query.append(_FINDER_COLUMN_C_S_STUDENTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(courses);

				qPos.add(studentId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_C_S, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the t y class students.
	 *
	 * @return the number of t y class students
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

				Query q = session.createQuery(_SQL_COUNT_TYCLASSSTUDENT);

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
	 * Initializes the t y class student persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.tvd.thptty.model.TYClassStudent")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TYClassStudent>> listenersList = new ArrayList<ModelListener<TYClassStudent>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TYClassStudent>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TYClassStudentImpl.class.getName());
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
	private static final String _SQL_SELECT_TYCLASSSTUDENT = "SELECT tyClassStudent FROM TYClassStudent tyClassStudent";
	private static final String _SQL_SELECT_TYCLASSSTUDENT_WHERE = "SELECT tyClassStudent FROM TYClassStudent tyClassStudent WHERE ";
	private static final String _SQL_COUNT_TYCLASSSTUDENT = "SELECT COUNT(tyClassStudent) FROM TYClassStudent tyClassStudent";
	private static final String _SQL_COUNT_TYCLASSSTUDENT_WHERE = "SELECT COUNT(tyClassStudent) FROM TYClassStudent tyClassStudent WHERE ";
	private static final String _FINDER_COLUMN_C_C_COURSES_2 = "tyClassStudent.id.courses = ? AND ";
	private static final String _FINDER_COLUMN_C_C_CLASSID_2 = "tyClassStudent.classId = ?";
	private static final String _FINDER_COLUMN_C_S_COURSES_2 = "tyClassStudent.id.courses = ? AND ";
	private static final String _FINDER_COLUMN_C_S_STUDENTID_2 = "tyClassStudent.id.studentId = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tyClassStudent.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TYClassStudent exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TYClassStudent exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(TYClassStudentPersistenceImpl.class);
}