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

import org.tvd.thptty.NoSuchStudentException;
import org.tvd.thptty.model.TYStudent;
import org.tvd.thptty.model.impl.TYStudentImpl;
import org.tvd.thptty.model.impl.TYStudentModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the t y student service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link TYStudentUtil} to access the t y student persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ta Van Dung
 * @see TYStudentPersistence
 * @see TYStudentUtil
 * @generated
 */
public class TYStudentPersistenceImpl extends BasePersistenceImpl<TYStudent>
	implements TYStudentPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = TYStudentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FETCH_BY_EMAIL = new FinderPath(TYStudentModelImpl.ENTITY_CACHE_ENABLED,
			TYStudentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_ENTITY,
			"fetchByEmail",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_EMAIL = new FinderPath(TYStudentModelImpl.ENTITY_CACHE_ENABLED,
			TYStudentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByEmail",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_SCHOOL = new FinderPath(TYStudentModelImpl.ENTITY_CACHE_ENABLED,
			TYStudentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findBySchool",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_SCHOOL = new FinderPath(TYStudentModelImpl.ENTITY_CACHE_ENABLED,
			TYStudentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countBySchool",
			new String[] { Long.class.getName(), Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_G_FIRSTNAME = new FinderPath(TYStudentModelImpl.ENTITY_CACHE_ENABLED,
			TYStudentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByG_FirstName",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_G_FIRSTNAME = new FinderPath(TYStudentModelImpl.ENTITY_CACHE_ENABLED,
			TYStudentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByG_FirstName",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_G_LASTNAME = new FinderPath(TYStudentModelImpl.ENTITY_CACHE_ENABLED,
			TYStudentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByG_LastName",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_G_LASTNAME = new FinderPath(TYStudentModelImpl.ENTITY_CACHE_ENABLED,
			TYStudentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByG_LastName",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_G_F_L_NAME = new FinderPath(TYStudentModelImpl.ENTITY_CACHE_ENABLED,
			TYStudentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByG_F_L_Name",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName(), String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_G_F_L_NAME = new FinderPath(TYStudentModelImpl.ENTITY_CACHE_ENABLED,
			TYStudentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByG_F_L_Name",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName(), String.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_GROUP1 = new FinderPath(TYStudentModelImpl.ENTITY_CACHE_ENABLED,
			TYStudentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByGroup1",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUP1 = new FinderPath(TYStudentModelImpl.ENTITY_CACHE_ENABLED,
			TYStudentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByGroup1",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_GROUP2 = new FinderPath(TYStudentModelImpl.ENTITY_CACHE_ENABLED,
			TYStudentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByGroup2",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUP2 = new FinderPath(TYStudentModelImpl.ENTITY_CACHE_ENABLED,
			TYStudentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByGroup2",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_GROUP3 = new FinderPath(TYStudentModelImpl.ENTITY_CACHE_ENABLED,
			TYStudentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByGroup3",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUP3 = new FinderPath(TYStudentModelImpl.ENTITY_CACHE_ENABLED,
			TYStudentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByGroup3",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(TYStudentModelImpl.ENTITY_CACHE_ENABLED,
			TYStudentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TYStudentModelImpl.ENTITY_CACHE_ENABLED,
			TYStudentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countAll", new String[0]);

	/**
	 * Caches the t y student in the entity cache if it is enabled.
	 *
	 * @param tyStudent the t y student to cache
	 */
	public void cacheResult(TYStudent tyStudent) {
		EntityCacheUtil.putResult(TYStudentModelImpl.ENTITY_CACHE_ENABLED,
			TYStudentImpl.class, tyStudent.getPrimaryKey(), tyStudent);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_EMAIL,
			new Object[] {
				new Long(tyStudent.getCompanyId()),
				new Long(tyStudent.getGroupId()),
				
			tyStudent.getEmailAddress()
			}, tyStudent);
	}

	/**
	 * Caches the t y students in the entity cache if it is enabled.
	 *
	 * @param tyStudents the t y students to cache
	 */
	public void cacheResult(List<TYStudent> tyStudents) {
		for (TYStudent tyStudent : tyStudents) {
			if (EntityCacheUtil.getResult(
						TYStudentModelImpl.ENTITY_CACHE_ENABLED,
						TYStudentImpl.class, tyStudent.getPrimaryKey(), this) == null) {
				cacheResult(tyStudent);
			}
		}
	}

	/**
	 * Clears the cache for all t y students.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(TYStudentImpl.class.getName());
		EntityCacheUtil.clearCache(TYStudentImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the t y student.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(TYStudent tyStudent) {
		EntityCacheUtil.removeResult(TYStudentModelImpl.ENTITY_CACHE_ENABLED,
			TYStudentImpl.class, tyStudent.getPrimaryKey());

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_EMAIL,
			new Object[] {
				new Long(tyStudent.getCompanyId()),
				new Long(tyStudent.getGroupId()),
				
			tyStudent.getEmailAddress()
			});
	}

	/**
	 * Creates a new t y student with the primary key. Does not add the t y student to the database.
	 *
	 * @param studentId the primary key for the new t y student
	 * @return the new t y student
	 */
	public TYStudent create(long studentId) {
		TYStudent tyStudent = new TYStudentImpl();

		tyStudent.setNew(true);
		tyStudent.setPrimaryKey(studentId);

		return tyStudent;
	}

	/**
	 * Removes the t y student with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the t y student to remove
	 * @return the t y student that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a t y student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudent remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Long)primaryKey).longValue());
	}

	/**
	 * Removes the t y student with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param studentId the primary key of the t y student to remove
	 * @return the t y student that was removed
	 * @throws org.tvd.thptty.NoSuchStudentException if a t y student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudent remove(long studentId)
		throws NoSuchStudentException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TYStudent tyStudent = (TYStudent)session.get(TYStudentImpl.class,
					new Long(studentId));

			if (tyStudent == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + studentId);
				}

				throw new NoSuchStudentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					studentId);
			}

			return remove(tyStudent);
		}
		catch (NoSuchStudentException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TYStudent removeImpl(TYStudent tyStudent)
		throws SystemException {
		tyStudent = toUnwrappedModel(tyStudent);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, tyStudent);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		TYStudentModelImpl tyStudentModelImpl = (TYStudentModelImpl)tyStudent;

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_EMAIL,
			new Object[] {
				new Long(tyStudentModelImpl.getCompanyId()),
				new Long(tyStudentModelImpl.getGroupId()),
				
			tyStudentModelImpl.getEmailAddress()
			});

		EntityCacheUtil.removeResult(TYStudentModelImpl.ENTITY_CACHE_ENABLED,
			TYStudentImpl.class, tyStudent.getPrimaryKey());

		return tyStudent;
	}

	public TYStudent updateImpl(org.tvd.thptty.model.TYStudent tyStudent,
		boolean merge) throws SystemException {
		tyStudent = toUnwrappedModel(tyStudent);

		boolean isNew = tyStudent.isNew();

		TYStudentModelImpl tyStudentModelImpl = (TYStudentModelImpl)tyStudent;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, tyStudent, merge);

			tyStudent.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(TYStudentModelImpl.ENTITY_CACHE_ENABLED,
			TYStudentImpl.class, tyStudent.getPrimaryKey(), tyStudent);

		if (!isNew &&
				((tyStudent.getCompanyId() != tyStudentModelImpl.getOriginalCompanyId()) ||
				(tyStudent.getGroupId() != tyStudentModelImpl.getOriginalGroupId()) ||
				!Validator.equals(tyStudent.getEmailAddress(),
					tyStudentModelImpl.getOriginalEmailAddress()))) {
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_EMAIL,
				new Object[] {
					new Long(tyStudentModelImpl.getOriginalCompanyId()),
					new Long(tyStudentModelImpl.getOriginalGroupId()),
					
				tyStudentModelImpl.getOriginalEmailAddress()
				});
		}

		if (isNew ||
				((tyStudent.getCompanyId() != tyStudentModelImpl.getOriginalCompanyId()) ||
				(tyStudent.getGroupId() != tyStudentModelImpl.getOriginalGroupId()) ||
				!Validator.equals(tyStudent.getEmailAddress(),
					tyStudentModelImpl.getOriginalEmailAddress()))) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_EMAIL,
				new Object[] {
					new Long(tyStudent.getCompanyId()),
					new Long(tyStudent.getGroupId()),
					
				tyStudent.getEmailAddress()
				}, tyStudent);
		}

		return tyStudent;
	}

	protected TYStudent toUnwrappedModel(TYStudent tyStudent) {
		if (tyStudent instanceof TYStudentImpl) {
			return tyStudent;
		}

		TYStudentImpl tyStudentImpl = new TYStudentImpl();

		tyStudentImpl.setNew(tyStudent.isNew());
		tyStudentImpl.setPrimaryKey(tyStudent.getPrimaryKey());

		tyStudentImpl.setStudentId(tyStudent.getStudentId());
		tyStudentImpl.setCompanyId(tyStudent.getCompanyId());
		tyStudentImpl.setGroupId(tyStudent.getGroupId());
		tyStudentImpl.setUserId(tyStudent.getUserId());
		tyStudentImpl.setStudentLastName(tyStudent.getStudentLastName());
		tyStudentImpl.setStudentFirstName(tyStudent.getStudentFirstName());
		tyStudentImpl.setStudentGroup1(tyStudent.getStudentGroup1());
		tyStudentImpl.setStudentGroup2(tyStudent.getStudentGroup2());
		tyStudentImpl.setStudentGroup3(tyStudent.getStudentGroup3());
		tyStudentImpl.setMale(tyStudent.isMale());
		tyStudentImpl.setBirthDay(tyStudent.getBirthDay());
		tyStudentImpl.setEmailAddress(tyStudent.getEmailAddress());
		tyStudentImpl.setEmailPassword(tyStudent.getEmailPassword());
		tyStudentImpl.setAddress(tyStudent.getAddress());
		tyStudentImpl.setFatherName(tyStudent.getFatherName());
		tyStudentImpl.setFatherPhone(tyStudent.getFatherPhone());
		tyStudentImpl.setMotherName(tyStudent.getMotherName());
		tyStudentImpl.setMotherPhone(tyStudent.getMotherPhone());
		tyStudentImpl.setStudentCode(tyStudent.getStudentCode());
		tyStudentImpl.setLoginCount(tyStudent.getLoginCount());
		tyStudentImpl.setDateLogin(tyStudent.getDateLogin());
		tyStudentImpl.setPasswordEncrypt(tyStudent.isPasswordEncrypt());
		tyStudentImpl.setQuestion(tyStudent.getQuestion());
		tyStudentImpl.setAnswer(tyStudent.getAnswer());
		tyStudentImpl.setRegId(tyStudent.getRegId());

		return tyStudentImpl;
	}

	/**
	 * Finds the t y student with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the t y student to find
	 * @return the t y student
	 * @throws com.liferay.portal.NoSuchModelException if a t y student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudent findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the t y student with the primary key or throws a {@link org.tvd.thptty.NoSuchStudentException} if it could not be found.
	 *
	 * @param studentId the primary key of the t y student to find
	 * @return the t y student
	 * @throws org.tvd.thptty.NoSuchStudentException if a t y student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudent findByPrimaryKey(long studentId)
		throws NoSuchStudentException, SystemException {
		TYStudent tyStudent = fetchByPrimaryKey(studentId);

		if (tyStudent == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + studentId);
			}

			throw new NoSuchStudentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				studentId);
		}

		return tyStudent;
	}

	/**
	 * Finds the t y student with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the t y student to find
	 * @return the t y student, or <code>null</code> if a t y student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudent fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the t y student with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param studentId the primary key of the t y student to find
	 * @return the t y student, or <code>null</code> if a t y student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudent fetchByPrimaryKey(long studentId)
		throws SystemException {
		TYStudent tyStudent = (TYStudent)EntityCacheUtil.getResult(TYStudentModelImpl.ENTITY_CACHE_ENABLED,
				TYStudentImpl.class, studentId, this);

		if (tyStudent == null) {
			Session session = null;

			try {
				session = openSession();

				tyStudent = (TYStudent)session.get(TYStudentImpl.class,
						new Long(studentId));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (tyStudent != null) {
					cacheResult(tyStudent);
				}

				closeSession(session);
			}
		}

		return tyStudent;
	}

	/**
	 * Finds the t y student where companyId = &#63; and groupId = &#63; and emailAddress = &#63; or throws a {@link org.tvd.thptty.NoSuchStudentException} if it could not be found.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param emailAddress the email address to search with
	 * @return the matching t y student
	 * @throws org.tvd.thptty.NoSuchStudentException if a matching t y student could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudent findByEmail(long companyId, long groupId,
		String emailAddress) throws NoSuchStudentException, SystemException {
		TYStudent tyStudent = fetchByEmail(companyId, groupId, emailAddress);

		if (tyStudent == null) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(", emailAddress=");
			msg.append(emailAddress);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchStudentException(msg.toString());
		}

		return tyStudent;
	}

	/**
	 * Finds the t y student where companyId = &#63; and groupId = &#63; and emailAddress = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param emailAddress the email address to search with
	 * @return the matching t y student, or <code>null</code> if a matching t y student could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudent fetchByEmail(long companyId, long groupId,
		String emailAddress) throws SystemException {
		return fetchByEmail(companyId, groupId, emailAddress, true);
	}

	/**
	 * Finds the t y student where companyId = &#63; and groupId = &#63; and emailAddress = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param emailAddress the email address to search with
	 * @return the matching t y student, or <code>null</code> if a matching t y student could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudent fetchByEmail(long companyId, long groupId,
		String emailAddress, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { companyId, groupId, emailAddress };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_EMAIL,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_SELECT_TYSTUDENT_WHERE);

			query.append(_FINDER_COLUMN_EMAIL_COMPANYID_2);

			query.append(_FINDER_COLUMN_EMAIL_GROUPID_2);

			if (emailAddress == null) {
				query.append(_FINDER_COLUMN_EMAIL_EMAILADDRESS_1);
			}
			else {
				if (emailAddress.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_EMAIL_EMAILADDRESS_3);
				}
				else {
					query.append(_FINDER_COLUMN_EMAIL_EMAILADDRESS_2);
				}
			}

			query.append(TYStudentModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				if (emailAddress != null) {
					qPos.add(emailAddress);
				}

				List<TYStudent> list = q.list();

				result = list;

				TYStudent tyStudent = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_EMAIL,
						finderArgs, list);
				}
				else {
					tyStudent = list.get(0);

					cacheResult(tyStudent);

					if ((tyStudent.getCompanyId() != companyId) ||
							(tyStudent.getGroupId() != groupId) ||
							(tyStudent.getEmailAddress() == null) ||
							!tyStudent.getEmailAddress().equals(emailAddress)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_EMAIL,
							finderArgs, tyStudent);
					}
				}

				return tyStudent;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_EMAIL,
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
				return (TYStudent)result;
			}
		}
	}

	/**
	 * Finds all the t y students where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @return the matching t y students
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudent> findBySchool(long companyId, long groupId)
		throws SystemException {
		return findBySchool(companyId, groupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the t y students where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of t y students to return
	 * @param end the upper bound of the range of t y students to return (not inclusive)
	 * @return the range of matching t y students
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudent> findBySchool(long companyId, long groupId,
		int start, int end) throws SystemException {
		return findBySchool(companyId, groupId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the t y students where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of t y students to return
	 * @param end the upper bound of the range of t y students to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching t y students
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudent> findBySchool(long companyId, long groupId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				companyId, groupId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<TYStudent> list = (List<TYStudent>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_SCHOOL,
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

			query.append(_SQL_SELECT_TYSTUDENT_WHERE);

			query.append(_FINDER_COLUMN_SCHOOL_COMPANYID_2);

			query.append(_FINDER_COLUMN_SCHOOL_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(TYStudentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				list = (List<TYStudent>)QueryUtil.list(q, getDialect(), start,
						end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_SCHOOL,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_SCHOOL,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first t y student in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching t y student
	 * @throws org.tvd.thptty.NoSuchStudentException if a matching t y student could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudent findBySchool_First(long companyId, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchStudentException, SystemException {
		List<TYStudent> list = findBySchool(companyId, groupId, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchStudentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last t y student in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching t y student
	 * @throws org.tvd.thptty.NoSuchStudentException if a matching t y student could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudent findBySchool_Last(long companyId, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchStudentException, SystemException {
		int count = countBySchool(companyId, groupId);

		List<TYStudent> list = findBySchool(companyId, groupId, count - 1,
				count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchStudentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the t y students before and after the current t y student in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param studentId the primary key of the current t y student
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next t y student
	 * @throws org.tvd.thptty.NoSuchStudentException if a t y student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudent[] findBySchool_PrevAndNext(long studentId, long companyId,
		long groupId, OrderByComparator orderByComparator)
		throws NoSuchStudentException, SystemException {
		TYStudent tyStudent = findByPrimaryKey(studentId);

		Session session = null;

		try {
			session = openSession();

			TYStudent[] array = new TYStudentImpl[3];

			array[0] = getBySchool_PrevAndNext(session, tyStudent, companyId,
					groupId, orderByComparator, true);

			array[1] = tyStudent;

			array[2] = getBySchool_PrevAndNext(session, tyStudent, companyId,
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

	protected TYStudent getBySchool_PrevAndNext(Session session,
		TYStudent tyStudent, long companyId, long groupId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TYSTUDENT_WHERE);

		query.append(_FINDER_COLUMN_SCHOOL_COMPANYID_2);

		query.append(_FINDER_COLUMN_SCHOOL_GROUPID_2);

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
			query.append(TYStudentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(tyStudent);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TYStudent> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Filters by the user's permissions and finds all the t y students where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @return the matching t y students that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudent> filterFindBySchool(long companyId, long groupId)
		throws SystemException {
		return filterFindBySchool(companyId, groupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Filters by the user's permissions and finds a range of all the t y students where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of t y students to return
	 * @param end the upper bound of the range of t y students to return (not inclusive)
	 * @return the range of matching t y students that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudent> filterFindBySchool(long companyId, long groupId,
		int start, int end) throws SystemException {
		return filterFindBySchool(companyId, groupId, start, end, null);
	}

	/**
	 * Filters by the user's permissions and finds an ordered range of all the t y students where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of t y students to return
	 * @param end the upper bound of the range of t y students to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching t y students that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudent> filterFindBySchool(long companyId, long groupId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return findBySchool(companyId, groupId, start, end,
				orderByComparator);
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
			query.append(_FILTER_SQL_SELECT_TYSTUDENT_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_TYSTUDENT_NO_INLINE_DISTINCT_WHERE_1);
		}

		query.append(_FINDER_COLUMN_SCHOOL_COMPANYID_2);

		query.append(_FINDER_COLUMN_SCHOOL_GROUPID_2);

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_TYSTUDENT_NO_INLINE_DISTINCT_WHERE_2);
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
				query.append(TYStudentModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(TYStudentModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				TYStudent.class.getName(), _FILTER_COLUMN_PK,
				_FILTER_COLUMN_USERID, groupId);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			if (getDB().isSupportsInlineDistinct()) {
				q.addEntity(_FILTER_ENTITY_ALIAS, TYStudentImpl.class);
			}
			else {
				q.addEntity(_FILTER_ENTITY_TABLE, TYStudentImpl.class);
			}

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(companyId);

			qPos.add(groupId);

			return (List<TYStudent>)QueryUtil.list(q, getDialect(), start, end);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	/**
	 * Finds all the t y students where companyId = &#63; and groupId = &#63; and studentFirstName = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentFirstName the student first name to search with
	 * @return the matching t y students
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudent> findByG_FirstName(long companyId, long groupId,
		String studentFirstName) throws SystemException {
		return findByG_FirstName(companyId, groupId, studentFirstName,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the t y students where companyId = &#63; and groupId = &#63; and studentFirstName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentFirstName the student first name to search with
	 * @param start the lower bound of the range of t y students to return
	 * @param end the upper bound of the range of t y students to return (not inclusive)
	 * @return the range of matching t y students
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudent> findByG_FirstName(long companyId, long groupId,
		String studentFirstName, int start, int end) throws SystemException {
		return findByG_FirstName(companyId, groupId, studentFirstName, start,
			end, null);
	}

	/**
	 * Finds an ordered range of all the t y students where companyId = &#63; and groupId = &#63; and studentFirstName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentFirstName the student first name to search with
	 * @param start the lower bound of the range of t y students to return
	 * @param end the upper bound of the range of t y students to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching t y students
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudent> findByG_FirstName(long companyId, long groupId,
		String studentFirstName, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				companyId, groupId, studentFirstName,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<TYStudent> list = (List<TYStudent>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_G_FIRSTNAME,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_TYSTUDENT_WHERE);

			query.append(_FINDER_COLUMN_G_FIRSTNAME_COMPANYID_2);

			query.append(_FINDER_COLUMN_G_FIRSTNAME_GROUPID_2);

			if (studentFirstName == null) {
				query.append(_FINDER_COLUMN_G_FIRSTNAME_STUDENTFIRSTNAME_1);
			}
			else {
				if (studentFirstName.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_FIRSTNAME_STUDENTFIRSTNAME_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_FIRSTNAME_STUDENTFIRSTNAME_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(TYStudentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				if (studentFirstName != null) {
					qPos.add(studentFirstName);
				}

				list = (List<TYStudent>)QueryUtil.list(q, getDialect(), start,
						end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_G_FIRSTNAME,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_G_FIRSTNAME,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first t y student in the ordered set where companyId = &#63; and groupId = &#63; and studentFirstName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentFirstName the student first name to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching t y student
	 * @throws org.tvd.thptty.NoSuchStudentException if a matching t y student could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudent findByG_FirstName_First(long companyId, long groupId,
		String studentFirstName, OrderByComparator orderByComparator)
		throws NoSuchStudentException, SystemException {
		List<TYStudent> list = findByG_FirstName(companyId, groupId,
				studentFirstName, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(", studentFirstName=");
			msg.append(studentFirstName);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchStudentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last t y student in the ordered set where companyId = &#63; and groupId = &#63; and studentFirstName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentFirstName the student first name to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching t y student
	 * @throws org.tvd.thptty.NoSuchStudentException if a matching t y student could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudent findByG_FirstName_Last(long companyId, long groupId,
		String studentFirstName, OrderByComparator orderByComparator)
		throws NoSuchStudentException, SystemException {
		int count = countByG_FirstName(companyId, groupId, studentFirstName);

		List<TYStudent> list = findByG_FirstName(companyId, groupId,
				studentFirstName, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(", studentFirstName=");
			msg.append(studentFirstName);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchStudentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the t y students before and after the current t y student in the ordered set where companyId = &#63; and groupId = &#63; and studentFirstName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param studentId the primary key of the current t y student
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentFirstName the student first name to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next t y student
	 * @throws org.tvd.thptty.NoSuchStudentException if a t y student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudent[] findByG_FirstName_PrevAndNext(long studentId,
		long companyId, long groupId, String studentFirstName,
		OrderByComparator orderByComparator)
		throws NoSuchStudentException, SystemException {
		TYStudent tyStudent = findByPrimaryKey(studentId);

		Session session = null;

		try {
			session = openSession();

			TYStudent[] array = new TYStudentImpl[3];

			array[0] = getByG_FirstName_PrevAndNext(session, tyStudent,
					companyId, groupId, studentFirstName, orderByComparator,
					true);

			array[1] = tyStudent;

			array[2] = getByG_FirstName_PrevAndNext(session, tyStudent,
					companyId, groupId, studentFirstName, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TYStudent getByG_FirstName_PrevAndNext(Session session,
		TYStudent tyStudent, long companyId, long groupId,
		String studentFirstName, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TYSTUDENT_WHERE);

		query.append(_FINDER_COLUMN_G_FIRSTNAME_COMPANYID_2);

		query.append(_FINDER_COLUMN_G_FIRSTNAME_GROUPID_2);

		if (studentFirstName == null) {
			query.append(_FINDER_COLUMN_G_FIRSTNAME_STUDENTFIRSTNAME_1);
		}
		else {
			if (studentFirstName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_FIRSTNAME_STUDENTFIRSTNAME_3);
			}
			else {
				query.append(_FINDER_COLUMN_G_FIRSTNAME_STUDENTFIRSTNAME_2);
			}
		}

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
			query.append(TYStudentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(groupId);

		if (studentFirstName != null) {
			qPos.add(studentFirstName);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(tyStudent);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TYStudent> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Filters by the user's permissions and finds all the t y students where companyId = &#63; and groupId = &#63; and studentFirstName = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentFirstName the student first name to search with
	 * @return the matching t y students that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudent> filterFindByG_FirstName(long companyId,
		long groupId, String studentFirstName) throws SystemException {
		return filterFindByG_FirstName(companyId, groupId, studentFirstName,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Filters by the user's permissions and finds a range of all the t y students where companyId = &#63; and groupId = &#63; and studentFirstName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentFirstName the student first name to search with
	 * @param start the lower bound of the range of t y students to return
	 * @param end the upper bound of the range of t y students to return (not inclusive)
	 * @return the range of matching t y students that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudent> filterFindByG_FirstName(long companyId,
		long groupId, String studentFirstName, int start, int end)
		throws SystemException {
		return filterFindByG_FirstName(companyId, groupId, studentFirstName,
			start, end, null);
	}

	/**
	 * Filters by the user's permissions and finds an ordered range of all the t y students where companyId = &#63; and groupId = &#63; and studentFirstName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentFirstName the student first name to search with
	 * @param start the lower bound of the range of t y students to return
	 * @param end the upper bound of the range of t y students to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching t y students that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudent> filterFindByG_FirstName(long companyId,
		long groupId, String studentFirstName, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return findByG_FirstName(companyId, groupId, studentFirstName,
				start, end, orderByComparator);
		}

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		if (getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_TYSTUDENT_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_TYSTUDENT_NO_INLINE_DISTINCT_WHERE_1);
		}

		query.append(_FINDER_COLUMN_G_FIRSTNAME_COMPANYID_2);

		query.append(_FINDER_COLUMN_G_FIRSTNAME_GROUPID_2);

		if (studentFirstName == null) {
			query.append(_FINDER_COLUMN_G_FIRSTNAME_STUDENTFIRSTNAME_1);
		}
		else {
			if (studentFirstName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_FIRSTNAME_STUDENTFIRSTNAME_3);
			}
			else {
				query.append(_FINDER_COLUMN_G_FIRSTNAME_STUDENTFIRSTNAME_2);
			}
		}

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_TYSTUDENT_NO_INLINE_DISTINCT_WHERE_2);
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
				query.append(TYStudentModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(TYStudentModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				TYStudent.class.getName(), _FILTER_COLUMN_PK,
				_FILTER_COLUMN_USERID, groupId);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			if (getDB().isSupportsInlineDistinct()) {
				q.addEntity(_FILTER_ENTITY_ALIAS, TYStudentImpl.class);
			}
			else {
				q.addEntity(_FILTER_ENTITY_TABLE, TYStudentImpl.class);
			}

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(companyId);

			qPos.add(groupId);

			if (studentFirstName != null) {
				qPos.add(studentFirstName);
			}

			return (List<TYStudent>)QueryUtil.list(q, getDialect(), start, end);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	/**
	 * Finds all the t y students where companyId = &#63; and groupId = &#63; and studentLastName = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentLastName the student last name to search with
	 * @return the matching t y students
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudent> findByG_LastName(long companyId, long groupId,
		String studentLastName) throws SystemException {
		return findByG_LastName(companyId, groupId, studentLastName,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the t y students where companyId = &#63; and groupId = &#63; and studentLastName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentLastName the student last name to search with
	 * @param start the lower bound of the range of t y students to return
	 * @param end the upper bound of the range of t y students to return (not inclusive)
	 * @return the range of matching t y students
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudent> findByG_LastName(long companyId, long groupId,
		String studentLastName, int start, int end) throws SystemException {
		return findByG_LastName(companyId, groupId, studentLastName, start,
			end, null);
	}

	/**
	 * Finds an ordered range of all the t y students where companyId = &#63; and groupId = &#63; and studentLastName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentLastName the student last name to search with
	 * @param start the lower bound of the range of t y students to return
	 * @param end the upper bound of the range of t y students to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching t y students
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudent> findByG_LastName(long companyId, long groupId,
		String studentLastName, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				companyId, groupId, studentLastName,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<TYStudent> list = (List<TYStudent>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_G_LASTNAME,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_TYSTUDENT_WHERE);

			query.append(_FINDER_COLUMN_G_LASTNAME_COMPANYID_2);

			query.append(_FINDER_COLUMN_G_LASTNAME_GROUPID_2);

			if (studentLastName == null) {
				query.append(_FINDER_COLUMN_G_LASTNAME_STUDENTLASTNAME_1);
			}
			else {
				if (studentLastName.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_LASTNAME_STUDENTLASTNAME_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_LASTNAME_STUDENTLASTNAME_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(TYStudentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				if (studentLastName != null) {
					qPos.add(studentLastName);
				}

				list = (List<TYStudent>)QueryUtil.list(q, getDialect(), start,
						end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_G_LASTNAME,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_G_LASTNAME,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first t y student in the ordered set where companyId = &#63; and groupId = &#63; and studentLastName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentLastName the student last name to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching t y student
	 * @throws org.tvd.thptty.NoSuchStudentException if a matching t y student could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudent findByG_LastName_First(long companyId, long groupId,
		String studentLastName, OrderByComparator orderByComparator)
		throws NoSuchStudentException, SystemException {
		List<TYStudent> list = findByG_LastName(companyId, groupId,
				studentLastName, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(", studentLastName=");
			msg.append(studentLastName);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchStudentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last t y student in the ordered set where companyId = &#63; and groupId = &#63; and studentLastName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentLastName the student last name to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching t y student
	 * @throws org.tvd.thptty.NoSuchStudentException if a matching t y student could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudent findByG_LastName_Last(long companyId, long groupId,
		String studentLastName, OrderByComparator orderByComparator)
		throws NoSuchStudentException, SystemException {
		int count = countByG_LastName(companyId, groupId, studentLastName);

		List<TYStudent> list = findByG_LastName(companyId, groupId,
				studentLastName, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(", studentLastName=");
			msg.append(studentLastName);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchStudentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the t y students before and after the current t y student in the ordered set where companyId = &#63; and groupId = &#63; and studentLastName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param studentId the primary key of the current t y student
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentLastName the student last name to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next t y student
	 * @throws org.tvd.thptty.NoSuchStudentException if a t y student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudent[] findByG_LastName_PrevAndNext(long studentId,
		long companyId, long groupId, String studentLastName,
		OrderByComparator orderByComparator)
		throws NoSuchStudentException, SystemException {
		TYStudent tyStudent = findByPrimaryKey(studentId);

		Session session = null;

		try {
			session = openSession();

			TYStudent[] array = new TYStudentImpl[3];

			array[0] = getByG_LastName_PrevAndNext(session, tyStudent,
					companyId, groupId, studentLastName, orderByComparator, true);

			array[1] = tyStudent;

			array[2] = getByG_LastName_PrevAndNext(session, tyStudent,
					companyId, groupId, studentLastName, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TYStudent getByG_LastName_PrevAndNext(Session session,
		TYStudent tyStudent, long companyId, long groupId,
		String studentLastName, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TYSTUDENT_WHERE);

		query.append(_FINDER_COLUMN_G_LASTNAME_COMPANYID_2);

		query.append(_FINDER_COLUMN_G_LASTNAME_GROUPID_2);

		if (studentLastName == null) {
			query.append(_FINDER_COLUMN_G_LASTNAME_STUDENTLASTNAME_1);
		}
		else {
			if (studentLastName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_LASTNAME_STUDENTLASTNAME_3);
			}
			else {
				query.append(_FINDER_COLUMN_G_LASTNAME_STUDENTLASTNAME_2);
			}
		}

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
			query.append(TYStudentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(groupId);

		if (studentLastName != null) {
			qPos.add(studentLastName);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(tyStudent);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TYStudent> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Filters by the user's permissions and finds all the t y students where companyId = &#63; and groupId = &#63; and studentLastName = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentLastName the student last name to search with
	 * @return the matching t y students that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudent> filterFindByG_LastName(long companyId, long groupId,
		String studentLastName) throws SystemException {
		return filterFindByG_LastName(companyId, groupId, studentLastName,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Filters by the user's permissions and finds a range of all the t y students where companyId = &#63; and groupId = &#63; and studentLastName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentLastName the student last name to search with
	 * @param start the lower bound of the range of t y students to return
	 * @param end the upper bound of the range of t y students to return (not inclusive)
	 * @return the range of matching t y students that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudent> filterFindByG_LastName(long companyId, long groupId,
		String studentLastName, int start, int end) throws SystemException {
		return filterFindByG_LastName(companyId, groupId, studentLastName,
			start, end, null);
	}

	/**
	 * Filters by the user's permissions and finds an ordered range of all the t y students where companyId = &#63; and groupId = &#63; and studentLastName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentLastName the student last name to search with
	 * @param start the lower bound of the range of t y students to return
	 * @param end the upper bound of the range of t y students to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching t y students that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudent> filterFindByG_LastName(long companyId, long groupId,
		String studentLastName, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return findByG_LastName(companyId, groupId, studentLastName, start,
				end, orderByComparator);
		}

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		if (getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_TYSTUDENT_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_TYSTUDENT_NO_INLINE_DISTINCT_WHERE_1);
		}

		query.append(_FINDER_COLUMN_G_LASTNAME_COMPANYID_2);

		query.append(_FINDER_COLUMN_G_LASTNAME_GROUPID_2);

		if (studentLastName == null) {
			query.append(_FINDER_COLUMN_G_LASTNAME_STUDENTLASTNAME_1);
		}
		else {
			if (studentLastName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_LASTNAME_STUDENTLASTNAME_3);
			}
			else {
				query.append(_FINDER_COLUMN_G_LASTNAME_STUDENTLASTNAME_2);
			}
		}

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_TYSTUDENT_NO_INLINE_DISTINCT_WHERE_2);
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
				query.append(TYStudentModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(TYStudentModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				TYStudent.class.getName(), _FILTER_COLUMN_PK,
				_FILTER_COLUMN_USERID, groupId);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			if (getDB().isSupportsInlineDistinct()) {
				q.addEntity(_FILTER_ENTITY_ALIAS, TYStudentImpl.class);
			}
			else {
				q.addEntity(_FILTER_ENTITY_TABLE, TYStudentImpl.class);
			}

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(companyId);

			qPos.add(groupId);

			if (studentLastName != null) {
				qPos.add(studentLastName);
			}

			return (List<TYStudent>)QueryUtil.list(q, getDialect(), start, end);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	/**
	 * Finds all the t y students where companyId = &#63; and groupId = &#63; and studentFirstName = &#63; and studentLastName = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentFirstName the student first name to search with
	 * @param studentLastName the student last name to search with
	 * @return the matching t y students
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudent> findByG_F_L_Name(long companyId, long groupId,
		String studentFirstName, String studentLastName)
		throws SystemException {
		return findByG_F_L_Name(companyId, groupId, studentFirstName,
			studentLastName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the t y students where companyId = &#63; and groupId = &#63; and studentFirstName = &#63; and studentLastName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentFirstName the student first name to search with
	 * @param studentLastName the student last name to search with
	 * @param start the lower bound of the range of t y students to return
	 * @param end the upper bound of the range of t y students to return (not inclusive)
	 * @return the range of matching t y students
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudent> findByG_F_L_Name(long companyId, long groupId,
		String studentFirstName, String studentLastName, int start, int end)
		throws SystemException {
		return findByG_F_L_Name(companyId, groupId, studentFirstName,
			studentLastName, start, end, null);
	}

	/**
	 * Finds an ordered range of all the t y students where companyId = &#63; and groupId = &#63; and studentFirstName = &#63; and studentLastName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentFirstName the student first name to search with
	 * @param studentLastName the student last name to search with
	 * @param start the lower bound of the range of t y students to return
	 * @param end the upper bound of the range of t y students to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching t y students
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudent> findByG_F_L_Name(long companyId, long groupId,
		String studentFirstName, String studentLastName, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				companyId, groupId, studentFirstName, studentLastName,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<TYStudent> list = (List<TYStudent>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_G_F_L_NAME,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(6 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(6);
			}

			query.append(_SQL_SELECT_TYSTUDENT_WHERE);

			query.append(_FINDER_COLUMN_G_F_L_NAME_COMPANYID_2);

			query.append(_FINDER_COLUMN_G_F_L_NAME_GROUPID_2);

			if (studentFirstName == null) {
				query.append(_FINDER_COLUMN_G_F_L_NAME_STUDENTFIRSTNAME_1);
			}
			else {
				if (studentFirstName.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_F_L_NAME_STUDENTFIRSTNAME_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_F_L_NAME_STUDENTFIRSTNAME_2);
				}
			}

			if (studentLastName == null) {
				query.append(_FINDER_COLUMN_G_F_L_NAME_STUDENTLASTNAME_1);
			}
			else {
				if (studentLastName.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_F_L_NAME_STUDENTLASTNAME_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_F_L_NAME_STUDENTLASTNAME_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(TYStudentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				if (studentFirstName != null) {
					qPos.add(studentFirstName);
				}

				if (studentLastName != null) {
					qPos.add(studentLastName);
				}

				list = (List<TYStudent>)QueryUtil.list(q, getDialect(), start,
						end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_G_F_L_NAME,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_G_F_L_NAME,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first t y student in the ordered set where companyId = &#63; and groupId = &#63; and studentFirstName = &#63; and studentLastName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentFirstName the student first name to search with
	 * @param studentLastName the student last name to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching t y student
	 * @throws org.tvd.thptty.NoSuchStudentException if a matching t y student could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudent findByG_F_L_Name_First(long companyId, long groupId,
		String studentFirstName, String studentLastName,
		OrderByComparator orderByComparator)
		throws NoSuchStudentException, SystemException {
		List<TYStudent> list = findByG_F_L_Name(companyId, groupId,
				studentFirstName, studentLastName, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(", studentFirstName=");
			msg.append(studentFirstName);

			msg.append(", studentLastName=");
			msg.append(studentLastName);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchStudentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last t y student in the ordered set where companyId = &#63; and groupId = &#63; and studentFirstName = &#63; and studentLastName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentFirstName the student first name to search with
	 * @param studentLastName the student last name to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching t y student
	 * @throws org.tvd.thptty.NoSuchStudentException if a matching t y student could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudent findByG_F_L_Name_Last(long companyId, long groupId,
		String studentFirstName, String studentLastName,
		OrderByComparator orderByComparator)
		throws NoSuchStudentException, SystemException {
		int count = countByG_F_L_Name(companyId, groupId, studentFirstName,
				studentLastName);

		List<TYStudent> list = findByG_F_L_Name(companyId, groupId,
				studentFirstName, studentLastName, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(", studentFirstName=");
			msg.append(studentFirstName);

			msg.append(", studentLastName=");
			msg.append(studentLastName);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchStudentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the t y students before and after the current t y student in the ordered set where companyId = &#63; and groupId = &#63; and studentFirstName = &#63; and studentLastName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param studentId the primary key of the current t y student
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentFirstName the student first name to search with
	 * @param studentLastName the student last name to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next t y student
	 * @throws org.tvd.thptty.NoSuchStudentException if a t y student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudent[] findByG_F_L_Name_PrevAndNext(long studentId,
		long companyId, long groupId, String studentFirstName,
		String studentLastName, OrderByComparator orderByComparator)
		throws NoSuchStudentException, SystemException {
		TYStudent tyStudent = findByPrimaryKey(studentId);

		Session session = null;

		try {
			session = openSession();

			TYStudent[] array = new TYStudentImpl[3];

			array[0] = getByG_F_L_Name_PrevAndNext(session, tyStudent,
					companyId, groupId, studentFirstName, studentLastName,
					orderByComparator, true);

			array[1] = tyStudent;

			array[2] = getByG_F_L_Name_PrevAndNext(session, tyStudent,
					companyId, groupId, studentFirstName, studentLastName,
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

	protected TYStudent getByG_F_L_Name_PrevAndNext(Session session,
		TYStudent tyStudent, long companyId, long groupId,
		String studentFirstName, String studentLastName,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TYSTUDENT_WHERE);

		query.append(_FINDER_COLUMN_G_F_L_NAME_COMPANYID_2);

		query.append(_FINDER_COLUMN_G_F_L_NAME_GROUPID_2);

		if (studentFirstName == null) {
			query.append(_FINDER_COLUMN_G_F_L_NAME_STUDENTFIRSTNAME_1);
		}
		else {
			if (studentFirstName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_F_L_NAME_STUDENTFIRSTNAME_3);
			}
			else {
				query.append(_FINDER_COLUMN_G_F_L_NAME_STUDENTFIRSTNAME_2);
			}
		}

		if (studentLastName == null) {
			query.append(_FINDER_COLUMN_G_F_L_NAME_STUDENTLASTNAME_1);
		}
		else {
			if (studentLastName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_F_L_NAME_STUDENTLASTNAME_3);
			}
			else {
				query.append(_FINDER_COLUMN_G_F_L_NAME_STUDENTLASTNAME_2);
			}
		}

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
			query.append(TYStudentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(groupId);

		if (studentFirstName != null) {
			qPos.add(studentFirstName);
		}

		if (studentLastName != null) {
			qPos.add(studentLastName);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(tyStudent);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TYStudent> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Filters by the user's permissions and finds all the t y students where companyId = &#63; and groupId = &#63; and studentFirstName = &#63; and studentLastName = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentFirstName the student first name to search with
	 * @param studentLastName the student last name to search with
	 * @return the matching t y students that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudent> filterFindByG_F_L_Name(long companyId, long groupId,
		String studentFirstName, String studentLastName)
		throws SystemException {
		return filterFindByG_F_L_Name(companyId, groupId, studentFirstName,
			studentLastName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Filters by the user's permissions and finds a range of all the t y students where companyId = &#63; and groupId = &#63; and studentFirstName = &#63; and studentLastName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentFirstName the student first name to search with
	 * @param studentLastName the student last name to search with
	 * @param start the lower bound of the range of t y students to return
	 * @param end the upper bound of the range of t y students to return (not inclusive)
	 * @return the range of matching t y students that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudent> filterFindByG_F_L_Name(long companyId, long groupId,
		String studentFirstName, String studentLastName, int start, int end)
		throws SystemException {
		return filterFindByG_F_L_Name(companyId, groupId, studentFirstName,
			studentLastName, start, end, null);
	}

	/**
	 * Filters by the user's permissions and finds an ordered range of all the t y students where companyId = &#63; and groupId = &#63; and studentFirstName = &#63; and studentLastName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentFirstName the student first name to search with
	 * @param studentLastName the student last name to search with
	 * @param start the lower bound of the range of t y students to return
	 * @param end the upper bound of the range of t y students to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching t y students that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudent> filterFindByG_F_L_Name(long companyId, long groupId,
		String studentFirstName, String studentLastName, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return findByG_F_L_Name(companyId, groupId, studentFirstName,
				studentLastName, start, end, orderByComparator);
		}

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(6);
		}

		if (getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_TYSTUDENT_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_TYSTUDENT_NO_INLINE_DISTINCT_WHERE_1);
		}

		query.append(_FINDER_COLUMN_G_F_L_NAME_COMPANYID_2);

		query.append(_FINDER_COLUMN_G_F_L_NAME_GROUPID_2);

		if (studentFirstName == null) {
			query.append(_FINDER_COLUMN_G_F_L_NAME_STUDENTFIRSTNAME_1);
		}
		else {
			if (studentFirstName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_F_L_NAME_STUDENTFIRSTNAME_3);
			}
			else {
				query.append(_FINDER_COLUMN_G_F_L_NAME_STUDENTFIRSTNAME_2);
			}
		}

		if (studentLastName == null) {
			query.append(_FINDER_COLUMN_G_F_L_NAME_STUDENTLASTNAME_1);
		}
		else {
			if (studentLastName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_F_L_NAME_STUDENTLASTNAME_3);
			}
			else {
				query.append(_FINDER_COLUMN_G_F_L_NAME_STUDENTLASTNAME_2);
			}
		}

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_TYSTUDENT_NO_INLINE_DISTINCT_WHERE_2);
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
				query.append(TYStudentModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(TYStudentModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				TYStudent.class.getName(), _FILTER_COLUMN_PK,
				_FILTER_COLUMN_USERID, groupId);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			if (getDB().isSupportsInlineDistinct()) {
				q.addEntity(_FILTER_ENTITY_ALIAS, TYStudentImpl.class);
			}
			else {
				q.addEntity(_FILTER_ENTITY_TABLE, TYStudentImpl.class);
			}

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(companyId);

			qPos.add(groupId);

			if (studentFirstName != null) {
				qPos.add(studentFirstName);
			}

			if (studentLastName != null) {
				qPos.add(studentLastName);
			}

			return (List<TYStudent>)QueryUtil.list(q, getDialect(), start, end);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	/**
	 * Finds all the t y students where companyId = &#63; and groupId = &#63; and studentGroup1 = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentGroup1 the student group1 to search with
	 * @return the matching t y students
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudent> findByGroup1(long companyId, long groupId,
		int studentGroup1) throws SystemException {
		return findByGroup1(companyId, groupId, studentGroup1,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the t y students where companyId = &#63; and groupId = &#63; and studentGroup1 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentGroup1 the student group1 to search with
	 * @param start the lower bound of the range of t y students to return
	 * @param end the upper bound of the range of t y students to return (not inclusive)
	 * @return the range of matching t y students
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudent> findByGroup1(long companyId, long groupId,
		int studentGroup1, int start, int end) throws SystemException {
		return findByGroup1(companyId, groupId, studentGroup1, start, end, null);
	}

	/**
	 * Finds an ordered range of all the t y students where companyId = &#63; and groupId = &#63; and studentGroup1 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentGroup1 the student group1 to search with
	 * @param start the lower bound of the range of t y students to return
	 * @param end the upper bound of the range of t y students to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching t y students
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudent> findByGroup1(long companyId, long groupId,
		int studentGroup1, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				companyId, groupId, studentGroup1,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<TYStudent> list = (List<TYStudent>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_GROUP1,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_TYSTUDENT_WHERE);

			query.append(_FINDER_COLUMN_GROUP1_COMPANYID_2);

			query.append(_FINDER_COLUMN_GROUP1_GROUPID_2);

			query.append(_FINDER_COLUMN_GROUP1_STUDENTGROUP1_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(TYStudentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				qPos.add(studentGroup1);

				list = (List<TYStudent>)QueryUtil.list(q, getDialect(), start,
						end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_GROUP1,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_GROUP1,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first t y student in the ordered set where companyId = &#63; and groupId = &#63; and studentGroup1 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentGroup1 the student group1 to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching t y student
	 * @throws org.tvd.thptty.NoSuchStudentException if a matching t y student could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudent findByGroup1_First(long companyId, long groupId,
		int studentGroup1, OrderByComparator orderByComparator)
		throws NoSuchStudentException, SystemException {
		List<TYStudent> list = findByGroup1(companyId, groupId, studentGroup1,
				0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(", studentGroup1=");
			msg.append(studentGroup1);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchStudentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last t y student in the ordered set where companyId = &#63; and groupId = &#63; and studentGroup1 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentGroup1 the student group1 to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching t y student
	 * @throws org.tvd.thptty.NoSuchStudentException if a matching t y student could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudent findByGroup1_Last(long companyId, long groupId,
		int studentGroup1, OrderByComparator orderByComparator)
		throws NoSuchStudentException, SystemException {
		int count = countByGroup1(companyId, groupId, studentGroup1);

		List<TYStudent> list = findByGroup1(companyId, groupId, studentGroup1,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(", studentGroup1=");
			msg.append(studentGroup1);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchStudentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the t y students before and after the current t y student in the ordered set where companyId = &#63; and groupId = &#63; and studentGroup1 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param studentId the primary key of the current t y student
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentGroup1 the student group1 to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next t y student
	 * @throws org.tvd.thptty.NoSuchStudentException if a t y student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudent[] findByGroup1_PrevAndNext(long studentId, long companyId,
		long groupId, int studentGroup1, OrderByComparator orderByComparator)
		throws NoSuchStudentException, SystemException {
		TYStudent tyStudent = findByPrimaryKey(studentId);

		Session session = null;

		try {
			session = openSession();

			TYStudent[] array = new TYStudentImpl[3];

			array[0] = getByGroup1_PrevAndNext(session, tyStudent, companyId,
					groupId, studentGroup1, orderByComparator, true);

			array[1] = tyStudent;

			array[2] = getByGroup1_PrevAndNext(session, tyStudent, companyId,
					groupId, studentGroup1, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TYStudent getByGroup1_PrevAndNext(Session session,
		TYStudent tyStudent, long companyId, long groupId, int studentGroup1,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TYSTUDENT_WHERE);

		query.append(_FINDER_COLUMN_GROUP1_COMPANYID_2);

		query.append(_FINDER_COLUMN_GROUP1_GROUPID_2);

		query.append(_FINDER_COLUMN_GROUP1_STUDENTGROUP1_2);

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
			query.append(TYStudentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(groupId);

		qPos.add(studentGroup1);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(tyStudent);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TYStudent> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Filters by the user's permissions and finds all the t y students where companyId = &#63; and groupId = &#63; and studentGroup1 = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentGroup1 the student group1 to search with
	 * @return the matching t y students that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudent> filterFindByGroup1(long companyId, long groupId,
		int studentGroup1) throws SystemException {
		return filterFindByGroup1(companyId, groupId, studentGroup1,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Filters by the user's permissions and finds a range of all the t y students where companyId = &#63; and groupId = &#63; and studentGroup1 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentGroup1 the student group1 to search with
	 * @param start the lower bound of the range of t y students to return
	 * @param end the upper bound of the range of t y students to return (not inclusive)
	 * @return the range of matching t y students that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudent> filterFindByGroup1(long companyId, long groupId,
		int studentGroup1, int start, int end) throws SystemException {
		return filterFindByGroup1(companyId, groupId, studentGroup1, start,
			end, null);
	}

	/**
	 * Filters by the user's permissions and finds an ordered range of all the t y students where companyId = &#63; and groupId = &#63; and studentGroup1 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentGroup1 the student group1 to search with
	 * @param start the lower bound of the range of t y students to return
	 * @param end the upper bound of the range of t y students to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching t y students that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudent> filterFindByGroup1(long companyId, long groupId,
		int studentGroup1, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return findByGroup1(companyId, groupId, studentGroup1, start, end,
				orderByComparator);
		}

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		if (getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_TYSTUDENT_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_TYSTUDENT_NO_INLINE_DISTINCT_WHERE_1);
		}

		query.append(_FINDER_COLUMN_GROUP1_COMPANYID_2);

		query.append(_FINDER_COLUMN_GROUP1_GROUPID_2);

		query.append(_FINDER_COLUMN_GROUP1_STUDENTGROUP1_2);

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_TYSTUDENT_NO_INLINE_DISTINCT_WHERE_2);
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
				query.append(TYStudentModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(TYStudentModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				TYStudent.class.getName(), _FILTER_COLUMN_PK,
				_FILTER_COLUMN_USERID, groupId);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			if (getDB().isSupportsInlineDistinct()) {
				q.addEntity(_FILTER_ENTITY_ALIAS, TYStudentImpl.class);
			}
			else {
				q.addEntity(_FILTER_ENTITY_TABLE, TYStudentImpl.class);
			}

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(companyId);

			qPos.add(groupId);

			qPos.add(studentGroup1);

			return (List<TYStudent>)QueryUtil.list(q, getDialect(), start, end);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	/**
	 * Finds all the t y students where companyId = &#63; and groupId = &#63; and studentGroup2 = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentGroup2 the student group2 to search with
	 * @return the matching t y students
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudent> findByGroup2(long companyId, long groupId,
		int studentGroup2) throws SystemException {
		return findByGroup2(companyId, groupId, studentGroup2,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the t y students where companyId = &#63; and groupId = &#63; and studentGroup2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentGroup2 the student group2 to search with
	 * @param start the lower bound of the range of t y students to return
	 * @param end the upper bound of the range of t y students to return (not inclusive)
	 * @return the range of matching t y students
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudent> findByGroup2(long companyId, long groupId,
		int studentGroup2, int start, int end) throws SystemException {
		return findByGroup2(companyId, groupId, studentGroup2, start, end, null);
	}

	/**
	 * Finds an ordered range of all the t y students where companyId = &#63; and groupId = &#63; and studentGroup2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentGroup2 the student group2 to search with
	 * @param start the lower bound of the range of t y students to return
	 * @param end the upper bound of the range of t y students to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching t y students
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudent> findByGroup2(long companyId, long groupId,
		int studentGroup2, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				companyId, groupId, studentGroup2,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<TYStudent> list = (List<TYStudent>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_GROUP2,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_TYSTUDENT_WHERE);

			query.append(_FINDER_COLUMN_GROUP2_COMPANYID_2);

			query.append(_FINDER_COLUMN_GROUP2_GROUPID_2);

			query.append(_FINDER_COLUMN_GROUP2_STUDENTGROUP2_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(TYStudentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				qPos.add(studentGroup2);

				list = (List<TYStudent>)QueryUtil.list(q, getDialect(), start,
						end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_GROUP2,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_GROUP2,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first t y student in the ordered set where companyId = &#63; and groupId = &#63; and studentGroup2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentGroup2 the student group2 to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching t y student
	 * @throws org.tvd.thptty.NoSuchStudentException if a matching t y student could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudent findByGroup2_First(long companyId, long groupId,
		int studentGroup2, OrderByComparator orderByComparator)
		throws NoSuchStudentException, SystemException {
		List<TYStudent> list = findByGroup2(companyId, groupId, studentGroup2,
				0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(", studentGroup2=");
			msg.append(studentGroup2);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchStudentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last t y student in the ordered set where companyId = &#63; and groupId = &#63; and studentGroup2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentGroup2 the student group2 to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching t y student
	 * @throws org.tvd.thptty.NoSuchStudentException if a matching t y student could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudent findByGroup2_Last(long companyId, long groupId,
		int studentGroup2, OrderByComparator orderByComparator)
		throws NoSuchStudentException, SystemException {
		int count = countByGroup2(companyId, groupId, studentGroup2);

		List<TYStudent> list = findByGroup2(companyId, groupId, studentGroup2,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(", studentGroup2=");
			msg.append(studentGroup2);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchStudentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the t y students before and after the current t y student in the ordered set where companyId = &#63; and groupId = &#63; and studentGroup2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param studentId the primary key of the current t y student
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentGroup2 the student group2 to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next t y student
	 * @throws org.tvd.thptty.NoSuchStudentException if a t y student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudent[] findByGroup2_PrevAndNext(long studentId, long companyId,
		long groupId, int studentGroup2, OrderByComparator orderByComparator)
		throws NoSuchStudentException, SystemException {
		TYStudent tyStudent = findByPrimaryKey(studentId);

		Session session = null;

		try {
			session = openSession();

			TYStudent[] array = new TYStudentImpl[3];

			array[0] = getByGroup2_PrevAndNext(session, tyStudent, companyId,
					groupId, studentGroup2, orderByComparator, true);

			array[1] = tyStudent;

			array[2] = getByGroup2_PrevAndNext(session, tyStudent, companyId,
					groupId, studentGroup2, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TYStudent getByGroup2_PrevAndNext(Session session,
		TYStudent tyStudent, long companyId, long groupId, int studentGroup2,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TYSTUDENT_WHERE);

		query.append(_FINDER_COLUMN_GROUP2_COMPANYID_2);

		query.append(_FINDER_COLUMN_GROUP2_GROUPID_2);

		query.append(_FINDER_COLUMN_GROUP2_STUDENTGROUP2_2);

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
			query.append(TYStudentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(groupId);

		qPos.add(studentGroup2);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(tyStudent);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TYStudent> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Filters by the user's permissions and finds all the t y students where companyId = &#63; and groupId = &#63; and studentGroup2 = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentGroup2 the student group2 to search with
	 * @return the matching t y students that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudent> filterFindByGroup2(long companyId, long groupId,
		int studentGroup2) throws SystemException {
		return filterFindByGroup2(companyId, groupId, studentGroup2,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Filters by the user's permissions and finds a range of all the t y students where companyId = &#63; and groupId = &#63; and studentGroup2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentGroup2 the student group2 to search with
	 * @param start the lower bound of the range of t y students to return
	 * @param end the upper bound of the range of t y students to return (not inclusive)
	 * @return the range of matching t y students that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudent> filterFindByGroup2(long companyId, long groupId,
		int studentGroup2, int start, int end) throws SystemException {
		return filterFindByGroup2(companyId, groupId, studentGroup2, start,
			end, null);
	}

	/**
	 * Filters by the user's permissions and finds an ordered range of all the t y students where companyId = &#63; and groupId = &#63; and studentGroup2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentGroup2 the student group2 to search with
	 * @param start the lower bound of the range of t y students to return
	 * @param end the upper bound of the range of t y students to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching t y students that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudent> filterFindByGroup2(long companyId, long groupId,
		int studentGroup2, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return findByGroup2(companyId, groupId, studentGroup2, start, end,
				orderByComparator);
		}

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		if (getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_TYSTUDENT_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_TYSTUDENT_NO_INLINE_DISTINCT_WHERE_1);
		}

		query.append(_FINDER_COLUMN_GROUP2_COMPANYID_2);

		query.append(_FINDER_COLUMN_GROUP2_GROUPID_2);

		query.append(_FINDER_COLUMN_GROUP2_STUDENTGROUP2_2);

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_TYSTUDENT_NO_INLINE_DISTINCT_WHERE_2);
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
				query.append(TYStudentModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(TYStudentModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				TYStudent.class.getName(), _FILTER_COLUMN_PK,
				_FILTER_COLUMN_USERID, groupId);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			if (getDB().isSupportsInlineDistinct()) {
				q.addEntity(_FILTER_ENTITY_ALIAS, TYStudentImpl.class);
			}
			else {
				q.addEntity(_FILTER_ENTITY_TABLE, TYStudentImpl.class);
			}

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(companyId);

			qPos.add(groupId);

			qPos.add(studentGroup2);

			return (List<TYStudent>)QueryUtil.list(q, getDialect(), start, end);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	/**
	 * Finds all the t y students where companyId = &#63; and groupId = &#63; and studentGroup3 = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentGroup3 the student group3 to search with
	 * @return the matching t y students
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudent> findByGroup3(long companyId, long groupId,
		int studentGroup3) throws SystemException {
		return findByGroup3(companyId, groupId, studentGroup3,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the t y students where companyId = &#63; and groupId = &#63; and studentGroup3 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentGroup3 the student group3 to search with
	 * @param start the lower bound of the range of t y students to return
	 * @param end the upper bound of the range of t y students to return (not inclusive)
	 * @return the range of matching t y students
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudent> findByGroup3(long companyId, long groupId,
		int studentGroup3, int start, int end) throws SystemException {
		return findByGroup3(companyId, groupId, studentGroup3, start, end, null);
	}

	/**
	 * Finds an ordered range of all the t y students where companyId = &#63; and groupId = &#63; and studentGroup3 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentGroup3 the student group3 to search with
	 * @param start the lower bound of the range of t y students to return
	 * @param end the upper bound of the range of t y students to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching t y students
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudent> findByGroup3(long companyId, long groupId,
		int studentGroup3, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				companyId, groupId, studentGroup3,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<TYStudent> list = (List<TYStudent>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_GROUP3,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_TYSTUDENT_WHERE);

			query.append(_FINDER_COLUMN_GROUP3_COMPANYID_2);

			query.append(_FINDER_COLUMN_GROUP3_GROUPID_2);

			query.append(_FINDER_COLUMN_GROUP3_STUDENTGROUP3_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(TYStudentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				qPos.add(studentGroup3);

				list = (List<TYStudent>)QueryUtil.list(q, getDialect(), start,
						end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_GROUP3,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_GROUP3,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first t y student in the ordered set where companyId = &#63; and groupId = &#63; and studentGroup3 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentGroup3 the student group3 to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching t y student
	 * @throws org.tvd.thptty.NoSuchStudentException if a matching t y student could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudent findByGroup3_First(long companyId, long groupId,
		int studentGroup3, OrderByComparator orderByComparator)
		throws NoSuchStudentException, SystemException {
		List<TYStudent> list = findByGroup3(companyId, groupId, studentGroup3,
				0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(", studentGroup3=");
			msg.append(studentGroup3);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchStudentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last t y student in the ordered set where companyId = &#63; and groupId = &#63; and studentGroup3 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentGroup3 the student group3 to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching t y student
	 * @throws org.tvd.thptty.NoSuchStudentException if a matching t y student could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudent findByGroup3_Last(long companyId, long groupId,
		int studentGroup3, OrderByComparator orderByComparator)
		throws NoSuchStudentException, SystemException {
		int count = countByGroup3(companyId, groupId, studentGroup3);

		List<TYStudent> list = findByGroup3(companyId, groupId, studentGroup3,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(", studentGroup3=");
			msg.append(studentGroup3);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchStudentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the t y students before and after the current t y student in the ordered set where companyId = &#63; and groupId = &#63; and studentGroup3 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param studentId the primary key of the current t y student
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentGroup3 the student group3 to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next t y student
	 * @throws org.tvd.thptty.NoSuchStudentException if a t y student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TYStudent[] findByGroup3_PrevAndNext(long studentId, long companyId,
		long groupId, int studentGroup3, OrderByComparator orderByComparator)
		throws NoSuchStudentException, SystemException {
		TYStudent tyStudent = findByPrimaryKey(studentId);

		Session session = null;

		try {
			session = openSession();

			TYStudent[] array = new TYStudentImpl[3];

			array[0] = getByGroup3_PrevAndNext(session, tyStudent, companyId,
					groupId, studentGroup3, orderByComparator, true);

			array[1] = tyStudent;

			array[2] = getByGroup3_PrevAndNext(session, tyStudent, companyId,
					groupId, studentGroup3, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TYStudent getByGroup3_PrevAndNext(Session session,
		TYStudent tyStudent, long companyId, long groupId, int studentGroup3,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TYSTUDENT_WHERE);

		query.append(_FINDER_COLUMN_GROUP3_COMPANYID_2);

		query.append(_FINDER_COLUMN_GROUP3_GROUPID_2);

		query.append(_FINDER_COLUMN_GROUP3_STUDENTGROUP3_2);

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
			query.append(TYStudentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(groupId);

		qPos.add(studentGroup3);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(tyStudent);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TYStudent> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Filters by the user's permissions and finds all the t y students where companyId = &#63; and groupId = &#63; and studentGroup3 = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentGroup3 the student group3 to search with
	 * @return the matching t y students that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudent> filterFindByGroup3(long companyId, long groupId,
		int studentGroup3) throws SystemException {
		return filterFindByGroup3(companyId, groupId, studentGroup3,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Filters by the user's permissions and finds a range of all the t y students where companyId = &#63; and groupId = &#63; and studentGroup3 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentGroup3 the student group3 to search with
	 * @param start the lower bound of the range of t y students to return
	 * @param end the upper bound of the range of t y students to return (not inclusive)
	 * @return the range of matching t y students that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudent> filterFindByGroup3(long companyId, long groupId,
		int studentGroup3, int start, int end) throws SystemException {
		return filterFindByGroup3(companyId, groupId, studentGroup3, start,
			end, null);
	}

	/**
	 * Filters by the user's permissions and finds an ordered range of all the t y students where companyId = &#63; and groupId = &#63; and studentGroup3 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentGroup3 the student group3 to search with
	 * @param start the lower bound of the range of t y students to return
	 * @param end the upper bound of the range of t y students to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching t y students that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudent> filterFindByGroup3(long companyId, long groupId,
		int studentGroup3, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return findByGroup3(companyId, groupId, studentGroup3, start, end,
				orderByComparator);
		}

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		if (getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_TYSTUDENT_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_TYSTUDENT_NO_INLINE_DISTINCT_WHERE_1);
		}

		query.append(_FINDER_COLUMN_GROUP3_COMPANYID_2);

		query.append(_FINDER_COLUMN_GROUP3_GROUPID_2);

		query.append(_FINDER_COLUMN_GROUP3_STUDENTGROUP3_2);

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_TYSTUDENT_NO_INLINE_DISTINCT_WHERE_2);
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
				query.append(TYStudentModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(TYStudentModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				TYStudent.class.getName(), _FILTER_COLUMN_PK,
				_FILTER_COLUMN_USERID, groupId);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			if (getDB().isSupportsInlineDistinct()) {
				q.addEntity(_FILTER_ENTITY_ALIAS, TYStudentImpl.class);
			}
			else {
				q.addEntity(_FILTER_ENTITY_TABLE, TYStudentImpl.class);
			}

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(companyId);

			qPos.add(groupId);

			qPos.add(studentGroup3);

			return (List<TYStudent>)QueryUtil.list(q, getDialect(), start, end);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	/**
	 * Finds all the t y students.
	 *
	 * @return the t y students
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudent> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the t y students.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of t y students to return
	 * @param end the upper bound of the range of t y students to return (not inclusive)
	 * @return the range of t y students
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudent> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the t y students.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of t y students to return
	 * @param end the upper bound of the range of t y students to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of t y students
	 * @throws SystemException if a system exception occurred
	 */
	public List<TYStudent> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<TYStudent> list = (List<TYStudent>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TYSTUDENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TYSTUDENT.concat(TYStudentModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<TYStudent>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<TYStudent>)QueryUtil.list(q, getDialect(),
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
	 * Removes the t y student where companyId = &#63; and groupId = &#63; and emailAddress = &#63; from the database.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param emailAddress the email address to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByEmail(long companyId, long groupId, String emailAddress)
		throws NoSuchStudentException, SystemException {
		TYStudent tyStudent = findByEmail(companyId, groupId, emailAddress);

		remove(tyStudent);
	}

	/**
	 * Removes all the t y students where companyId = &#63; and groupId = &#63; from the database.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBySchool(long companyId, long groupId)
		throws SystemException {
		for (TYStudent tyStudent : findBySchool(companyId, groupId)) {
			remove(tyStudent);
		}
	}

	/**
	 * Removes all the t y students where companyId = &#63; and groupId = &#63; and studentFirstName = &#63; from the database.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentFirstName the student first name to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByG_FirstName(long companyId, long groupId,
		String studentFirstName) throws SystemException {
		for (TYStudent tyStudent : findByG_FirstName(companyId, groupId,
				studentFirstName)) {
			remove(tyStudent);
		}
	}

	/**
	 * Removes all the t y students where companyId = &#63; and groupId = &#63; and studentLastName = &#63; from the database.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentLastName the student last name to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByG_LastName(long companyId, long groupId,
		String studentLastName) throws SystemException {
		for (TYStudent tyStudent : findByG_LastName(companyId, groupId,
				studentLastName)) {
			remove(tyStudent);
		}
	}

	/**
	 * Removes all the t y students where companyId = &#63; and groupId = &#63; and studentFirstName = &#63; and studentLastName = &#63; from the database.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentFirstName the student first name to search with
	 * @param studentLastName the student last name to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByG_F_L_Name(long companyId, long groupId,
		String studentFirstName, String studentLastName)
		throws SystemException {
		for (TYStudent tyStudent : findByG_F_L_Name(companyId, groupId,
				studentFirstName, studentLastName)) {
			remove(tyStudent);
		}
	}

	/**
	 * Removes all the t y students where companyId = &#63; and groupId = &#63; and studentGroup1 = &#63; from the database.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentGroup1 the student group1 to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByGroup1(long companyId, long groupId, int studentGroup1)
		throws SystemException {
		for (TYStudent tyStudent : findByGroup1(companyId, groupId,
				studentGroup1)) {
			remove(tyStudent);
		}
	}

	/**
	 * Removes all the t y students where companyId = &#63; and groupId = &#63; and studentGroup2 = &#63; from the database.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentGroup2 the student group2 to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByGroup2(long companyId, long groupId, int studentGroup2)
		throws SystemException {
		for (TYStudent tyStudent : findByGroup2(companyId, groupId,
				studentGroup2)) {
			remove(tyStudent);
		}
	}

	/**
	 * Removes all the t y students where companyId = &#63; and groupId = &#63; and studentGroup3 = &#63; from the database.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentGroup3 the student group3 to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByGroup3(long companyId, long groupId, int studentGroup3)
		throws SystemException {
		for (TYStudent tyStudent : findByGroup3(companyId, groupId,
				studentGroup3)) {
			remove(tyStudent);
		}
	}

	/**
	 * Removes all the t y students from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (TYStudent tyStudent : findAll()) {
			remove(tyStudent);
		}
	}

	/**
	 * Counts all the t y students where companyId = &#63; and groupId = &#63; and emailAddress = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param emailAddress the email address to search with
	 * @return the number of matching t y students
	 * @throws SystemException if a system exception occurred
	 */
	public int countByEmail(long companyId, long groupId, String emailAddress)
		throws SystemException {
		Object[] finderArgs = new Object[] { companyId, groupId, emailAddress };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_EMAIL,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_TYSTUDENT_WHERE);

			query.append(_FINDER_COLUMN_EMAIL_COMPANYID_2);

			query.append(_FINDER_COLUMN_EMAIL_GROUPID_2);

			if (emailAddress == null) {
				query.append(_FINDER_COLUMN_EMAIL_EMAILADDRESS_1);
			}
			else {
				if (emailAddress.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_EMAIL_EMAILADDRESS_3);
				}
				else {
					query.append(_FINDER_COLUMN_EMAIL_EMAILADDRESS_2);
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

				if (emailAddress != null) {
					qPos.add(emailAddress);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_EMAIL,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the t y students where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @return the number of matching t y students
	 * @throws SystemException if a system exception occurred
	 */
	public int countBySchool(long companyId, long groupId)
		throws SystemException {
		Object[] finderArgs = new Object[] { companyId, groupId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_SCHOOL,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TYSTUDENT_WHERE);

			query.append(_FINDER_COLUMN_SCHOOL_COMPANYID_2);

			query.append(_FINDER_COLUMN_SCHOOL_GROUPID_2);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SCHOOL,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Filters by the user's permissions and counts all the t y students where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @return the number of matching t y students that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	public int filterCountBySchool(long companyId, long groupId)
		throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return countBySchool(companyId, groupId);
		}

		StringBundler query = new StringBundler(3);

		query.append(_FILTER_SQL_COUNT_TYSTUDENT_WHERE);

		query.append(_FINDER_COLUMN_SCHOOL_COMPANYID_2);

		query.append(_FINDER_COLUMN_SCHOOL_GROUPID_2);

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				TYStudent.class.getName(), _FILTER_COLUMN_PK,
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
	 * Counts all the t y students where companyId = &#63; and groupId = &#63; and studentFirstName = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentFirstName the student first name to search with
	 * @return the number of matching t y students
	 * @throws SystemException if a system exception occurred
	 */
	public int countByG_FirstName(long companyId, long groupId,
		String studentFirstName) throws SystemException {
		Object[] finderArgs = new Object[] { companyId, groupId, studentFirstName };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G_FIRSTNAME,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_TYSTUDENT_WHERE);

			query.append(_FINDER_COLUMN_G_FIRSTNAME_COMPANYID_2);

			query.append(_FINDER_COLUMN_G_FIRSTNAME_GROUPID_2);

			if (studentFirstName == null) {
				query.append(_FINDER_COLUMN_G_FIRSTNAME_STUDENTFIRSTNAME_1);
			}
			else {
				if (studentFirstName.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_FIRSTNAME_STUDENTFIRSTNAME_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_FIRSTNAME_STUDENTFIRSTNAME_2);
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

				if (studentFirstName != null) {
					qPos.add(studentFirstName);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_FIRSTNAME,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Filters by the user's permissions and counts all the t y students where companyId = &#63; and groupId = &#63; and studentFirstName = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentFirstName the student first name to search with
	 * @return the number of matching t y students that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	public int filterCountByG_FirstName(long companyId, long groupId,
		String studentFirstName) throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return countByG_FirstName(companyId, groupId, studentFirstName);
		}

		StringBundler query = new StringBundler(4);

		query.append(_FILTER_SQL_COUNT_TYSTUDENT_WHERE);

		query.append(_FINDER_COLUMN_G_FIRSTNAME_COMPANYID_2);

		query.append(_FINDER_COLUMN_G_FIRSTNAME_GROUPID_2);

		if (studentFirstName == null) {
			query.append(_FINDER_COLUMN_G_FIRSTNAME_STUDENTFIRSTNAME_1);
		}
		else {
			if (studentFirstName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_FIRSTNAME_STUDENTFIRSTNAME_3);
			}
			else {
				query.append(_FINDER_COLUMN_G_FIRSTNAME_STUDENTFIRSTNAME_2);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				TYStudent.class.getName(), _FILTER_COLUMN_PK,
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

			if (studentFirstName != null) {
				qPos.add(studentFirstName);
			}

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
	 * Counts all the t y students where companyId = &#63; and groupId = &#63; and studentLastName = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentLastName the student last name to search with
	 * @return the number of matching t y students
	 * @throws SystemException if a system exception occurred
	 */
	public int countByG_LastName(long companyId, long groupId,
		String studentLastName) throws SystemException {
		Object[] finderArgs = new Object[] { companyId, groupId, studentLastName };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G_LASTNAME,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_TYSTUDENT_WHERE);

			query.append(_FINDER_COLUMN_G_LASTNAME_COMPANYID_2);

			query.append(_FINDER_COLUMN_G_LASTNAME_GROUPID_2);

			if (studentLastName == null) {
				query.append(_FINDER_COLUMN_G_LASTNAME_STUDENTLASTNAME_1);
			}
			else {
				if (studentLastName.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_LASTNAME_STUDENTLASTNAME_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_LASTNAME_STUDENTLASTNAME_2);
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

				if (studentLastName != null) {
					qPos.add(studentLastName);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_LASTNAME,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Filters by the user's permissions and counts all the t y students where companyId = &#63; and groupId = &#63; and studentLastName = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentLastName the student last name to search with
	 * @return the number of matching t y students that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	public int filterCountByG_LastName(long companyId, long groupId,
		String studentLastName) throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return countByG_LastName(companyId, groupId, studentLastName);
		}

		StringBundler query = new StringBundler(4);

		query.append(_FILTER_SQL_COUNT_TYSTUDENT_WHERE);

		query.append(_FINDER_COLUMN_G_LASTNAME_COMPANYID_2);

		query.append(_FINDER_COLUMN_G_LASTNAME_GROUPID_2);

		if (studentLastName == null) {
			query.append(_FINDER_COLUMN_G_LASTNAME_STUDENTLASTNAME_1);
		}
		else {
			if (studentLastName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_LASTNAME_STUDENTLASTNAME_3);
			}
			else {
				query.append(_FINDER_COLUMN_G_LASTNAME_STUDENTLASTNAME_2);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				TYStudent.class.getName(), _FILTER_COLUMN_PK,
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

			if (studentLastName != null) {
				qPos.add(studentLastName);
			}

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
	 * Counts all the t y students where companyId = &#63; and groupId = &#63; and studentFirstName = &#63; and studentLastName = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentFirstName the student first name to search with
	 * @param studentLastName the student last name to search with
	 * @return the number of matching t y students
	 * @throws SystemException if a system exception occurred
	 */
	public int countByG_F_L_Name(long companyId, long groupId,
		String studentFirstName, String studentLastName)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				companyId, groupId, studentFirstName, studentLastName
			};

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G_F_L_NAME,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_TYSTUDENT_WHERE);

			query.append(_FINDER_COLUMN_G_F_L_NAME_COMPANYID_2);

			query.append(_FINDER_COLUMN_G_F_L_NAME_GROUPID_2);

			if (studentFirstName == null) {
				query.append(_FINDER_COLUMN_G_F_L_NAME_STUDENTFIRSTNAME_1);
			}
			else {
				if (studentFirstName.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_F_L_NAME_STUDENTFIRSTNAME_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_F_L_NAME_STUDENTFIRSTNAME_2);
				}
			}

			if (studentLastName == null) {
				query.append(_FINDER_COLUMN_G_F_L_NAME_STUDENTLASTNAME_1);
			}
			else {
				if (studentLastName.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_F_L_NAME_STUDENTLASTNAME_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_F_L_NAME_STUDENTLASTNAME_2);
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

				if (studentFirstName != null) {
					qPos.add(studentFirstName);
				}

				if (studentLastName != null) {
					qPos.add(studentLastName);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_F_L_NAME,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Filters by the user's permissions and counts all the t y students where companyId = &#63; and groupId = &#63; and studentFirstName = &#63; and studentLastName = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentFirstName the student first name to search with
	 * @param studentLastName the student last name to search with
	 * @return the number of matching t y students that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	public int filterCountByG_F_L_Name(long companyId, long groupId,
		String studentFirstName, String studentLastName)
		throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return countByG_F_L_Name(companyId, groupId, studentFirstName,
				studentLastName);
		}

		StringBundler query = new StringBundler(5);

		query.append(_FILTER_SQL_COUNT_TYSTUDENT_WHERE);

		query.append(_FINDER_COLUMN_G_F_L_NAME_COMPANYID_2);

		query.append(_FINDER_COLUMN_G_F_L_NAME_GROUPID_2);

		if (studentFirstName == null) {
			query.append(_FINDER_COLUMN_G_F_L_NAME_STUDENTFIRSTNAME_1);
		}
		else {
			if (studentFirstName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_F_L_NAME_STUDENTFIRSTNAME_3);
			}
			else {
				query.append(_FINDER_COLUMN_G_F_L_NAME_STUDENTFIRSTNAME_2);
			}
		}

		if (studentLastName == null) {
			query.append(_FINDER_COLUMN_G_F_L_NAME_STUDENTLASTNAME_1);
		}
		else {
			if (studentLastName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_F_L_NAME_STUDENTLASTNAME_3);
			}
			else {
				query.append(_FINDER_COLUMN_G_F_L_NAME_STUDENTLASTNAME_2);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				TYStudent.class.getName(), _FILTER_COLUMN_PK,
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

			if (studentFirstName != null) {
				qPos.add(studentFirstName);
			}

			if (studentLastName != null) {
				qPos.add(studentLastName);
			}

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
	 * Counts all the t y students where companyId = &#63; and groupId = &#63; and studentGroup1 = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentGroup1 the student group1 to search with
	 * @return the number of matching t y students
	 * @throws SystemException if a system exception occurred
	 */
	public int countByGroup1(long companyId, long groupId, int studentGroup1)
		throws SystemException {
		Object[] finderArgs = new Object[] { companyId, groupId, studentGroup1 };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_GROUP1,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_TYSTUDENT_WHERE);

			query.append(_FINDER_COLUMN_GROUP1_COMPANYID_2);

			query.append(_FINDER_COLUMN_GROUP1_GROUPID_2);

			query.append(_FINDER_COLUMN_GROUP1_STUDENTGROUP1_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				qPos.add(studentGroup1);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_GROUP1,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Filters by the user's permissions and counts all the t y students where companyId = &#63; and groupId = &#63; and studentGroup1 = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentGroup1 the student group1 to search with
	 * @return the number of matching t y students that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	public int filterCountByGroup1(long companyId, long groupId,
		int studentGroup1) throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return countByGroup1(companyId, groupId, studentGroup1);
		}

		StringBundler query = new StringBundler(4);

		query.append(_FILTER_SQL_COUNT_TYSTUDENT_WHERE);

		query.append(_FINDER_COLUMN_GROUP1_COMPANYID_2);

		query.append(_FINDER_COLUMN_GROUP1_GROUPID_2);

		query.append(_FINDER_COLUMN_GROUP1_STUDENTGROUP1_2);

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				TYStudent.class.getName(), _FILTER_COLUMN_PK,
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

			qPos.add(studentGroup1);

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
	 * Counts all the t y students where companyId = &#63; and groupId = &#63; and studentGroup2 = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentGroup2 the student group2 to search with
	 * @return the number of matching t y students
	 * @throws SystemException if a system exception occurred
	 */
	public int countByGroup2(long companyId, long groupId, int studentGroup2)
		throws SystemException {
		Object[] finderArgs = new Object[] { companyId, groupId, studentGroup2 };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_GROUP2,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_TYSTUDENT_WHERE);

			query.append(_FINDER_COLUMN_GROUP2_COMPANYID_2);

			query.append(_FINDER_COLUMN_GROUP2_GROUPID_2);

			query.append(_FINDER_COLUMN_GROUP2_STUDENTGROUP2_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				qPos.add(studentGroup2);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_GROUP2,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Filters by the user's permissions and counts all the t y students where companyId = &#63; and groupId = &#63; and studentGroup2 = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentGroup2 the student group2 to search with
	 * @return the number of matching t y students that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	public int filterCountByGroup2(long companyId, long groupId,
		int studentGroup2) throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return countByGroup2(companyId, groupId, studentGroup2);
		}

		StringBundler query = new StringBundler(4);

		query.append(_FILTER_SQL_COUNT_TYSTUDENT_WHERE);

		query.append(_FINDER_COLUMN_GROUP2_COMPANYID_2);

		query.append(_FINDER_COLUMN_GROUP2_GROUPID_2);

		query.append(_FINDER_COLUMN_GROUP2_STUDENTGROUP2_2);

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				TYStudent.class.getName(), _FILTER_COLUMN_PK,
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

			qPos.add(studentGroup2);

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
	 * Counts all the t y students where companyId = &#63; and groupId = &#63; and studentGroup3 = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentGroup3 the student group3 to search with
	 * @return the number of matching t y students
	 * @throws SystemException if a system exception occurred
	 */
	public int countByGroup3(long companyId, long groupId, int studentGroup3)
		throws SystemException {
		Object[] finderArgs = new Object[] { companyId, groupId, studentGroup3 };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_GROUP3,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_TYSTUDENT_WHERE);

			query.append(_FINDER_COLUMN_GROUP3_COMPANYID_2);

			query.append(_FINDER_COLUMN_GROUP3_GROUPID_2);

			query.append(_FINDER_COLUMN_GROUP3_STUDENTGROUP3_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				qPos.add(studentGroup3);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_GROUP3,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Filters by the user's permissions and counts all the t y students where companyId = &#63; and groupId = &#63; and studentGroup3 = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @param groupId the group id to search with
	 * @param studentGroup3 the student group3 to search with
	 * @return the number of matching t y students that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	public int filterCountByGroup3(long companyId, long groupId,
		int studentGroup3) throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return countByGroup3(companyId, groupId, studentGroup3);
		}

		StringBundler query = new StringBundler(4);

		query.append(_FILTER_SQL_COUNT_TYSTUDENT_WHERE);

		query.append(_FINDER_COLUMN_GROUP3_COMPANYID_2);

		query.append(_FINDER_COLUMN_GROUP3_GROUPID_2);

		query.append(_FINDER_COLUMN_GROUP3_STUDENTGROUP3_2);

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				TYStudent.class.getName(), _FILTER_COLUMN_PK,
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

			qPos.add(studentGroup3);

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
	 * Counts all the t y students.
	 *
	 * @return the number of t y students
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

				Query q = session.createQuery(_SQL_COUNT_TYSTUDENT);

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
	 * Initializes the t y student persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.tvd.thptty.model.TYStudent")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TYStudent>> listenersList = new ArrayList<ModelListener<TYStudent>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TYStudent>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TYStudentImpl.class.getName());
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
	private static final String _SQL_SELECT_TYSTUDENT = "SELECT tyStudent FROM TYStudent tyStudent";
	private static final String _SQL_SELECT_TYSTUDENT_WHERE = "SELECT tyStudent FROM TYStudent tyStudent WHERE ";
	private static final String _SQL_COUNT_TYSTUDENT = "SELECT COUNT(tyStudent) FROM TYStudent tyStudent";
	private static final String _SQL_COUNT_TYSTUDENT_WHERE = "SELECT COUNT(tyStudent) FROM TYStudent tyStudent WHERE ";
	private static final String _FINDER_COLUMN_EMAIL_COMPANYID_2 = "tyStudent.companyId = ? AND ";
	private static final String _FINDER_COLUMN_EMAIL_GROUPID_2 = "tyStudent.groupId = ? AND ";
	private static final String _FINDER_COLUMN_EMAIL_EMAILADDRESS_1 = "tyStudent.emailAddress IS NULL";
	private static final String _FINDER_COLUMN_EMAIL_EMAILADDRESS_2 = "tyStudent.emailAddress = ?";
	private static final String _FINDER_COLUMN_EMAIL_EMAILADDRESS_3 = "(tyStudent.emailAddress IS NULL OR tyStudent.emailAddress = ?)";
	private static final String _FINDER_COLUMN_SCHOOL_COMPANYID_2 = "tyStudent.companyId = ? AND ";
	private static final String _FINDER_COLUMN_SCHOOL_GROUPID_2 = "tyStudent.groupId = ?";
	private static final String _FINDER_COLUMN_G_FIRSTNAME_COMPANYID_2 = "tyStudent.companyId = ? AND ";
	private static final String _FINDER_COLUMN_G_FIRSTNAME_GROUPID_2 = "tyStudent.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_FIRSTNAME_STUDENTFIRSTNAME_1 = "tyStudent.studentFirstName IS NULL";
	private static final String _FINDER_COLUMN_G_FIRSTNAME_STUDENTFIRSTNAME_2 = "tyStudent.studentFirstName = ?";
	private static final String _FINDER_COLUMN_G_FIRSTNAME_STUDENTFIRSTNAME_3 = "(tyStudent.studentFirstName IS NULL OR tyStudent.studentFirstName = ?)";
	private static final String _FINDER_COLUMN_G_LASTNAME_COMPANYID_2 = "tyStudent.companyId = ? AND ";
	private static final String _FINDER_COLUMN_G_LASTNAME_GROUPID_2 = "tyStudent.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_LASTNAME_STUDENTLASTNAME_1 = "tyStudent.studentLastName IS NULL";
	private static final String _FINDER_COLUMN_G_LASTNAME_STUDENTLASTNAME_2 = "tyStudent.studentLastName = ?";
	private static final String _FINDER_COLUMN_G_LASTNAME_STUDENTLASTNAME_3 = "(tyStudent.studentLastName IS NULL OR tyStudent.studentLastName = ?)";
	private static final String _FINDER_COLUMN_G_F_L_NAME_COMPANYID_2 = "tyStudent.companyId = ? AND ";
	private static final String _FINDER_COLUMN_G_F_L_NAME_GROUPID_2 = "tyStudent.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_F_L_NAME_STUDENTFIRSTNAME_1 = "tyStudent.studentFirstName IS NULL AND ";
	private static final String _FINDER_COLUMN_G_F_L_NAME_STUDENTFIRSTNAME_2 = "tyStudent.studentFirstName = ? AND ";
	private static final String _FINDER_COLUMN_G_F_L_NAME_STUDENTFIRSTNAME_3 = "(tyStudent.studentFirstName IS NULL OR tyStudent.studentFirstName = ?) AND ";
	private static final String _FINDER_COLUMN_G_F_L_NAME_STUDENTLASTNAME_1 = "tyStudent.studentLastName IS NULL";
	private static final String _FINDER_COLUMN_G_F_L_NAME_STUDENTLASTNAME_2 = "tyStudent.studentLastName = ?";
	private static final String _FINDER_COLUMN_G_F_L_NAME_STUDENTLASTNAME_3 = "(tyStudent.studentLastName IS NULL OR tyStudent.studentLastName = ?)";
	private static final String _FINDER_COLUMN_GROUP1_COMPANYID_2 = "tyStudent.companyId = ? AND ";
	private static final String _FINDER_COLUMN_GROUP1_GROUPID_2 = "tyStudent.groupId = ? AND ";
	private static final String _FINDER_COLUMN_GROUP1_STUDENTGROUP1_2 = "tyStudent.studentGroup1 = ?";
	private static final String _FINDER_COLUMN_GROUP2_COMPANYID_2 = "tyStudent.companyId = ? AND ";
	private static final String _FINDER_COLUMN_GROUP2_GROUPID_2 = "tyStudent.groupId = ? AND ";
	private static final String _FINDER_COLUMN_GROUP2_STUDENTGROUP2_2 = "tyStudent.studentGroup2 = ?";
	private static final String _FINDER_COLUMN_GROUP3_COMPANYID_2 = "tyStudent.companyId = ? AND ";
	private static final String _FINDER_COLUMN_GROUP3_GROUPID_2 = "tyStudent.groupId = ? AND ";
	private static final String _FINDER_COLUMN_GROUP3_STUDENTGROUP3_2 = "tyStudent.studentGroup3 = ?";
	private static final String _FILTER_SQL_SELECT_TYSTUDENT_WHERE = "SELECT DISTINCT {tyStudent.*} FROM TY_TYStudent tyStudent WHERE ";
	private static final String _FILTER_SQL_SELECT_TYSTUDENT_NO_INLINE_DISTINCT_WHERE_1 =
		"SELECT {TY_TYStudent.*} FROM (SELECT DISTINCT tyStudent.studentId FROM TY_TYStudent tyStudent WHERE ";
	private static final String _FILTER_SQL_SELECT_TYSTUDENT_NO_INLINE_DISTINCT_WHERE_2 =
		") TEMP_TABLE INNER JOIN TY_TYStudent ON TEMP_TABLE.studentId = TY_TYStudent.studentId";
	private static final String _FILTER_SQL_COUNT_TYSTUDENT_WHERE = "SELECT COUNT(DISTINCT tyStudent.studentId) AS COUNT_VALUE FROM TY_TYStudent tyStudent WHERE ";
	private static final String _FILTER_COLUMN_PK = "tyStudent.studentId";
	private static final String _FILTER_COLUMN_USERID = "tyStudent.userId";
	private static final String _FILTER_ENTITY_ALIAS = "tyStudent";
	private static final String _FILTER_ENTITY_TABLE = "TY_TYStudent";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tyStudent.";
	private static final String _ORDER_BY_ENTITY_TABLE = "TY_TYStudent.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TYStudent exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TYStudent exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(TYStudentPersistenceImpl.class);
}