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
import com.liferay.portal.service.persistence.GroupPersistence;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.RolePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import org.tvd.thptty.NoSuchClassUserRoleException;
import org.tvd.thptty.model.TYClassUserRole;
import org.tvd.thptty.model.impl.TYClassUserRoleImpl;
import org.tvd.thptty.model.impl.TYClassUserRoleModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the t y class user role service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link TYClassUserRoleUtil} to access the t y class user role persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ta Van Dung
 * @see TYClassUserRolePersistence
 * @see TYClassUserRoleUtil
 * @generated
 */
public class TYClassUserRolePersistenceImpl extends BasePersistenceImpl<TYClassUserRole>
	implements TYClassUserRolePersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = TYClassUserRoleImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FETCH_BY_C_C_R = new FinderPath(TYClassUserRoleModelImpl.ENTITY_CACHE_ENABLED,
			TYClassUserRoleModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_ENTITY, "fetchByC_C_R",
			new String[] {
				Integer.class.getName(), Long.class.getName(),
				Long.class.getName()
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_C_C_R = new FinderPath(TYClassUserRoleModelImpl.ENTITY_CACHE_ENABLED,
			TYClassUserRoleModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByC_C_R",
			new String[] {
				Integer.class.getName(), Long.class.getName(),
				Long.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_C_C = new FinderPath(TYClassUserRoleModelImpl.ENTITY_CACHE_ENABLED,
			TYClassUserRoleModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByC_C",
			new String[] {
				Integer.class.getName(), Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_C_C = new FinderPath(TYClassUserRoleModelImpl.ENTITY_CACHE_ENABLED,
			TYClassUserRoleModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByC_C",
			new String[] { Integer.class.getName(), Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_C_U_R = new FinderPath(TYClassUserRoleModelImpl.ENTITY_CACHE_ENABLED,
			TYClassUserRoleModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByC_U_R",
			new String[] {
				Integer.class.getName(), Long.class.getName(),
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_C_U_R = new FinderPath(TYClassUserRoleModelImpl.ENTITY_CACHE_ENABLED,
			TYClassUserRoleModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByC_U_R",
			new String[] {
				Integer.class.getName(), Long.class.getName(),
				Long.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(TYClassUserRoleModelImpl.ENTITY_CACHE_ENABLED,
			TYClassUserRoleModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TYClassUserRoleModelImpl.ENTITY_CACHE_ENABLED,
			TYClassUserRoleModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countAll", new String[0]);

	/**
	 * Caches the t y class user role in the entity cache if it is enabled.
	 *
	 * @param tyClassUserRole the t y class user role to cache
	 */
	public void cacheResult(TYClassUserRole tyClassUserRole) {
		EntityCacheUtil.putResult(TYClassUserRoleModelImpl.ENTITY_CACHE_ENABLED,
			TYClassUserRoleImpl.class, tyClassUserRole.getPrimaryKey(),
			tyClassUserRole);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_C_R,
			new Object[] {
				new Integer(tyClassUserRole.getCourses()),
				new Long(tyClassUserRole.getClassId()),
				new Long(tyClassUserRole.getRoleId())
			}, tyClassUserRole);
	}

	/**
	 * Caches the t y class user roles in the entity cache if it is enabled.
	 *
	 * @param tyClassUserRoles the t y class user roles to cache
	 */
	public void cacheResult(List<TYClassUserRole> tyClassUserRoles) {
		for (TYClassUserRole tyClassUserRole : tyClassUserRoles) {
			if (EntityCacheUtil.getResult(
						TYClassUserRoleModelImpl.ENTITY_CACHE_ENABLED,
						TYClassUserRoleImpl.class,
						tyClassUserRole.getPrimaryKey(), this) == null) {
				cacheResult(tyClassUserRole);
			}
		}
	}

	/**
	 * Clears the cache for all t y class user roles.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(TYClassUserRoleImpl.class.getName());
		EntityCacheUtil.clearCache(TYClassUserRoleImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the t y class user role.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(TYClassUserRole tyClassUserRole) {
		EntityCacheUtil.removeResult(TYClassUserRoleModelImpl.ENTITY_CACHE_ENABLED,
			TYClassUserRoleImpl.class, tyClassUserRole.getPrimaryKey());

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_C_R,
			new Object[] {
				new Integer(tyClassUserRole.getCourses()),
				new Long(tyClassUserRole.getClassId()),
				new Long(tyClassUserRole.getRoleId())
			});
	}

	/**
	 * Creates a new t y class user role with the primary key. Does not add the t y class user role to the database.
	 *
	 * @param tyClassUserRolePK the primary key for the new t y class user role
	 * @return the new t y class user role
	 */
	public TYClassUserRole create(TYClassUserRolePK tyClassUserRolePK) {
		TYClassUserRole tyClassUserRole = new TYClassUserRoleImpl();

		tyClassUserRole.setNew(true);
		tyClassUserRole.setPrimaryKey(tyClassUserRolePK);

		return tyClassUserRole;
	}

	/**
	 * Removes the t y class user role with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the t y class user role to remove
	 * @return the t y class user role that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a t y class user role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYClassUserRole remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove((TYClassUserRolePK)primaryKey);
	}

	/**
	 * Removes the t y class user role with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tyClassUserRolePK the primary key of the t y class user role to remove
	 * @return the t y class user role that was removed
	 * @throws org.tvd.thptty.NoSuchClassUserRoleException if a t y class user role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYClassUserRole remove(TYClassUserRolePK tyClassUserRolePK)
		throws NoSuchClassUserRoleException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TYClassUserRole tyClassUserRole = (TYClassUserRole)session.get(TYClassUserRoleImpl.class,
					tyClassUserRolePK);

			if (tyClassUserRole == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
						tyClassUserRolePK);
				}

				throw new NoSuchClassUserRoleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					tyClassUserRolePK);
			}

			return remove(tyClassUserRole);
		}
		catch (NoSuchClassUserRoleException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TYClassUserRole removeImpl(TYClassUserRole tyClassUserRole)
		throws SystemException {
		tyClassUserRole = toUnwrappedModel(tyClassUserRole);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, tyClassUserRole);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		TYClassUserRoleModelImpl tyClassUserRoleModelImpl = (TYClassUserRoleModelImpl)tyClassUserRole;

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_C_R,
			new Object[] {
				new Integer(tyClassUserRoleModelImpl.getCourses()),
				new Long(tyClassUserRoleModelImpl.getClassId()),
				new Long(tyClassUserRoleModelImpl.getRoleId())
			});

		EntityCacheUtil.removeResult(TYClassUserRoleModelImpl.ENTITY_CACHE_ENABLED,
			TYClassUserRoleImpl.class, tyClassUserRole.getPrimaryKey());

		return tyClassUserRole;
	}

	public TYClassUserRole updateImpl(
		org.tvd.thptty.model.TYClassUserRole tyClassUserRole, boolean merge)
		throws SystemException {
		tyClassUserRole = toUnwrappedModel(tyClassUserRole);

		boolean isNew = tyClassUserRole.isNew();

		TYClassUserRoleModelImpl tyClassUserRoleModelImpl = (TYClassUserRoleModelImpl)tyClassUserRole;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, tyClassUserRole, merge);

			tyClassUserRole.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(TYClassUserRoleModelImpl.ENTITY_CACHE_ENABLED,
			TYClassUserRoleImpl.class, tyClassUserRole.getPrimaryKey(),
			tyClassUserRole);

		if (!isNew &&
				((tyClassUserRole.getCourses() != tyClassUserRoleModelImpl.getOriginalCourses()) ||
				(tyClassUserRole.getClassId() != tyClassUserRoleModelImpl.getOriginalClassId()) ||
				(tyClassUserRole.getRoleId() != tyClassUserRoleModelImpl.getOriginalRoleId()))) {
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_C_R,
				new Object[] {
					new Integer(tyClassUserRoleModelImpl.getOriginalCourses()),
					new Long(tyClassUserRoleModelImpl.getOriginalClassId()),
					new Long(tyClassUserRoleModelImpl.getOriginalRoleId())
				});
		}

		if (isNew ||
				((tyClassUserRole.getCourses() != tyClassUserRoleModelImpl.getOriginalCourses()) ||
				(tyClassUserRole.getClassId() != tyClassUserRoleModelImpl.getOriginalClassId()) ||
				(tyClassUserRole.getRoleId() != tyClassUserRoleModelImpl.getOriginalRoleId()))) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_C_R,
				new Object[] {
					new Integer(tyClassUserRole.getCourses()),
					new Long(tyClassUserRole.getClassId()),
					new Long(tyClassUserRole.getRoleId())
				}, tyClassUserRole);
		}

		return tyClassUserRole;
	}

	protected TYClassUserRole toUnwrappedModel(TYClassUserRole tyClassUserRole) {
		if (tyClassUserRole instanceof TYClassUserRoleImpl) {
			return tyClassUserRole;
		}

		TYClassUserRoleImpl tyClassUserRoleImpl = new TYClassUserRoleImpl();

		tyClassUserRoleImpl.setNew(tyClassUserRole.isNew());
		tyClassUserRoleImpl.setPrimaryKey(tyClassUserRole.getPrimaryKey());

		tyClassUserRoleImpl.setCourses(tyClassUserRole.getCourses());
		tyClassUserRoleImpl.setClassId(tyClassUserRole.getClassId());
		tyClassUserRoleImpl.setUserId(tyClassUserRole.getUserId());
		tyClassUserRoleImpl.setRoleId(tyClassUserRole.getRoleId());
		tyClassUserRoleImpl.setStatus(tyClassUserRole.getStatus());

		return tyClassUserRoleImpl;
	}

	/**
	 * Finds the t y class user role with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the t y class user role to find
	 * @return the t y class user role
	 * @throws com.liferay.portal.NoSuchModelException if a t y class user role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYClassUserRole findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((TYClassUserRolePK)primaryKey);
	}

	/**
	 * Finds the t y class user role with the primary key or throws a {@link org.tvd.thptty.NoSuchClassUserRoleException} if it could not be found.
	 *
	 * @param tyClassUserRolePK the primary key of the t y class user role to find
	 * @return the t y class user role
	 * @throws org.tvd.thptty.NoSuchClassUserRoleException if a t y class user role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYClassUserRole findByPrimaryKey(TYClassUserRolePK tyClassUserRolePK)
		throws NoSuchClassUserRoleException, SystemException {
		TYClassUserRole tyClassUserRole = fetchByPrimaryKey(tyClassUserRolePK);

		if (tyClassUserRole == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + tyClassUserRolePK);
			}

			throw new NoSuchClassUserRoleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				tyClassUserRolePK);
		}

		return tyClassUserRole;
	}

	/**
	 * Finds the t y class user role with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the t y class user role to find
	 * @return the t y class user role, or <code>null</code> if a t y class user role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYClassUserRole fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((TYClassUserRolePK)primaryKey);
	}

	/**
	 * Finds the t y class user role with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tyClassUserRolePK the primary key of the t y class user role to find
	 * @return the t y class user role, or <code>null</code> if a t y class user role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYClassUserRole fetchByPrimaryKey(
		TYClassUserRolePK tyClassUserRolePK) throws SystemException {
		TYClassUserRole tyClassUserRole = (TYClassUserRole)EntityCacheUtil.getResult(TYClassUserRoleModelImpl.ENTITY_CACHE_ENABLED,
				TYClassUserRoleImpl.class, tyClassUserRolePK, this);

		if (tyClassUserRole == null) {
			Session session = null;

			try {
				session = openSession();

				tyClassUserRole = (TYClassUserRole)session.get(TYClassUserRoleImpl.class,
						tyClassUserRolePK);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (tyClassUserRole != null) {
					cacheResult(tyClassUserRole);
				}

				closeSession(session);
			}
		}

		return tyClassUserRole;
	}

	/**
	 * Finds the t y class user role where courses = &#63; and classId = &#63; and roleId = &#63; or throws a {@link org.tvd.thptty.NoSuchClassUserRoleException} if it could not be found.
	 *
	 * @param courses the courses to search with
	 * @param classId the class id to search with
	 * @param roleId the role id to search with
	 * @return the matching t y class user role
	 * @throws org.tvd.thptty.NoSuchClassUserRoleException if a matching t y class user role could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYClassUserRole findByC_C_R(int courses, long classId, long roleId)
		throws NoSuchClassUserRoleException, SystemException {
		TYClassUserRole tyClassUserRole = fetchByC_C_R(courses, classId, roleId);

		if (tyClassUserRole == null) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("courses=");
			msg.append(courses);

			msg.append(", classId=");
			msg.append(classId);

			msg.append(", roleId=");
			msg.append(roleId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchClassUserRoleException(msg.toString());
		}

		return tyClassUserRole;
	}

	/**
	 * Finds the t y class user role where courses = &#63; and classId = &#63; and roleId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param courses the courses to search with
	 * @param classId the class id to search with
	 * @param roleId the role id to search with
	 * @return the matching t y class user role, or <code>null</code> if a matching t y class user role could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYClassUserRole fetchByC_C_R(int courses, long classId, long roleId)
		throws SystemException {
		return fetchByC_C_R(courses, classId, roleId, true);
	}

	/**
	 * Finds the t y class user role where courses = &#63; and classId = &#63; and roleId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param courses the courses to search with
	 * @param classId the class id to search with
	 * @param roleId the role id to search with
	 * @return the matching t y class user role, or <code>null</code> if a matching t y class user role could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYClassUserRole fetchByC_C_R(int courses, long classId, long roleId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { courses, classId, roleId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_C_C_R,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_TYCLASSUSERROLE_WHERE);

			query.append(_FINDER_COLUMN_C_C_R_COURSES_2);

			query.append(_FINDER_COLUMN_C_C_R_CLASSID_2);

			query.append(_FINDER_COLUMN_C_C_R_ROLEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(courses);

				qPos.add(classId);

				qPos.add(roleId);

				List<TYClassUserRole> list = q.list();

				result = list;

				TYClassUserRole tyClassUserRole = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_C_R,
						finderArgs, list);
				}
				else {
					tyClassUserRole = list.get(0);

					cacheResult(tyClassUserRole);

					if ((tyClassUserRole.getCourses() != courses) ||
							(tyClassUserRole.getClassId() != classId) ||
							(tyClassUserRole.getRoleId() != roleId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_C_R,
							finderArgs, tyClassUserRole);
					}
				}

				return tyClassUserRole;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_C_R,
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
				return (TYClassUserRole)result;
			}
		}
	}

	/**
	 * Finds all the t y class user roles where courses = &#63; and classId = &#63;.
	 *
	 * @param courses the courses to search with
	 * @param classId the class id to search with
	 * @return the matching t y class user roles
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYClassUserRole> findByC_C(int courses, long classId)
		throws SystemException {
		return findByC_C(courses, classId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the t y class user roles where courses = &#63; and classId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param courses the courses to search with
	 * @param classId the class id to search with
	 * @param start the lower bound of the range of t y class user roles to return
	 * @param end the upper bound of the range of t y class user roles to return (not inclusive)
	 * @return the range of matching t y class user roles
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYClassUserRole> findByC_C(int courses, long classId,
		int start, int end) throws SystemException {
		return findByC_C(courses, classId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the t y class user roles where courses = &#63; and classId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param courses the courses to search with
	 * @param classId the class id to search with
	 * @param start the lower bound of the range of t y class user roles to return
	 * @param end the upper bound of the range of t y class user roles to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching t y class user roles
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYClassUserRole> findByC_C(int courses, long classId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				courses, classId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<TYClassUserRole> list = (List<TYClassUserRole>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_C_C,
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

			query.append(_SQL_SELECT_TYCLASSUSERROLE_WHERE);

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

				list = (List<TYClassUserRole>)QueryUtil.list(q, getDialect(),
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
	 * Finds the first t y class user role in the ordered set where courses = &#63; and classId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param courses the courses to search with
	 * @param classId the class id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching t y class user role
	 * @throws org.tvd.thptty.NoSuchClassUserRoleException if a matching t y class user role could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYClassUserRole findByC_C_First(int courses, long classId,
		OrderByComparator orderByComparator)
		throws NoSuchClassUserRoleException, SystemException {
		List<TYClassUserRole> list = findByC_C(courses, classId, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("courses=");
			msg.append(courses);

			msg.append(", classId=");
			msg.append(classId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchClassUserRoleException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last t y class user role in the ordered set where courses = &#63; and classId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param courses the courses to search with
	 * @param classId the class id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching t y class user role
	 * @throws org.tvd.thptty.NoSuchClassUserRoleException if a matching t y class user role could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYClassUserRole findByC_C_Last(int courses, long classId,
		OrderByComparator orderByComparator)
		throws NoSuchClassUserRoleException, SystemException {
		int count = countByC_C(courses, classId);

		List<TYClassUserRole> list = findByC_C(courses, classId, count - 1,
				count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("courses=");
			msg.append(courses);

			msg.append(", classId=");
			msg.append(classId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchClassUserRoleException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the t y class user roles before and after the current t y class user role in the ordered set where courses = &#63; and classId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param tyClassUserRolePK the primary key of the current t y class user role
	 * @param courses the courses to search with
	 * @param classId the class id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next t y class user role
	 * @throws org.tvd.thptty.NoSuchClassUserRoleException if a t y class user role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYClassUserRole[] findByC_C_PrevAndNext(
		TYClassUserRolePK tyClassUserRolePK, int courses, long classId,
		OrderByComparator orderByComparator)
		throws NoSuchClassUserRoleException, SystemException {
		TYClassUserRole tyClassUserRole = findByPrimaryKey(tyClassUserRolePK);

		Session session = null;

		try {
			session = openSession();

			TYClassUserRole[] array = new TYClassUserRoleImpl[3];

			array[0] = getByC_C_PrevAndNext(session, tyClassUserRole, courses,
					classId, orderByComparator, true);

			array[1] = tyClassUserRole;

			array[2] = getByC_C_PrevAndNext(session, tyClassUserRole, courses,
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

	protected TYClassUserRole getByC_C_PrevAndNext(Session session,
		TYClassUserRole tyClassUserRole, int courses, long classId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TYCLASSUSERROLE_WHERE);

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
			Object[] values = orderByComparator.getOrderByValues(tyClassUserRole);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TYClassUserRole> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the t y class user roles where courses = &#63; and userId = &#63; and roleId = &#63;.
	 *
	 * @param courses the courses to search with
	 * @param userId the user id to search with
	 * @param roleId the role id to search with
	 * @return the matching t y class user roles
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYClassUserRole> findByC_U_R(int courses, long userId,
		long roleId) throws SystemException {
		return findByC_U_R(courses, userId, roleId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the t y class user roles where courses = &#63; and userId = &#63; and roleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param courses the courses to search with
	 * @param userId the user id to search with
	 * @param roleId the role id to search with
	 * @param start the lower bound of the range of t y class user roles to return
	 * @param end the upper bound of the range of t y class user roles to return (not inclusive)
	 * @return the range of matching t y class user roles
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYClassUserRole> findByC_U_R(int courses, long userId,
		long roleId, int start, int end) throws SystemException {
		return findByC_U_R(courses, userId, roleId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the t y class user roles where courses = &#63; and userId = &#63; and roleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param courses the courses to search with
	 * @param userId the user id to search with
	 * @param roleId the role id to search with
	 * @param start the lower bound of the range of t y class user roles to return
	 * @param end the upper bound of the range of t y class user roles to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching t y class user roles
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYClassUserRole> findByC_U_R(int courses, long userId,
		long roleId, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				courses, userId, roleId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<TYClassUserRole> list = (List<TYClassUserRole>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_C_U_R,
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

			query.append(_SQL_SELECT_TYCLASSUSERROLE_WHERE);

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

				list = (List<TYClassUserRole>)QueryUtil.list(q, getDialect(),
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
	 * Finds the first t y class user role in the ordered set where courses = &#63; and userId = &#63; and roleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param courses the courses to search with
	 * @param userId the user id to search with
	 * @param roleId the role id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching t y class user role
	 * @throws org.tvd.thptty.NoSuchClassUserRoleException if a matching t y class user role could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYClassUserRole findByC_U_R_First(int courses, long userId,
		long roleId, OrderByComparator orderByComparator)
		throws NoSuchClassUserRoleException, SystemException {
		List<TYClassUserRole> list = findByC_U_R(courses, userId, roleId, 0, 1,
				orderByComparator);

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

			throw new NoSuchClassUserRoleException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last t y class user role in the ordered set where courses = &#63; and userId = &#63; and roleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param courses the courses to search with
	 * @param userId the user id to search with
	 * @param roleId the role id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching t y class user role
	 * @throws org.tvd.thptty.NoSuchClassUserRoleException if a matching t y class user role could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYClassUserRole findByC_U_R_Last(int courses, long userId,
		long roleId, OrderByComparator orderByComparator)
		throws NoSuchClassUserRoleException, SystemException {
		int count = countByC_U_R(courses, userId, roleId);

		List<TYClassUserRole> list = findByC_U_R(courses, userId, roleId,
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

			throw new NoSuchClassUserRoleException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the t y class user roles before and after the current t y class user role in the ordered set where courses = &#63; and userId = &#63; and roleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param tyClassUserRolePK the primary key of the current t y class user role
	 * @param courses the courses to search with
	 * @param userId the user id to search with
	 * @param roleId the role id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next t y class user role
	 * @throws org.tvd.thptty.NoSuchClassUserRoleException if a t y class user role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYClassUserRole[] findByC_U_R_PrevAndNext(
		TYClassUserRolePK tyClassUserRolePK, int courses, long userId,
		long roleId, OrderByComparator orderByComparator)
		throws NoSuchClassUserRoleException, SystemException {
		TYClassUserRole tyClassUserRole = findByPrimaryKey(tyClassUserRolePK);

		Session session = null;

		try {
			session = openSession();

			TYClassUserRole[] array = new TYClassUserRoleImpl[3];

			array[0] = getByC_U_R_PrevAndNext(session, tyClassUserRole,
					courses, userId, roleId, orderByComparator, true);

			array[1] = tyClassUserRole;

			array[2] = getByC_U_R_PrevAndNext(session, tyClassUserRole,
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

	protected TYClassUserRole getByC_U_R_PrevAndNext(Session session,
		TYClassUserRole tyClassUserRole, int courses, long userId, long roleId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TYCLASSUSERROLE_WHERE);

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
			Object[] values = orderByComparator.getOrderByValues(tyClassUserRole);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TYClassUserRole> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the t y class user roles.
	 *
	 * @return the t y class user roles
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYClassUserRole> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the t y class user roles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of t y class user roles to return
	 * @param end the upper bound of the range of t y class user roles to return (not inclusive)
	 * @return the range of t y class user roles
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYClassUserRole> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the t y class user roles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of t y class user roles to return
	 * @param end the upper bound of the range of t y class user roles to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of t y class user roles
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYClassUserRole> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<TYClassUserRole> list = (List<TYClassUserRole>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TYCLASSUSERROLE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TYCLASSUSERROLE;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<TYClassUserRole>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<TYClassUserRole>)QueryUtil.list(q,
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
	 * Removes the t y class user role where courses = &#63; and classId = &#63; and roleId = &#63; from the database.
	 *
	 * @param courses the courses to search with
	 * @param classId the class id to search with
	 * @param roleId the role id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByC_C_R(int courses, long classId, long roleId)
		throws NoSuchClassUserRoleException, SystemException {
		TYClassUserRole tyClassUserRole = findByC_C_R(courses, classId, roleId);

		remove(tyClassUserRole);
	}

	/**
	 * Removes all the t y class user roles where courses = &#63; and classId = &#63; from the database.
	 *
	 * @param courses the courses to search with
	 * @param classId the class id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByC_C(int courses, long classId)
		throws SystemException {
		for (TYClassUserRole tyClassUserRole : findByC_C(courses, classId)) {
			remove(tyClassUserRole);
		}
	}

	/**
	 * Removes all the t y class user roles where courses = &#63; and userId = &#63; and roleId = &#63; from the database.
	 *
	 * @param courses the courses to search with
	 * @param userId the user id to search with
	 * @param roleId the role id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByC_U_R(int courses, long userId, long roleId)
		throws SystemException {
		for (TYClassUserRole tyClassUserRole : findByC_U_R(courses, userId,
				roleId)) {
			remove(tyClassUserRole);
		}
	}

	/**
	 * Removes all the t y class user roles from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (TYClassUserRole tyClassUserRole : findAll()) {
			remove(tyClassUserRole);
		}
	}

	/**
	 * Counts all the t y class user roles where courses = &#63; and classId = &#63; and roleId = &#63;.
	 *
	 * @param courses the courses to search with
	 * @param classId the class id to search with
	 * @param roleId the role id to search with
	 * @return the number of matching t y class user roles
	 * @throws SystemException if a system exception occurred
	 */
	public int countByC_C_R(int courses, long classId, long roleId)
		throws SystemException {
		Object[] finderArgs = new Object[] { courses, classId, roleId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_C_C_R,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_TYCLASSUSERROLE_WHERE);

			query.append(_FINDER_COLUMN_C_C_R_COURSES_2);

			query.append(_FINDER_COLUMN_C_C_R_CLASSID_2);

			query.append(_FINDER_COLUMN_C_C_R_ROLEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(courses);

				qPos.add(classId);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_C_C_R,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the t y class user roles where courses = &#63; and classId = &#63;.
	 *
	 * @param courses the courses to search with
	 * @param classId the class id to search with
	 * @return the number of matching t y class user roles
	 * @throws SystemException if a system exception occurred
	 */
	public int countByC_C(int courses, long classId) throws SystemException {
		Object[] finderArgs = new Object[] { courses, classId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_C_C,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TYCLASSUSERROLE_WHERE);

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
	 * Counts all the t y class user roles where courses = &#63; and userId = &#63; and roleId = &#63;.
	 *
	 * @param courses the courses to search with
	 * @param userId the user id to search with
	 * @param roleId the role id to search with
	 * @return the number of matching t y class user roles
	 * @throws SystemException if a system exception occurred
	 */
	public int countByC_U_R(int courses, long userId, long roleId)
		throws SystemException {
		Object[] finderArgs = new Object[] { courses, userId, roleId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_C_U_R,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_TYCLASSUSERROLE_WHERE);

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
	 * Counts all the t y class user roles.
	 *
	 * @return the number of t y class user roles
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

				Query q = session.createQuery(_SQL_COUNT_TYCLASSUSERROLE);

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
	 * Initializes the t y class user role persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.tvd.thptty.model.TYClassUserRole")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TYClassUserRole>> listenersList = new ArrayList<ModelListener<TYClassUserRole>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TYClassUserRole>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TYClassUserRoleImpl.class.getName());
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
	@BeanReference(type = GroupPersistence.class)
	protected GroupPersistence groupPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = RolePersistence.class)
	protected RolePersistence rolePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_TYCLASSUSERROLE = "SELECT tyClassUserRole FROM TYClassUserRole tyClassUserRole";
	private static final String _SQL_SELECT_TYCLASSUSERROLE_WHERE = "SELECT tyClassUserRole FROM TYClassUserRole tyClassUserRole WHERE ";
	private static final String _SQL_COUNT_TYCLASSUSERROLE = "SELECT COUNT(tyClassUserRole) FROM TYClassUserRole tyClassUserRole";
	private static final String _SQL_COUNT_TYCLASSUSERROLE_WHERE = "SELECT COUNT(tyClassUserRole) FROM TYClassUserRole tyClassUserRole WHERE ";
	private static final String _FINDER_COLUMN_C_C_R_COURSES_2 = "tyClassUserRole.id.courses = ? AND ";
	private static final String _FINDER_COLUMN_C_C_R_CLASSID_2 = "tyClassUserRole.id.classId = ? AND ";
	private static final String _FINDER_COLUMN_C_C_R_ROLEID_2 = "tyClassUserRole.id.roleId = ?";
	private static final String _FINDER_COLUMN_C_C_COURSES_2 = "tyClassUserRole.id.courses = ? AND ";
	private static final String _FINDER_COLUMN_C_C_CLASSID_2 = "tyClassUserRole.id.classId = ?";
	private static final String _FINDER_COLUMN_C_U_R_COURSES_2 = "tyClassUserRole.id.courses = ? AND ";
	private static final String _FINDER_COLUMN_C_U_R_USERID_2 = "tyClassUserRole.id.userId = ? AND ";
	private static final String _FINDER_COLUMN_C_U_R_ROLEID_2 = "tyClassUserRole.id.roleId = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tyClassUserRole.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TYClassUserRole exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TYClassUserRole exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(TYClassUserRolePersistenceImpl.class);
}