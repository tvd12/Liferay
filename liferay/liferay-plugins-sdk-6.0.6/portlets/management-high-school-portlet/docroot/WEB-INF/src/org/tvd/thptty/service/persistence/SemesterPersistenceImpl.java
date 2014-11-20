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

import org.tvd.thptty.NoSuchSemesterException;
import org.tvd.thptty.model.Semester;
import org.tvd.thptty.model.impl.SemesterImpl;
import org.tvd.thptty.model.impl.SemesterModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the semester service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link SemesterUtil} to access the semester persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ta Van Dung
 * @see SemesterPersistence
 * @see SemesterUtil
 * @generated
 */
public class SemesterPersistenceImpl extends BasePersistenceImpl<Semester>
	implements SemesterPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = SemesterImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FETCH_BY_C_G_STATUS = new FinderPath(SemesterModelImpl.ENTITY_CACHE_ENABLED,
			SemesterModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_ENTITY,
			"fetchByC_G_Status",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName()
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_C_G_STATUS = new FinderPath(SemesterModelImpl.ENTITY_CACHE_ENABLED,
			SemesterModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByC_G_Status",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_C_G = new FinderPath(SemesterModelImpl.ENTITY_CACHE_ENABLED,
			SemesterModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByC_G",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_C_G = new FinderPath(SemesterModelImpl.ENTITY_CACHE_ENABLED,
			SemesterModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByC_G",
			new String[] { Long.class.getName(), Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(SemesterModelImpl.ENTITY_CACHE_ENABLED,
			SemesterModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SemesterModelImpl.ENTITY_CACHE_ENABLED,
			SemesterModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countAll", new String[0]);

	/**
	 * Caches the semester in the entity cache if it is enabled.
	 *
	 * @param semester the semester to cache
	 */
	public void cacheResult(Semester semester) {
		EntityCacheUtil.putResult(SemesterModelImpl.ENTITY_CACHE_ENABLED,
			SemesterImpl.class, semester.getPrimaryKey(), semester);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_G_STATUS,
			new Object[] {
				new Long(semester.getCompanyId()),
				new Long(semester.getGroupId()),
				new Integer(semester.getStatus())
			}, semester);
	}

	/**
	 * Caches the semesters in the entity cache if it is enabled.
	 *
	 * @param semesters the semesters to cache
	 */
	public void cacheResult(List<Semester> semesters) {
		for (Semester semester : semesters) {
			if (EntityCacheUtil.getResult(
						SemesterModelImpl.ENTITY_CACHE_ENABLED,
						SemesterImpl.class, semester.getPrimaryKey(), this) == null) {
				cacheResult(semester);
			}
		}
	}

	/**
	 * Clears the cache for all semesters.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(SemesterImpl.class.getName());
		EntityCacheUtil.clearCache(SemesterImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the semester.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(Semester semester) {
		EntityCacheUtil.removeResult(SemesterModelImpl.ENTITY_CACHE_ENABLED,
			SemesterImpl.class, semester.getPrimaryKey());

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_G_STATUS,
			new Object[] {
				new Long(semester.getCompanyId()),
				new Long(semester.getGroupId()),
				new Integer(semester.getStatus())
			});
	}

	/**
	 * Creates a new semester with the primary key. Does not add the semester to the database.
	 *
	 * @param semesterPK the primary key for the new semester
	 * @return the new semester
	 */
	public Semester create(SemesterPK semesterPK) {
		Semester semester = new SemesterImpl();

		semester.setNew(true);
		semester.setPrimaryKey(semesterPK);

		return semester;
	}

	/**
	 * Removes the semester with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the semester to remove
	 * @return the semester that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a semester with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Semester remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove((SemesterPK)primaryKey);
	}

	/**
	 * Removes the semester with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param semesterPK the primary key of the semester to remove
	 * @return the semester that was removed
	 * @throws org.tvd.thptty.NoSuchSemesterException if a semester with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Semester remove(SemesterPK semesterPK)
		throws NoSuchSemesterException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Semester semester = (Semester)session.get(SemesterImpl.class,
					semesterPK);

			if (semester == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + semesterPK);
				}

				throw new NoSuchSemesterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					semesterPK);
			}

			return remove(semester);
		}
		catch (NoSuchSemesterException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Semester removeImpl(Semester semester) throws SystemException {
		semester = toUnwrappedModel(semester);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, semester);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		SemesterModelImpl semesterModelImpl = (SemesterModelImpl)semester;

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_G_STATUS,
			new Object[] {
				new Long(semesterModelImpl.getCompanyId()),
				new Long(semesterModelImpl.getGroupId()),
				new Integer(semesterModelImpl.getStatus())
			});

		EntityCacheUtil.removeResult(SemesterModelImpl.ENTITY_CACHE_ENABLED,
			SemesterImpl.class, semester.getPrimaryKey());

		return semester;
	}

	public Semester updateImpl(org.tvd.thptty.model.Semester semester,
		boolean merge) throws SystemException {
		semester = toUnwrappedModel(semester);

		boolean isNew = semester.isNew();

		SemesterModelImpl semesterModelImpl = (SemesterModelImpl)semester;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, semester, merge);

			semester.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(SemesterModelImpl.ENTITY_CACHE_ENABLED,
			SemesterImpl.class, semester.getPrimaryKey(), semester);

		if (!isNew &&
				((semester.getCompanyId() != semesterModelImpl.getOriginalCompanyId()) ||
				(semester.getGroupId() != semesterModelImpl.getOriginalGroupId()) ||
				(semester.getStatus() != semesterModelImpl.getOriginalStatus()))) {
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_G_STATUS,
				new Object[] {
					new Long(semesterModelImpl.getOriginalCompanyId()),
					new Long(semesterModelImpl.getOriginalGroupId()),
					new Integer(semesterModelImpl.getOriginalStatus())
				});
		}

		if (isNew ||
				((semester.getCompanyId() != semesterModelImpl.getOriginalCompanyId()) ||
				(semester.getGroupId() != semesterModelImpl.getOriginalGroupId()) ||
				(semester.getStatus() != semesterModelImpl.getOriginalStatus()))) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_G_STATUS,
				new Object[] {
					new Long(semester.getCompanyId()),
					new Long(semester.getGroupId()),
					new Integer(semester.getStatus())
				}, semester);
		}

		return semester;
	}

	protected Semester toUnwrappedModel(Semester semester) {
		if (semester instanceof SemesterImpl) {
			return semester;
		}

		SemesterImpl semesterImpl = new SemesterImpl();

		semesterImpl.setNew(semester.isNew());
		semesterImpl.setPrimaryKey(semester.getPrimaryKey());

		semesterImpl.setCompanyId(semester.getCompanyId());
		semesterImpl.setGroupId(semester.getGroupId());
		semesterImpl.setSemesterId(semester.getSemesterId());
		semesterImpl.setStatus(semester.getStatus());

		return semesterImpl;
	}

	/**
	 * Finds the semester with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the semester to find
	 * @return the semester
	 * @throws com.liferay.portal.NoSuchModelException if a semester with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Semester findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((SemesterPK)primaryKey);
	}

	/**
	 * Finds the semester with the primary key or throws a {@link org.tvd.thptty.NoSuchSemesterException} if it could not be found.
	 *
	 * @param semesterPK the primary key of the semester to find
	 * @return the semester
	 * @throws org.tvd.thptty.NoSuchSemesterException if a semester with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Semester findByPrimaryKey(SemesterPK semesterPK)
		throws NoSuchSemesterException, SystemException {
		Semester semester = fetchByPrimaryKey(semesterPK);

		if (semester == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + semesterPK);
			}

			throw new NoSuchSemesterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				semesterPK);
		}

		return semester;
	}

	/**
	 * Finds the semester with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the semester to find
	 * @return the semester, or <code>null</code> if a semester with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Semester fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((SemesterPK)primaryKey);
	}

	/**
	 * Finds the semester with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param semesterPK the primary key of the semester to find
	 * @return the semester, or <code>null</code> if a semester with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Semester fetchByPrimaryKey(SemesterPK semesterPK)
		throws SystemException {
		Semester semester = (Semester)EntityCacheUtil.getResult(SemesterModelImpl.ENTITY_CACHE_ENABLED,
				SemesterImpl.class, semesterPK, this);

		if (semester == null) {
			Session session = null;

			try {
				session = openSession();

				semester = (Semester)session.get(SemesterImpl.class, semesterPK);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (semester != null) {
					cacheResult(semester);
				}

				closeSession(session);
			}
		}

		return semester;
	}

	/**
	 * Finds the semester where companyId = &#63; and groupId = &#63; and status = &#63; or throws a {@link org.tvd.thptty.NoSuchSemesterException} if it could not be found.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param status the status to search with
	 * @return the matching semester
	 * @throws org.tvd.thptty.NoSuchSemesterException if a matching semester could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Semester findByC_G_Status(long companyId, long groupId, int status)
		throws NoSuchSemesterException, SystemException {
		Semester semester = fetchByC_G_Status(companyId, groupId, status);

		if (semester == null) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(", status=");
			msg.append(status);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchSemesterException(msg.toString());
		}

		return semester;
	}

	/**
	 * Finds the semester where companyId = &#63; and groupId = &#63; and status = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param status the status to search with
	 * @return the matching semester, or <code>null</code> if a matching semester could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Semester fetchByC_G_Status(long companyId, long groupId, int status)
		throws SystemException {
		return fetchByC_G_Status(companyId, groupId, status, true);
	}

	/**
	 * Finds the semester where companyId = &#63; and groupId = &#63; and status = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param status the status to search with
	 * @return the matching semester, or <code>null</code> if a matching semester could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Semester fetchByC_G_Status(long companyId, long groupId, int status,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { companyId, groupId, status };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_C_G_STATUS,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_SEMESTER_WHERE);

			query.append(_FINDER_COLUMN_C_G_STATUS_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_G_STATUS_GROUPID_2);

			query.append(_FINDER_COLUMN_C_G_STATUS_STATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				qPos.add(status);

				List<Semester> list = q.list();

				result = list;

				Semester semester = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_G_STATUS,
						finderArgs, list);
				}
				else {
					semester = list.get(0);

					cacheResult(semester);

					if ((semester.getCompanyId() != companyId) ||
							(semester.getGroupId() != groupId) ||
							(semester.getStatus() != status)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_G_STATUS,
							finderArgs, semester);
					}
				}

				return semester;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_G_STATUS,
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
				return (Semester)result;
			}
		}
	}

	/**
	 * Finds all the semesters where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @return the matching semesters
	 * @throws SystemException if a system exception occurred
	 */
	public List<Semester> findByC_G(long companyId, long groupId)
		throws SystemException {
		return findByC_G(companyId, groupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the semesters where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of semesters to return
	 * @param end the upper bound of the range of semesters to return (not inclusive)
	 * @return the range of matching semesters
	 * @throws SystemException if a system exception occurred
	 */
	public List<Semester> findByC_G(long companyId, long groupId, int start,
		int end) throws SystemException {
		return findByC_G(companyId, groupId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the semesters where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of semesters to return
	 * @param end the upper bound of the range of semesters to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching semesters
	 * @throws SystemException if a system exception occurred
	 */
	public List<Semester> findByC_G(long companyId, long groupId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				companyId, groupId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<Semester> list = (List<Semester>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_C_G,
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

			query.append(_SQL_SELECT_SEMESTER_WHERE);

			query.append(_FINDER_COLUMN_C_G_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_G_GROUPID_2);

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

				qPos.add(companyId);

				qPos.add(groupId);

				list = (List<Semester>)QueryUtil.list(q, getDialect(), start,
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
	 * Finds the first semester in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching semester
	 * @throws org.tvd.thptty.NoSuchSemesterException if a matching semester could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Semester findByC_G_First(long companyId, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchSemesterException, SystemException {
		List<Semester> list = findByC_G(companyId, groupId, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchSemesterException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last semester in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching semester
	 * @throws org.tvd.thptty.NoSuchSemesterException if a matching semester could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Semester findByC_G_Last(long companyId, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchSemesterException, SystemException {
		int count = countByC_G(companyId, groupId);

		List<Semester> list = findByC_G(companyId, groupId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchSemesterException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the semesters before and after the current semester in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param semesterPK the primary key of the current semester
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next semester
	 * @throws org.tvd.thptty.NoSuchSemesterException if a semester with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Semester[] findByC_G_PrevAndNext(SemesterPK semesterPK,
		long companyId, long groupId, OrderByComparator orderByComparator)
		throws NoSuchSemesterException, SystemException {
		Semester semester = findByPrimaryKey(semesterPK);

		Session session = null;

		try {
			session = openSession();

			Semester[] array = new SemesterImpl[3];

			array[0] = getByC_G_PrevAndNext(session, semester, companyId,
					groupId, orderByComparator, true);

			array[1] = semester;

			array[2] = getByC_G_PrevAndNext(session, semester, companyId,
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

	protected Semester getByC_G_PrevAndNext(Session session, Semester semester,
		long companyId, long groupId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SEMESTER_WHERE);

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

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(semester);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Semester> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the semesters.
	 *
	 * @return the semesters
	 * @throws SystemException if a system exception occurred
	 */
	public List<Semester> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the semesters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of semesters to return
	 * @param end the upper bound of the range of semesters to return (not inclusive)
	 * @return the range of semesters
	 * @throws SystemException if a system exception occurred
	 */
	public List<Semester> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the semesters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of semesters to return
	 * @param end the upper bound of the range of semesters to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of semesters
	 * @throws SystemException if a system exception occurred
	 */
	public List<Semester> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<Semester> list = (List<Semester>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SEMESTER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SEMESTER;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<Semester>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<Semester>)QueryUtil.list(q, getDialect(),
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
	 * Removes the semester where companyId = &#63; and groupId = &#63; and status = &#63; from the database.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param status the status to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByC_G_Status(long companyId, long groupId, int status)
		throws NoSuchSemesterException, SystemException {
		Semester semester = findByC_G_Status(companyId, groupId, status);

		remove(semester);
	}

	/**
	 * Removes all the semesters where companyId = &#63; and groupId = &#63; from the database.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByC_G(long companyId, long groupId)
		throws SystemException {
		for (Semester semester : findByC_G(companyId, groupId)) {
			remove(semester);
		}
	}

	/**
	 * Removes all the semesters from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (Semester semester : findAll()) {
			remove(semester);
		}
	}

	/**
	 * Counts all the semesters where companyId = &#63; and groupId = &#63; and status = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param status the status to search with
	 * @return the number of matching semesters
	 * @throws SystemException if a system exception occurred
	 */
	public int countByC_G_Status(long companyId, long groupId, int status)
		throws SystemException {
		Object[] finderArgs = new Object[] { companyId, groupId, status };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_C_G_STATUS,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_SEMESTER_WHERE);

			query.append(_FINDER_COLUMN_C_G_STATUS_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_G_STATUS_GROUPID_2);

			query.append(_FINDER_COLUMN_C_G_STATUS_STATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				qPos.add(status);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_C_G_STATUS,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the semesters where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @return the number of matching semesters
	 * @throws SystemException if a system exception occurred
	 */
	public int countByC_G(long companyId, long groupId)
		throws SystemException {
		Object[] finderArgs = new Object[] { companyId, groupId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_C_G,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_SEMESTER_WHERE);

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
	 * Counts all the semesters.
	 *
	 * @return the number of semesters
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

				Query q = session.createQuery(_SQL_COUNT_SEMESTER);

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
	 * Initializes the semester persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.tvd.thptty.model.Semester")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Semester>> listenersList = new ArrayList<ModelListener<Semester>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Semester>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(SemesterImpl.class.getName());
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
	private static final String _SQL_SELECT_SEMESTER = "SELECT semester FROM Semester semester";
	private static final String _SQL_SELECT_SEMESTER_WHERE = "SELECT semester FROM Semester semester WHERE ";
	private static final String _SQL_COUNT_SEMESTER = "SELECT COUNT(semester) FROM Semester semester";
	private static final String _SQL_COUNT_SEMESTER_WHERE = "SELECT COUNT(semester) FROM Semester semester WHERE ";
	private static final String _FINDER_COLUMN_C_G_STATUS_COMPANYID_2 = "semester.id.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_G_STATUS_GROUPID_2 = "semester.id.groupId = ? AND ";
	private static final String _FINDER_COLUMN_C_G_STATUS_STATUS_2 = "semester.status = ?";
	private static final String _FINDER_COLUMN_C_G_COMPANYID_2 = "semester.id.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_G_GROUPID_2 = "semester.id.groupId = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "semester.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Semester exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Semester exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(SemesterPersistenceImpl.class);
}