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

import org.tvd.thptty.NoSuchStudentConductException;
import org.tvd.thptty.model.TYStudentConduct;
import org.tvd.thptty.model.impl.TYStudentConductImpl;
import org.tvd.thptty.model.impl.TYStudentConductModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the t y student conduct service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link TYStudentConductUtil} to access the t y student conduct persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ta Van Dung
 * @see TYStudentConductPersistence
 * @see TYStudentConductUtil
 * @generated
 */
public class TYStudentConductPersistenceImpl extends BasePersistenceImpl<TYStudentConduct>
	implements TYStudentConductPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = TYStudentConductImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FETCH_BY_C_S_S = new FinderPath(TYStudentConductModelImpl.ENTITY_CACHE_ENABLED,
			TYStudentConductModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_ENTITY, "fetchByC_S_S",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Long.class.getName()
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_C_S_S = new FinderPath(TYStudentConductModelImpl.ENTITY_CACHE_ENABLED,
			TYStudentConductModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByC_S_S",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Long.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(TYStudentConductModelImpl.ENTITY_CACHE_ENABLED,
			TYStudentConductModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TYStudentConductModelImpl.ENTITY_CACHE_ENABLED,
			TYStudentConductModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countAll", new String[0]);

	/**
	 * Caches the t y student conduct in the entity cache if it is enabled.
	 *
	 * @param tyStudentConduct the t y student conduct to cache
	 */
	public void cacheResult(TYStudentConduct tyStudentConduct) {
		EntityCacheUtil.putResult(TYStudentConductModelImpl.ENTITY_CACHE_ENABLED,
			TYStudentConductImpl.class, tyStudentConduct.getPrimaryKey(),
			tyStudentConduct);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_S_S,
			new Object[] {
				new Integer(tyStudentConduct.getCourses()),
				new Integer(tyStudentConduct.getSemester()),
				new Long(tyStudentConduct.getStudentId())
			}, tyStudentConduct);
	}

	/**
	 * Caches the t y student conducts in the entity cache if it is enabled.
	 *
	 * @param tyStudentConducts the t y student conducts to cache
	 */
	public void cacheResult(List<TYStudentConduct> tyStudentConducts) {
		for (TYStudentConduct tyStudentConduct : tyStudentConducts) {
			if (EntityCacheUtil.getResult(
						TYStudentConductModelImpl.ENTITY_CACHE_ENABLED,
						TYStudentConductImpl.class,
						tyStudentConduct.getPrimaryKey(), this) == null) {
				cacheResult(tyStudentConduct);
			}
		}
	}

	/**
	 * Clears the cache for all t y student conducts.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(TYStudentConductImpl.class.getName());
		EntityCacheUtil.clearCache(TYStudentConductImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the t y student conduct.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(TYStudentConduct tyStudentConduct) {
		EntityCacheUtil.removeResult(TYStudentConductModelImpl.ENTITY_CACHE_ENABLED,
			TYStudentConductImpl.class, tyStudentConduct.getPrimaryKey());

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_S_S,
			new Object[] {
				new Integer(tyStudentConduct.getCourses()),
				new Integer(tyStudentConduct.getSemester()),
				new Long(tyStudentConduct.getStudentId())
			});
	}

	/**
	 * Creates a new t y student conduct with the primary key. Does not add the t y student conduct to the database.
	 *
	 * @param tyStudentConductPK the primary key for the new t y student conduct
	 * @return the new t y student conduct
	 */
	public TYStudentConduct create(TYStudentConductPK tyStudentConductPK) {
		TYStudentConduct tyStudentConduct = new TYStudentConductImpl();

		tyStudentConduct.setNew(true);
		tyStudentConduct.setPrimaryKey(tyStudentConductPK);

		return tyStudentConduct;
	}

	/**
	 * Removes the t y student conduct with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the t y student conduct to remove
	 * @return the t y student conduct that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a t y student conduct with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudentConduct remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove((TYStudentConductPK)primaryKey);
	}

	/**
	 * Removes the t y student conduct with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tyStudentConductPK the primary key of the t y student conduct to remove
	 * @return the t y student conduct that was removed
	 * @throws org.tvd.thptty.NoSuchStudentConductException if a t y student conduct with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudentConduct remove(TYStudentConductPK tyStudentConductPK)
		throws NoSuchStudentConductException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TYStudentConduct tyStudentConduct = (TYStudentConduct)session.get(TYStudentConductImpl.class,
					tyStudentConductPK);

			if (tyStudentConduct == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
						tyStudentConductPK);
				}

				throw new NoSuchStudentConductException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					tyStudentConductPK);
			}

			return remove(tyStudentConduct);
		}
		catch (NoSuchStudentConductException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TYStudentConduct removeImpl(TYStudentConduct tyStudentConduct)
		throws SystemException {
		tyStudentConduct = toUnwrappedModel(tyStudentConduct);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, tyStudentConduct);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		TYStudentConductModelImpl tyStudentConductModelImpl = (TYStudentConductModelImpl)tyStudentConduct;

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_S_S,
			new Object[] {
				new Integer(tyStudentConductModelImpl.getCourses()),
				new Integer(tyStudentConductModelImpl.getSemester()),
				new Long(tyStudentConductModelImpl.getStudentId())
			});

		EntityCacheUtil.removeResult(TYStudentConductModelImpl.ENTITY_CACHE_ENABLED,
			TYStudentConductImpl.class, tyStudentConduct.getPrimaryKey());

		return tyStudentConduct;
	}

	public TYStudentConduct updateImpl(
		org.tvd.thptty.model.TYStudentConduct tyStudentConduct, boolean merge)
		throws SystemException {
		tyStudentConduct = toUnwrappedModel(tyStudentConduct);

		boolean isNew = tyStudentConduct.isNew();

		TYStudentConductModelImpl tyStudentConductModelImpl = (TYStudentConductModelImpl)tyStudentConduct;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, tyStudentConduct, merge);

			tyStudentConduct.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(TYStudentConductModelImpl.ENTITY_CACHE_ENABLED,
			TYStudentConductImpl.class, tyStudentConduct.getPrimaryKey(),
			tyStudentConduct);

		if (!isNew &&
				((tyStudentConduct.getCourses() != tyStudentConductModelImpl.getOriginalCourses()) ||
				(tyStudentConduct.getSemester() != tyStudentConductModelImpl.getOriginalSemester()) ||
				(tyStudentConduct.getStudentId() != tyStudentConductModelImpl.getOriginalStudentId()))) {
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_S_S,
				new Object[] {
					new Integer(tyStudentConductModelImpl.getOriginalCourses()),
					new Integer(tyStudentConductModelImpl.getOriginalSemester()),
					new Long(tyStudentConductModelImpl.getOriginalStudentId())
				});
		}

		if (isNew ||
				((tyStudentConduct.getCourses() != tyStudentConductModelImpl.getOriginalCourses()) ||
				(tyStudentConduct.getSemester() != tyStudentConductModelImpl.getOriginalSemester()) ||
				(tyStudentConduct.getStudentId() != tyStudentConductModelImpl.getOriginalStudentId()))) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_S_S,
				new Object[] {
					new Integer(tyStudentConduct.getCourses()),
					new Integer(tyStudentConduct.getSemester()),
					new Long(tyStudentConduct.getStudentId())
				}, tyStudentConduct);
		}

		return tyStudentConduct;
	}

	protected TYStudentConduct toUnwrappedModel(
		TYStudentConduct tyStudentConduct) {
		if (tyStudentConduct instanceof TYStudentConductImpl) {
			return tyStudentConduct;
		}

		TYStudentConductImpl tyStudentConductImpl = new TYStudentConductImpl();

		tyStudentConductImpl.setNew(tyStudentConduct.isNew());
		tyStudentConductImpl.setPrimaryKey(tyStudentConduct.getPrimaryKey());

		tyStudentConductImpl.setCourses(tyStudentConduct.getCourses());
		tyStudentConductImpl.setSemester(tyStudentConduct.getSemester());
		tyStudentConductImpl.setStudentId(tyStudentConduct.getStudentId());
		tyStudentConductImpl.setConduct(tyStudentConduct.getConduct());
		tyStudentConductImpl.setModifiedDate(tyStudentConduct.getModifiedDate());
		tyStudentConductImpl.setUserId(tyStudentConduct.getUserId());

		return tyStudentConductImpl;
	}

	/**
	 * Finds the t y student conduct with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the t y student conduct to find
	 * @return the t y student conduct
	 * @throws com.liferay.portal.NoSuchModelException if a t y student conduct with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudentConduct findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((TYStudentConductPK)primaryKey);
	}

	/**
	 * Finds the t y student conduct with the primary key or throws a {@link org.tvd.thptty.NoSuchStudentConductException} if it could not be found.
	 *
	 * @param tyStudentConductPK the primary key of the t y student conduct to find
	 * @return the t y student conduct
	 * @throws org.tvd.thptty.NoSuchStudentConductException if a t y student conduct with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudentConduct findByPrimaryKey(
		TYStudentConductPK tyStudentConductPK)
		throws NoSuchStudentConductException, SystemException {
		TYStudentConduct tyStudentConduct = fetchByPrimaryKey(tyStudentConductPK);

		if (tyStudentConduct == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					tyStudentConductPK);
			}

			throw new NoSuchStudentConductException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				tyStudentConductPK);
		}

		return tyStudentConduct;
	}

	/**
	 * Finds the t y student conduct with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the t y student conduct to find
	 * @return the t y student conduct, or <code>null</code> if a t y student conduct with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudentConduct fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((TYStudentConductPK)primaryKey);
	}

	/**
	 * Finds the t y student conduct with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tyStudentConductPK the primary key of the t y student conduct to find
	 * @return the t y student conduct, or <code>null</code> if a t y student conduct with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudentConduct fetchByPrimaryKey(
		TYStudentConductPK tyStudentConductPK) throws SystemException {
		TYStudentConduct tyStudentConduct = (TYStudentConduct)EntityCacheUtil.getResult(TYStudentConductModelImpl.ENTITY_CACHE_ENABLED,
				TYStudentConductImpl.class, tyStudentConductPK, this);

		if (tyStudentConduct == null) {
			Session session = null;

			try {
				session = openSession();

				tyStudentConduct = (TYStudentConduct)session.get(TYStudentConductImpl.class,
						tyStudentConductPK);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (tyStudentConduct != null) {
					cacheResult(tyStudentConduct);
				}

				closeSession(session);
			}
		}

		return tyStudentConduct;
	}

	/**
	 * Finds the t y student conduct where courses = &#63; and semester = &#63; and studentId = &#63; or throws a {@link org.tvd.thptty.NoSuchStudentConductException} if it could not be found.
	 *
	 * @param courses the courses to search with
	 * @param semester the semester to search with
	 * @param studentId the student id to search with
	 * @return the matching t y student conduct
	 * @throws org.tvd.thptty.NoSuchStudentConductException if a matching t y student conduct could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudentConduct findByC_S_S(int courses, int semester,
		long studentId) throws NoSuchStudentConductException, SystemException {
		TYStudentConduct tyStudentConduct = fetchByC_S_S(courses, semester,
				studentId);

		if (tyStudentConduct == null) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("courses=");
			msg.append(courses);

			msg.append(", semester=");
			msg.append(semester);

			msg.append(", studentId=");
			msg.append(studentId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchStudentConductException(msg.toString());
		}

		return tyStudentConduct;
	}

	/**
	 * Finds the t y student conduct where courses = &#63; and semester = &#63; and studentId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param courses the courses to search with
	 * @param semester the semester to search with
	 * @param studentId the student id to search with
	 * @return the matching t y student conduct, or <code>null</code> if a matching t y student conduct could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudentConduct fetchByC_S_S(int courses, int semester,
		long studentId) throws SystemException {
		return fetchByC_S_S(courses, semester, studentId, true);
	}

	/**
	 * Finds the t y student conduct where courses = &#63; and semester = &#63; and studentId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param courses the courses to search with
	 * @param semester the semester to search with
	 * @param studentId the student id to search with
	 * @return the matching t y student conduct, or <code>null</code> if a matching t y student conduct could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudentConduct fetchByC_S_S(int courses, int semester,
		long studentId, boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { courses, semester, studentId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_C_S_S,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_TYSTUDENTCONDUCT_WHERE);

			query.append(_FINDER_COLUMN_C_S_S_COURSES_2);

			query.append(_FINDER_COLUMN_C_S_S_SEMESTER_2);

			query.append(_FINDER_COLUMN_C_S_S_STUDENTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(courses);

				qPos.add(semester);

				qPos.add(studentId);

				List<TYStudentConduct> list = q.list();

				result = list;

				TYStudentConduct tyStudentConduct = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_S_S,
						finderArgs, list);
				}
				else {
					tyStudentConduct = list.get(0);

					cacheResult(tyStudentConduct);

					if ((tyStudentConduct.getCourses() != courses) ||
							(tyStudentConduct.getSemester() != semester) ||
							(tyStudentConduct.getStudentId() != studentId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_S_S,
							finderArgs, tyStudentConduct);
					}
				}

				return tyStudentConduct;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_S_S,
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
				return (TYStudentConduct)result;
			}
		}
	}

	/**
	 * Finds all the t y student conducts.
	 *
	 * @return the t y student conducts
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudentConduct> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the t y student conducts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of t y student conducts to return
	 * @param end the upper bound of the range of t y student conducts to return (not inclusive)
	 * @return the range of t y student conducts
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudentConduct> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the t y student conducts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of t y student conducts to return
	 * @param end the upper bound of the range of t y student conducts to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of t y student conducts
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudentConduct> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<TYStudentConduct> list = (List<TYStudentConduct>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TYSTUDENTCONDUCT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TYSTUDENTCONDUCT;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<TYStudentConduct>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<TYStudentConduct>)QueryUtil.list(q,
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
	 * Removes the t y student conduct where courses = &#63; and semester = &#63; and studentId = &#63; from the database.
	 *
	 * @param courses the courses to search with
	 * @param semester the semester to search with
	 * @param studentId the student id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByC_S_S(int courses, int semester, long studentId)
		throws NoSuchStudentConductException, SystemException {
		TYStudentConduct tyStudentConduct = findByC_S_S(courses, semester,
				studentId);

		remove(tyStudentConduct);
	}

	/**
	 * Removes all the t y student conducts from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (TYStudentConduct tyStudentConduct : findAll()) {
			remove(tyStudentConduct);
		}
	}

	/**
	 * Counts all the t y student conducts where courses = &#63; and semester = &#63; and studentId = &#63;.
	 *
	 * @param courses the courses to search with
	 * @param semester the semester to search with
	 * @param studentId the student id to search with
	 * @return the number of matching t y student conducts
	 * @throws SystemException if a system exception occurred
	 */
	public int countByC_S_S(int courses, int semester, long studentId)
		throws SystemException {
		Object[] finderArgs = new Object[] { courses, semester, studentId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_C_S_S,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_TYSTUDENTCONDUCT_WHERE);

			query.append(_FINDER_COLUMN_C_S_S_COURSES_2);

			query.append(_FINDER_COLUMN_C_S_S_SEMESTER_2);

			query.append(_FINDER_COLUMN_C_S_S_STUDENTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(courses);

				qPos.add(semester);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_C_S_S,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the t y student conducts.
	 *
	 * @return the number of t y student conducts
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

				Query q = session.createQuery(_SQL_COUNT_TYSTUDENTCONDUCT);

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
	 * Initializes the t y student conduct persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.tvd.thptty.model.TYStudentConduct")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TYStudentConduct>> listenersList = new ArrayList<ModelListener<TYStudentConduct>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TYStudentConduct>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TYStudentConductImpl.class.getName());
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
	private static final String _SQL_SELECT_TYSTUDENTCONDUCT = "SELECT tyStudentConduct FROM TYStudentConduct tyStudentConduct";
	private static final String _SQL_SELECT_TYSTUDENTCONDUCT_WHERE = "SELECT tyStudentConduct FROM TYStudentConduct tyStudentConduct WHERE ";
	private static final String _SQL_COUNT_TYSTUDENTCONDUCT = "SELECT COUNT(tyStudentConduct) FROM TYStudentConduct tyStudentConduct";
	private static final String _SQL_COUNT_TYSTUDENTCONDUCT_WHERE = "SELECT COUNT(tyStudentConduct) FROM TYStudentConduct tyStudentConduct WHERE ";
	private static final String _FINDER_COLUMN_C_S_S_COURSES_2 = "tyStudentConduct.id.courses = ? AND ";
	private static final String _FINDER_COLUMN_C_S_S_SEMESTER_2 = "tyStudentConduct.id.semester = ? AND ";
	private static final String _FINDER_COLUMN_C_S_S_STUDENTID_2 = "tyStudentConduct.id.studentId = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tyStudentConduct.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TYStudentConduct exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TYStudentConduct exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(TYStudentConductPersistenceImpl.class);
}