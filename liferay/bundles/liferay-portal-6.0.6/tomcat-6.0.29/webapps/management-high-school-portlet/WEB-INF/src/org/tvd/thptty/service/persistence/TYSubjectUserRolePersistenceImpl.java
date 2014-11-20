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

import org.tvd.thptty.NoSuchSubjectUserRoleException;
import org.tvd.thptty.model.TYSubjectUserRole;
import org.tvd.thptty.model.impl.TYSubjectUserRoleImpl;
import org.tvd.thptty.model.impl.TYSubjectUserRoleModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the t y subject user role service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link TYSubjectUserRoleUtil} to access the t y subject user role persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ta Van Dung
 * @see TYSubjectUserRolePersistence
 * @see TYSubjectUserRoleUtil
 * @generated
 */
public class TYSubjectUserRolePersistenceImpl extends BasePersistenceImpl<TYSubjectUserRole>
	implements TYSubjectUserRolePersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = TYSubjectUserRoleImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FETCH_BY_C_S_R = new FinderPath(TYSubjectUserRoleModelImpl.ENTITY_CACHE_ENABLED,
			TYSubjectUserRoleModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_ENTITY, "fetchByC_S_R",
			new String[] {
				Integer.class.getName(), Long.class.getName(),
				Long.class.getName()
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_C_S_R = new FinderPath(TYSubjectUserRoleModelImpl.ENTITY_CACHE_ENABLED,
			TYSubjectUserRoleModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByC_S_R",
			new String[] {
				Integer.class.getName(), Long.class.getName(),
				Long.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_C_S = new FinderPath(TYSubjectUserRoleModelImpl.ENTITY_CACHE_ENABLED,
			TYSubjectUserRoleModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByC_S",
			new String[] {
				Integer.class.getName(), Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_C_S = new FinderPath(TYSubjectUserRoleModelImpl.ENTITY_CACHE_ENABLED,
			TYSubjectUserRoleModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByC_S",
			new String[] { Integer.class.getName(), Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_C_U_R = new FinderPath(TYSubjectUserRoleModelImpl.ENTITY_CACHE_ENABLED,
			TYSubjectUserRoleModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByC_U_R",
			new String[] {
				Integer.class.getName(), Long.class.getName(),
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_C_U_R = new FinderPath(TYSubjectUserRoleModelImpl.ENTITY_CACHE_ENABLED,
			TYSubjectUserRoleModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByC_U_R",
			new String[] {
				Integer.class.getName(), Long.class.getName(),
				Long.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(TYSubjectUserRoleModelImpl.ENTITY_CACHE_ENABLED,
			TYSubjectUserRoleModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TYSubjectUserRoleModelImpl.ENTITY_CACHE_ENABLED,
			TYSubjectUserRoleModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countAll", new String[0]);

	/**
	 * Caches the t y subject user role in the entity cache if it is enabled.
	 *
	 * @param tySubjectUserRole the t y subject user role to cache
	 */
	public void cacheResult(TYSubjectUserRole tySubjectUserRole) {
		EntityCacheUtil.putResult(TYSubjectUserRoleModelImpl.ENTITY_CACHE_ENABLED,
			TYSubjectUserRoleImpl.class, tySubjectUserRole.getPrimaryKey(),
			tySubjectUserRole);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_S_R,
			new Object[] {
				new Integer(tySubjectUserRole.getCourses()),
				new Long(tySubjectUserRole.getSubjectId()),
				new Long(tySubjectUserRole.getRoleId())
			}, tySubjectUserRole);
	}

	/**
	 * Caches the t y subject user roles in the entity cache if it is enabled.
	 *
	 * @param tySubjectUserRoles the t y subject user roles to cache
	 */
	public void cacheResult(List<TYSubjectUserRole> tySubjectUserRoles) {
		for (TYSubjectUserRole tySubjectUserRole : tySubjectUserRoles) {
			if (EntityCacheUtil.getResult(
						TYSubjectUserRoleModelImpl.ENTITY_CACHE_ENABLED,
						TYSubjectUserRoleImpl.class,
						tySubjectUserRole.getPrimaryKey(), this) == null) {
				cacheResult(tySubjectUserRole);
			}
		}
	}

	/**
	 * Clears the cache for all t y subject user roles.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(TYSubjectUserRoleImpl.class.getName());
		EntityCacheUtil.clearCache(TYSubjectUserRoleImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the t y subject user role.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(TYSubjectUserRole tySubjectUserRole) {
		EntityCacheUtil.removeResult(TYSubjectUserRoleModelImpl.ENTITY_CACHE_ENABLED,
			TYSubjectUserRoleImpl.class, tySubjectUserRole.getPrimaryKey());

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_S_R,
			new Object[] {
				new Integer(tySubjectUserRole.getCourses()),
				new Long(tySubjectUserRole.getSubjectId()),
				new Long(tySubjectUserRole.getRoleId())
			});
	}

	/**
	 * Creates a new t y subject user role with the primary key. Does not add the t y subject user role to the database.
	 *
	 * @param tySubjectUserRolePK the primary key for the new t y subject user role
	 * @return the new t y subject user role
	 */
	public TYSubjectUserRole create(TYSubjectUserRolePK tySubjectUserRolePK) {
		TYSubjectUserRole tySubjectUserRole = new TYSubjectUserRoleImpl();

		tySubjectUserRole.setNew(true);
		tySubjectUserRole.setPrimaryKey(tySubjectUserRolePK);

		return tySubjectUserRole;
	}

	/**
	 * Removes the t y subject user role with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the t y subject user role to remove
	 * @return the t y subject user role that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a t y subject user role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYSubjectUserRole remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove((TYSubjectUserRolePK)primaryKey);
	}

	/**
	 * Removes the t y subject user role with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tySubjectUserRolePK the primary key of the t y subject user role to remove
	 * @return the t y subject user role that was removed
	 * @throws org.tvd.thptty.NoSuchSubjectUserRoleException if a t y subject user role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYSubjectUserRole remove(TYSubjectUserRolePK tySubjectUserRolePK)
		throws NoSuchSubjectUserRoleException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TYSubjectUserRole tySubjectUserRole = (TYSubjectUserRole)session.get(TYSubjectUserRoleImpl.class,
					tySubjectUserRolePK);

			if (tySubjectUserRole == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
						tySubjectUserRolePK);
				}

				throw new NoSuchSubjectUserRoleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					tySubjectUserRolePK);
			}

			return remove(tySubjectUserRole);
		}
		catch (NoSuchSubjectUserRoleException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TYSubjectUserRole removeImpl(TYSubjectUserRole tySubjectUserRole)
		throws SystemException {
		tySubjectUserRole = toUnwrappedModel(tySubjectUserRole);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, tySubjectUserRole);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		TYSubjectUserRoleModelImpl tySubjectUserRoleModelImpl = (TYSubjectUserRoleModelImpl)tySubjectUserRole;

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_S_R,
			new Object[] {
				new Integer(tySubjectUserRoleModelImpl.getCourses()),
				new Long(tySubjectUserRoleModelImpl.getSubjectId()),
				new Long(tySubjectUserRoleModelImpl.getRoleId())
			});

		EntityCacheUtil.removeResult(TYSubjectUserRoleModelImpl.ENTITY_CACHE_ENABLED,
			TYSubjectUserRoleImpl.class, tySubjectUserRole.getPrimaryKey());

		return tySubjectUserRole;
	}

	public TYSubjectUserRole updateImpl(
		org.tvd.thptty.model.TYSubjectUserRole tySubjectUserRole, boolean merge)
		throws SystemException {
		tySubjectUserRole = toUnwrappedModel(tySubjectUserRole);

		boolean isNew = tySubjectUserRole.isNew();

		TYSubjectUserRoleModelImpl tySubjectUserRoleModelImpl = (TYSubjectUserRoleModelImpl)tySubjectUserRole;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, tySubjectUserRole, merge);

			tySubjectUserRole.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(TYSubjectUserRoleModelImpl.ENTITY_CACHE_ENABLED,
			TYSubjectUserRoleImpl.class, tySubjectUserRole.getPrimaryKey(),
			tySubjectUserRole);

		if (!isNew &&
				((tySubjectUserRole.getCourses() != tySubjectUserRoleModelImpl.getOriginalCourses()) ||
				(tySubjectUserRole.getSubjectId() != tySubjectUserRoleModelImpl.getOriginalSubjectId()) ||
				(tySubjectUserRole.getRoleId() != tySubjectUserRoleModelImpl.getOriginalRoleId()))) {
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_S_R,
				new Object[] {
					new Integer(tySubjectUserRoleModelImpl.getOriginalCourses()),
					new Long(tySubjectUserRoleModelImpl.getOriginalSubjectId()),
					new Long(tySubjectUserRoleModelImpl.getOriginalRoleId())
				});
		}

		if (isNew ||
				((tySubjectUserRole.getCourses() != tySubjectUserRoleModelImpl.getOriginalCourses()) ||
				(tySubjectUserRole.getSubjectId() != tySubjectUserRoleModelImpl.getOriginalSubjectId()) ||
				(tySubjectUserRole.getRoleId() != tySubjectUserRoleModelImpl.getOriginalRoleId()))) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_S_R,
				new Object[] {
					new Integer(tySubjectUserRole.getCourses()),
					new Long(tySubjectUserRole.getSubjectId()),
					new Long(tySubjectUserRole.getRoleId())
				}, tySubjectUserRole);
		}

		return tySubjectUserRole;
	}

	protected TYSubjectUserRole toUnwrappedModel(
		TYSubjectUserRole tySubjectUserRole) {
		if (tySubjectUserRole instanceof TYSubjectUserRoleImpl) {
			return tySubjectUserRole;
		}

		TYSubjectUserRoleImpl tySubjectUserRoleImpl = new TYSubjectUserRoleImpl();

		tySubjectUserRoleImpl.setNew(tySubjectUserRole.isNew());
		tySubjectUserRoleImpl.setPrimaryKey(tySubjectUserRole.getPrimaryKey());

		tySubjectUserRoleImpl.setCourses(tySubjectUserRole.getCourses());
		tySubjectUserRoleImpl.setSubjectId(tySubjectUserRole.getSubjectId());
		tySubjectUserRoleImpl.setUserId(tySubjectUserRole.getUserId());
		tySubjectUserRoleImpl.setRoleId(tySubjectUserRole.getRoleId());

		return tySubjectUserRoleImpl;
	}

	/**
	 * Finds the t y subject user role with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the t y subject user role to find
	 * @return the t y subject user role
	 * @throws com.liferay.portal.NoSuchModelException if a t y subject user role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYSubjectUserRole findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((TYSubjectUserRolePK)primaryKey);
	}

	/**
	 * Finds the t y subject user role with the primary key or throws a {@link org.tvd.thptty.NoSuchSubjectUserRoleException} if it could not be found.
	 *
	 * @param tySubjectUserRolePK the primary key of the t y subject user role to find
	 * @return the t y subject user role
	 * @throws org.tvd.thptty.NoSuchSubjectUserRoleException if a t y subject user role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYSubjectUserRole findByPrimaryKey(
		TYSubjectUserRolePK tySubjectUserRolePK)
		throws NoSuchSubjectUserRoleException, SystemException {
		TYSubjectUserRole tySubjectUserRole = fetchByPrimaryKey(tySubjectUserRolePK);

		if (tySubjectUserRole == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					tySubjectUserRolePK);
			}

			throw new NoSuchSubjectUserRoleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				tySubjectUserRolePK);
		}

		return tySubjectUserRole;
	}

	/**
	 * Finds the t y subject user role with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the t y subject user role to find
	 * @return the t y subject user role, or <code>null</code> if a t y subject user role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYSubjectUserRole fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((TYSubjectUserRolePK)primaryKey);
	}

	/**
	 * Finds the t y subject user role with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tySubjectUserRolePK the primary key of the t y subject user role to find
	 * @return the t y subject user role, or <code>null</code> if a t y subject user role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYSubjectUserRole fetchByPrimaryKey(
		TYSubjectUserRolePK tySubjectUserRolePK) throws SystemException {
		TYSubjectUserRole tySubjectUserRole = (TYSubjectUserRole)EntityCacheUtil.getResult(TYSubjectUserRoleModelImpl.ENTITY_CACHE_ENABLED,
				TYSubjectUserRoleImpl.class, tySubjectUserRolePK, this);

		if (tySubjectUserRole == null) {
			Session session = null;

			try {
				session = openSession();

				tySubjectUserRole = (TYSubjectUserRole)session.get(TYSubjectUserRoleImpl.class,
						tySubjectUserRolePK);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (tySubjectUserRole != null) {
					cacheResult(tySubjectUserRole);
				}

				closeSession(session);
			}
		}

		return tySubjectUserRole;
	}

	/**
	 * Finds the t y subject user role where courses = &#63; and subjectId = &#63; and roleId = &#63; or throws a {@link org.tvd.thptty.NoSuchSubjectUserRoleException} if it could not be found.
	 *
	 * @param courses the courses to search with
	 * @param subjectId the subject id to search with
	 * @param roleId the role id to search with
	 * @return the matching t y subject user role
	 * @throws org.tvd.thptty.NoSuchSubjectUserRoleException if a matching t y subject user role could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYSubjectUserRole findByC_S_R(int courses, long subjectId,
		long roleId) throws NoSuchSubjectUserRoleException, SystemException {
		TYSubjectUserRole tySubjectUserRole = fetchByC_S_R(courses, subjectId,
				roleId);

		if (tySubjectUserRole == null) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("courses=");
			msg.append(courses);

			msg.append(", subjectId=");
			msg.append(subjectId);

			msg.append(", roleId=");
			msg.append(roleId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchSubjectUserRoleException(msg.toString());
		}

		return tySubjectUserRole;
	}

	/**
	 * Finds the t y subject user role where courses = &#63; and subjectId = &#63; and roleId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param courses the courses to search with
	 * @param subjectId the subject id to search with
	 * @param roleId the role id to search with
	 * @return the matching t y subject user role, or <code>null</code> if a matching t y subject user role could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYSubjectUserRole fetchByC_S_R(int courses, long subjectId,
		long roleId) throws SystemException {
		return fetchByC_S_R(courses, subjectId, roleId, true);
	}

	/**
	 * Finds the t y subject user role where courses = &#63; and subjectId = &#63; and roleId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param courses the courses to search with
	 * @param subjectId the subject id to search with
	 * @param roleId the role id to search with
	 * @return the matching t y subject user role, or <code>null</code> if a matching t y subject user role could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYSubjectUserRole fetchByC_S_R(int courses, long subjectId,
		long roleId, boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { courses, subjectId, roleId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_C_S_R,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_TYSUBJECTUSERROLE_WHERE);

			query.append(_FINDER_COLUMN_C_S_R_COURSES_2);

			query.append(_FINDER_COLUMN_C_S_R_SUBJECTID_2);

			query.append(_FINDER_COLUMN_C_S_R_ROLEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(courses);

				qPos.add(subjectId);

				qPos.add(roleId);

				List<TYSubjectUserRole> list = q.list();

				result = list;

				TYSubjectUserRole tySubjectUserRole = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_S_R,
						finderArgs, list);
				}
				else {
					tySubjectUserRole = list.get(0);

					cacheResult(tySubjectUserRole);

					if ((tySubjectUserRole.getCourses() != courses) ||
							(tySubjectUserRole.getSubjectId() != subjectId) ||
							(tySubjectUserRole.getRoleId() != roleId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_S_R,
							finderArgs, tySubjectUserRole);
					}
				}

				return tySubjectUserRole;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_S_R,
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
				return (TYSubjectUserRole)result;
			}
		}
	}

	/**
	 * Finds all the t y subject user roles where courses = &#63; and subjectId = &#63;.
	 *
	 * @param courses the courses to search with
	 * @param subjectId the subject id to search with
	 * @return the matching t y subject user roles
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYSubjectUserRole> findByC_S(int courses, long subjectId)
		throws SystemException {
		return findByC_S(courses, subjectId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the t y subject user roles where courses = &#63; and subjectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param courses the courses to search with
	 * @param subjectId the subject id to search with
	 * @param start the lower bound of the range of t y subject user roles to return
	 * @param end the upper bound of the range of t y subject user roles to return (not inclusive)
	 * @return the range of matching t y subject user roles
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYSubjectUserRole> findByC_S(int courses, long subjectId,
		int start, int end) throws SystemException {
		return findByC_S(courses, subjectId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the t y subject user roles where courses = &#63; and subjectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param courses the courses to search with
	 * @param subjectId the subject id to search with
	 * @param start the lower bound of the range of t y subject user roles to return
	 * @param end the upper bound of the range of t y subject user roles to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching t y subject user roles
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYSubjectUserRole> findByC_S(int courses, long subjectId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				courses, subjectId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<TYSubjectUserRole> list = (List<TYSubjectUserRole>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_C_S,
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

			query.append(_SQL_SELECT_TYSUBJECTUSERROLE_WHERE);

			query.append(_FINDER_COLUMN_C_S_COURSES_2);

			query.append(_FINDER_COLUMN_C_S_SUBJECTID_2);

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

				qPos.add(subjectId);

				list = (List<TYSubjectUserRole>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_C_S,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_C_S,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first t y subject user role in the ordered set where courses = &#63; and subjectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param courses the courses to search with
	 * @param subjectId the subject id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching t y subject user role
	 * @throws org.tvd.thptty.NoSuchSubjectUserRoleException if a matching t y subject user role could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYSubjectUserRole findByC_S_First(int courses, long subjectId,
		OrderByComparator orderByComparator)
		throws NoSuchSubjectUserRoleException, SystemException {
		List<TYSubjectUserRole> list = findByC_S(courses, subjectId, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("courses=");
			msg.append(courses);

			msg.append(", subjectId=");
			msg.append(subjectId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchSubjectUserRoleException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last t y subject user role in the ordered set where courses = &#63; and subjectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param courses the courses to search with
	 * @param subjectId the subject id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching t y subject user role
	 * @throws org.tvd.thptty.NoSuchSubjectUserRoleException if a matching t y subject user role could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYSubjectUserRole findByC_S_Last(int courses, long subjectId,
		OrderByComparator orderByComparator)
		throws NoSuchSubjectUserRoleException, SystemException {
		int count = countByC_S(courses, subjectId);

		List<TYSubjectUserRole> list = findByC_S(courses, subjectId, count - 1,
				count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("courses=");
			msg.append(courses);

			msg.append(", subjectId=");
			msg.append(subjectId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchSubjectUserRoleException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the t y subject user roles before and after the current t y subject user role in the ordered set where courses = &#63; and subjectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param tySubjectUserRolePK the primary key of the current t y subject user role
	 * @param courses the courses to search with
	 * @param subjectId the subject id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next t y subject user role
	 * @throws org.tvd.thptty.NoSuchSubjectUserRoleException if a t y subject user role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYSubjectUserRole[] findByC_S_PrevAndNext(
		TYSubjectUserRolePK tySubjectUserRolePK, int courses, long subjectId,
		OrderByComparator orderByComparator)
		throws NoSuchSubjectUserRoleException, SystemException {
		TYSubjectUserRole tySubjectUserRole = findByPrimaryKey(tySubjectUserRolePK);

		Session session = null;

		try {
			session = openSession();

			TYSubjectUserRole[] array = new TYSubjectUserRoleImpl[3];

			array[0] = getByC_S_PrevAndNext(session, tySubjectUserRole,
					courses, subjectId, orderByComparator, true);

			array[1] = tySubjectUserRole;

			array[2] = getByC_S_PrevAndNext(session, tySubjectUserRole,
					courses, subjectId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TYSubjectUserRole getByC_S_PrevAndNext(Session session,
		TYSubjectUserRole tySubjectUserRole, int courses, long subjectId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TYSUBJECTUSERROLE_WHERE);

		query.append(_FINDER_COLUMN_C_S_COURSES_2);

		query.append(_FINDER_COLUMN_C_S_SUBJECTID_2);

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

		qPos.add(subjectId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(tySubjectUserRole);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TYSubjectUserRole> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the t y subject user roles where courses = &#63; and userId = &#63; and roleId = &#63;.
	 *
	 * @param courses the courses to search with
	 * @param userId the user id to search with
	 * @param roleId the role id to search with
	 * @return the matching t y subject user roles
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYSubjectUserRole> findByC_U_R(int courses, long userId,
		long roleId) throws SystemException {
		return findByC_U_R(courses, userId, roleId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the t y subject user roles where courses = &#63; and userId = &#63; and roleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param courses the courses to search with
	 * @param userId the user id to search with
	 * @param roleId the role id to search with
	 * @param start the lower bound of the range of t y subject user roles to return
	 * @param end the upper bound of the range of t y subject user roles to return (not inclusive)
	 * @return the range of matching t y subject user roles
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYSubjectUserRole> findByC_U_R(int courses, long userId,
		long roleId, int start, int end) throws SystemException {
		return findByC_U_R(courses, userId, roleId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the t y subject user roles where courses = &#63; and userId = &#63; and roleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param courses the courses to search with
	 * @param userId the user id to search with
	 * @param roleId the role id to search with
	 * @param start the lower bound of the range of t y subject user roles to return
	 * @param end the upper bound of the range of t y subject user roles to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching t y subject user roles
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYSubjectUserRole> findByC_U_R(int courses, long userId,
		long roleId, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				courses, userId, roleId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<TYSubjectUserRole> list = (List<TYSubjectUserRole>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_C_U_R,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_TYSUBJECTUSERROLE_WHERE);

			query.append(_FINDER_COLUMN_C_U_R_COURSES_2);

			query.append(_FINDER_COLUMN_C_U_R_USERID_2);

			query.append(_FINDER_COLUMN_C_U_R_ROLEID_2);

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

				qPos.add(userId);

				qPos.add(roleId);

				list = (List<TYSubjectUserRole>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_C_U_R,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_C_U_R,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first t y subject user role in the ordered set where courses = &#63; and userId = &#63; and roleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param courses the courses to search with
	 * @param userId the user id to search with
	 * @param roleId the role id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching t y subject user role
	 * @throws org.tvd.thptty.NoSuchSubjectUserRoleException if a matching t y subject user role could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYSubjectUserRole findByC_U_R_First(int courses, long userId,
		long roleId, OrderByComparator orderByComparator)
		throws NoSuchSubjectUserRoleException, SystemException {
		List<TYSubjectUserRole> list = findByC_U_R(courses, userId, roleId, 0,
				1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("courses=");
			msg.append(courses);

			msg.append(", userId=");
			msg.append(userId);

			msg.append(", roleId=");
			msg.append(roleId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchSubjectUserRoleException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last t y subject user role in the ordered set where courses = &#63; and userId = &#63; and roleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param courses the courses to search with
	 * @param userId the user id to search with
	 * @param roleId the role id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching t y subject user role
	 * @throws org.tvd.thptty.NoSuchSubjectUserRoleException if a matching t y subject user role could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYSubjectUserRole findByC_U_R_Last(int courses, long userId,
		long roleId, OrderByComparator orderByComparator)
		throws NoSuchSubjectUserRoleException, SystemException {
		int count = countByC_U_R(courses, userId, roleId);

		List<TYSubjectUserRole> list = findByC_U_R(courses, userId, roleId,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("courses=");
			msg.append(courses);

			msg.append(", userId=");
			msg.append(userId);

			msg.append(", roleId=");
			msg.append(roleId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchSubjectUserRoleException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the t y subject user roles before and after the current t y subject user role in the ordered set where courses = &#63; and userId = &#63; and roleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param tySubjectUserRolePK the primary key of the current t y subject user role
	 * @param courses the courses to search with
	 * @param userId the user id to search with
	 * @param roleId the role id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next t y subject user role
	 * @throws org.tvd.thptty.NoSuchSubjectUserRoleException if a t y subject user role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYSubjectUserRole[] findByC_U_R_PrevAndNext(
		TYSubjectUserRolePK tySubjectUserRolePK, int courses, long userId,
		long roleId, OrderByComparator orderByComparator)
		throws NoSuchSubjectUserRoleException, SystemException {
		TYSubjectUserRole tySubjectUserRole = findByPrimaryKey(tySubjectUserRolePK);

		Session session = null;

		try {
			session = openSession();

			TYSubjectUserRole[] array = new TYSubjectUserRoleImpl[3];

			array[0] = getByC_U_R_PrevAndNext(session, tySubjectUserRole,
					courses, userId, roleId, orderByComparator, true);

			array[1] = tySubjectUserRole;

			array[2] = getByC_U_R_PrevAndNext(session, tySubjectUserRole,
					courses, userId, roleId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TYSubjectUserRole getByC_U_R_PrevAndNext(Session session,
		TYSubjectUserRole tySubjectUserRole, int courses, long userId,
		long roleId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TYSUBJECTUSERROLE_WHERE);

		query.append(_FINDER_COLUMN_C_U_R_COURSES_2);

		query.append(_FINDER_COLUMN_C_U_R_USERID_2);

		query.append(_FINDER_COLUMN_C_U_R_ROLEID_2);

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

		qPos.add(userId);

		qPos.add(roleId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(tySubjectUserRole);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TYSubjectUserRole> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the t y subject user roles.
	 *
	 * @return the t y subject user roles
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYSubjectUserRole> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the t y subject user roles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of t y subject user roles to return
	 * @param end the upper bound of the range of t y subject user roles to return (not inclusive)
	 * @return the range of t y subject user roles
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYSubjectUserRole> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the t y subject user roles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of t y subject user roles to return
	 * @param end the upper bound of the range of t y subject user roles to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of t y subject user roles
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYSubjectUserRole> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<TYSubjectUserRole> list = (List<TYSubjectUserRole>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TYSUBJECTUSERROLE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TYSUBJECTUSERROLE;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<TYSubjectUserRole>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<TYSubjectUserRole>)QueryUtil.list(q,
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
	 * Removes the t y subject user role where courses = &#63; and subjectId = &#63; and roleId = &#63; from the database.
	 *
	 * @param courses the courses to search with
	 * @param subjectId the subject id to search with
	 * @param roleId the role id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByC_S_R(int courses, long subjectId, long roleId)
		throws NoSuchSubjectUserRoleException, SystemException {
		TYSubjectUserRole tySubjectUserRole = findByC_S_R(courses, subjectId,
				roleId);

		remove(tySubjectUserRole);
	}

	/**
	 * Removes all the t y subject user roles where courses = &#63; and subjectId = &#63; from the database.
	 *
	 * @param courses the courses to search with
	 * @param subjectId the subject id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByC_S(int courses, long subjectId)
		throws SystemException {
		for (TYSubjectUserRole tySubjectUserRole : findByC_S(courses, subjectId)) {
			remove(tySubjectUserRole);
		}
	}

	/**
	 * Removes all the t y subject user roles where courses = &#63; and userId = &#63; and roleId = &#63; from the database.
	 *
	 * @param courses the courses to search with
	 * @param userId the user id to search with
	 * @param roleId the role id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByC_U_R(int courses, long userId, long roleId)
		throws SystemException {
		for (TYSubjectUserRole tySubjectUserRole : findByC_U_R(courses, userId,
				roleId)) {
			remove(tySubjectUserRole);
		}
	}

	/**
	 * Removes all the t y subject user roles from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (TYSubjectUserRole tySubjectUserRole : findAll()) {
			remove(tySubjectUserRole);
		}
	}

	/**
	 * Counts all the t y subject user roles where courses = &#63; and subjectId = &#63; and roleId = &#63;.
	 *
	 * @param courses the courses to search with
	 * @param subjectId the subject id to search with
	 * @param roleId the role id to search with
	 * @return the number of matching t y subject user roles
	 * @throws SystemException if a system exception occurred
	 */
	public int countByC_S_R(int courses, long subjectId, long roleId)
		throws SystemException {
		Object[] finderArgs = new Object[] { courses, subjectId, roleId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_C_S_R,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_TYSUBJECTUSERROLE_WHERE);

			query.append(_FINDER_COLUMN_C_S_R_COURSES_2);

			query.append(_FINDER_COLUMN_C_S_R_SUBJECTID_2);

			query.append(_FINDER_COLUMN_C_S_R_ROLEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(courses);

				qPos.add(subjectId);

				qPos.add(roleId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_C_S_R,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the t y subject user roles where courses = &#63; and subjectId = &#63;.
	 *
	 * @param courses the courses to search with
	 * @param subjectId the subject id to search with
	 * @return the number of matching t y subject user roles
	 * @throws SystemException if a system exception occurred
	 */
	public int countByC_S(int courses, long subjectId)
		throws SystemException {
		Object[] finderArgs = new Object[] { courses, subjectId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_C_S,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TYSUBJECTUSERROLE_WHERE);

			query.append(_FINDER_COLUMN_C_S_COURSES_2);

			query.append(_FINDER_COLUMN_C_S_SUBJECTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(courses);

				qPos.add(subjectId);

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
	 * Counts all the t y subject user roles where courses = &#63; and userId = &#63; and roleId = &#63;.
	 *
	 * @param courses the courses to search with
	 * @param userId the user id to search with
	 * @param roleId the role id to search with
	 * @return the number of matching t y subject user roles
	 * @throws SystemException if a system exception occurred
	 */
	public int countByC_U_R(int courses, long userId, long roleId)
		throws SystemException {
		Object[] finderArgs = new Object[] { courses, userId, roleId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_C_U_R,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_TYSUBJECTUSERROLE_WHERE);

			query.append(_FINDER_COLUMN_C_U_R_COURSES_2);

			query.append(_FINDER_COLUMN_C_U_R_USERID_2);

			query.append(_FINDER_COLUMN_C_U_R_ROLEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(courses);

				qPos.add(userId);

				qPos.add(roleId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_C_U_R,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the t y subject user roles.
	 *
	 * @return the number of t y subject user roles
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

				Query q = session.createQuery(_SQL_COUNT_TYSUBJECTUSERROLE);

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
	 * Initializes the t y subject user role persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.tvd.thptty.model.TYSubjectUserRole")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TYSubjectUserRole>> listenersList = new ArrayList<ModelListener<TYSubjectUserRole>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TYSubjectUserRole>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TYSubjectUserRoleImpl.class.getName());
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
	private static final String _SQL_SELECT_TYSUBJECTUSERROLE = "SELECT tySubjectUserRole FROM TYSubjectUserRole tySubjectUserRole";
	private static final String _SQL_SELECT_TYSUBJECTUSERROLE_WHERE = "SELECT tySubjectUserRole FROM TYSubjectUserRole tySubjectUserRole WHERE ";
	private static final String _SQL_COUNT_TYSUBJECTUSERROLE = "SELECT COUNT(tySubjectUserRole) FROM TYSubjectUserRole tySubjectUserRole";
	private static final String _SQL_COUNT_TYSUBJECTUSERROLE_WHERE = "SELECT COUNT(tySubjectUserRole) FROM TYSubjectUserRole tySubjectUserRole WHERE ";
	private static final String _FINDER_COLUMN_C_S_R_COURSES_2 = "tySubjectUserRole.id.courses = ? AND ";
	private static final String _FINDER_COLUMN_C_S_R_SUBJECTID_2 = "tySubjectUserRole.id.subjectId = ? AND ";
	private static final String _FINDER_COLUMN_C_S_R_ROLEID_2 = "tySubjectUserRole.id.roleId = ?";
	private static final String _FINDER_COLUMN_C_S_COURSES_2 = "tySubjectUserRole.id.courses = ? AND ";
	private static final String _FINDER_COLUMN_C_S_SUBJECTID_2 = "tySubjectUserRole.id.subjectId = ?";
	private static final String _FINDER_COLUMN_C_U_R_COURSES_2 = "tySubjectUserRole.id.courses = ? AND ";
	private static final String _FINDER_COLUMN_C_U_R_USERID_2 = "tySubjectUserRole.id.userId = ? AND ";
	private static final String _FINDER_COLUMN_C_U_R_ROLEID_2 = "tySubjectUserRole.id.roleId = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tySubjectUserRole.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TYSubjectUserRole exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TYSubjectUserRole exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(TYSubjectUserRolePersistenceImpl.class);
}