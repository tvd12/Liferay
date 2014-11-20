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

import org.tvd.thptty.NoSuchStudentPointReserveException;
import org.tvd.thptty.model.TYStudentPointReserve;
import org.tvd.thptty.model.impl.TYStudentPointReserveImpl;
import org.tvd.thptty.model.impl.TYStudentPointReserveModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the t y student point reserve service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link TYStudentPointReserveUtil} to access the t y student point reserve persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ta Van Dung
 * @see TYStudentPointReservePersistence
 * @see TYStudentPointReserveUtil
 * @generated
 */
public class TYStudentPointReservePersistenceImpl extends BasePersistenceImpl<TYStudentPointReserve>
	implements TYStudentPointReservePersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = TYStudentPointReserveImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FETCH_BY_C_S_S_S_PT_PI_PF = new FinderPath(TYStudentPointReserveModelImpl.ENTITY_CACHE_ENABLED,
			TYStudentPointReserveModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_ENTITY, "fetchByC_S_S_S_PT_PI_PF",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_C_S_S_S_PT_PI_PF = new FinderPath(TYStudentPointReserveModelImpl.ENTITY_CACHE_ENABLED,
			TYStudentPointReserveModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByC_S_S_S_PT_PI_PF",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_C_S_S_S_PT_PF = new FinderPath(TYStudentPointReserveModelImpl.ENTITY_CACHE_ENABLED,
			TYStudentPointReserveModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByC_S_S_S_PT_PF",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_C_S_S_S_PT_PF = new FinderPath(TYStudentPointReserveModelImpl.ENTITY_CACHE_ENABLED,
			TYStudentPointReserveModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByC_S_S_S_PT_PF",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(TYStudentPointReserveModelImpl.ENTITY_CACHE_ENABLED,
			TYStudentPointReserveModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TYStudentPointReserveModelImpl.ENTITY_CACHE_ENABLED,
			TYStudentPointReserveModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countAll", new String[0]);

	/**
	 * Caches the t y student point reserve in the entity cache if it is enabled.
	 *
	 * @param tyStudentPointReserve the t y student point reserve to cache
	 */
	public void cacheResult(TYStudentPointReserve tyStudentPointReserve) {
		EntityCacheUtil.putResult(TYStudentPointReserveModelImpl.ENTITY_CACHE_ENABLED,
			TYStudentPointReserveImpl.class,
			tyStudentPointReserve.getPrimaryKey(), tyStudentPointReserve);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_S_S_S_PT_PI_PF,
			new Object[] {
				new Integer(tyStudentPointReserve.getCourses()),
				new Integer(tyStudentPointReserve.getSemester()),
				new Long(tyStudentPointReserve.getStudentId()),
				new Long(tyStudentPointReserve.getSubjectId()),
				new Integer(tyStudentPointReserve.getPointType()),
				new Integer(tyStudentPointReserve.getPointIndex()),
				new Integer(tyStudentPointReserve.getPointFactor())
			}, tyStudentPointReserve);
	}

	/**
	 * Caches the t y student point reserves in the entity cache if it is enabled.
	 *
	 * @param tyStudentPointReserves the t y student point reserves to cache
	 */
	public void cacheResult(List<TYStudentPointReserve> tyStudentPointReserves) {
		for (TYStudentPointReserve tyStudentPointReserve : tyStudentPointReserves) {
			if (EntityCacheUtil.getResult(
						TYStudentPointReserveModelImpl.ENTITY_CACHE_ENABLED,
						TYStudentPointReserveImpl.class,
						tyStudentPointReserve.getPrimaryKey(), this) == null) {
				cacheResult(tyStudentPointReserve);
			}
		}
	}

	/**
	 * Clears the cache for all t y student point reserves.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(TYStudentPointReserveImpl.class.getName());
		EntityCacheUtil.clearCache(TYStudentPointReserveImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the t y student point reserve.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(TYStudentPointReserve tyStudentPointReserve) {
		EntityCacheUtil.removeResult(TYStudentPointReserveModelImpl.ENTITY_CACHE_ENABLED,
			TYStudentPointReserveImpl.class,
			tyStudentPointReserve.getPrimaryKey());

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_S_S_S_PT_PI_PF,
			new Object[] {
				new Integer(tyStudentPointReserve.getCourses()),
				new Integer(tyStudentPointReserve.getSemester()),
				new Long(tyStudentPointReserve.getStudentId()),
				new Long(tyStudentPointReserve.getSubjectId()),
				new Integer(tyStudentPointReserve.getPointType()),
				new Integer(tyStudentPointReserve.getPointIndex()),
				new Integer(tyStudentPointReserve.getPointFactor())
			});
	}

	/**
	 * Creates a new t y student point reserve with the primary key. Does not add the t y student point reserve to the database.
	 *
	 * @param tyStudentPointReservePK the primary key for the new t y student point reserve
	 * @return the new t y student point reserve
	 */
	public TYStudentPointReserve create(
		TYStudentPointReservePK tyStudentPointReservePK) {
		TYStudentPointReserve tyStudentPointReserve = new TYStudentPointReserveImpl();

		tyStudentPointReserve.setNew(true);
		tyStudentPointReserve.setPrimaryKey(tyStudentPointReservePK);

		return tyStudentPointReserve;
	}

	/**
	 * Removes the t y student point reserve with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the t y student point reserve to remove
	 * @return the t y student point reserve that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a t y student point reserve with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudentPointReserve remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove((TYStudentPointReservePK)primaryKey);
	}

	/**
	 * Removes the t y student point reserve with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tyStudentPointReservePK the primary key of the t y student point reserve to remove
	 * @return the t y student point reserve that was removed
	 * @throws org.tvd.thptty.NoSuchStudentPointReserveException if a t y student point reserve with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudentPointReserve remove(
		TYStudentPointReservePK tyStudentPointReservePK)
		throws NoSuchStudentPointReserveException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TYStudentPointReserve tyStudentPointReserve = (TYStudentPointReserve)session.get(TYStudentPointReserveImpl.class,
					tyStudentPointReservePK);

			if (tyStudentPointReserve == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
						tyStudentPointReservePK);
				}

				throw new NoSuchStudentPointReserveException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					tyStudentPointReservePK);
			}

			return remove(tyStudentPointReserve);
		}
		catch (NoSuchStudentPointReserveException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TYStudentPointReserve removeImpl(
		TYStudentPointReserve tyStudentPointReserve) throws SystemException {
		tyStudentPointReserve = toUnwrappedModel(tyStudentPointReserve);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, tyStudentPointReserve);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		TYStudentPointReserveModelImpl tyStudentPointReserveModelImpl = (TYStudentPointReserveModelImpl)tyStudentPointReserve;

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_S_S_S_PT_PI_PF,
			new Object[] {
				new Integer(tyStudentPointReserveModelImpl.getCourses()),
				new Integer(tyStudentPointReserveModelImpl.getSemester()),
				new Long(tyStudentPointReserveModelImpl.getStudentId()),
				new Long(tyStudentPointReserveModelImpl.getSubjectId()),
				new Integer(tyStudentPointReserveModelImpl.getPointType()),
				new Integer(tyStudentPointReserveModelImpl.getPointIndex()),
				new Integer(tyStudentPointReserveModelImpl.getPointFactor())
			});

		EntityCacheUtil.removeResult(TYStudentPointReserveModelImpl.ENTITY_CACHE_ENABLED,
			TYStudentPointReserveImpl.class,
			tyStudentPointReserve.getPrimaryKey());

		return tyStudentPointReserve;
	}

	public TYStudentPointReserve updateImpl(
		org.tvd.thptty.model.TYStudentPointReserve tyStudentPointReserve,
		boolean merge) throws SystemException {
		tyStudentPointReserve = toUnwrappedModel(tyStudentPointReserve);

		boolean isNew = tyStudentPointReserve.isNew();

		TYStudentPointReserveModelImpl tyStudentPointReserveModelImpl = (TYStudentPointReserveModelImpl)tyStudentPointReserve;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, tyStudentPointReserve, merge);

			tyStudentPointReserve.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(TYStudentPointReserveModelImpl.ENTITY_CACHE_ENABLED,
			TYStudentPointReserveImpl.class,
			tyStudentPointReserve.getPrimaryKey(), tyStudentPointReserve);

		if (!isNew &&
				((tyStudentPointReserve.getCourses() != tyStudentPointReserveModelImpl.getOriginalCourses()) ||
				(tyStudentPointReserve.getSemester() != tyStudentPointReserveModelImpl.getOriginalSemester()) ||
				(tyStudentPointReserve.getStudentId() != tyStudentPointReserveModelImpl.getOriginalStudentId()) ||
				(tyStudentPointReserve.getSubjectId() != tyStudentPointReserveModelImpl.getOriginalSubjectId()) ||
				(tyStudentPointReserve.getPointType() != tyStudentPointReserveModelImpl.getOriginalPointType()) ||
				(tyStudentPointReserve.getPointIndex() != tyStudentPointReserveModelImpl.getOriginalPointIndex()) ||
				(tyStudentPointReserve.getPointFactor() != tyStudentPointReserveModelImpl.getOriginalPointFactor()))) {
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_S_S_S_PT_PI_PF,
				new Object[] {
					new Integer(tyStudentPointReserveModelImpl.getOriginalCourses()),
					new Integer(tyStudentPointReserveModelImpl.getOriginalSemester()),
					new Long(tyStudentPointReserveModelImpl.getOriginalStudentId()),
					new Long(tyStudentPointReserveModelImpl.getOriginalSubjectId()),
					new Integer(tyStudentPointReserveModelImpl.getOriginalPointType()),
					new Integer(tyStudentPointReserveModelImpl.getOriginalPointIndex()),
					new Integer(tyStudentPointReserveModelImpl.getOriginalPointFactor())
				});
		}

		if (isNew ||
				((tyStudentPointReserve.getCourses() != tyStudentPointReserveModelImpl.getOriginalCourses()) ||
				(tyStudentPointReserve.getSemester() != tyStudentPointReserveModelImpl.getOriginalSemester()) ||
				(tyStudentPointReserve.getStudentId() != tyStudentPointReserveModelImpl.getOriginalStudentId()) ||
				(tyStudentPointReserve.getSubjectId() != tyStudentPointReserveModelImpl.getOriginalSubjectId()) ||
				(tyStudentPointReserve.getPointType() != tyStudentPointReserveModelImpl.getOriginalPointType()) ||
				(tyStudentPointReserve.getPointIndex() != tyStudentPointReserveModelImpl.getOriginalPointIndex()) ||
				(tyStudentPointReserve.getPointFactor() != tyStudentPointReserveModelImpl.getOriginalPointFactor()))) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_S_S_S_PT_PI_PF,
				new Object[] {
					new Integer(tyStudentPointReserve.getCourses()),
					new Integer(tyStudentPointReserve.getSemester()),
					new Long(tyStudentPointReserve.getStudentId()),
					new Long(tyStudentPointReserve.getSubjectId()),
					new Integer(tyStudentPointReserve.getPointType()),
					new Integer(tyStudentPointReserve.getPointIndex()),
					new Integer(tyStudentPointReserve.getPointFactor())
				}, tyStudentPointReserve);
		}

		return tyStudentPointReserve;
	}

	protected TYStudentPointReserve toUnwrappedModel(
		TYStudentPointReserve tyStudentPointReserve) {
		if (tyStudentPointReserve instanceof TYStudentPointReserveImpl) {
			return tyStudentPointReserve;
		}

		TYStudentPointReserveImpl tyStudentPointReserveImpl = new TYStudentPointReserveImpl();

		tyStudentPointReserveImpl.setNew(tyStudentPointReserve.isNew());
		tyStudentPointReserveImpl.setPrimaryKey(tyStudentPointReserve.getPrimaryKey());

		tyStudentPointReserveImpl.setCourses(tyStudentPointReserve.getCourses());
		tyStudentPointReserveImpl.setSemester(tyStudentPointReserve.getSemester());
		tyStudentPointReserveImpl.setStudentId(tyStudentPointReserve.getStudentId());
		tyStudentPointReserveImpl.setSubjectId(tyStudentPointReserve.getSubjectId());
		tyStudentPointReserveImpl.setPointType(tyStudentPointReserve.getPointType());
		tyStudentPointReserveImpl.setPointIndex(tyStudentPointReserve.getPointIndex());
		tyStudentPointReserveImpl.setPointFactor(tyStudentPointReserve.getPointFactor());
		tyStudentPointReserveImpl.setPoint(tyStudentPointReserve.getPoint());
		tyStudentPointReserveImpl.setModifiedDate(tyStudentPointReserve.getModifiedDate());
		tyStudentPointReserveImpl.setUserId(tyStudentPointReserve.getUserId());

		return tyStudentPointReserveImpl;
	}

	/**
	 * Finds the t y student point reserve with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the t y student point reserve to find
	 * @return the t y student point reserve
	 * @throws com.liferay.portal.NoSuchModelException if a t y student point reserve with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudentPointReserve findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((TYStudentPointReservePK)primaryKey);
	}

	/**
	 * Finds the t y student point reserve with the primary key or throws a {@link org.tvd.thptty.NoSuchStudentPointReserveException} if it could not be found.
	 *
	 * @param tyStudentPointReservePK the primary key of the t y student point reserve to find
	 * @return the t y student point reserve
	 * @throws org.tvd.thptty.NoSuchStudentPointReserveException if a t y student point reserve with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudentPointReserve findByPrimaryKey(
		TYStudentPointReservePK tyStudentPointReservePK)
		throws NoSuchStudentPointReserveException, SystemException {
		TYStudentPointReserve tyStudentPointReserve = fetchByPrimaryKey(tyStudentPointReservePK);

		if (tyStudentPointReserve == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					tyStudentPointReservePK);
			}

			throw new NoSuchStudentPointReserveException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				tyStudentPointReservePK);
		}

		return tyStudentPointReserve;
	}

	/**
	 * Finds the t y student point reserve with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the t y student point reserve to find
	 * @return the t y student point reserve, or <code>null</code> if a t y student point reserve with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudentPointReserve fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((TYStudentPointReservePK)primaryKey);
	}

	/**
	 * Finds the t y student point reserve with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tyStudentPointReservePK the primary key of the t y student point reserve to find
	 * @return the t y student point reserve, or <code>null</code> if a t y student point reserve with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudentPointReserve fetchByPrimaryKey(
		TYStudentPointReservePK tyStudentPointReservePK)
		throws SystemException {
		TYStudentPointReserve tyStudentPointReserve = (TYStudentPointReserve)EntityCacheUtil.getResult(TYStudentPointReserveModelImpl.ENTITY_CACHE_ENABLED,
				TYStudentPointReserveImpl.class, tyStudentPointReservePK, this);

		if (tyStudentPointReserve == null) {
			Session session = null;

			try {
				session = openSession();

				tyStudentPointReserve = (TYStudentPointReserve)session.get(TYStudentPointReserveImpl.class,
						tyStudentPointReservePK);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (tyStudentPointReserve != null) {
					cacheResult(tyStudentPointReserve);
				}

				closeSession(session);
			}
		}

		return tyStudentPointReserve;
	}

	/**
	 * Finds the t y student point reserve where courses = &#63; and semester = &#63; and studentId = &#63; and subjectId = &#63; and pointType = &#63; and pointIndex = &#63; and pointFactor = &#63; or throws a {@link org.tvd.thptty.NoSuchStudentPointReserveException} if it could not be found.
	 *
	 * @param courses the courses to search with
	 * @param semester the semester to search with
	 * @param studentId the student id to search with
	 * @param subjectId the subject id to search with
	 * @param pointType the point type to search with
	 * @param pointIndex the point index to search with
	 * @param pointFactor the point factor to search with
	 * @return the matching t y student point reserve
	 * @throws org.tvd.thptty.NoSuchStudentPointReserveException if a matching t y student point reserve could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudentPointReserve findByC_S_S_S_PT_PI_PF(int courses,
		int semester, long studentId, long subjectId, int pointType,
		int pointIndex, int pointFactor)
		throws NoSuchStudentPointReserveException, SystemException {
		TYStudentPointReserve tyStudentPointReserve = fetchByC_S_S_S_PT_PI_PF(courses,
				semester, studentId, subjectId, pointType, pointIndex,
				pointFactor);

		if (tyStudentPointReserve == null) {
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

			throw new NoSuchStudentPointReserveException(msg.toString());
		}

		return tyStudentPointReserve;
	}

	/**
	 * Finds the t y student point reserve where courses = &#63; and semester = &#63; and studentId = &#63; and subjectId = &#63; and pointType = &#63; and pointIndex = &#63; and pointFactor = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param courses the courses to search with
	 * @param semester the semester to search with
	 * @param studentId the student id to search with
	 * @param subjectId the subject id to search with
	 * @param pointType the point type to search with
	 * @param pointIndex the point index to search with
	 * @param pointFactor the point factor to search with
	 * @return the matching t y student point reserve, or <code>null</code> if a matching t y student point reserve could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudentPointReserve fetchByC_S_S_S_PT_PI_PF(int courses,
		int semester, long studentId, long subjectId, int pointType,
		int pointIndex, int pointFactor) throws SystemException {
		return fetchByC_S_S_S_PT_PI_PF(courses, semester, studentId, subjectId,
			pointType, pointIndex, pointFactor, true);
	}

	/**
	 * Finds the t y student point reserve where courses = &#63; and semester = &#63; and studentId = &#63; and subjectId = &#63; and pointType = &#63; and pointIndex = &#63; and pointFactor = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param courses the courses to search with
	 * @param semester the semester to search with
	 * @param studentId the student id to search with
	 * @param subjectId the subject id to search with
	 * @param pointType the point type to search with
	 * @param pointIndex the point index to search with
	 * @param pointFactor the point factor to search with
	 * @return the matching t y student point reserve, or <code>null</code> if a matching t y student point reserve could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudentPointReserve fetchByC_S_S_S_PT_PI_PF(int courses,
		int semester, long studentId, long subjectId, int pointType,
		int pointIndex, int pointFactor, boolean retrieveFromCache)
		throws SystemException {
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

			query.append(_SQL_SELECT_TYSTUDENTPOINTRESERVE_WHERE);

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

				List<TYStudentPointReserve> list = q.list();

				result = list;

				TYStudentPointReserve tyStudentPointReserve = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_S_S_S_PT_PI_PF,
						finderArgs, list);
				}
				else {
					tyStudentPointReserve = list.get(0);

					cacheResult(tyStudentPointReserve);

					if ((tyStudentPointReserve.getCourses() != courses) ||
							(tyStudentPointReserve.getSemester() != semester) ||
							(tyStudentPointReserve.getStudentId() != studentId) ||
							(tyStudentPointReserve.getSubjectId() != subjectId) ||
							(tyStudentPointReserve.getPointType() != pointType) ||
							(tyStudentPointReserve.getPointIndex() != pointIndex) ||
							(tyStudentPointReserve.getPointFactor() != pointFactor)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_S_S_S_PT_PI_PF,
							finderArgs, tyStudentPointReserve);
					}
				}

				return tyStudentPointReserve;
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
				return (TYStudentPointReserve)result;
			}
		}
	}

	/**
	 * Finds all the t y student point reserves where courses = &#63; and semester = &#63; and studentId = &#63; and subjectId = &#63; and pointType = &#63; and pointFactor = &#63;.
	 *
	 * @param courses the courses to search with
	 * @param semester the semester to search with
	 * @param studentId the student id to search with
	 * @param subjectId the subject id to search with
	 * @param pointType the point type to search with
	 * @param pointFactor the point factor to search with
	 * @return the matching t y student point reserves
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudentPointReserve> findByC_S_S_S_PT_PF(int courses,
		int semester, long studentId, long subjectId, int pointType,
		int pointFactor) throws SystemException {
		return findByC_S_S_S_PT_PF(courses, semester, studentId, subjectId,
			pointType, pointFactor, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the t y student point reserves where courses = &#63; and semester = &#63; and studentId = &#63; and subjectId = &#63; and pointType = &#63; and pointFactor = &#63;.
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
	 * @param start the lower bound of the range of t y student point reserves to return
	 * @param end the upper bound of the range of t y student point reserves to return (not inclusive)
	 * @return the range of matching t y student point reserves
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudentPointReserve> findByC_S_S_S_PT_PF(int courses,
		int semester, long studentId, long subjectId, int pointType,
		int pointFactor, int start, int end) throws SystemException {
		return findByC_S_S_S_PT_PF(courses, semester, studentId, subjectId,
			pointType, pointFactor, start, end, null);
	}

	/**
	 * Finds an ordered range of all the t y student point reserves where courses = &#63; and semester = &#63; and studentId = &#63; and subjectId = &#63; and pointType = &#63; and pointFactor = &#63;.
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
	 * @param start the lower bound of the range of t y student point reserves to return
	 * @param end the upper bound of the range of t y student point reserves to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching t y student point reserves
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudentPointReserve> findByC_S_S_S_PT_PF(int courses,
		int semester, long studentId, long subjectId, int pointType,
		int pointFactor, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				courses, semester, studentId, subjectId, pointType, pointFactor,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<TYStudentPointReserve> list = (List<TYStudentPointReserve>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_C_S_S_S_PT_PF,
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

			query.append(_SQL_SELECT_TYSTUDENTPOINTRESERVE_WHERE);

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

				list = (List<TYStudentPointReserve>)QueryUtil.list(q,
						getDialect(), start, end);
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
	 * Finds the first t y student point reserve in the ordered set where courses = &#63; and semester = &#63; and studentId = &#63; and subjectId = &#63; and pointType = &#63; and pointFactor = &#63;.
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
	 * @return the first matching t y student point reserve
	 * @throws org.tvd.thptty.NoSuchStudentPointReserveException if a matching t y student point reserve could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudentPointReserve findByC_S_S_S_PT_PF_First(int courses,
		int semester, long studentId, long subjectId, int pointType,
		int pointFactor, OrderByComparator orderByComparator)
		throws NoSuchStudentPointReserveException, SystemException {
		List<TYStudentPointReserve> list = findByC_S_S_S_PT_PF(courses,
				semester, studentId, subjectId, pointType, pointFactor, 0, 1,
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

			throw new NoSuchStudentPointReserveException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last t y student point reserve in the ordered set where courses = &#63; and semester = &#63; and studentId = &#63; and subjectId = &#63; and pointType = &#63; and pointFactor = &#63;.
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
	 * @return the last matching t y student point reserve
	 * @throws org.tvd.thptty.NoSuchStudentPointReserveException if a matching t y student point reserve could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudentPointReserve findByC_S_S_S_PT_PF_Last(int courses,
		int semester, long studentId, long subjectId, int pointType,
		int pointFactor, OrderByComparator orderByComparator)
		throws NoSuchStudentPointReserveException, SystemException {
		int count = countByC_S_S_S_PT_PF(courses, semester, studentId,
				subjectId, pointType, pointFactor);

		List<TYStudentPointReserve> list = findByC_S_S_S_PT_PF(courses,
				semester, studentId, subjectId, pointType, pointFactor,
				count - 1, count, orderByComparator);

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

			throw new NoSuchStudentPointReserveException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the t y student point reserves before and after the current t y student point reserve in the ordered set where courses = &#63; and semester = &#63; and studentId = &#63; and subjectId = &#63; and pointType = &#63; and pointFactor = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param tyStudentPointReservePK the primary key of the current t y student point reserve
	 * @param courses the courses to search with
	 * @param semester the semester to search with
	 * @param studentId the student id to search with
	 * @param subjectId the subject id to search with
	 * @param pointType the point type to search with
	 * @param pointFactor the point factor to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next t y student point reserve
	 * @throws org.tvd.thptty.NoSuchStudentPointReserveException if a t y student point reserve with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudentPointReserve[] findByC_S_S_S_PT_PF_PrevAndNext(
		TYStudentPointReservePK tyStudentPointReservePK, int courses,
		int semester, long studentId, long subjectId, int pointType,
		int pointFactor, OrderByComparator orderByComparator)
		throws NoSuchStudentPointReserveException, SystemException {
		TYStudentPointReserve tyStudentPointReserve = findByPrimaryKey(tyStudentPointReservePK);

		Session session = null;

		try {
			session = openSession();

			TYStudentPointReserve[] array = new TYStudentPointReserveImpl[3];

			array[0] = getByC_S_S_S_PT_PF_PrevAndNext(session,
					tyStudentPointReserve, courses, semester, studentId,
					subjectId, pointType, pointFactor, orderByComparator, true);

			array[1] = tyStudentPointReserve;

			array[2] = getByC_S_S_S_PT_PF_PrevAndNext(session,
					tyStudentPointReserve, courses, semester, studentId,
					subjectId, pointType, pointFactor, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TYStudentPointReserve getByC_S_S_S_PT_PF_PrevAndNext(
		Session session, TYStudentPointReserve tyStudentPointReserve,
		int courses, int semester, long studentId, long subjectId,
		int pointType, int pointFactor, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TYSTUDENTPOINTRESERVE_WHERE);

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
			Object[] values = orderByComparator.getOrderByValues(tyStudentPointReserve);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TYStudentPointReserve> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the t y student point reserves.
	 *
	 * @return the t y student point reserves
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudentPointReserve> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the t y student point reserves.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of t y student point reserves to return
	 * @param end the upper bound of the range of t y student point reserves to return (not inclusive)
	 * @return the range of t y student point reserves
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudentPointReserve> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the t y student point reserves.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of t y student point reserves to return
	 * @param end the upper bound of the range of t y student point reserves to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of t y student point reserves
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudentPointReserve> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<TYStudentPointReserve> list = (List<TYStudentPointReserve>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TYSTUDENTPOINTRESERVE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TYSTUDENTPOINTRESERVE;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<TYStudentPointReserve>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<TYStudentPointReserve>)QueryUtil.list(q,
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
	 * Removes the t y student point reserve where courses = &#63; and semester = &#63; and studentId = &#63; and subjectId = &#63; and pointType = &#63; and pointIndex = &#63; and pointFactor = &#63; from the database.
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
		int pointFactor)
		throws NoSuchStudentPointReserveException, SystemException {
		TYStudentPointReserve tyStudentPointReserve = findByC_S_S_S_PT_PI_PF(courses,
				semester, studentId, subjectId, pointType, pointIndex,
				pointFactor);

		remove(tyStudentPointReserve);
	}

	/**
	 * Removes all the t y student point reserves where courses = &#63; and semester = &#63; and studentId = &#63; and subjectId = &#63; and pointType = &#63; and pointFactor = &#63; from the database.
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
		for (TYStudentPointReserve tyStudentPointReserve : findByC_S_S_S_PT_PF(
				courses, semester, studentId, subjectId, pointType, pointFactor)) {
			remove(tyStudentPointReserve);
		}
	}

	/**
	 * Removes all the t y student point reserves from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (TYStudentPointReserve tyStudentPointReserve : findAll()) {
			remove(tyStudentPointReserve);
		}
	}

	/**
	 * Counts all the t y student point reserves where courses = &#63; and semester = &#63; and studentId = &#63; and subjectId = &#63; and pointType = &#63; and pointIndex = &#63; and pointFactor = &#63;.
	 *
	 * @param courses the courses to search with
	 * @param semester the semester to search with
	 * @param studentId the student id to search with
	 * @param subjectId the subject id to search with
	 * @param pointType the point type to search with
	 * @param pointIndex the point index to search with
	 * @param pointFactor the point factor to search with
	 * @return the number of matching t y student point reserves
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

			query.append(_SQL_COUNT_TYSTUDENTPOINTRESERVE_WHERE);

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
	 * Counts all the t y student point reserves where courses = &#63; and semester = &#63; and studentId = &#63; and subjectId = &#63; and pointType = &#63; and pointFactor = &#63;.
	 *
	 * @param courses the courses to search with
	 * @param semester the semester to search with
	 * @param studentId the student id to search with
	 * @param subjectId the subject id to search with
	 * @param pointType the point type to search with
	 * @param pointFactor the point factor to search with
	 * @return the number of matching t y student point reserves
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

			query.append(_SQL_COUNT_TYSTUDENTPOINTRESERVE_WHERE);

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
	 * Counts all the t y student point reserves.
	 *
	 * @return the number of t y student point reserves
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

				Query q = session.createQuery(_SQL_COUNT_TYSTUDENTPOINTRESERVE);

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
	 * Initializes the t y student point reserve persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.tvd.thptty.model.TYStudentPointReserve")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TYStudentPointReserve>> listenersList = new ArrayList<ModelListener<TYStudentPointReserve>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TYStudentPointReserve>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TYStudentPointReserveImpl.class.getName());
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
	private static final String _SQL_SELECT_TYSTUDENTPOINTRESERVE = "SELECT tyStudentPointReserve FROM TYStudentPointReserve tyStudentPointReserve";
	private static final String _SQL_SELECT_TYSTUDENTPOINTRESERVE_WHERE = "SELECT tyStudentPointReserve FROM TYStudentPointReserve tyStudentPointReserve WHERE ";
	private static final String _SQL_COUNT_TYSTUDENTPOINTRESERVE = "SELECT COUNT(tyStudentPointReserve) FROM TYStudentPointReserve tyStudentPointReserve";
	private static final String _SQL_COUNT_TYSTUDENTPOINTRESERVE_WHERE = "SELECT COUNT(tyStudentPointReserve) FROM TYStudentPointReserve tyStudentPointReserve WHERE ";
	private static final String _FINDER_COLUMN_C_S_S_S_PT_PI_PF_COURSES_2 = "tyStudentPointReserve.id.courses = ? AND ";
	private static final String _FINDER_COLUMN_C_S_S_S_PT_PI_PF_SEMESTER_2 = "tyStudentPointReserve.id.semester = ? AND ";
	private static final String _FINDER_COLUMN_C_S_S_S_PT_PI_PF_STUDENTID_2 = "tyStudentPointReserve.id.studentId = ? AND ";
	private static final String _FINDER_COLUMN_C_S_S_S_PT_PI_PF_SUBJECTID_2 = "tyStudentPointReserve.id.subjectId = ? AND ";
	private static final String _FINDER_COLUMN_C_S_S_S_PT_PI_PF_POINTTYPE_2 = "tyStudentPointReserve.id.pointType = ? AND ";
	private static final String _FINDER_COLUMN_C_S_S_S_PT_PI_PF_POINTINDEX_2 = "tyStudentPointReserve.id.pointIndex = ? AND ";
	private static final String _FINDER_COLUMN_C_S_S_S_PT_PI_PF_POINTFACTOR_2 = "tyStudentPointReserve.id.pointFactor = ?";
	private static final String _FINDER_COLUMN_C_S_S_S_PT_PF_COURSES_2 = "tyStudentPointReserve.id.courses = ? AND ";
	private static final String _FINDER_COLUMN_C_S_S_S_PT_PF_SEMESTER_2 = "tyStudentPointReserve.id.semester = ? AND ";
	private static final String _FINDER_COLUMN_C_S_S_S_PT_PF_STUDENTID_2 = "tyStudentPointReserve.id.studentId = ? AND ";
	private static final String _FINDER_COLUMN_C_S_S_S_PT_PF_SUBJECTID_2 = "tyStudentPointReserve.id.subjectId = ? AND ";
	private static final String _FINDER_COLUMN_C_S_S_S_PT_PF_POINTTYPE_2 = "tyStudentPointReserve.id.pointType = ? AND ";
	private static final String _FINDER_COLUMN_C_S_S_S_PT_PF_POINTFACTOR_2 = "tyStudentPointReserve.id.pointFactor = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tyStudentPointReserve.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TYStudentPointReserve exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TYStudentPointReserve exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(TYStudentPointReservePersistenceImpl.class);
}