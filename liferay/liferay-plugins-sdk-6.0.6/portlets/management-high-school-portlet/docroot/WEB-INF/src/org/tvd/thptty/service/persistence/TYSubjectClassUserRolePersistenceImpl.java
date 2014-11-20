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

import org.tvd.thptty.NoSuchSubjectClassUserRoleException;
import org.tvd.thptty.model.TYSubjectClassUserRole;
import org.tvd.thptty.model.impl.TYSubjectClassUserRoleImpl;
import org.tvd.thptty.model.impl.TYSubjectClassUserRoleModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the t y subject class user role service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link TYSubjectClassUserRoleUtil} to access the t y subject class user role persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ta Van Dung
 * @see TYSubjectClassUserRolePersistence
 * @see TYSubjectClassUserRoleUtil
 * @generated
 */
public class TYSubjectClassUserRolePersistenceImpl extends BasePersistenceImpl<TYSubjectClassUserRole>
	implements TYSubjectClassUserRolePersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = TYSubjectClassUserRoleImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_C_S_U_R = new FinderPath(TYSubjectClassUserRoleModelImpl.ENTITY_CACHE_ENABLED,
			TYSubjectClassUserRoleModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByC_S_U_R",
			new String[] {
				Integer.class.getName(), Long.class.getName(),
				Long.class.getName(), Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_C_S_U_R = new FinderPath(TYSubjectClassUserRoleModelImpl.ENTITY_CACHE_ENABLED,
			TYSubjectClassUserRoleModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByC_S_U_R",
			new String[] {
				Integer.class.getName(), Long.class.getName(),
				Long.class.getName(), Long.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_C_U_R = new FinderPath(TYSubjectClassUserRoleModelImpl.ENTITY_CACHE_ENABLED,
			TYSubjectClassUserRoleModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByC_U_R",
			new String[] {
				Integer.class.getName(), Long.class.getName(),
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_C_U_R = new FinderPath(TYSubjectClassUserRoleModelImpl.ENTITY_CACHE_ENABLED,
			TYSubjectClassUserRoleModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByC_U_R",
			new String[] {
				Integer.class.getName(), Long.class.getName(),
				Long.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(TYSubjectClassUserRoleModelImpl.ENTITY_CACHE_ENABLED,
			TYSubjectClassUserRoleModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TYSubjectClassUserRoleModelImpl.ENTITY_CACHE_ENABLED,
			TYSubjectClassUserRoleModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countAll", new String[0]);

	/**
	 * Caches the t y subject class user role in the entity cache if it is enabled.
	 *
	 * @param tySubjectClassUserRole the t y subject class user role to cache
	 */
	public void cacheResult(TYSubjectClassUserRole tySubjectClassUserRole) {
		EntityCacheUtil.putResult(TYSubjectClassUserRoleModelImpl.ENTITY_CACHE_ENABLED,
			TYSubjectClassUserRoleImpl.class,
			tySubjectClassUserRole.getPrimaryKey(), tySubjectClassUserRole);
	}

	/**
	 * Caches the t y subject class user roles in the entity cache if it is enabled.
	 *
	 * @param tySubjectClassUserRoles the t y subject class user roles to cache
	 */
	public void cacheResult(
		List<TYSubjectClassUserRole> tySubjectClassUserRoles) {
		for (TYSubjectClassUserRole tySubjectClassUserRole : tySubjectClassUserRoles) {
			if (EntityCacheUtil.getResult(
						TYSubjectClassUserRoleModelImpl.ENTITY_CACHE_ENABLED,
						TYSubjectClassUserRoleImpl.class,
						tySubjectClassUserRole.getPrimaryKey(), this) == null) {
				cacheResult(tySubjectClassUserRole);
			}
		}
	}

	/**
	 * Clears the cache for all t y subject class user roles.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(TYSubjectClassUserRoleImpl.class.getName());
		EntityCacheUtil.clearCache(TYSubjectClassUserRoleImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the t y subject class user role.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(TYSubjectClassUserRole tySubjectClassUserRole) {
		EntityCacheUtil.removeResult(TYSubjectClassUserRoleModelImpl.ENTITY_CACHE_ENABLED,
			TYSubjectClassUserRoleImpl.class,
			tySubjectClassUserRole.getPrimaryKey());
	}

	/**
	 * Creates a new t y subject class user role with the primary key. Does not add the t y subject class user role to the database.
	 *
	 * @param tySubjectClassUserRolePK the primary key for the new t y subject class user role
	 * @return the new t y subject class user role
	 */
	public TYSubjectClassUserRole create(
		TYSubjectClassUserRolePK tySubjectClassUserRolePK) {
		TYSubjectClassUserRole tySubjectClassUserRole = new TYSubjectClassUserRoleImpl();

		tySubjectClassUserRole.setNew(true);
		tySubjectClassUserRole.setPrimaryKey(tySubjectClassUserRolePK);

		return tySubjectClassUserRole;
	}

	/**
	 * Removes the t y subject class user role with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the t y subject class user role to remove
	 * @return the t y subject class user role that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a t y subject class user role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYSubjectClassUserRole remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove((TYSubjectClassUserRolePK)primaryKey);
	}

	/**
	 * Removes the t y subject class user role with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tySubjectClassUserRolePK the primary key of the t y subject class user role to remove
	 * @return the t y subject class user role that was removed
	 * @throws org.tvd.thptty.NoSuchSubjectClassUserRoleException if a t y subject class user role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYSubjectClassUserRole remove(
		TYSubjectClassUserRolePK tySubjectClassUserRolePK)
		throws NoSuchSubjectClassUserRoleException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TYSubjectClassUserRole tySubjectClassUserRole = (TYSubjectClassUserRole)session.get(TYSubjectClassUserRoleImpl.class,
					tySubjectClassUserRolePK);

			if (tySubjectClassUserRole == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
						tySubjectClassUserRolePK);
				}

				throw new NoSuchSubjectClassUserRoleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					tySubjectClassUserRolePK);
			}

			return remove(tySubjectClassUserRole);
		}
		catch (NoSuchSubjectClassUserRoleException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TYSubjectClassUserRole removeImpl(
		TYSubjectClassUserRole tySubjectClassUserRole)
		throws SystemException {
		tySubjectClassUserRole = toUnwrappedModel(tySubjectClassUserRole);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, tySubjectClassUserRole);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.removeResult(TYSubjectClassUserRoleModelImpl.ENTITY_CACHE_ENABLED,
			TYSubjectClassUserRoleImpl.class,
			tySubjectClassUserRole.getPrimaryKey());

		return tySubjectClassUserRole;
	}

	public TYSubjectClassUserRole updateImpl(
		org.tvd.thptty.model.TYSubjectClassUserRole tySubjectClassUserRole,
		boolean merge) throws SystemException {
		tySubjectClassUserRole = toUnwrappedModel(tySubjectClassUserRole);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, tySubjectClassUserRole, merge);

			tySubjectClassUserRole.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(TYSubjectClassUserRoleModelImpl.ENTITY_CACHE_ENABLED,
			TYSubjectClassUserRoleImpl.class,
			tySubjectClassUserRole.getPrimaryKey(), tySubjectClassUserRole);

		return tySubjectClassUserRole;
	}

	protected TYSubjectClassUserRole toUnwrappedModel(
		TYSubjectClassUserRole tySubjectClassUserRole) {
		if (tySubjectClassUserRole instanceof TYSubjectClassUserRoleImpl) {
			return tySubjectClassUserRole;
		}

		TYSubjectClassUserRoleImpl tySubjectClassUserRoleImpl = new TYSubjectClassUserRoleImpl();

		tySubjectClassUserRoleImpl.setNew(tySubjectClassUserRole.isNew());
		tySubjectClassUserRoleImpl.setPrimaryKey(tySubjectClassUserRole.getPrimaryKey());

		tySubjectClassUserRoleImpl.setCourses(tySubjectClassUserRole.getCourses());
		tySubjectClassUserRoleImpl.setSubjectId(tySubjectClassUserRole.getSubjectId());
		tySubjectClassUserRoleImpl.setClassId(tySubjectClassUserRole.getClassId());
		tySubjectClassUserRoleImpl.setUserId(tySubjectClassUserRole.getUserId());
		tySubjectClassUserRoleImpl.setRoleId(tySubjectClassUserRole.getRoleId());
		tySubjectClassUserRoleImpl.setStatus(tySubjectClassUserRole.getStatus());

		return tySubjectClassUserRoleImpl;
	}

	/**
	 * Finds the t y subject class user role with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the t y subject class user role to find
	 * @return the t y subject class user role
	 * @throws com.liferay.portal.NoSuchModelException if a t y subject class user role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYSubjectClassUserRole findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((TYSubjectClassUserRolePK)primaryKey);
	}

	/**
	 * Finds the t y subject class user role with the primary key or throws a {@link org.tvd.thptty.NoSuchSubjectClassUserRoleException} if it could not be found.
	 *
	 * @param tySubjectClassUserRolePK the primary key of the t y subject class user role to find
	 * @return the t y subject class user role
	 * @throws org.tvd.thptty.NoSuchSubjectClassUserRoleException if a t y subject class user role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYSubjectClassUserRole findByPrimaryKey(
		TYSubjectClassUserRolePK tySubjectClassUserRolePK)
		throws NoSuchSubjectClassUserRoleException, SystemException {
		TYSubjectClassUserRole tySubjectClassUserRole = fetchByPrimaryKey(tySubjectClassUserRolePK);

		if (tySubjectClassUserRole == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					tySubjectClassUserRolePK);
			}

			throw new NoSuchSubjectClassUserRoleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				tySubjectClassUserRolePK);
		}

		return tySubjectClassUserRole;
	}

	/**
	 * Finds the t y subject class user role with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the t y subject class user role to find
	 * @return the t y subject class user role, or <code>null</code> if a t y subject class user role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYSubjectClassUserRole fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((TYSubjectClassUserRolePK)primaryKey);
	}

	/**
	 * Finds the t y subject class user role with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tySubjectClassUserRolePK the primary key of the t y subject class user role to find
	 * @return the t y subject class user role, or <code>null</code> if a t y subject class user role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYSubjectClassUserRole fetchByPrimaryKey(
		TYSubjectClassUserRolePK tySubjectClassUserRolePK)
		throws SystemException {
		TYSubjectClassUserRole tySubjectClassUserRole = (TYSubjectClassUserRole)EntityCacheUtil.getResult(TYSubjectClassUserRoleModelImpl.ENTITY_CACHE_ENABLED,
				TYSubjectClassUserRoleImpl.class, tySubjectClassUserRolePK, this);

		if (tySubjectClassUserRole == null) {
			Session session = null;

			try {
				session = openSession();

				tySubjectClassUserRole = (TYSubjectClassUserRole)session.get(TYSubjectClassUserRoleImpl.class,
						tySubjectClassUserRolePK);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (tySubjectClassUserRole != null) {
					cacheResult(tySubjectClassUserRole);
				}

				closeSession(session);
			}
		}

		return tySubjectClassUserRole;
	}

	/**
	 * Finds all the t y subject class user roles where courses = &#63; and subjectId = &#63; and userId = &#63; and roleId = &#63;.
	 *
	 * @param courses the courses to search with
	 * @param subjectId the subject id to search with
	 * @param userId the user id to search with
	 * @param roleId the role id to search with
	 * @return the matching t y subject class user roles
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYSubjectClassUserRole> findByC_S_U_R(int courses,
		long subjectId, long userId, long roleId) throws SystemException {
		return findByC_S_U_R(courses, subjectId, userId, roleId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the t y subject class user roles where courses = &#63; and subjectId = &#63; and userId = &#63; and roleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param courses the courses to search with
	 * @param subjectId the subject id to search with
	 * @param userId the user id to search with
	 * @param roleId the role id to search with
	 * @param start the lower bound of the range of t y subject class user roles to return
	 * @param end the upper bound of the range of t y subject class user roles to return (not inclusive)
	 * @return the range of matching t y subject class user roles
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYSubjectClassUserRole> findByC_S_U_R(int courses,
		long subjectId, long userId, long roleId, int start, int end)
		throws SystemException {
		return findByC_S_U_R(courses, subjectId, userId, roleId, start, end,
			null);
	}

	/**
	 * Finds an ordered range of all the t y subject class user roles where courses = &#63; and subjectId = &#63; and userId = &#63; and roleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param courses the courses to search with
	 * @param subjectId the subject id to search with
	 * @param userId the user id to search with
	 * @param roleId the role id to search with
	 * @param start the lower bound of the range of t y subject class user roles to return
	 * @param end the upper bound of the range of t y subject class user roles to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching t y subject class user roles
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYSubjectClassUserRole> findByC_S_U_R(int courses,
		long subjectId, long userId, long roleId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				courses, subjectId, userId, roleId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<TYSubjectClassUserRole> list = (List<TYSubjectClassUserRole>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_C_S_U_R,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(6 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_TYSUBJECTCLASSUSERROLE_WHERE);

			query.append(_FINDER_COLUMN_C_S_U_R_COURSES_2);

			query.append(_FINDER_COLUMN_C_S_U_R_SUBJECTID_2);

			query.append(_FINDER_COLUMN_C_S_U_R_USERID_2);

			query.append(_FINDER_COLUMN_C_S_U_R_ROLEID_2);

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

				qPos.add(userId);

				qPos.add(roleId);

				list = (List<TYSubjectClassUserRole>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_C_S_U_R,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_C_S_U_R,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first t y subject class user role in the ordered set where courses = &#63; and subjectId = &#63; and userId = &#63; and roleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param courses the courses to search with
	 * @param subjectId the subject id to search with
	 * @param userId the user id to search with
	 * @param roleId the role id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching t y subject class user role
	 * @throws org.tvd.thptty.NoSuchSubjectClassUserRoleException if a matching t y subject class user role could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYSubjectClassUserRole findByC_S_U_R_First(int courses,
		long subjectId, long userId, long roleId,
		OrderByComparator orderByComparator)
		throws NoSuchSubjectClassUserRoleException, SystemException {
		List<TYSubjectClassUserRole> list = findByC_S_U_R(courses, subjectId,
				userId, roleId, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("courses=");
			msg.append(courses);

			msg.append(", subjectId=");
			msg.append(subjectId);

			msg.append(", userId=");
			msg.append(userId);

			msg.append(", roleId=");
			msg.append(roleId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchSubjectClassUserRoleException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last t y subject class user role in the ordered set where courses = &#63; and subjectId = &#63; and userId = &#63; and roleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param courses the courses to search with
	 * @param subjectId the subject id to search with
	 * @param userId the user id to search with
	 * @param roleId the role id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching t y subject class user role
	 * @throws org.tvd.thptty.NoSuchSubjectClassUserRoleException if a matching t y subject class user role could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYSubjectClassUserRole findByC_S_U_R_Last(int courses,
		long subjectId, long userId, long roleId,
		OrderByComparator orderByComparator)
		throws NoSuchSubjectClassUserRoleException, SystemException {
		int count = countByC_S_U_R(courses, subjectId, userId, roleId);

		List<TYSubjectClassUserRole> list = findByC_S_U_R(courses, subjectId,
				userId, roleId, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("courses=");
			msg.append(courses);

			msg.append(", subjectId=");
			msg.append(subjectId);

			msg.append(", userId=");
			msg.append(userId);

			msg.append(", roleId=");
			msg.append(roleId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchSubjectClassUserRoleException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the t y subject class user roles before and after the current t y subject class user role in the ordered set where courses = &#63; and subjectId = &#63; and userId = &#63; and roleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param tySubjectClassUserRolePK the primary key of the current t y subject class user role
	 * @param courses the courses to search with
	 * @param subjectId the subject id to search with
	 * @param userId the user id to search with
	 * @param roleId the role id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next t y subject class user role
	 * @throws org.tvd.thptty.NoSuchSubjectClassUserRoleException if a t y subject class user role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYSubjectClassUserRole[] findByC_S_U_R_PrevAndNext(
		TYSubjectClassUserRolePK tySubjectClassUserRolePK, int courses,
		long subjectId, long userId, long roleId,
		OrderByComparator orderByComparator)
		throws NoSuchSubjectClassUserRoleException, SystemException {
		TYSubjectClassUserRole tySubjectClassUserRole = findByPrimaryKey(tySubjectClassUserRolePK);

		Session session = null;

		try {
			session = openSession();

			TYSubjectClassUserRole[] array = new TYSubjectClassUserRoleImpl[3];

			array[0] = getByC_S_U_R_PrevAndNext(session,
					tySubjectClassUserRole, courses, subjectId, userId, roleId,
					orderByComparator, true);

			array[1] = tySubjectClassUserRole;

			array[2] = getByC_S_U_R_PrevAndNext(session,
					tySubjectClassUserRole, courses, subjectId, userId, roleId,
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

	protected TYSubjectClassUserRole getByC_S_U_R_PrevAndNext(Session session,
		TYSubjectClassUserRole tySubjectClassUserRole, int courses,
		long subjectId, long userId, long roleId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TYSUBJECTCLASSUSERROLE_WHERE);

		query.append(_FINDER_COLUMN_C_S_U_R_COURSES_2);

		query.append(_FINDER_COLUMN_C_S_U_R_SUBJECTID_2);

		query.append(_FINDER_COLUMN_C_S_U_R_USERID_2);

		query.append(_FINDER_COLUMN_C_S_U_R_ROLEID_2);

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

		qPos.add(userId);

		qPos.add(roleId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(tySubjectClassUserRole);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TYSubjectClassUserRole> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the t y subject class user roles where courses = &#63; and userId = &#63; and roleId = &#63;.
	 *
	 * @param courses the courses to search with
	 * @param userId the user id to search with
	 * @param roleId the role id to search with
	 * @return the matching t y subject class user roles
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYSubjectClassUserRole> findByC_U_R(int courses, long userId,
		long roleId) throws SystemException {
		return findByC_U_R(courses, userId, roleId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the t y subject class user roles where courses = &#63; and userId = &#63; and roleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param courses the courses to search with
	 * @param userId the user id to search with
	 * @param roleId the role id to search with
	 * @param start the lower bound of the range of t y subject class user roles to return
	 * @param end the upper bound of the range of t y subject class user roles to return (not inclusive)
	 * @return the range of matching t y subject class user roles
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYSubjectClassUserRole> findByC_U_R(int courses, long userId,
		long roleId, int start, int end) throws SystemException {
		return findByC_U_R(courses, userId, roleId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the t y subject class user roles where courses = &#63; and userId = &#63; and roleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param courses the courses to search with
	 * @param userId the user id to search with
	 * @param roleId the role id to search with
	 * @param start the lower bound of the range of t y subject class user roles to return
	 * @param end the upper bound of the range of t y subject class user roles to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching t y subject class user roles
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYSubjectClassUserRole> findByC_U_R(int courses, long userId,
		long roleId, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				courses, userId, roleId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<TYSubjectClassUserRole> list = (List<TYSubjectClassUserRole>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_C_U_R,
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

			query.append(_SQL_SELECT_TYSUBJECTCLASSUSERROLE_WHERE);

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

				list = (List<TYSubjectClassUserRole>)QueryUtil.list(q,
						getDialect(), start, end);
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
	 * Finds the first t y subject class user role in the ordered set where courses = &#63; and userId = &#63; and roleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param courses the courses to search with
	 * @param userId the user id to search with
	 * @param roleId the role id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching t y subject class user role
	 * @throws org.tvd.thptty.NoSuchSubjectClassUserRoleException if a matching t y subject class user role could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYSubjectClassUserRole findByC_U_R_First(int courses, long userId,
		long roleId, OrderByComparator orderByComparator)
		throws NoSuchSubjectClassUserRoleException, SystemException {
		List<TYSubjectClassUserRole> list = findByC_U_R(courses, userId,
				roleId, 0, 1, orderByComparator);

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

			throw new NoSuchSubjectClassUserRoleException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last t y subject class user role in the ordered set where courses = &#63; and userId = &#63; and roleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param courses the courses to search with
	 * @param userId the user id to search with
	 * @param roleId the role id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching t y subject class user role
	 * @throws org.tvd.thptty.NoSuchSubjectClassUserRoleException if a matching t y subject class user role could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYSubjectClassUserRole findByC_U_R_Last(int courses, long userId,
		long roleId, OrderByComparator orderByComparator)
		throws NoSuchSubjectClassUserRoleException, SystemException {
		int count = countByC_U_R(courses, userId, roleId);

		List<TYSubjectClassUserRole> list = findByC_U_R(courses, userId,
				roleId, count - 1, count, orderByComparator);

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

			throw new NoSuchSubjectClassUserRoleException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the t y subject class user roles before and after the current t y subject class user role in the ordered set where courses = &#63; and userId = &#63; and roleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param tySubjectClassUserRolePK the primary key of the current t y subject class user role
	 * @param courses the courses to search with
	 * @param userId the user id to search with
	 * @param roleId the role id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next t y subject class user role
	 * @throws org.tvd.thptty.NoSuchSubjectClassUserRoleException if a t y subject class user role with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYSubjectClassUserRole[] findByC_U_R_PrevAndNext(
		TYSubjectClassUserRolePK tySubjectClassUserRolePK, int courses,
		long userId, long roleId, OrderByComparator orderByComparator)
		throws NoSuchSubjectClassUserRoleException, SystemException {
		TYSubjectClassUserRole tySubjectClassUserRole = findByPrimaryKey(tySubjectClassUserRolePK);

		Session session = null;

		try {
			session = openSession();

			TYSubjectClassUserRole[] array = new TYSubjectClassUserRoleImpl[3];

			array[0] = getByC_U_R_PrevAndNext(session, tySubjectClassUserRole,
					courses, userId, roleId, orderByComparator, true);

			array[1] = tySubjectClassUserRole;

			array[2] = getByC_U_R_PrevAndNext(session, tySubjectClassUserRole,
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

	protected TYSubjectClassUserRole getByC_U_R_PrevAndNext(Session session,
		TYSubjectClassUserRole tySubjectClassUserRole, int courses,
		long userId, long roleId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TYSUBJECTCLASSUSERROLE_WHERE);

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
			Object[] values = orderByComparator.getOrderByValues(tySubjectClassUserRole);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TYSubjectClassUserRole> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the t y subject class user roles.
	 *
	 * @return the t y subject class user roles
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYSubjectClassUserRole> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the t y subject class user roles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of t y subject class user roles to return
	 * @param end the upper bound of the range of t y subject class user roles to return (not inclusive)
	 * @return the range of t y subject class user roles
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYSubjectClassUserRole> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the t y subject class user roles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of t y subject class user roles to return
	 * @param end the upper bound of the range of t y subject class user roles to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of t y subject class user roles
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYSubjectClassUserRole> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<TYSubjectClassUserRole> list = (List<TYSubjectClassUserRole>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TYSUBJECTCLASSUSERROLE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TYSUBJECTCLASSUSERROLE;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<TYSubjectClassUserRole>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<TYSubjectClassUserRole>)QueryUtil.list(q,
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
	 * Removes all the t y subject class user roles where courses = &#63; and subjectId = &#63; and userId = &#63; and roleId = &#63; from the database.
	 *
	 * @param courses the courses to search with
	 * @param subjectId the subject id to search with
	 * @param userId the user id to search with
	 * @param roleId the role id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByC_S_U_R(int courses, long subjectId, long userId,
		long roleId) throws SystemException {
		for (TYSubjectClassUserRole tySubjectClassUserRole : findByC_S_U_R(
				courses, subjectId, userId, roleId)) {
			remove(tySubjectClassUserRole);
		}
	}

	/**
	 * Removes all the t y subject class user roles where courses = &#63; and userId = &#63; and roleId = &#63; from the database.
	 *
	 * @param courses the courses to search with
	 * @param userId the user id to search with
	 * @param roleId the role id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByC_U_R(int courses, long userId, long roleId)
		throws SystemException {
		for (TYSubjectClassUserRole tySubjectClassUserRole : findByC_U_R(
				courses, userId, roleId)) {
			remove(tySubjectClassUserRole);
		}
	}

	/**
	 * Removes all the t y subject class user roles from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (TYSubjectClassUserRole tySubjectClassUserRole : findAll()) {
			remove(tySubjectClassUserRole);
		}
	}

	/**
	 * Counts all the t y subject class user roles where courses = &#63; and subjectId = &#63; and userId = &#63; and roleId = &#63;.
	 *
	 * @param courses the courses to search with
	 * @param subjectId the subject id to search with
	 * @param userId the user id to search with
	 * @param roleId the role id to search with
	 * @return the number of matching t y subject class user roles
	 * @throws SystemException if a system exception occurred
	 */
	public int countByC_S_U_R(int courses, long subjectId, long userId,
		long roleId) throws SystemException {
		Object[] finderArgs = new Object[] { courses, subjectId, userId, roleId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_C_S_U_R,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_TYSUBJECTCLASSUSERROLE_WHERE);

			query.append(_FINDER_COLUMN_C_S_U_R_COURSES_2);

			query.append(_FINDER_COLUMN_C_S_U_R_SUBJECTID_2);

			query.append(_FINDER_COLUMN_C_S_U_R_USERID_2);

			query.append(_FINDER_COLUMN_C_S_U_R_ROLEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(courses);

				qPos.add(subjectId);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_C_S_U_R,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the t y subject class user roles where courses = &#63; and userId = &#63; and roleId = &#63;.
	 *
	 * @param courses the courses to search with
	 * @param userId the user id to search with
	 * @param roleId the role id to search with
	 * @return the number of matching t y subject class user roles
	 * @throws SystemException if a system exception occurred
	 */
	public int countByC_U_R(int courses, long userId, long roleId)
		throws SystemException {
		Object[] finderArgs = new Object[] { courses, userId, roleId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_C_U_R,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_TYSUBJECTCLASSUSERROLE_WHERE);

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
	 * Counts all the t y subject class user roles.
	 *
	 * @return the number of t y subject class user roles
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

				Query q = session.createQuery(_SQL_COUNT_TYSUBJECTCLASSUSERROLE);

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
	 * Initializes the t y subject class user role persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.tvd.thptty.model.TYSubjectClassUserRole")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TYSubjectClassUserRole>> listenersList = new ArrayList<ModelListener<TYSubjectClassUserRole>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TYSubjectClassUserRole>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TYSubjectClassUserRoleImpl.class.getName());
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
	private static final String _SQL_SELECT_TYSUBJECTCLASSUSERROLE = "SELECT tySubjectClassUserRole FROM TYSubjectClassUserRole tySubjectClassUserRole";
	private static final String _SQL_SELECT_TYSUBJECTCLASSUSERROLE_WHERE = "SELECT tySubjectClassUserRole FROM TYSubjectClassUserRole tySubjectClassUserRole WHERE ";
	private static final String _SQL_COUNT_TYSUBJECTCLASSUSERROLE = "SELECT COUNT(tySubjectClassUserRole) FROM TYSubjectClassUserRole tySubjectClassUserRole";
	private static final String _SQL_COUNT_TYSUBJECTCLASSUSERROLE_WHERE = "SELECT COUNT(tySubjectClassUserRole) FROM TYSubjectClassUserRole tySubjectClassUserRole WHERE ";
	private static final String _FINDER_COLUMN_C_S_U_R_COURSES_2 = "tySubjectClassUserRole.id.courses = ? AND ";
	private static final String _FINDER_COLUMN_C_S_U_R_SUBJECTID_2 = "tySubjectClassUserRole.id.subjectId = ? AND ";
	private static final String _FINDER_COLUMN_C_S_U_R_USERID_2 = "tySubjectClassUserRole.id.userId = ? AND ";
	private static final String _FINDER_COLUMN_C_S_U_R_ROLEID_2 = "tySubjectClassUserRole.id.roleId = ?";
	private static final String _FINDER_COLUMN_C_U_R_COURSES_2 = "tySubjectClassUserRole.id.courses = ? AND ";
	private static final String _FINDER_COLUMN_C_U_R_USERID_2 = "tySubjectClassUserRole.id.userId = ? AND ";
	private static final String _FINDER_COLUMN_C_U_R_ROLEID_2 = "tySubjectClassUserRole.id.roleId = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tySubjectClassUserRole.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TYSubjectClassUserRole exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TYSubjectClassUserRole exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(TYSubjectClassUserRolePersistenceImpl.class);
}