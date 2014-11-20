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
import com.liferay.portal.kernel.dao.orm.SQLQuery;
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
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.security.permission.InlineSQLHelperUtil;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import org.tvd.thptty.NoSuchClassException;
import org.tvd.thptty.model.TYClass;
import org.tvd.thptty.model.impl.TYClassImpl;
import org.tvd.thptty.model.impl.TYClassModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the t y class service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link TYClassUtil} to access the t y class persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ta Van Dung
 * @see TYClassPersistence
 * @see TYClassUtil
 * @generated
 */
public class TYClassPersistenceImpl extends BasePersistenceImpl<TYClass>
	implements TYClassPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = TYClassImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_G_ID = new FinderPath(TYClassModelImpl.ENTITY_CACHE_ENABLED,
			TYClassModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByG_ID",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_G_ID = new FinderPath(TYClassModelImpl.ENTITY_CACHE_ENABLED,
			TYClassModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByG_ID",
			new String[] { Long.class.getName(), Long.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_C_G = new FinderPath(TYClassModelImpl.ENTITY_CACHE_ENABLED,
			TYClassModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_ENTITY,
			"fetchByC_G",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_C_G = new FinderPath(TYClassModelImpl.ENTITY_CACHE_ENABLED,
			TYClassModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByC_G",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			});
	public static final FinderPath FINDER_PATH_FETCH_BY_CLASSGROUP_NAME = new FinderPath(TYClassModelImpl.ENTITY_CACHE_ENABLED,
			TYClassModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_ENTITY,
			"fetchByclassGroup_Name",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName(), String.class.getName()
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_CLASSGROUP_NAME = new FinderPath(TYClassModelImpl.ENTITY_CACHE_ENABLED,
			TYClassModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByclassGroup_Name",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName(), String.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(TYClassModelImpl.ENTITY_CACHE_ENABLED,
			TYClassModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TYClassModelImpl.ENTITY_CACHE_ENABLED,
			TYClassModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countAll", new String[0]);

	/**
	 * Caches the t y class in the entity cache if it is enabled.
	 *
	 * @param tyClass the t y class to cache
	 */
	public void cacheResult(TYClass tyClass) {
		EntityCacheUtil.putResult(TYClassModelImpl.ENTITY_CACHE_ENABLED,
			TYClassImpl.class, tyClass.getPrimaryKey(), tyClass);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_G,
			new Object[] {
				new Long(tyClass.getClassId()), new Long(tyClass.getGroupId()),
				new Long(tyClass.getCompanyId())
			}, tyClass);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CLASSGROUP_NAME,
			new Object[] {
				new Long(tyClass.getCompanyId()), new Long(tyClass.getGroupId()),
				new Integer(tyClass.getClassGroup()),
				
			tyClass.getClassName()
			}, tyClass);
	}

	/**
	 * Caches the t y classes in the entity cache if it is enabled.
	 *
	 * @param tyClasses the t y classes to cache
	 */
	public void cacheResult(List<TYClass> tyClasses) {
		for (TYClass tyClass : tyClasses) {
			if (EntityCacheUtil.getResult(
						TYClassModelImpl.ENTITY_CACHE_ENABLED,
						TYClassImpl.class, tyClass.getPrimaryKey(), this) == null) {
				cacheResult(tyClass);
			}
		}
	}

	/**
	 * Clears the cache for all t y classes.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(TYClassImpl.class.getName());
		EntityCacheUtil.clearCache(TYClassImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the t y class.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(TYClass tyClass) {
		EntityCacheUtil.removeResult(TYClassModelImpl.ENTITY_CACHE_ENABLED,
			TYClassImpl.class, tyClass.getPrimaryKey());

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_G,
			new Object[] {
				new Long(tyClass.getClassId()), new Long(tyClass.getGroupId()),
				new Long(tyClass.getCompanyId())
			});

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CLASSGROUP_NAME,
			new Object[] {
				new Long(tyClass.getCompanyId()), new Long(tyClass.getGroupId()),
				new Integer(tyClass.getClassGroup()),
				
			tyClass.getClassName()
			});
	}

	/**
	 * Creates a new t y class with the primary key. Does not add the t y class to the database.
	 *
	 * @param classId the primary key for the new t y class
	 * @return the new t y class
	 */
	public TYClass create(long classId) {
		TYClass tyClass = new TYClassImpl();

		tyClass.setNew(true);
		tyClass.setPrimaryKey(classId);

		return tyClass;
	}

	/**
	 * Removes the t y class with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the t y class to remove
	 * @return the t y class that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a t y class with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYClass remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Long)primaryKey).longValue());
	}

	/**
	 * Removes the t y class with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param classId the primary key of the t y class to remove
	 * @return the t y class that was removed
	 * @throws org.tvd.thptty.NoSuchClassException if a t y class with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYClass remove(long classId)
		throws NoSuchClassException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TYClass tyClass = (TYClass)session.get(TYClassImpl.class,
					new Long(classId));

			if (tyClass == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + classId);
				}

				throw new NoSuchClassException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					classId);
			}

			return remove(tyClass);
		}
		catch (NoSuchClassException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TYClass removeImpl(TYClass tyClass) throws SystemException {
		tyClass = toUnwrappedModel(tyClass);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, tyClass);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		TYClassModelImpl tyClassModelImpl = (TYClassModelImpl)tyClass;

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_G,
			new Object[] {
				new Long(tyClassModelImpl.getClassId()),
				new Long(tyClassModelImpl.getGroupId()),
				new Long(tyClassModelImpl.getCompanyId())
			});

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CLASSGROUP_NAME,
			new Object[] {
				new Long(tyClassModelImpl.getCompanyId()),
				new Long(tyClassModelImpl.getGroupId()),
				new Integer(tyClassModelImpl.getClassGroup()),
				
			tyClassModelImpl.getClassName()
			});

		EntityCacheUtil.removeResult(TYClassModelImpl.ENTITY_CACHE_ENABLED,
			TYClassImpl.class, tyClass.getPrimaryKey());

		return tyClass;
	}

	public TYClass updateImpl(org.tvd.thptty.model.TYClass tyClass,
		boolean merge) throws SystemException {
		tyClass = toUnwrappedModel(tyClass);

		boolean isNew = tyClass.isNew();

		TYClassModelImpl tyClassModelImpl = (TYClassModelImpl)tyClass;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, tyClass, merge);

			tyClass.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(TYClassModelImpl.ENTITY_CACHE_ENABLED,
			TYClassImpl.class, tyClass.getPrimaryKey(), tyClass);

		if (!isNew &&
				((tyClass.getClassId() != tyClassModelImpl.getOriginalClassId()) ||
				(tyClass.getGroupId() != tyClassModelImpl.getOriginalGroupId()) ||
				(tyClass.getCompanyId() != tyClassModelImpl.getOriginalCompanyId()))) {
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_G,
				new Object[] {
					new Long(tyClassModelImpl.getOriginalClassId()),
					new Long(tyClassModelImpl.getOriginalGroupId()),
					new Long(tyClassModelImpl.getOriginalCompanyId())
				});
		}

		if (isNew ||
				((tyClass.getClassId() != tyClassModelImpl.getOriginalClassId()) ||
				(tyClass.getGroupId() != tyClassModelImpl.getOriginalGroupId()) ||
				(tyClass.getCompanyId() != tyClassModelImpl.getOriginalCompanyId()))) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_G,
				new Object[] {
					new Long(tyClass.getClassId()),
					new Long(tyClass.getGroupId()),
					new Long(tyClass.getCompanyId())
				}, tyClass);
		}

		if (!isNew &&
				((tyClass.getCompanyId() != tyClassModelImpl.getOriginalCompanyId()) ||
				(tyClass.getGroupId() != tyClassModelImpl.getOriginalGroupId()) ||
				(tyClass.getClassGroup() != tyClassModelImpl.getOriginalClassGroup()) ||
				!Validator.equals(tyClass.getClassName(),
					tyClassModelImpl.getOriginalClassName()))) {
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CLASSGROUP_NAME,
				new Object[] {
					new Long(tyClassModelImpl.getOriginalCompanyId()),
					new Long(tyClassModelImpl.getOriginalGroupId()),
					new Integer(tyClassModelImpl.getOriginalClassGroup()),
					
				tyClassModelImpl.getOriginalClassName()
				});
		}

		if (isNew ||
				((tyClass.getCompanyId() != tyClassModelImpl.getOriginalCompanyId()) ||
				(tyClass.getGroupId() != tyClassModelImpl.getOriginalGroupId()) ||
				(tyClass.getClassGroup() != tyClassModelImpl.getOriginalClassGroup()) ||
				!Validator.equals(tyClass.getClassName(),
					tyClassModelImpl.getOriginalClassName()))) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CLASSGROUP_NAME,
				new Object[] {
					new Long(tyClass.getCompanyId()),
					new Long(tyClass.getGroupId()),
					new Integer(tyClass.getClassGroup()),
					
				tyClass.getClassName()
				}, tyClass);
		}

		return tyClass;
	}

	protected TYClass toUnwrappedModel(TYClass tyClass) {
		if (tyClass instanceof TYClassImpl) {
			return tyClass;
		}

		TYClassImpl tyClassImpl = new TYClassImpl();

		tyClassImpl.setNew(tyClass.isNew());
		tyClassImpl.setPrimaryKey(tyClass.getPrimaryKey());

		tyClassImpl.setClassId(tyClass.getClassId());
		tyClassImpl.setCompanyId(tyClass.getCompanyId());
		tyClassImpl.setGroupId(tyClass.getGroupId());
		tyClassImpl.setClassCode(tyClass.getClassCode());
		tyClassImpl.setClassGroup(tyClass.getClassGroup());
		tyClassImpl.setClassName(tyClass.getClassName());
		tyClassImpl.setModifiedDate(tyClass.getModifiedDate());
		tyClassImpl.setUserId(tyClass.getUserId());

		return tyClassImpl;
	}

	/**
	 * Finds the t y class with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the t y class to find
	 * @return the t y class
	 * @throws com.liferay.portal.NoSuchModelException if a t y class with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYClass findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the t y class with the primary key or throws a {@link org.tvd.thptty.NoSuchClassException} if it could not be found.
	 *
	 * @param classId the primary key of the t y class to find
	 * @return the t y class
	 * @throws org.tvd.thptty.NoSuchClassException if a t y class with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYClass findByPrimaryKey(long classId)
		throws NoSuchClassException, SystemException {
		TYClass tyClass = fetchByPrimaryKey(classId);

		if (tyClass == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + classId);
			}

			throw new NoSuchClassException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				classId);
		}

		return tyClass;
	}

	/**
	 * Finds the t y class with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the t y class to find
	 * @return the t y class, or <code>null</code> if a t y class with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYClass fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the t y class with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param classId the primary key of the t y class to find
	 * @return the t y class, or <code>null</code> if a t y class with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYClass fetchByPrimaryKey(long classId) throws SystemException {
		TYClass tyClass = (TYClass)EntityCacheUtil.getResult(TYClassModelImpl.ENTITY_CACHE_ENABLED,
				TYClassImpl.class, classId, this);

		if (tyClass == null) {
			Session session = null;

			try {
				session = openSession();

				tyClass = (TYClass)session.get(TYClassImpl.class,
						new Long(classId));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (tyClass != null) {
					cacheResult(tyClass);
				}

				closeSession(session);
			}
		}

		return tyClass;
	}

	/**
	 * Finds all the t y classes where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @return the matching t y classes
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYClass> findByG_ID(long companyId, long groupId)
		throws SystemException {
		return findByG_ID(companyId, groupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the t y classes where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of t y classes to return
	 * @param end the upper bound of the range of t y classes to return (not inclusive)
	 * @return the range of matching t y classes
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYClass> findByG_ID(long companyId, long groupId, int start,
		int end) throws SystemException {
		return findByG_ID(companyId, groupId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the t y classes where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of t y classes to return
	 * @param end the upper bound of the range of t y classes to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching t y classes
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYClass> findByG_ID(long companyId, long groupId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				companyId, groupId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<TYClass> list = (List<TYClass>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_G_ID,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_TYCLASS_WHERE);

			query.append(_FINDER_COLUMN_G_ID_COMPANYID_2);

			query.append(_FINDER_COLUMN_G_ID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(TYClassModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				list = (List<TYClass>)QueryUtil.list(q, getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_G_ID,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_G_ID,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first t y class in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching t y class
	 * @throws org.tvd.thptty.NoSuchClassException if a matching t y class could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYClass findByG_ID_First(long companyId, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchClassException, SystemException {
		List<TYClass> list = findByG_ID(companyId, groupId, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchClassException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last t y class in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching t y class
	 * @throws org.tvd.thptty.NoSuchClassException if a matching t y class could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYClass findByG_ID_Last(long companyId, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchClassException, SystemException {
		int count = countByG_ID(companyId, groupId);

		List<TYClass> list = findByG_ID(companyId, groupId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchClassException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the t y classes before and after the current t y class in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param classId the primary key of the current t y class
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next t y class
	 * @throws org.tvd.thptty.NoSuchClassException if a t y class with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYClass[] findByG_ID_PrevAndNext(long classId, long companyId,
		long groupId, OrderByComparator orderByComparator)
		throws NoSuchClassException, SystemException {
		TYClass tyClass = findByPrimaryKey(classId);

		Session session = null;

		try {
			session = openSession();

			TYClass[] array = new TYClassImpl[3];

			array[0] = getByG_ID_PrevAndNext(session, tyClass, companyId,
					groupId, orderByComparator, true);

			array[1] = tyClass;

			array[2] = getByG_ID_PrevAndNext(session, tyClass, companyId,
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

	protected TYClass getByG_ID_PrevAndNext(Session session, TYClass tyClass,
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

		query.append(_SQL_SELECT_TYCLASS_WHERE);

		query.append(_FINDER_COLUMN_G_ID_COMPANYID_2);

		query.append(_FINDER_COLUMN_G_ID_GROUPID_2);

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

		else {
			query.append(TYClassModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(tyClass);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TYClass> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Filters by the user's permissions and finds all the t y classes where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @return the matching t y classes that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYClass> filterFindByG_ID(long companyId, long groupId)
		throws SystemException {
		return filterFindByG_ID(companyId, groupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Filters by the user's permissions and finds a range of all the t y classes where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of t y classes to return
	 * @param end the upper bound of the range of t y classes to return (not inclusive)
	 * @return the range of matching t y classes that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYClass> filterFindByG_ID(long companyId, long groupId,
		int start, int end) throws SystemException {
		return filterFindByG_ID(companyId, groupId, start, end, null);
	}

	/**
	 * Filters by the user's permissions and finds an ordered range of all the t y classes where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of t y classes to return
	 * @param end the upper bound of the range of t y classes to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching t y classes that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYClass> filterFindByG_ID(long companyId, long groupId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return findByG_ID(companyId, groupId, start, end, orderByComparator);
		}

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		if (getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_TYCLASS_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_TYCLASS_NO_INLINE_DISTINCT_WHERE_1);
		}

		query.append(_FINDER_COLUMN_G_ID_COMPANYID_2);

		query.append(_FINDER_COLUMN_G_ID_GROUPID_2);

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_TYCLASS_NO_INLINE_DISTINCT_WHERE_2);
		}

		if (orderByComparator != null) {
			if (getDB().isSupportsInlineDistinct()) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_TABLE,
					orderByComparator);
			}
		}

		else {
			if (getDB().isSupportsInlineDistinct()) {
				query.append(TYClassModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(TYClassModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				TYClass.class.getName(), _FILTER_COLUMN_PK,
				_FILTER_COLUMN_USERID, groupId);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			if (getDB().isSupportsInlineDistinct()) {
				q.addEntity(_FILTER_ENTITY_ALIAS, TYClassImpl.class);
			}
			else {
				q.addEntity(_FILTER_ENTITY_TABLE, TYClassImpl.class);
			}

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(companyId);

			qPos.add(groupId);

			return (List<TYClass>)QueryUtil.list(q, getDialect(), start, end);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	/**
	 * Finds the t y class where classId = &#63; and groupId = &#63; and companyId = &#63; or throws a {@link org.tvd.thptty.NoSuchClassException} if it could not be found.
	 *
	 * @param classId the class id to search with
	 * @param groupId the group id to search with
	 * @param companyId the company id to search with
	 * @return the matching t y class
	 * @throws org.tvd.thptty.NoSuchClassException if a matching t y class could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYClass findByC_G(long classId, long groupId, long companyId)
		throws NoSuchClassException, SystemException {
		TYClass tyClass = fetchByC_G(classId, groupId, companyId);

		if (tyClass == null) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("classId=");
			msg.append(classId);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(", companyId=");
			msg.append(companyId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchClassException(msg.toString());
		}

		return tyClass;
	}

	/**
	 * Finds the t y class where classId = &#63; and groupId = &#63; and companyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param classId the class id to search with
	 * @param groupId the group id to search with
	 * @param companyId the company id to search with
	 * @return the matching t y class, or <code>null</code> if a matching t y class could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYClass fetchByC_G(long classId, long groupId, long companyId)
		throws SystemException {
		return fetchByC_G(classId, groupId, companyId, true);
	}

	/**
	 * Finds the t y class where classId = &#63; and groupId = &#63; and companyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param classId the class id to search with
	 * @param groupId the group id to search with
	 * @param companyId the company id to search with
	 * @return the matching t y class, or <code>null</code> if a matching t y class could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYClass fetchByC_G(long classId, long groupId, long companyId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { classId, groupId, companyId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_C_G,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_SELECT_TYCLASS_WHERE);

			query.append(_FINDER_COLUMN_C_G_CLASSID_2);

			query.append(_FINDER_COLUMN_C_G_GROUPID_2);

			query.append(_FINDER_COLUMN_C_G_COMPANYID_2);

			query.append(TYClassModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(classId);

				qPos.add(groupId);

				qPos.add(companyId);

				List<TYClass> list = q.list();

				result = list;

				TYClass tyClass = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_G,
						finderArgs, list);
				}
				else {
					tyClass = list.get(0);

					cacheResult(tyClass);

					if ((tyClass.getClassId() != classId) ||
							(tyClass.getGroupId() != groupId) ||
							(tyClass.getCompanyId() != companyId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_G,
							finderArgs, tyClass);
					}
				}

				return tyClass;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_G,
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
				return (TYClass)result;
			}
		}
	}

	/**
	 * Finds the t y class where companyId = &#63; and groupId = &#63; and classGroup = &#63; and className = &#63; or throws a {@link org.tvd.thptty.NoSuchClassException} if it could not be found.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param classGroup the class group to search with
	 * @param className the class name to search with
	 * @return the matching t y class
	 * @throws org.tvd.thptty.NoSuchClassException if a matching t y class could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYClass findByclassGroup_Name(long companyId, long groupId,
		int classGroup, String className)
		throws NoSuchClassException, SystemException {
		TYClass tyClass = fetchByclassGroup_Name(companyId, groupId,
				classGroup, className);

		if (tyClass == null) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(", classGroup=");
			msg.append(classGroup);

			msg.append(", className=");
			msg.append(className);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchClassException(msg.toString());
		}

		return tyClass;
	}

	/**
	 * Finds the t y class where companyId = &#63; and groupId = &#63; and classGroup = &#63; and className = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param classGroup the class group to search with
	 * @param className the class name to search with
	 * @return the matching t y class, or <code>null</code> if a matching t y class could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYClass fetchByclassGroup_Name(long companyId, long groupId,
		int classGroup, String className) throws SystemException {
		return fetchByclassGroup_Name(companyId, groupId, classGroup,
			className, true);
	}

	/**
	 * Finds the t y class where companyId = &#63; and groupId = &#63; and classGroup = &#63; and className = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param classGroup the class group to search with
	 * @param className the class name to search with
	 * @return the matching t y class, or <code>null</code> if a matching t y class could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYClass fetchByclassGroup_Name(long companyId, long groupId,
		int classGroup, String className, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				companyId, groupId, classGroup, className
			};

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_CLASSGROUP_NAME,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(6);

			query.append(_SQL_SELECT_TYCLASS_WHERE);

			query.append(_FINDER_COLUMN_CLASSGROUP_NAME_COMPANYID_2);

			query.append(_FINDER_COLUMN_CLASSGROUP_NAME_GROUPID_2);

			query.append(_FINDER_COLUMN_CLASSGROUP_NAME_CLASSGROUP_2);

			if (className == null) {
				query.append(_FINDER_COLUMN_CLASSGROUP_NAME_CLASSNAME_1);
			}
			else {
				if (className.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_CLASSGROUP_NAME_CLASSNAME_3);
				}
				else {
					query.append(_FINDER_COLUMN_CLASSGROUP_NAME_CLASSNAME_2);
				}
			}

			query.append(TYClassModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				qPos.add(classGroup);

				if (className != null) {
					qPos.add(className);
				}

				List<TYClass> list = q.list();

				result = list;

				TYClass tyClass = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CLASSGROUP_NAME,
						finderArgs, list);
				}
				else {
					tyClass = list.get(0);

					cacheResult(tyClass);

					if ((tyClass.getCompanyId() != companyId) ||
							(tyClass.getGroupId() != groupId) ||
							(tyClass.getClassGroup() != classGroup) ||
							(tyClass.getClassName() == null) ||
							!tyClass.getClassName().equals(className)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CLASSGROUP_NAME,
							finderArgs, tyClass);
					}
				}

				return tyClass;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CLASSGROUP_NAME,
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
				return (TYClass)result;
			}
		}
	}

	/**
	 * Finds all the t y classes.
	 *
	 * @return the t y classes
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYClass> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the t y classes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of t y classes to return
	 * @param end the upper bound of the range of t y classes to return (not inclusive)
	 * @return the range of t y classes
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYClass> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the t y classes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of t y classes to return
	 * @param end the upper bound of the range of t y classes to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of t y classes
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYClass> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<TYClass> list = (List<TYClass>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TYCLASS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TYCLASS.concat(TYClassModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<TYClass>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<TYClass>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the t y classes where companyId = &#63; and groupId = &#63; from the database.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByG_ID(long companyId, long groupId)
		throws SystemException {
		for (TYClass tyClass : findByG_ID(companyId, groupId)) {
			remove(tyClass);
		}
	}

	/**
	 * Removes the t y class where classId = &#63; and groupId = &#63; and companyId = &#63; from the database.
	 *
	 * @param classId the class id to search with
	 * @param groupId the group id to search with
	 * @param companyId the company id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByC_G(long classId, long groupId, long companyId)
		throws NoSuchClassException, SystemException {
		TYClass tyClass = findByC_G(classId, groupId, companyId);

		remove(tyClass);
	}

	/**
	 * Removes the t y class where companyId = &#63; and groupId = &#63; and classGroup = &#63; and className = &#63; from the database.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param classGroup the class group to search with
	 * @param className the class name to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByclassGroup_Name(long companyId, long groupId,
		int classGroup, String className)
		throws NoSuchClassException, SystemException {
		TYClass tyClass = findByclassGroup_Name(companyId, groupId, classGroup,
				className);

		remove(tyClass);
	}

	/**
	 * Removes all the t y classes from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (TYClass tyClass : findAll()) {
			remove(tyClass);
		}
	}

	/**
	 * Counts all the t y classes where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @return the number of matching t y classes
	 * @throws SystemException if a system exception occurred
	 */
	public int countByG_ID(long companyId, long groupId)
		throws SystemException {
		Object[] finderArgs = new Object[] { companyId, groupId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G_ID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TYCLASS_WHERE);

			query.append(_FINDER_COLUMN_G_ID_COMPANYID_2);

			query.append(_FINDER_COLUMN_G_ID_GROUPID_2);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_ID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Filters by the user's permissions and counts all the t y classes where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @return the number of matching t y classes that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	public int filterCountByG_ID(long companyId, long groupId)
		throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return countByG_ID(companyId, groupId);
		}

		StringBundler query = new StringBundler(3);

		query.append(_FILTER_SQL_COUNT_TYCLASS_WHERE);

		query.append(_FINDER_COLUMN_G_ID_COMPANYID_2);

		query.append(_FINDER_COLUMN_G_ID_GROUPID_2);

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				TYClass.class.getName(), _FILTER_COLUMN_PK,
				_FILTER_COLUMN_USERID, groupId);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME,
				com.liferay.portal.kernel.dao.orm.Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(companyId);

			qPos.add(groupId);

			Long count = (Long)q.uniqueResult();

			return count.intValue();
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	/**
	 * Counts all the t y classes where classId = &#63; and groupId = &#63; and companyId = &#63;.
	 *
	 * @param classId the class id to search with
	 * @param groupId the group id to search with
	 * @param companyId the company id to search with
	 * @return the number of matching t y classes
	 * @throws SystemException if a system exception occurred
	 */
	public int countByC_G(long classId, long groupId, long companyId)
		throws SystemException {
		Object[] finderArgs = new Object[] { classId, groupId, companyId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_C_G,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_TYCLASS_WHERE);

			query.append(_FINDER_COLUMN_C_G_CLASSID_2);

			query.append(_FINDER_COLUMN_C_G_GROUPID_2);

			query.append(_FINDER_COLUMN_C_G_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(classId);

				qPos.add(groupId);

				qPos.add(companyId);

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
	 * Counts all the t y classes where companyId = &#63; and groupId = &#63; and classGroup = &#63; and className = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param classGroup the class group to search with
	 * @param className the class name to search with
	 * @return the number of matching t y classes
	 * @throws SystemException if a system exception occurred
	 */
	public int countByclassGroup_Name(long companyId, long groupId,
		int classGroup, String className) throws SystemException {
		Object[] finderArgs = new Object[] {
				companyId, groupId, classGroup, className
			};

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_CLASSGROUP_NAME,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_TYCLASS_WHERE);

			query.append(_FINDER_COLUMN_CLASSGROUP_NAME_COMPANYID_2);

			query.append(_FINDER_COLUMN_CLASSGROUP_NAME_GROUPID_2);

			query.append(_FINDER_COLUMN_CLASSGROUP_NAME_CLASSGROUP_2);

			if (className == null) {
				query.append(_FINDER_COLUMN_CLASSGROUP_NAME_CLASSNAME_1);
			}
			else {
				if (className.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_CLASSGROUP_NAME_CLASSNAME_3);
				}
				else {
					query.append(_FINDER_COLUMN_CLASSGROUP_NAME_CLASSNAME_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				qPos.add(classGroup);

				if (className != null) {
					qPos.add(className);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CLASSGROUP_NAME,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the t y classes.
	 *
	 * @return the number of t y classes
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

				Query q = session.createQuery(_SQL_COUNT_TYCLASS);

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
	 * Initializes the t y class persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.tvd.thptty.model.TYClass")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TYClass>> listenersList = new ArrayList<ModelListener<TYClass>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TYClass>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TYClassImpl.class.getName());
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
	private static final String _SQL_SELECT_TYCLASS = "SELECT tyClass FROM TYClass tyClass";
	private static final String _SQL_SELECT_TYCLASS_WHERE = "SELECT tyClass FROM TYClass tyClass WHERE ";
	private static final String _SQL_COUNT_TYCLASS = "SELECT COUNT(tyClass) FROM TYClass tyClass";
	private static final String _SQL_COUNT_TYCLASS_WHERE = "SELECT COUNT(tyClass) FROM TYClass tyClass WHERE ";
	private static final String _FINDER_COLUMN_G_ID_COMPANYID_2 = "tyClass.companyId = ? AND ";
	private static final String _FINDER_COLUMN_G_ID_GROUPID_2 = "tyClass.groupId = ?";
	private static final String _FINDER_COLUMN_C_G_CLASSID_2 = "tyClass.classId = ? AND ";
	private static final String _FINDER_COLUMN_C_G_GROUPID_2 = "tyClass.groupId = ? AND ";
	private static final String _FINDER_COLUMN_C_G_COMPANYID_2 = "tyClass.companyId = ?";
	private static final String _FINDER_COLUMN_CLASSGROUP_NAME_COMPANYID_2 = "tyClass.companyId = ? AND ";
	private static final String _FINDER_COLUMN_CLASSGROUP_NAME_GROUPID_2 = "tyClass.groupId = ? AND ";
	private static final String _FINDER_COLUMN_CLASSGROUP_NAME_CLASSGROUP_2 = "tyClass.classGroup = ? AND ";
	private static final String _FINDER_COLUMN_CLASSGROUP_NAME_CLASSNAME_1 = "tyClass.className IS NULL";
	private static final String _FINDER_COLUMN_CLASSGROUP_NAME_CLASSNAME_2 = "tyClass.className = ?";
	private static final String _FINDER_COLUMN_CLASSGROUP_NAME_CLASSNAME_3 = "(tyClass.className IS NULL OR tyClass.className = ?)";
	private static final String _FILTER_SQL_SELECT_TYCLASS_WHERE = "SELECT DISTINCT {tyClass.*} FROM TY_TYClass tyClass WHERE ";
	private static final String _FILTER_SQL_SELECT_TYCLASS_NO_INLINE_DISTINCT_WHERE_1 =
		"SELECT {TY_TYClass.*} FROM (SELECT DISTINCT tyClass.classId FROM TY_TYClass tyClass WHERE ";
	private static final String _FILTER_SQL_SELECT_TYCLASS_NO_INLINE_DISTINCT_WHERE_2 =
		") TEMP_TABLE INNER JOIN TY_TYClass ON TEMP_TABLE.classId = TY_TYClass.classId";
	private static final String _FILTER_SQL_COUNT_TYCLASS_WHERE = "SELECT COUNT(DISTINCT tyClass.classId) AS COUNT_VALUE FROM TY_TYClass tyClass WHERE ";
	private static final String _FILTER_COLUMN_PK = "tyClass.classId";
	private static final String _FILTER_COLUMN_USERID = "tyClass.userId";
	private static final String _FILTER_ENTITY_ALIAS = "tyClass";
	private static final String _FILTER_ENTITY_TABLE = "TY_TYClass";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tyClass.";
	private static final String _ORDER_BY_ENTITY_TABLE = "TY_TYClass.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TYClass exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TYClass exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(TYClassPersistenceImpl.class);
}