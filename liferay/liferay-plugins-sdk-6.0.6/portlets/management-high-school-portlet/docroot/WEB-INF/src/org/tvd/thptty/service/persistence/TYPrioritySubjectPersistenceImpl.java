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
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import org.tvd.thptty.NoSuchPrioritySubjectException;
import org.tvd.thptty.model.TYPrioritySubject;
import org.tvd.thptty.model.impl.TYPrioritySubjectImpl;
import org.tvd.thptty.model.impl.TYPrioritySubjectModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the t y priority subject service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link TYPrioritySubjectUtil} to access the t y priority subject persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ta Van Dung
 * @see TYPrioritySubjectPersistence
 * @see TYPrioritySubjectUtil
 * @generated
 */
public class TYPrioritySubjectPersistenceImpl extends BasePersistenceImpl<TYPrioritySubject>
	implements TYPrioritySubjectPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = TYPrioritySubjectImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(TYPrioritySubjectModelImpl.ENTITY_CACHE_ENABLED,
			TYPrioritySubjectModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TYPrioritySubjectModelImpl.ENTITY_CACHE_ENABLED,
			TYPrioritySubjectModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countAll", new String[0]);

	/**
	 * Caches the t y priority subject in the entity cache if it is enabled.
	 *
	 * @param tyPrioritySubject the t y priority subject to cache
	 */
	public void cacheResult(TYPrioritySubject tyPrioritySubject) {
		EntityCacheUtil.putResult(TYPrioritySubjectModelImpl.ENTITY_CACHE_ENABLED,
			TYPrioritySubjectImpl.class, tyPrioritySubject.getPrimaryKey(),
			tyPrioritySubject);
	}

	/**
	 * Caches the t y priority subjects in the entity cache if it is enabled.
	 *
	 * @param tyPrioritySubjects the t y priority subjects to cache
	 */
	public void cacheResult(List<TYPrioritySubject> tyPrioritySubjects) {
		for (TYPrioritySubject tyPrioritySubject : tyPrioritySubjects) {
			if (EntityCacheUtil.getResult(
						TYPrioritySubjectModelImpl.ENTITY_CACHE_ENABLED,
						TYPrioritySubjectImpl.class,
						tyPrioritySubject.getPrimaryKey(), this) == null) {
				cacheResult(tyPrioritySubject);
			}
		}
	}

	/**
	 * Clears the cache for all t y priority subjects.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(TYPrioritySubjectImpl.class.getName());
		EntityCacheUtil.clearCache(TYPrioritySubjectImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the t y priority subject.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(TYPrioritySubject tyPrioritySubject) {
		EntityCacheUtil.removeResult(TYPrioritySubjectModelImpl.ENTITY_CACHE_ENABLED,
			TYPrioritySubjectImpl.class, tyPrioritySubject.getPrimaryKey());
	}

	/**
	 * Creates a new t y priority subject with the primary key. Does not add the t y priority subject to the database.
	 *
	 * @param tyPrioritySubjectPK the primary key for the new t y priority subject
	 * @return the new t y priority subject
	 */
	public TYPrioritySubject create(TYPrioritySubjectPK tyPrioritySubjectPK) {
		TYPrioritySubject tyPrioritySubject = new TYPrioritySubjectImpl();

		tyPrioritySubject.setNew(true);
		tyPrioritySubject.setPrimaryKey(tyPrioritySubjectPK);

		return tyPrioritySubject;
	}

	/**
	 * Removes the t y priority subject with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the t y priority subject to remove
	 * @return the t y priority subject that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a t y priority subject with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYPrioritySubject remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove((TYPrioritySubjectPK)primaryKey);
	}

	/**
	 * Removes the t y priority subject with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tyPrioritySubjectPK the primary key of the t y priority subject to remove
	 * @return the t y priority subject that was removed
	 * @throws org.tvd.thptty.NoSuchPrioritySubjectException if a t y priority subject with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYPrioritySubject remove(TYPrioritySubjectPK tyPrioritySubjectPK)
		throws NoSuchPrioritySubjectException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TYPrioritySubject tyPrioritySubject = (TYPrioritySubject)session.get(TYPrioritySubjectImpl.class,
					tyPrioritySubjectPK);

			if (tyPrioritySubject == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
						tyPrioritySubjectPK);
				}

				throw new NoSuchPrioritySubjectException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					tyPrioritySubjectPK);
			}

			return remove(tyPrioritySubject);
		}
		catch (NoSuchPrioritySubjectException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TYPrioritySubject removeImpl(TYPrioritySubject tyPrioritySubject)
		throws SystemException {
		tyPrioritySubject = toUnwrappedModel(tyPrioritySubject);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, tyPrioritySubject);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.removeResult(TYPrioritySubjectModelImpl.ENTITY_CACHE_ENABLED,
			TYPrioritySubjectImpl.class, tyPrioritySubject.getPrimaryKey());

		return tyPrioritySubject;
	}

	public TYPrioritySubject updateImpl(
		org.tvd.thptty.model.TYPrioritySubject tyPrioritySubject, boolean merge)
		throws SystemException {
		tyPrioritySubject = toUnwrappedModel(tyPrioritySubject);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, tyPrioritySubject, merge);

			tyPrioritySubject.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(TYPrioritySubjectModelImpl.ENTITY_CACHE_ENABLED,
			TYPrioritySubjectImpl.class, tyPrioritySubject.getPrimaryKey(),
			tyPrioritySubject);

		return tyPrioritySubject;
	}

	protected TYPrioritySubject toUnwrappedModel(
		TYPrioritySubject tyPrioritySubject) {
		if (tyPrioritySubject instanceof TYPrioritySubjectImpl) {
			return tyPrioritySubject;
		}

		TYPrioritySubjectImpl tyPrioritySubjectImpl = new TYPrioritySubjectImpl();

		tyPrioritySubjectImpl.setNew(tyPrioritySubject.isNew());
		tyPrioritySubjectImpl.setPrimaryKey(tyPrioritySubject.getPrimaryKey());

		tyPrioritySubjectImpl.setCourses(tyPrioritySubject.getCourses());
		tyPrioritySubjectImpl.setSubjectId(tyPrioritySubject.getSubjectId());
		tyPrioritySubjectImpl.setStudentId(tyPrioritySubject.getStudentId());
		tyPrioritySubjectImpl.setIsSpecial(tyPrioritySubject.isIsSpecial());
		tyPrioritySubjectImpl.setExtra(tyPrioritySubject.getExtra());

		return tyPrioritySubjectImpl;
	}

	/**
	 * Finds the t y priority subject with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the t y priority subject to find
	 * @return the t y priority subject
	 * @throws com.liferay.portal.NoSuchModelException if a t y priority subject with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYPrioritySubject findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((TYPrioritySubjectPK)primaryKey);
	}

	/**
	 * Finds the t y priority subject with the primary key or throws a {@link org.tvd.thptty.NoSuchPrioritySubjectException} if it could not be found.
	 *
	 * @param tyPrioritySubjectPK the primary key of the t y priority subject to find
	 * @return the t y priority subject
	 * @throws org.tvd.thptty.NoSuchPrioritySubjectException if a t y priority subject with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYPrioritySubject findByPrimaryKey(
		TYPrioritySubjectPK tyPrioritySubjectPK)
		throws NoSuchPrioritySubjectException, SystemException {
		TYPrioritySubject tyPrioritySubject = fetchByPrimaryKey(tyPrioritySubjectPK);

		if (tyPrioritySubject == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					tyPrioritySubjectPK);
			}

			throw new NoSuchPrioritySubjectException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				tyPrioritySubjectPK);
		}

		return tyPrioritySubject;
	}

	/**
	 * Finds the t y priority subject with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the t y priority subject to find
	 * @return the t y priority subject, or <code>null</code> if a t y priority subject with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYPrioritySubject fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((TYPrioritySubjectPK)primaryKey);
	}

	/**
	 * Finds the t y priority subject with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tyPrioritySubjectPK the primary key of the t y priority subject to find
	 * @return the t y priority subject, or <code>null</code> if a t y priority subject with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYPrioritySubject fetchByPrimaryKey(
		TYPrioritySubjectPK tyPrioritySubjectPK) throws SystemException {
		TYPrioritySubject tyPrioritySubject = (TYPrioritySubject)EntityCacheUtil.getResult(TYPrioritySubjectModelImpl.ENTITY_CACHE_ENABLED,
				TYPrioritySubjectImpl.class, tyPrioritySubjectPK, this);

		if (tyPrioritySubject == null) {
			Session session = null;

			try {
				session = openSession();

				tyPrioritySubject = (TYPrioritySubject)session.get(TYPrioritySubjectImpl.class,
						tyPrioritySubjectPK);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (tyPrioritySubject != null) {
					cacheResult(tyPrioritySubject);
				}

				closeSession(session);
			}
		}

		return tyPrioritySubject;
	}

	/**
	 * Finds all the t y priority subjects.
	 *
	 * @return the t y priority subjects
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYPrioritySubject> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the t y priority subjects.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of t y priority subjects to return
	 * @param end the upper bound of the range of t y priority subjects to return (not inclusive)
	 * @return the range of t y priority subjects
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYPrioritySubject> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the t y priority subjects.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of t y priority subjects to return
	 * @param end the upper bound of the range of t y priority subjects to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of t y priority subjects
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYPrioritySubject> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<TYPrioritySubject> list = (List<TYPrioritySubject>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TYPRIORITYSUBJECT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TYPRIORITYSUBJECT;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<TYPrioritySubject>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<TYPrioritySubject>)QueryUtil.list(q,
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
	 * Removes all the t y priority subjects from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (TYPrioritySubject tyPrioritySubject : findAll()) {
			remove(tyPrioritySubject);
		}
	}

	/**
	 * Counts all the t y priority subjects.
	 *
	 * @return the number of t y priority subjects
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

				Query q = session.createQuery(_SQL_COUNT_TYPRIORITYSUBJECT);

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
	 * Initializes the t y priority subject persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.tvd.thptty.model.TYPrioritySubject")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TYPrioritySubject>> listenersList = new ArrayList<ModelListener<TYPrioritySubject>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TYPrioritySubject>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TYPrioritySubjectImpl.class.getName());
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
	private static final String _SQL_SELECT_TYPRIORITYSUBJECT = "SELECT tyPrioritySubject FROM TYPrioritySubject tyPrioritySubject";
	private static final String _SQL_COUNT_TYPRIORITYSUBJECT = "SELECT COUNT(tyPrioritySubject) FROM TYPrioritySubject tyPrioritySubject";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tyPrioritySubject.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TYPrioritySubject exists with the primary key ";
	private static Log _log = LogFactoryUtil.getLog(TYPrioritySubjectPersistenceImpl.class);
}