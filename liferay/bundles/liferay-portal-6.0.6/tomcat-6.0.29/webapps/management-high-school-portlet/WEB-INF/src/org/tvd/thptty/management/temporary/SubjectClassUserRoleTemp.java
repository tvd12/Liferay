package org.tvd.thptty.management.temporary;

import org.tvd.thptty.model.TYSubjectClassUserRole;
import org.tvd.thptty.service.TYClassLocalServiceUtil;
import org.tvd.thptty.service.TYSubjectLocalServiceUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.UserLocalServiceUtil;

public class SubjectClassUserRoleTemp {
	private int courses;
	private long subjectId;
	private long classId;
	private long userId;
	private long roleId;
	
	private String subjectName;
	private String className;
	private String userName;
	private String roleName;
	
	private int index;
	
	public SubjectClassUserRoleTemp() {}
	
	public SubjectClassUserRoleTemp(TYSubjectClassUserRole input) {
		courses = input.getCourses();
		subjectId = input.getSubjectId();
		classId = input.getClassId();
		userId = input.getUserId();
		roleId = input.getRoleId();
		
		try {
			subjectName = TYSubjectLocalServiceUtil.getTYSubject(
					subjectId).getSubjectName();
			className = TYClassLocalServiceUtil.getTYClass(
					classId).getClassGroup() + TYClassLocalServiceUtil.getTYClass(
							classId).getClassName();
			userName = UserLocalServiceUtil.getUser(
					userId).getFullName();
		} catch (PortalException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		}
	}
	
	public int getCourses() {
		return courses;
	}
	public void setCourses(int courses) {
		this.courses = courses;
	}
	public long getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(long subjectId) {
		this.subjectId = subjectId;
	}
	public long getClassId() {
		return classId;
	}
	public void setClassId(long classId) {
		this.classId = classId;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long getRoleId() {
		return roleId;
	}
	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
}
