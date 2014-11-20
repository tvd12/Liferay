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

import org.tvd.thptty.NoSuchSubjectException;
import org.tvd.thptty.model.TYSubject;
import org.tvd.thptty.model.impl.TYSubjectImpl;
import org.tvd.thptty.model.impl.TYSubjectModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the t y subject service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link TYSubjectUtil} to access the t y subject persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ta Van Dung
 * @see TYSubjectPersistence
 * @see TYSubjectUtil
 * @generated
 */
public class TYSubjectPersistenceImpl extends BasePersistenceImpl<TYSubject>
	implements TYSubjectPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = TYSubjectImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_C_G = new FinderPath(TYSubjectModelImpl.ENTITY_CACHE_ENABLED,
			TYSubjectModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByC_G",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_C_G = new FinderPath(TYSubjectModelImpl.ENTITY_CACHE_ENABLED,
			TYSubjectModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByC_G",
			new String[] { Long.class.getName(), Long.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_CODE = new FinderPath(TYSubjectModelImpl.ENTITY_CACHE_ENABLED,
			TYSubjectModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_ENTITY,
			"fetchByCode",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_CODE = new FinderPath(TYSubjectModelImpl.ENTITY_CACHE_ENABLED,
			TYSubjectModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByCode",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			});
	public static final FinderPath FINDER_PATH_FETCH_BY_NAME = new FinderPath(TYSubjectModelImpl.ENTITY_CACHE_ENABLED,
			TYSubjectModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_ENTITY,
			"fetchByName",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_NAME = new FinderPath(TYSubjectModelImpl.ENTITY_CACHE_ENABLED,
			TYSubjectModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByName",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(TYSubjectModelImpl.ENTITY_CACHE_ENABLED,
			TYSubjectModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TYSubjectModelImpl.ENTITY_CACHE_ENABLED,
			TYSubjectModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countAll", new String[0]);

	/**
	 * Caches the t y subject in the entity cache if it is enabled.
	 *
	 * @param tySubject the t y subject to cache
	 */
	public void cacheResult(TYSubject tySubject) {
		EntityCacheUtil.putResult(TYSubjectModelImpl.ENTITY_CACHE_ENABLED,
			TYSubjectImpl.class, tySubject.getPrimaryKey(), tySubject);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODE,
			new Object[] {
				new Long(tySubject.getCompanyId()),
				new Long(tySubject.getGroupId()),
				
			tySubject.getSubjectCode()
			}, tySubject);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_NAME,
			new Object[] {
				new Long(tySubject.getCompanyId()),
				new Long(tySubject.getGroupId()),
				
			tySubject.getSubjectName()
			}, tySubject);
	}

	/**
	 * Caches the t y subjects in the entity cache if it is enabled.
	 *
	 * @param tySubjects the t y subjects to cache
	 */
	public void cacheResult(List<TYSubject> tySubjects) {
		for (TYSubject tySubject : tySubjects) {
			if (EntityCacheUtil.getResult(
						TYSubjectModelImpl.ENTITY_CACHE_ENABLED,
						TYSubjectImpl.class, tySubject.getPrimaryKey(), this) == null) {
				cacheResult(tySubject);
			}
		}
	}

	/**
	 * Clears the cache for all t y subjects.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(TYSubjectImpl.class.getName());
		EntityCacheUtil.clearCache(TYSubjectImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the t y subject.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(TYSubject tySubject) {
		EntityCacheUtil.removeResult(TYSubjectModelImpl.ENTITY_CACHE_ENABLED,
			TYSubjectImpl.class, tySubject.getPrimaryKey());

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CODE,
			new Object[] {
				new Long(tySubject.getCompanyId()),
				new Long(tySubject.getGroupId()),
				
			tySubject.getSubjectCode()
			});

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_NAME,
			new Object[] {
				new Long(tySubject.getCompanyId()),
				new Long(tySubject.getGroupId()),
				
			tySubject.getSubjectName()
			});
	}

	/**
	 * Creates a new t y subject with the primary key. Does not add the t y subject to the database.
	 *
	 * @param subjectId the primary key for the new t y subject
	 * @return the new t y subject
	 */
	public TYSubject create(long subjectId) {
		TYSubject tySubject = new TYSubjectImpl();

		tySubject.setNew(true);
		tySubject.setPrimaryKey(subjectId);

		return tySubject;
	}

	/**
	 * Removes the t y subject with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the t y subject to remove
	 * @return the t y subject that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a t y subject with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYSubject remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Long)primaryKey).longValue());
	}

	/**
	 * Removes the t y subject with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param subjectId the primary key of the t y subject to remove
	 * @return the t y subject that was removed
	 * @throws org.tvd.thptty.NoSuchSubjectException if a t y subject with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYSubject remove(long subjectId)
		throws NoSuchSubjectException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TYSubject tySubject = (TYSubject)session.get(TYSubjectImpl.class,
					new Long(subjectId));

			if (tySubject == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + subjectId);
				}

				throw new NoSuchSubjectException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					subjectId);
			}

			return remove(tySubject);
		}
		catch (NoSuchSubjectException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TYSubject removeImpl(TYSubject tySubject)
		throws SystemException {
		tySubject = toUnwrappedModel(tySubject);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, tySubject);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		TYSubjectModelImpl tySubjectModelImpl = (TYSubjectModelImpl)tySubject;

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CODE,
			new Object[] {
				new Long(tySubjectModelImpl.getCompanyId()),
				new Long(tySubjectModelImpl.getGroupId()),
				
			tySubjectModelImpl.getSubjectCode()
			});

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_NAME,
			new Object[] {
				new Long(tySubjectModelImpl.getCompanyId()),
				new Long(tySubjectModelImpl.getGroupId()),
				
			tySubjectModelImpl.getSubjectName()
			});

		EntityCacheUtil.removeResult(TYSubjectModelImpl.ENTITY_CACHE_ENABLED,
			TYSubjectImpl.class, tySubject.getPrimaryKey());

		return tySubject;
	}

	public TYSubject updateImpl(org.tvd.thptty.model.TYSubject tySubject,
		boolean merge) throws SystemException {
		tySubject = toUnwrappedModel(tySubject);

		boolean isNew = tySubject.isNew();

		TYSubjectModelImpl tySubjectModelImpl = (TYSubjectModelImpl)tySubject;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, tySubject, merge);

			tySubject.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(TYSubjectModelImpl.ENTITY_CACHE_ENABLED,
			TYSubjectImpl.class, tySubject.getPrimaryKey(), tySubject);

		if (!isNew &&
				((tySubject.getCompanyId() != tySubjectModelImpl.getOriginalCompanyId()) ||
				(tySubject.getGroupId() != tySubjectModelImpl.getOriginalGroupId()) ||
				!Validator.equals(tySubject.getSubjectCode(),
					tySubjectModelImpl.getOriginalSubjectCode()))) {
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CODE,
				new Object[] {
					new Long(tySubjectModelImpl.getOriginalCompanyId()),
					new Long(tySubjectModelImpl.getOriginalGroupId()),
					
				tySubjectModelImpl.getOriginalSubjectCode()
				});
		}

		if (isNew ||
				((tySubject.getCompanyId() != tySubjectModelImpl.getOriginalCompanyId()) ||
				(tySubject.getGroupId() != tySubjectModelImpl.getOriginalGroupId()) ||
				!Validator.equals(tySubject.getSubjectCode(),
					tySubjectModelImpl.getOriginalSubjectCode()))) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODE,
				new Object[] {
					new Long(tySubject.getCompanyId()),
					new Long(tySubject.getGroupId()),
					
				tySubject.getSubjectCode()
				}, tySubject);
		}

		if (!isNew &&
				((tySubject.getCompanyId() != tySubjectModelImpl.getOriginalCompanyId()) ||
				(tySubject.getGroupId() != tySubjectModelImpl.getOriginalGroupId()) ||
				!Validator.equals(tySubject.getSubjectName(),
					tySubjectModelImpl.getOriginalSubjectName()))) {
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_NAME,
				new Object[] {
					new Long(tySubjectModelImpl.getOriginalCompanyId()),
					new Long(tySubjectModelImpl.getOriginalGroupId()),
					
				tySubjectModelImpl.getOriginalSubjectName()
				});
		}

		if (isNew ||
				((tySubject.getCompanyId() != tySubjectModelImpl.getOriginalCompanyId()) ||
				(tySubject.getGroupId() != tySubjectModelImpl.getOriginalGroupId()) ||
				!Validator.equals(tySubject.getSubjectName(),
					tySubjectModelImpl.getOriginalSubjectName()))) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_NAME,
				new Object[] {
					new Long(tySubject.getCompanyId()),
					new Long(tySubject.getGroupId()),
					
				tySubject.getSubjectName()
				}, tySubject);
		}

		return tySubject;
	}

	protected TYSubject toUnwrappedModel(TYSubject tySubject) {
		if (tySubject instanceof TYSubjectImpl) {
			return tySubject;
		}

		TYSubjectImpl tySubjectImpl = new TYSubjectImpl();

		tySubjectImpl.setNew(tySubject.isNew());
		tySubjectImpl.setPrimaryKey(tySubject.getPrimaryKey());

		tySubjectImpl.setSubjectId(tySubject.getSubjectId());
		tySubjectImpl.setCompanyId(tySubject.getCompanyId());
		tySubjectImpl.setGroupId(tySubject.getGroupId());
		tySubjectImpl.setSubjectCode(tySubject.getSubjectCode());
		tySubjectImpl.setSubjectName(tySubject.getSubjectName());
		tySubjectImpl.setDescription(tySubject.getDescription());

		return tySubjectImpl;
	}

	/**
	 * Finds the t y subject with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the t y subject to find
	 * @return the t y subject
	 * @throws com.liferay.portal.NoSuchModelException if a t y subject with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYSubject findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the t y subject with the primary key or throws a {@link org.tvd.thptty.NoSuchSubjectException} if it could not be found.
	 *
	 * @param subjectId the primary key of the t y subject to find
	 * @return the t y subject
	 * @throws org.tvd.thptty.NoSuchSubjectException if a t y subject with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYSubject findByPrimaryKey(long subjectId)
		throws NoSuchSubjectException, SystemException {
		TYSubject tySubject = fetchByPrimaryKey(subjectId);

		if (tySubject == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + subjectId);
			}

			throw new NoSuchSubjectException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				subjectId);
		}

		return tySubject;
	}

	/**
	 * Finds the t y subject with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the t y subject to find
	 * @return the t y subject, or <code>null</code> if a t y subject with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYSubject fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the t y subject with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param subjectId the primary key of the t y subject to find
	 * @return the t y subject, or <code>null</code> if a t y subject with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYSubject fetchByPrimaryKey(long subjectId)
		throws SystemException {
		TYSubject tySubject = (TYSubject)EntityCacheUtil.getResult(TYSubjectModelImpl.ENTITY_CACHE_ENABLED,
				TYSubjectImpl.class, subjectId, this);

		if (tySubject == null) {
			Session session = null;

			try {
				session = openSession();

				tySubject = (TYSubject)session.get(TYSubjectImpl.class,
						new Long(subjectId));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (tySubject != null) {
					cacheResult(tySubject);
				}

				closeSession(session);
			}
		}

		return tySubject;
	}

	/**
	 * Finds all the t y subjects where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @return the matching t y subjects
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYSubject> findByC_G(long companyId, long groupId)
		throws SystemException {
		return findByC_G(companyId, groupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the t y subjects where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of t y subjects to return
	 * @param end the upper bound of the range of t y subjects to return (not inclusive)
	 * @return the range of matching t y subjects
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYSubject> findByC_G(long companyId, long groupId, int start,
		int end) throws SystemException {
		return findByC_G(companyId, groupId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the t y subjects where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of t y subjects to return
	 * @param end the upper bound of the range of t y subjects to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching t y subjects
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYSubject> findByC_G(long companyId, long groupId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				companyId, groupId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<TYSubject> list = (List<TYSubject>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_C_G,
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

			query.append(_SQL_SELECT_TYSUBJECT_WHERE);

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

				list = (List<TYSubject>)QueryUtil.list(q, getDialect(), start,
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
	 * Finds the first t y subject in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching t y subject
	 * @throws org.tvd.thptty.NoSuchSubjectException if a matching t y subject could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYSubject findByC_G_First(long companyId, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchSubjectException, SystemException {
		List<TYSubject> list = findByC_G(companyId, groupId, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchSubjectException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last t y subject in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching t y subject
	 * @throws org.tvd.thptty.NoSuchSubjectException if a matching t y subject could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYSubject findByC_G_Last(long companyId, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchSubjectException, SystemException {
		int count = countByC_G(companyId, groupId);

		List<TYSubject> list = findByC_G(companyId, groupId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchSubjectException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the t y subjects before and after the current t y subject in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param subjectId the primary key of the current t y subject
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next t y subject
	 * @throws org.tvd.thptty.NoSuchSubjectException if a t y subject with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYSubject[] findByC_G_PrevAndNext(long subjectId, long companyId,
		long groupId, OrderByComparator orderByComparator)
		throws NoSuchSubjectException, SystemException {
		TYSubject tySubject = findByPrimaryKey(subjectId);

		Session session = null;

		try {
			session = openSession();

			TYSubject[] array = new TYSubjectImpl[3];

			array[0] = getByC_G_PrevAndNext(session, tySubject, companyId,
					groupId, orderByComparator, true);

			array[1] = tySubject;

			array[2] = getByC_G_PrevAndNext(session, tySubject, companyId,
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

	protected TYSubject getByC_G_PrevAndNext(Session session,
		TYSubject tySubject, long companyId, long groupId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TYSUBJECT_WHERE);

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
			Object[] values = orderByComparator.getOrderByValues(tySubject);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TYSubject> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Filters by the user's permissions and finds all the t y subjects where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @return the matching t y subjects that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYSubject> filterFindByC_G(long companyId, long groupId)
		throws SystemException {
		return filterFindByC_G(companyId, groupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Filters by the user's permissions and finds a range of all the t y subjects where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of t y subjects to return
	 * @param end the upper bound of the range of t y subjects to return (not inclusive)
	 * @return the range of matching t y subjects that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYSubject> filterFindByC_G(long companyId, long groupId,
		int start, int end) throws SystemException {
		return filterFindByC_G(companyId, groupId, start, end, null);
	}

	/**
	 * Filters by the user's permissions and finds an ordered range of all the t y subjects where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of t y subjects to return
	 * @param end the upper bound of the range of t y subjects to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching t y subjects that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYSubject> filterFindByC_G(long companyId, long groupId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return findByC_G(companyId, groupId, start, end, orderByComparator);
		}

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		if (getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_TYSUBJECT_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_TYSUBJECT_NO_INLINE_DISTINCT_WHERE_1);
		}

		query.append(_FINDER_COLUMN_C_G_COMPANYID_2);

		query.append(_FINDER_COLUMN_C_G_GROUPID_2);

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_TYSUBJECT_NO_INLINE_DISTINCT_WHERE_2);
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

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				TYSubject.class.getName(), _FILTER_COLUMN_PK,
				_FILTER_COLUMN_USERID, groupId);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			if (getDB().isSupportsInlineDistinct()) {
				q.addEntity(_FILTER_ENTITY_ALIAS, TYSubjectImpl.class);
			}
			else {
				q.addEntity(_FILTER_ENTITY_TABLE, TYSubjectImpl.class);
			}

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(companyId);

			qPos.add(groupId);

			return (List<TYSubject>)QueryUtil.list(q, getDialect(), start, end);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	/**
	 * Finds the t y subject where companyId = &#63; and groupId = &#63; and subjectCode = &#63; or throws a {@link org.tvd.thptty.NoSuchSubjectException} if it could not be found.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param subjectCode the subject code to search with
	 * @return the matching t y subject
	 * @throws org.tvd.thptty.NoSuchSubjectException if a matching t y subject could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYSubject findByCode(long companyId, long groupId, String subjectCode)
		throws NoSuchSubjectException, SystemException {
		TYSubject tySubject = fetchByCode(companyId, groupId, subjectCode);

		if (tySubject == null) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(", subjectCode=");
			msg.append(subjectCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchSubjectException(msg.toString());
		}

		return tySubject;
	}

	/**
	 * Finds the t y subject where companyId = &#63; and groupId = &#63; and subjectCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param subjectCode the subject code to search with
	 * @return the matching t y subject, or <code>null</code> if a matching t y subject could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYSubject fetchByCode(long companyId, long groupId,
		String subjectCode) throws SystemException {
		return fetchByCode(companyId, groupId, subjectCode, true);
	}

	/**
	 * Finds the t y subject where companyId = &#63; and groupId = &#63; and subjectCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param subjectCode the subject code to search with
	 * @return the matching t y subject, or <code>null</code> if a matching t y subject could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYSubject fetchByCode(long companyId, long groupId,
		String subjectCode, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { companyId, groupId, subjectCode };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_CODE,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_TYSUBJECT_WHERE);

			query.append(_FINDER_COLUMN_CODE_COMPANYID_2);

			query.append(_FINDER_COLUMN_CODE_GROUPID_2);

			if (subjectCode == null) {
				query.append(_FINDER_COLUMN_CODE_SUBJECTCODE_1);
			}
			else {
				if (subjectCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_CODE_SUBJECTCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_CODE_SUBJECTCODE_2);
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

				if (subjectCode != null) {
					qPos.add(subjectCode);
				}

				List<TYSubject> list = q.list();

				result = list;

				TYSubject tySubject = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODE,
						finderArgs, list);
				}
				else {
					tySubject = list.get(0);

					cacheResult(tySubject);

					if ((tySubject.getCompanyId() != companyId) ||
							(tySubject.getGroupId() != groupId) ||
							(tySubject.getSubjectCode() == null) ||
							!tySubject.getSubjectCode().equals(subjectCode)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODE,
							finderArgs, tySubject);
					}
				}

				return tySubject;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CODE,
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
				return (TYSubject)result;
			}
		}
	}

	/**
	 * Finds the t y subject where companyId = &#63; and groupId = &#63; and subjectName = &#63; or throws a {@link org.tvd.thptty.NoSuchSubjectException} if it could not be found.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param subjectName the subject name to search with
	 * @return the matching t y subject
	 * @throws org.tvd.thptty.NoSuchSubjectException if a matching t y subject could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYSubject findByName(long companyId, long groupId, String subjectName)
		throws NoSuchSubjectException, SystemException {
		TYSubject tySubject = fetchByName(companyId, groupId, subjectName);

		if (tySubject == null) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(", subjectName=");
			msg.append(subjectName);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchSubjectException(msg.toString());
		}

		return tySubject;
	}

	/**
	 * Finds the t y subject where companyId = &#63; and groupId = &#63; and subjectName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param subjectName the subject name to search with
	 * @return the matching t y subject, or <code>null</code> if a matching t y subject could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYSubject fetchByName(long companyId, long groupId,
		String subjectName) throws SystemException {
		return fetchByName(companyId, groupId, subjectName, true);
	}

	/**
	 * Finds the t y subject where companyId = &#63; and groupId = &#63; and subjectName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param subjectName the subject name to search with
	 * @return the matching t y subject, or <code>null</code> if a matching t y subject could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYSubject fetchByName(long companyId, long groupId,
		String subjectName, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { companyId, groupId, subjectName };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_NAME,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_TYSUBJECT_WHERE);

			query.append(_FINDER_COLUMN_NAME_COMPANYID_2);

			query.append(_FINDER_COLUMN_NAME_GROUPID_2);

			if (subjectName == null) {
				query.append(_FINDER_COLUMN_NAME_SUBJECTNAME_1);
			}
			else {
				if (subjectName.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_NAME_SUBJECTNAME_3);
				}
				else {
					query.append(_FINDER_COLUMN_NAME_SUBJECTNAME_2);
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

				if (subjectName != null) {
					qPos.add(subjectName);
				}

				List<TYSubject> list = q.list();

				result = list;

				TYSubject tySubject = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_NAME,
						finderArgs, list);
				}
				else {
					tySubject = list.get(0);

					cacheResult(tySubject);

					if ((tySubject.getCompanyId() != companyId) ||
							(tySubject.getGroupId() != groupId) ||
							(tySubject.getSubjectName() == null) ||
							!tySubject.getSubjectName().equals(subjectName)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_NAME,
							finderArgs, tySubject);
					}
				}

				return tySubject;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_NAME,
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
				return (TYSubject)result;
			}
		}
	}

	/**
	 * Finds all the t y subjects.
	 *
	 * @return the t y subjects
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYSubject> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the t y subjects.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of t y subjects to return
	 * @param end the upper bound of the range of t y subjects to return (not inclusive)
	 * @return the range of t y subjects
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYSubject> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the t y subjects.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of t y subjects to return
	 * @param end the upper bound of the range of t y subjects to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of t y subjects
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYSubject> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<TYSubject> list = (List<TYSubject>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TYSUBJECT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TYSUBJECT;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<TYSubject>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<TYSubject>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the t y subjects where companyId = &#63; and groupId = &#63; from the database.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByC_G(long companyId, long groupId)
		throws SystemException {
		for (TYSubject tySubject : findByC_G(companyId, groupId)) {
			remove(tySubject);
		}
	}

	/**
	 * Removes the t y subject where companyId = &#63; and groupId = &#63; and subjectCode = &#63; from the database.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param subjectCode the subject code to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByCode(long companyId, long groupId, String subjectCode)
		throws NoSuchSubjectException, SystemException {
		TYSubject tySubject = findByCode(companyId, groupId, subjectCode);

		remove(tySubject);
	}

	/**
	 * Removes the t y subject where companyId = &#63; and groupId = &#63; and subjectName = &#63; from the database.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param subjectName the subject name to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByName(long companyId, long groupId, String subjectName)
		throws NoSuchSubjectException, SystemException {
		TYSubject tySubject = findByName(companyId, groupId, subjectName);

		remove(tySubject);
	}

	/**
	 * Removes all the t y subjects from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (TYSubject tySubject : findAll()) {
			remove(tySubject);
		}
	}

	/**
	 * Counts all the t y subjects where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @return the number of matching t y subjects
	 * @throws SystemException if a system exception occurred
	 */
	public int countByC_G(long companyId, long groupId)
		throws SystemException {
		Object[] finderArgs = new Object[] { companyId, groupId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_C_G,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TYSUBJECT_WHERE);

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
	 * Filters by the user's permissions and counts all the t y subjects where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @return the number of matching t y subjects that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	public int filterCountByC_G(long companyId, long groupId)
		throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return countByC_G(companyId, groupId);
		}

		StringBundler query = new StringBundler(3);

		query.append(_FILTER_SQL_COUNT_TYSUBJECT_WHERE);

		query.append(_FINDER_COLUMN_C_G_COMPANYID_2);

		query.append(_FINDER_COLUMN_C_G_GROUPID_2);

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				TYSubject.class.getName(), _FILTER_COLUMN_PK,
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
	 * Counts all the t y subjects where companyId = &#63; and groupId = &#63; and subjectCode = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param subjectCode the subject code to search with
	 * @return the number of matching t y subjects
	 * @throws SystemException if a system exception occurred
	 */
	public int countByCode(long companyId, long groupId, String subjectCode)
		throws SystemException {
		Object[] finderArgs = new Object[] { companyId, groupId, subjectCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_CODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_TYSUBJECT_WHERE);

			query.append(_FINDER_COLUMN_CODE_COMPANYID_2);

			query.append(_FINDER_COLUMN_CODE_GROUPID_2);

			if (subjectCode == null) {
				query.append(_FINDER_COLUMN_CODE_SUBJECTCODE_1);
			}
			else {
				if (subjectCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_CODE_SUBJECTCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_CODE_SUBJECTCODE_2);
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

				if (subjectCode != null) {
					qPos.add(subjectCode);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CODE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the t y subjects where companyId = &#63; and groupId = &#63; and subjectName = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param subjectName the subject name to search with
	 * @return the number of matching t y subjects
	 * @throws SystemException if a system exception occurred
	 */
	public int countByName(long companyId, long groupId, String subjectName)
		throws SystemException {
		Object[] finderArgs = new Object[] { companyId, groupId, subjectName };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_NAME,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_TYSUBJECT_WHERE);

			query.append(_FINDER_COLUMN_NAME_COMPANYID_2);

			query.append(_FINDER_COLUMN_NAME_GROUPID_2);

			if (subjectName == null) {
				query.append(_FINDER_COLUMN_NAME_SUBJECTNAME_1);
			}
			else {
				if (subjectName.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_NAME_SUBJECTNAME_3);
				}
				else {
					query.append(_FINDER_COLUMN_NAME_SUBJECTNAME_2);
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

				if (subjectName != null) {
					qPos.add(subjectName);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_NAME,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the t y subjects.
	 *
	 * @return the number of t y subjects
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

				Query q = session.createQuery(_SQL_COUNT_TYSUBJECT);

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
	 * Initializes the t y subject persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.tvd.thptty.model.TYSubject")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TYSubject>> listenersList = new ArrayList<ModelListener<TYSubject>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TYSubject>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TYSubjectImpl.class.getName());
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
	private static final String _SQL_SELECT_TYSUBJECT = "SELECT tySubject FROM TYSubject tySubject";
	private static final String _SQL_SELECT_TYSUBJECT_WHERE = "SELECT tySubject FROM TYSubject tySubject WHERE ";
	private static final String _SQL_COUNT_TYSUBJECT = "SELECT COUNT(tySubject) FROM TYSubject tySubject";
	private static final String _SQL_COUNT_TYSUBJECT_WHERE = "SELECT COUNT(tySubject) FROM TYSubject tySubject WHERE ";
	private static final String _FINDER_COLUMN_C_G_COMPANYID_2 = "tySubject.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_G_GROUPID_2 = "tySubject.groupId = ?";
	private static final String _FINDER_COLUMN_CODE_COMPANYID_2 = "tySubject.companyId = ? AND ";
	private static final String _FINDER_COLUMN_CODE_GROUPID_2 = "tySubject.groupId = ? AND ";
	private static final String _FINDER_COLUMN_CODE_SUBJECTCODE_1 = "tySubject.subjectCode IS NULL";
	private static final String _FINDER_COLUMN_CODE_SUBJECTCODE_2 = "tySubject.subjectCode = ?";
	private static final String _FINDER_COLUMN_CODE_SUBJECTCODE_3 = "(tySubject.subjectCode IS NULL OR tySubject.subjectCode = ?)";
	private static final String _FINDER_COLUMN_NAME_COMPANYID_2 = "tySubject.companyId = ? AND ";
	private static final String _FINDER_COLUMN_NAME_GROUPID_2 = "tySubject.groupId = ? AND ";
	private static final String _FINDER_COLUMN_NAME_SUBJECTNAME_1 = "tySubject.subjectName IS NULL";
	private static final String _FINDER_COLUMN_NAME_SUBJECTNAME_2 = "tySubject.subjectName = ?";
	private static final String _FINDER_COLUMN_NAME_SUBJECTNAME_3 = "(tySubject.subjectName IS NULL OR tySubject.subjectName = ?)";
	private static final String _FILTER_SQL_SELECT_TYSUBJECT_WHERE = "SELECT DISTINCT {tySubject.*} FROM TY_TYSubject tySubject WHERE ";
	private static final String _FILTER_SQL_SELECT_TYSUBJECT_NO_INLINE_DISTINCT_WHERE_1 =
		"SELECT {TY_TYSubject.*} FROM (SELECT DISTINCT tySubject.subjectId FROM TY_TYSubject tySubject WHERE ";
	private static final String _FILTER_SQL_SELECT_TYSUBJECT_NO_INLINE_DISTINCT_WHERE_2 =
		") TEMP_TABLE INNER JOIN TY_TYSubject ON TEMP_TABLE.subjectId = TY_TYSubject.subjectId";
	private static final String _FILTER_SQL_COUNT_TYSUBJECT_WHERE = "SELECT COUNT(DISTINCT tySubject.subjectId) AS COUNT_VALUE FROM TY_TYSubject tySubject WHERE ";
	private static final String _FILTER_COLUMN_PK = "tySubject.subjectId";
	private static final String _FILTER_COLUMN_USERID = null;
	private static final String _FILTER_ENTITY_ALIAS = "tySubject";
	private static final String _FILTER_ENTITY_TABLE = "TY_TYSubject";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tySubject.";
	private static final String _ORDER_BY_ENTITY_TABLE = "TY_TYSubject.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TYSubject exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TYSubject exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(TYSubjectPersistenceImpl.class);
}