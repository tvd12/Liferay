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

import org.tvd.thptty.NoSuchStudentPointException;
import org.tvd.thptty.model.TYStudentPoint;
import org.tvd.thptty.model.impl.TYStudentPointImpl;
import org.tvd.thptty.model.impl.TYStudentPointModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the t y student point service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link TYStudentPointUtil} to access the t y student point persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ta Van Dung
 * @see TYStudentPointPersistence
 * @see TYStudentPointUtil
 * @generated
 */
public class TYStudentPointPersistenceImpl extends BasePersistenceImpl<TYStudentPoint>
	implements TYStudentPointPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = TYStudentPointImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FETCH_BY_C_S_S_S_PT_PI_PF = new FinderPath(TYStudentPointModelImpl.ENTITY_CACHE_ENABLED,
			TYStudentPointModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_ENTITY, "fetchByC_S_S_S_PT_PI_PF",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_C_S_S_S_PT_PI_PF = new FinderPath(TYStudentPointModelImpl.ENTITY_CACHE_ENABLED,
			TYStudentPointModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByC_S_S_S_PT_PI_PF",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_C_S_S_S_PT_PF = new FinderPath(TYStudentPointModelImpl.ENTITY_CACHE_ENABLED,
			TYStudentPointModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByC_S_S_S_PT_PF",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_C_S_S_S_PT_PF = new FinderPath(TYStudentPointModelImpl.ENTITY_CACHE_ENABLED,
			TYStudentPointModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByC_S_S_S_PT_PF",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(TYStudentPointModelImpl.ENTITY_CACHE_ENABLED,
			TYStudentPointModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TYStudentPointModelImpl.ENTITY_CACHE_ENABLED,
			TYStudentPointModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countAll", new String[0]);

	/**
	 * Caches the t y student point in the entity cache if it is enabled.
	 *
	 * @param tyStudentPoint the t y student point to cache
	 */
	public void cacheResult(TYStudentPoint tyStudentPoint) {
		EntityCacheUtil.putResult(TYStudentPointModelImpl.ENTITY_CACHE_ENABLED,
			TYStudentPointImpl.class, tyStudentPoint.getPrimaryKey(),
			tyStudentPoint);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_S_S_S_PT_PI_PF,
			new Object[] {
				new Integer(tyStudentPoint.getCourses()),
				new Integer(tyStudentPoint.getSemester()),
				new Long(tyStudentPoint.getStudentId()),
				new Long(tyStudentPoint.getSubjectId()),
				new Integer(tyStudentPoint.getPointType()),
				new Integer(tyStudentPoint.getPointIndex()),
				new Integer(tyStudentPoint.getPointFactor())
			}, tyStudentPoint);
	}

	/**
	 * Caches the t y student points in the entity cache if it is enabled.
	 *
	 * @param tyStudentPoints the t y student points to cache
	 */
	public void cacheResult(List<TYStudentPoint> tyStudentPoints) {
		for (TYStudentPoint tyStudentPoint : tyStudentPoints) {
			if (EntityCacheUtil.getResult(
						TYStudentPointModelImpl.ENTITY_CACHE_ENABLED,
						TYStudentPointImpl.class,
						tyStudentPoint.getPrimaryKey(), this) == null) {
				cacheResult(tyStudentPoint);
			}
		}
	}

	/**
	 * Clears the cache for all t y student points.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(TYStudentPointImpl.class.getName());
		EntityCacheUtil.clearCache(TYStudentPointImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the t y student point.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(TYStudentPoint tyStudentPoint) {
		EntityCacheUtil.removeResult(TYStudentPointModelImpl.ENTITY_CACHE_ENABLED,
			TYStudentPointImpl.class, tyStudentPoint.getPrimaryKey());

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_S_S_S_PT_PI_PF,
			new Object[] {
				new Integer(tyStudentPoint.getCourses()),
				new Integer(tyStudentPoint.getSemester()),
				new Long(tyStudentPoint.getStudentId()),
				new Long(tyStudentPoint.getSubjectId()),
				new Integer(tyStudentPoint.getPointType()),
				new Integer(tyStudentPoint.getPointIndex()),
				new Integer(tyStudentPoint.getPointFactor())
			});
	}

	/**
	 * Creates a new t y student point with the primary key. Does not add the t y student point to the database.
	 *
	 * @param tyStudentPointPK the primary key for the new t y student point
	 * @return the new t y student point
	 */
	public TYStudentPoint create(TYStudentPointPK tyStudentPointPK) {
		TYStudentPoint tyStudentPoint = new TYStudentPointImpl();

		tyStudentPoint.setNew(true);
		tyStudentPoint.setPrimaryKey(tyStudentPointPK);

		return tyStudentPoint;
	}

	/**
	 * Removes the t y student point with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the t y student point to remove
	 * @return the t y student point that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a t y student point with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudentPoint remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove((TYStudentPointPK)primaryKey);
	}

	/**
	 * Removes the t y student point with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tyStudentPointPK the primary key of the t y student point to remove
	 * @return the t y student point that was removed
	 * @throws org.tvd.thptty.NoSuchStudentPointException if a t y student point with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudentPoint remove(TYStudentPointPK tyStudentPointPK)
		throws NoSuchStudentPointException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TYStudentPoint tyStudentPoint = (TYStudentPoint)session.get(TYStudentPointImpl.class,
					tyStudentPointPK);

			if (tyStudentPoint == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
						tyStudentPointPK);
				}

				throw new NoSuchStudentPointException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					tyStudentPointPK);
			}

			return remove(tyStudentPoint);
		}
		catch (NoSuchStudentPointException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TYStudentPoint removeImpl(TYStudentPoint tyStudentPoint)
		throws SystemException {
		tyStudentPoint = toUnwrappedModel(tyStudentPoint);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, tyStudentPoint);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		TYStudentPointModelImpl tyStudentPointModelImpl = (TYStudentPointModelImpl)tyStudentPoint;

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_S_S_S_PT_PI_PF,
			new Object[] {
				new Integer(tyStudentPointModelImpl.getCourses()),
				new Integer(tyStudentPointModelImpl.getSemester()),
				new Long(tyStudentPointModelImpl.getStudentId()),
				new Long(tyStudentPointModelImpl.getSubjectId()),
				new Integer(tyStudentPointModelImpl.getPointType()),
				new Integer(tyStudentPointModelImpl.getPointIndex()),
				new Integer(tyStudentPointModelImpl.getPointFactor())
			});

		EntityCacheUtil.removeResult(TYStudentPointModelImpl.ENTITY_CACHE_ENABLED,
			TYStudentPointImpl.class, tyStudentPoint.getPrimaryKey());

		return tyStudentPoint;
	}

	public TYStudentPoint updateImpl(
		org.tvd.thptty.model.TYStudentPoint tyStudentPoint, boolean merge)
		throws SystemException {
		tyStudentPoint = toUnwrappedModel(tyStudentPoint);

		boolean isNew = tyStudentPoint.isNew();

		TYStudentPointModelImpl tyStudentPointModelImpl = (TYStudentPointModelImpl)tyStudentPoint;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, tyStudentPoint, merge);

			tyStudentPoint.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(TYStudentPointModelImpl.ENTITY_CACHE_ENABLED,
			TYStudentPointImpl.class, tyStudentPoint.getPrimaryKey(),
			tyStudentPoint);

		if (!isNew &&
				((tyStudentPoint.getCourses() != tyStudentPointModelImpl.getOriginalCourses()) ||
				(tyStudentPoint.getSemester() != tyStudentPointModelImpl.getOriginalSemester()) ||
				(tyStudentPoint.getStudentId() != tyStudentPointModelImpl.getOriginalStudentId()) ||
				(tyStudentPoint.getSubjectId() != tyStudentPointModelImpl.getOriginalSubjectId()) ||
				(tyStudentPoint.getPointType() != tyStudentPointModelImpl.getOriginalPointType()) ||
				(tyStudentPoint.getPointIndex() != tyStudentPointModelImpl.getOriginalPointIndex()) ||
				(tyStudentPoint.getPointFactor() != tyStudentPointModelImpl.getOriginalPointFactor()))) {
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_S_S_S_PT_PI_PF,
				new Object[] {
					new Integer(tyStudentPointModelImpl.getOriginalCourses()),
					new Integer(tyStudentPointModelImpl.getOriginalSemester()),
					new Long(tyStudentPointModelImpl.getOriginalStudentId()),
					new Long(tyStudentPointModelImpl.getOriginalSubjectId()),
					new Integer(tyStudentPointModelImpl.getOriginalPointType()),
					new Integer(tyStudentPointModelImpl.getOriginalPointIndex()),
					new Integer(tyStudentPointModelImpl.getOriginalPointFactor())
				});
		}

		if (isNew ||
				((tyStudentPoint.getCourses() != tyStudentPointModelImpl.getOriginalCourses()) ||
				(tyStudentPoint.getSemester() != tyStudentPointModelImpl.getOriginalSemester()) ||
				(tyStudentPoint.getStudentId() != tyStudentPointModelImpl.getOriginalStudentId()) ||
				(tyStudentPoint.getSubjectId() != tyStudentPointModelImpl.getOriginalSubjectId()) ||
				(tyStudentPoint.getPointType() != tyStudentPointModelImpl.getOriginalPointType()) ||
				(tyStudentPoint.getPointIndex() != tyStudentPointModelImpl.getOriginalPointIndex()) ||
				(tyStudentPoint.getPointFactor() != tyStudentPointModelImpl.getOriginalPointFactor()))) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_S_S_S_PT_PI_PF,
				new Object[] {
					new Integer(tyStudentPoint.getCourses()),
					new Integer(tyStudentPoint.getSemester()),
					new Long(tyStudentPoint.getStudentId()),
					new Long(tyStudentPoint.getSubjectId()),
					new Integer(tyStudentPoint.getPointType()),
					new Integer(tyStudentPoint.getPointIndex()),
					new Integer(tyStudentPoint.getPointFactor())
				}, tyStudentPoint);
		}

		return tyStudentPoint;
	}

	protected TYStudentPoint toUnwrappedModel(TYStudentPoint tyStudentPoint) {
		if (tyStudentPoint instanceof TYStudentPointImpl) {
			return tyStudentPoint;
		}

		TYStudentPointImpl tyStudentPointImpl = new TYStudentPointImpl();

		tyStudentPointImpl.setNew(tyStudentPoint.isNew());
		tyStudentPointImpl.setPrimaryKey(tyStudentPoint.getPrimaryKey());

		tyStudentPointImpl.setCourses(tyStudentPoint.getCourses());
		tyStudentPointImpl.setSemester(tyStudentPoint.getSemester());
		tyStudentPointImpl.setStudentId(tyStudentPoint.getStudentId());
		tyStudentPointImpl.setSubjectId(tyStudentPoint.getSubjectId());
		tyStudentPointImpl.setPointType(tyStudentPoint.getPointType());
		tyStudentPointImpl.setPointIndex(tyStudentPoint.getPointIndex());
		tyStudentPointImpl.setPointFactor(tyStudentPoint.getPointFactor());
		tyStudentPointImpl.setPoint(tyStudentPoint.getPoint());
		tyStudentPointImpl.setModifiedDate(tyStudentPoint.getModifiedDate());
		tyStudentPointImpl.setUserId(tyStudentPoint.getUserId());

		return tyStudentPointImpl;
	}

	/**
	 * Finds the t y student point with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the t y student point to find
	 * @return the t y student point
	 * @throws com.liferay.portal.NoSuchModelException if a t y student point with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudentPoint findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((TYStudentPointPK)primaryKey);
	}

	/**
	 * Finds the t y student point with the primary key or throws a {@link org.tvd.thptty.NoSuchStudentPointException} if it could not be found.
	 *
	 * @param tyStudentPointPK the primary key of the t y student point to find
	 * @return the t y student point
	 * @throws org.tvd.thptty.NoSuchStudentPointException if a t y student point with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudentPoint findByPrimaryKey(TYStudentPointPK tyStudentPointPK)
		throws NoSuchStudentPointException, SystemException {
		TYStudentPoint tyStudentPoint = fetchByPrimaryKey(tyStudentPointPK);

		if (tyStudentPoint == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + tyStudentPointPK);
			}

			throw new NoSuchStudentPointException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				tyStudentPointPK);
		}

		return tyStudentPoint;
	}

	/**
	 * Finds the t y student point with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the t y student point to find
	 * @return the t y student point, or <code>null</code> if a t y student point with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudentPoint fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((TYStudentPointPK)primaryKey);
	}

	/**
	 * Finds the t y student point with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tyStudentPointPK the primary key of the t y student point to find
	 * @return the t y student point, or <code>null</code> if a t y student point with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudentPoint fetchByPrimaryKey(TYStudentPointPK tyStudentPointPK)
		throws SystemException {
		TYStudentPoint tyStudentPoint = (TYStudentPoint)EntityCacheUtil.getResult(TYStudentPointModelImpl.ENTITY_CACHE_ENABLED,
				TYStudentPointImpl.class, tyStudentPointPK, this);

		if (tyStudentPoint == null) {
			Session session = null;

			try {
				session = openSession();

				tyStudentPoint = (TYStudentPoint)session.get(TYStudentPointImpl.class,
						tyStudentPointPK);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (tyStudentPoint != null) {
					cacheResult(tyStudentPoint);
				}

				closeSession(session);
			}
		}

		return tyStudentPoint;
	}

	/**
	 * Finds the t y student point where courses = &#63; and semester = &#63; and studentId = &#63; and subjectId = &#63; and pointType = &#63; and pointIndex = &#63; and pointFactor = &#63; or throws a {@link org.tvd.thptty.NoSuchStudentPointException} if it could not be found.
	 *
	 * @param courses the courses to search with
	 * @param semester the semester to search with
	 * @param studentId the student id to search with
	 * @param subjectId the subject id to search with
	 * @param pointType the point type to search with
	 * @param pointIndex the point index to search with
	 * @param pointFactor the point factor to search with
	 * @return the matching t y student point
	 * @throws org.tvd.thptty.NoSuchStudentPointException if a matching t y student point could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudentPoint findByC_S_S_S_PT_PI_PF(int courses, int semester,
		long studentId, long subjectId, int pointType, int pointIndex,
		int pointFactor) throws NoSuchStudentPointException, SystemException {
		TYStudentPoint tyStudentPoint = fetchByC_S_S_S_PT_PI_PF(courses,
				semester, studentId, subjectId, pointType, pointIndex,
				pointFactor);

		if (tyStudentPoint == null) {
			StringBundler msg = new StringBundler(16);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("courses=");
			msg.append(courses);

			msg.append(", semester=");
			msg.append(semester);

			msg.append(", studentId=");
			msg.append(studentId);

			msg.append(", subjectId=");
			msg.append(subjectId);

			msg.append(", pointType=");
			msg.append(pointType);

			msg.append(", pointIndex=");
			msg.append(pointIndex);

			msg.append(", pointFactor=");
			msg.append(pointFactor);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchStudentPointException(msg.toString());
		}

		return tyStudentPoint;
	}

	/**
	 * Finds the t y student point where courses = &#63; and semester = &#63; and studentId = &#63; and subjectId = &#63; and pointType = &#63; and pointIndex = &#63; and pointFactor = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param courses the courses to search with
	 * @param semester the semester to search with
	 * @param studentId the student id to search with
	 * @param subjectId the subject id to search with
	 * @param pointType the point type to search with
	 * @param pointIndex the point index to search with
	 * @param pointFactor the point factor to search with
	 * @return the matching t y student point, or <code>null</code> if a matching t y student point could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudentPoint fetchByC_S_S_S_PT_PI_PF(int courses, int semester,
		long studentId, long subjectId, int pointType, int pointIndex,
		int pointFactor) throws SystemException {
		return fetchByC_S_S_S_PT_PI_PF(courses, semester, studentId, subjectId,
			pointType, pointIndex, pointFactor, true);
	}

	/**
	 * Finds the t y student point where courses = &#63; and semester = &#63; and studentId = &#63; and subjectId = &#63; and pointType = &#63; and pointIndex = &#63; and pointFactor = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param courses the courses to search with
	 * @param semester the semester to search with
	 * @param studentId the student id to search with
	 * @param subjectId the subject id to search with
	 * @param pointType the point type to search with
	 * @param pointIndex the point index to search with
	 * @param pointFactor the point factor to search with
	 * @return the matching t y student point, or <code>null</code> if a matching t y student point could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudentPoint fetchByC_S_S_S_PT_PI_PF(int courses, int semester,
		long studentId, long subjectId, int pointType, int pointIndex,
		int pointFactor, boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] {
				courses, semester, studentId, subjectId, pointType, pointIndex,
				pointFactor
			};

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_C_S_S_S_PT_PI_PF,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(8);

			query.append(_SQL_SELECT_TYSTUDENTPOINT_WHERE);

			query.append(_FINDER_COLUMN_C_S_S_S_PT_PI_PF_COURSES_2);

			query.append(_FINDER_COLUMN_C_S_S_S_PT_PI_PF_SEMESTER_2);

			query.append(_FINDER_COLUMN_C_S_S_S_PT_PI_PF_STUDENTID_2);

			query.append(_FINDER_COLUMN_C_S_S_S_PT_PI_PF_SUBJECTID_2);

			query.append(_FINDER_COLUMN_C_S_S_S_PT_PI_PF_POINTTYPE_2);

			query.append(_FINDER_COLUMN_C_S_S_S_PT_PI_PF_POINTINDEX_2);

			query.append(_FINDER_COLUMN_C_S_S_S_PT_PI_PF_POINTFACTOR_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(courses);

				qPos.add(semester);

				qPos.add(studentId);

				qPos.add(subjectId);

				qPos.add(pointType);

				qPos.add(pointIndex);

				qPos.add(pointFactor);

				List<TYStudentPoint> list = q.list();

				result = list;

				TYStudentPoint tyStudentPoint = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_S_S_S_PT_PI_PF,
						finderArgs, list);
				}
				else {
					tyStudentPoint = list.get(0);

					cacheResult(tyStudentPoint);

					if ((tyStudentPoint.getCourses() != courses) ||
							(tyStudentPoint.getSemester() != semester) ||
							(tyStudentPoint.getStudentId() != studentId) ||
							(tyStudentPoint.getSubjectId() != subjectId) ||
							(tyStudentPoint.getPointType() != pointType) ||
							(tyStudentPoint.getPointIndex() != pointIndex) ||
							(tyStudentPoint.getPointFactor() != pointFactor)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_S_S_S_PT_PI_PF,
							finderArgs, tyStudentPoint);
					}
				}

				return tyStudentPoint;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_S_S_S_PT_PI_PF,
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
				return (TYStudentPoint)result;
			}
		}
	}

	/**
	 * Finds all the t y student points where courses = &#63; and semester = &#63; and studentId = &#63; and subjectId = &#63; and pointType = &#63; and pointFactor = &#63;.
	 *
	 * @param courses the courses to search with
	 * @param semester the semester to search with
	 * @param studentId the student id to search with
	 * @param subjectId the subject id to search with
	 * @param pointType the point type to search with
	 * @param pointFactor the point factor to search with
	 * @return the matching t y student points
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudentPoint> findByC_S_S_S_PT_PF(int courses, int semester,
		long studentId, long subjectId, int pointType, int pointFactor)
		throws SystemException {
		return findByC_S_S_S_PT_PF(courses, semester, studentId, subjectId,
			pointType, pointFactor, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the t y student points where courses = &#63; and semester = &#63; and studentId = &#63; and subjectId = &#63; and pointType = &#63; and pointFactor = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param courses the courses to search with
	 * @param semester the semester to search with
	 * @param studentId the student id to search with
	 * @param subjectId the subject id to search with
	 * @param pointType the point type to search with
	 * @param pointFactor the point factor to search with
	 * @param start the lower bound of the range of t y student points to return
	 * @param end the upper bound of the range of t y student points to return (not inclusive)
	 * @return the range of matching t y student points
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudentPoint> findByC_S_S_S_PT_PF(int courses, int semester,
		long studentId, long subjectId, int pointType, int pointFactor,
		int start, int end) throws SystemException {
		return findByC_S_S_S_PT_PF(courses, semester, studentId, subjectId,
			pointType, pointFactor, start, end, null);
	}

	/**
	 * Finds an ordered range of all the t y student points where courses = &#63; and semester = &#63; and studentId = &#63; and subjectId = &#63; and pointType = &#63; and pointFactor = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param courses the courses to search with
	 * @param semester the semester to search with
	 * @param studentId the student id to search with
	 * @param subjectId the subject id to search with
	 * @param pointType the point type to search with
	 * @param pointFactor the point factor to search with
	 * @param start the lower bound of the range of t y student points to return
	 * @param end the upper bound of the range of t y student points to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching t y student points
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudentPoint> findByC_S_S_S_PT_PF(int courses, int semester,
		long studentId, long subjectId, int pointType, int pointFactor,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				courses, semester, studentId, subjectId, pointType, pointFactor,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<TYStudentPoint> list = (List<TYStudentPoint>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_C_S_S_S_PT_PF,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(8 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(7);
			}

			query.append(_SQL_SELECT_TYSTUDENTPOINT_WHERE);

			query.append(_FINDER_COLUMN_C_S_S_S_PT_PF_COURSES_2);

			query.append(_FINDER_COLUMN_C_S_S_S_PT_PF_SEMESTER_2);

			query.append(_FINDER_COLUMN_C_S_S_S_PT_PF_STUDENTID_2);

			query.append(_FINDER_COLUMN_C_S_S_S_PT_PF_SUBJECTID_2);

			query.append(_FINDER_COLUMN_C_S_S_S_PT_PF_POINTTYPE_2);

			query.append(_FINDER_COLUMN_C_S_S_S_PT_PF_POINTFACTOR_2);

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

				qPos.add(semester);

				qPos.add(studentId);

				qPos.add(subjectId);

				qPos.add(pointType);

				qPos.add(pointFactor);

				list = (List<TYStudentPoint>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_C_S_S_S_PT_PF,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_C_S_S_S_PT_PF,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first t y student point in the ordered set where courses = &#63; and semester = &#63; and studentId = &#63; and subjectId = &#63; and pointType = &#63; and pointFactor = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param courses the courses to search with
	 * @param semester the semester to search with
	 * @param studentId the student id to search with
	 * @param subjectId the subject id to search with
	 * @param pointType the point type to search with
	 * @param pointFactor the point factor to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching t y student point
	 * @throws org.tvd.thptty.NoSuchStudentPointException if a matching t y student point could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudentPoint findByC_S_S_S_PT_PF_First(int courses, int semester,
		long studentId, long subjectId, int pointType, int pointFactor,
		OrderByComparator orderByComparator)
		throws NoSuchStudentPointException, SystemException {
		List<TYStudentPoint> list = findByC_S_S_S_PT_PF(courses, semester,
				studentId, subjectId, pointType, pointFactor, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(14);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("courses=");
			msg.append(courses);

			msg.append(", semester=");
			msg.append(semester);

			msg.append(", studentId=");
			msg.append(studentId);

			msg.append(", subjectId=");
			msg.append(subjectId);

			msg.append(", pointType=");
			msg.append(pointType);

			msg.append(", pointFactor=");
			msg.append(pointFactor);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchStudentPointException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last t y student point in the ordered set where courses = &#63; and semester = &#63; and studentId = &#63; and subjectId = &#63; and pointType = &#63; and pointFactor = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param courses the courses to search with
	 * @param semester the semester to search with
	 * @param studentId the student id to search with
	 * @param subjectId the subject id to search with
	 * @param pointType the point type to search with
	 * @param pointFactor the point factor to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching t y student point
	 * @throws org.tvd.thptty.NoSuchStudentPointException if a matching t y student point could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudentPoint findByC_S_S_S_PT_PF_Last(int courses, int semester,
		long studentId, long subjectId, int pointType, int pointFactor,
		OrderByComparator orderByComparator)
		throws NoSuchStudentPointException, SystemException {
		int count = countByC_S_S_S_PT_PF(courses, semester, studentId,
				subjectId, pointType, pointFactor);

		List<TYStudentPoint> list = findByC_S_S_S_PT_PF(courses, semester,
				studentId, subjectId, pointType, pointFactor, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(14);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("courses=");
			msg.append(courses);

			msg.append(", semester=");
			msg.append(semester);

			msg.append(", studentId=");
			msg.append(studentId);

			msg.append(", subjectId=");
			msg.append(subjectId);

			msg.append(", pointType=");
			msg.append(pointType);

			msg.append(", pointFactor=");
			msg.append(pointFactor);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchStudentPointException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the t y student points before and after the current t y student point in the ordered set where courses = &#63; and semester = &#63; and studentId = &#63; and subjectId = &#63; and pointType = &#63; and pointFactor = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param tyStudentPointPK the primary key of the current t y student point
	 * @param courses the courses to search with
	 * @param semester the semester to search with
	 * @param studentId the student id to search with
	 * @param subjectId the subject id to search with
	 * @param pointType the point type to search with
	 * @param pointFactor the point factor to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next t y student point
	 * @throws org.tvd.thptty.NoSuchStudentPointException if a t y student point with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudentPoint[] findByC_S_S_S_PT_PF_PrevAndNext(
		TYStudentPointPK tyStudentPointPK, int courses, int semester,
		long studentId, long subjectId, int pointType, int pointFactor,
		OrderByComparator orderByComparator)
		throws NoSuchStudentPointException, SystemException {
		TYStudentPoint tyStudentPoint = findByPrimaryKey(tyStudentPointPK);

		Session session = null;

		try {
			session = openSession();

			TYStudentPoint[] array = new TYStudentPointImpl[3];

			array[0] = getByC_S_S_S_PT_PF_PrevAndNext(session, tyStudentPoint,
					courses, semester, studentId, subjectId, pointType,
					pointFactor, orderByComparator, true);

			array[1] = tyStudentPoint;

			array[2] = getByC_S_S_S_PT_PF_PrevAndNext(session, tyStudentPoint,
					courses, semester, studentId, subjectId, pointType,
					pointFactor, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TYStudentPoint getByC_S_S_S_PT_PF_PrevAndNext(Session session,
		TYStudentPoint tyStudentPoint, int courses, int semester,
		long studentId, long subjectId, int pointType, int pointFactor,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TYSTUDENTPOINT_WHERE);

		query.append(_FINDER_COLUMN_C_S_S_S_PT_PF_COURSES_2);

		query.append(_FINDER_COLUMN_C_S_S_S_PT_PF_SEMESTER_2);

		query.append(_FINDER_COLUMN_C_S_S_S_PT_PF_STUDENTID_2);

		query.append(_FINDER_COLUMN_C_S_S_S_PT_PF_SUBJECTID_2);

		query.append(_FINDER_COLUMN_C_S_S_S_PT_PF_POINTTYPE_2);

		query.append(_FINDER_COLUMN_C_S_S_S_PT_PF_POINTFACTOR_2);

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

		qPos.add(semester);

		qPos.add(studentId);

		qPos.add(subjectId);

		qPos.add(pointType);

		qPos.add(pointFactor);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(tyStudentPoint);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TYStudentPoint> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the t y student points.
	 *
	 * @return the t y student points
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudentPoint> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the t y student points.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of t y student points to return
	 * @param end the upper bound of the range of t y student points to return (not inclusive)
	 * @return the range of t y student points
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudentPoint> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the t y student points.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of t y student points to return
	 * @param end the upper bound of the range of t y student points to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of t y student points
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudentPoint> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<TYStudentPoint> list = (List<TYStudentPoint>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TYSTUDENTPOINT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TYSTUDENTPOINT;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<TYStudentPoint>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<TYStudentPoint>)QueryUtil.list(q,
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
	 * Removes the t y student point where courses = &#63; and semester = &#63; and studentId = &#63; and subjectId = &#63; and pointType = &#63; and pointIndex = &#63; and pointFactor = &#63; from the database.
	 *
	 * @param courses the courses to search with
	 * @param semester the semester to search with
	 * @param studentId the student id to search with
	 * @param subjectId the subject id to search with
	 * @param pointType the point type to search with
	 * @param pointIndex the point index to search with
	 * @param pointFactor the point factor to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByC_S_S_S_PT_PI_PF(int courses, int semester,
		long studentId, long subjectId, int pointType, int pointIndex,
		int pointFactor) throws NoSuchStudentPointException, SystemException {
		TYStudentPoint tyStudentPoint = findByC_S_S_S_PT_PI_PF(courses,
				semester, studentId, subjectId, pointType, pointIndex,
				pointFactor);

		remove(tyStudentPoint);
	}

	/**
	 * Removes all the t y student points where courses = &#63; and semester = &#63; and studentId = &#63; and subjectId = &#63; and pointType = &#63; and pointFactor = &#63; from the database.
	 *
	 * @param courses the courses to search with
	 * @param semester the semester to search with
	 * @param studentId the student id to search with
	 * @param subjectId the subject id to search with
	 * @param pointType the point type to search with
	 * @param pointFactor the point factor to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByC_S_S_S_PT_PF(int courses, int semester,
		long studentId, long subjectId, int pointType, int pointFactor)
		throws SystemException {
		for (TYStudentPoint tyStudentPoint : findByC_S_S_S_PT_PF(courses,
				semester, studentId, subjectId, pointType, pointFactor)) {
			remove(tyStudentPoint);
		}
	}

	/**
	 * Removes all the t y student points from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (TYStudentPoint tyStudentPoint : findAll()) {
			remove(tyStudentPoint);
		}
	}

	/**
	 * Counts all the t y student points where courses = &#63; and semester = &#63; and studentId = &#63; and subjectId = &#63; and pointType = &#63; and pointIndex = &#63; and pointFactor = &#63;.
	 *
	 * @param courses the courses to search with
	 * @param semester the semester to search with
	 * @param studentId the student id to search with
	 * @param subjectId the subject id to search with
	 * @param pointType the point type to search with
	 * @param pointIndex the point index to search with
	 * @param pointFactor the point factor to search with
	 * @return the number of matching t y student points
	 * @throws SystemException if a system exception occurred
	 */
	public int countByC_S_S_S_PT_PI_PF(int courses, int semester,
		long studentId, long subjectId, int pointType, int pointIndex,
		int pointFactor) throws SystemException {
		Object[] finderArgs = new Object[] {
				courses, semester, studentId, subjectId, pointType, pointIndex,
				pointFactor
			};

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_C_S_S_S_PT_PI_PF,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(8);

			query.append(_SQL_COUNT_TYSTUDENTPOINT_WHERE);

			query.append(_FINDER_COLUMN_C_S_S_S_PT_PI_PF_COURSES_2);

			query.append(_FINDER_COLUMN_C_S_S_S_PT_PI_PF_SEMESTER_2);

			query.append(_FINDER_COLUMN_C_S_S_S_PT_PI_PF_STUDENTID_2);

			query.append(_FINDER_COLUMN_C_S_S_S_PT_PI_PF_SUBJECTID_2);

			query.append(_FINDER_COLUMN_C_S_S_S_PT_PI_PF_POINTTYPE_2);

			query.append(_FINDER_COLUMN_C_S_S_S_PT_PI_PF_POINTINDEX_2);

			query.append(_FINDER_COLUMN_C_S_S_S_PT_PI_PF_POINTFACTOR_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(courses);

				qPos.add(semester);

				qPos.add(studentId);

				qPos.add(subjectId);

				qPos.add(pointType);

				qPos.add(pointIndex);

				qPos.add(pointFactor);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_C_S_S_S_PT_PI_PF,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the t y student points where courses = &#63; and semester = &#63; and studentId = &#63; and subjectId = &#63; and pointType = &#63; and pointFactor = &#63;.
	 *
	 * @param courses the courses to search with
	 * @param semester the semester to search with
	 * @param studentId the student id to search with
	 * @param subjectId the subject id to search with
	 * @param pointType the point type to search with
	 * @param pointFactor the point factor to search with
	 * @return the number of matching t y student points
	 * @throws SystemException if a system exception occurred
	 */
	public int countByC_S_S_S_PT_PF(int courses, int semester, long studentId,
		long subjectId, int pointType, int pointFactor)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				courses, semester, studentId, subjectId, pointType, pointFactor
			};

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_C_S_S_S_PT_PF,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(7);

			query.append(_SQL_COUNT_TYSTUDENTPOINT_WHERE);

			query.append(_FINDER_COLUMN_C_S_S_S_PT_PF_COURSES_2);

			query.append(_FINDER_COLUMN_C_S_S_S_PT_PF_SEMESTER_2);

			query.append(_FINDER_COLUMN_C_S_S_S_PT_PF_STUDENTID_2);

			query.append(_FINDER_COLUMN_C_S_S_S_PT_PF_SUBJECTID_2);

			query.append(_FINDER_COLUMN_C_S_S_S_PT_PF_POINTTYPE_2);

			query.append(_FINDER_COLUMN_C_S_S_S_PT_PF_POINTFACTOR_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(courses);

				qPos.add(semester);

				qPos.add(studentId);

				qPos.add(subjectId);

				qPos.add(pointType);

				qPos.add(pointFactor);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_C_S_S_S_PT_PF,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the t y student points.
	 *
	 * @return the number of t y student points
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

				Query q = session.createQuery(_SQL_COUNT_TYSTUDENTPOINT);

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
	 * Initializes the t y student point persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.tvd.thptty.model.TYStudentPoint")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TYStudentPoint>> listenersList = new ArrayList<ModelListener<TYStudentPoint>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TYStudentPoint>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TYStudentPointImpl.class.getName());
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
	private static final String _SQL_SELECT_TYSTUDENTPOINT = "SELECT tyStudentPoint FROM TYStudentPoint tyStudentPoint";
	private static final String _SQL_SELECT_TYSTUDENTPOINT_WHERE = "SELECT tyStudentPoint FROM TYStudentPoint tyStudentPoint WHERE ";
	private static final String _SQL_COUNT_TYSTUDENTPOINT = "SELECT COUNT(tyStudentPoint) FROM TYStudentPoint tyStudentPoint";
	private static final String _SQL_COUNT_TYSTUDENTPOINT_WHERE = "SELECT COUNT(tyStudentPoint) FROM TYStudentPoint tyStudentPoint WHERE ";
	private static final String _FINDER_COLUMN_C_S_S_S_PT_PI_PF_COURSES_2 = "tyStudentPoint.id.courses = ? AND ";
	private static final String _FINDER_COLUMN_C_S_S_S_PT_PI_PF_SEMESTER_2 = "tyStudentPoint.id.semester = ? AND ";
	private static final String _FINDER_COLUMN_C_S_S_S_PT_PI_PF_STUDENTID_2 = "tyStudentPoint.id.studentId = ? AND ";
	private static final String _FINDER_COLUMN_C_S_S_S_PT_PI_PF_SUBJECTID_2 = "tyStudentPoint.id.subjectId = ? AND ";
	private static final String _FINDER_COLUMN_C_S_S_S_PT_PI_PF_POINTTYPE_2 = "tyStudentPoint.id.pointType = ? AND ";
	private static final String _FINDER_COLUMN_C_S_S_S_PT_PI_PF_POINTINDEX_2 = "tyStudentPoint.id.pointIndex = ? AND ";
	private static final String _FINDER_COLUMN_C_S_S_S_PT_PI_PF_POINTFACTOR_2 = "tyStudentPoint.id.pointFactor = ?";
	private static final String _FINDER_COLUMN_C_S_S_S_PT_PF_COURSES_2 = "tyStudentPoint.id.courses = ? AND ";
	private static final String _FINDER_COLUMN_C_S_S_S_PT_PF_SEMESTER_2 = "tyStudentPoint.id.semester = ? AND ";
	private static final String _FINDER_COLUMN_C_S_S_S_PT_PF_STUDENTID_2 = "tyStudentPoint.id.studentId = ? AND ";
	private static final String _FINDER_COLUMN_C_S_S_S_PT_PF_SUBJECTID_2 = "tyStudentPoint.id.subjectId = ? AND ";
	private static final String _FINDER_COLUMN_C_S_S_S_PT_PF_POINTTYPE_2 = "tyStudentPoint.id.pointType = ? AND ";
	private static final String _FINDER_COLUMN_C_S_S_S_PT_PF_POINTFACTOR_2 = "tyStudentPoint.id.pointFactor = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tyStudentPoint.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TYStudentPoint exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TYStudentPoint exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(TYStudentPointPersistenceImpl.class);
}