package org.tvd.thptty.management.util;

import org.tvd.thptty.NoSuchSubjectClassUserRoleException;
import org.tvd.thptty.management.temporary.RoleKeys;
import org.tvd.thptty.model.TYSubjectClassUserRole;
import org.tvd.thptty.service.TYSubjectClassUserRoleLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;

public class PermissionChecker {
	
	public static boolean isTeacherManagement(int courses, 
			long classId, long userId, long roleId) {
		boolean result = false;
		
		User teacherManager = ActionUtil.getTeacherManagementOfClass(
				courses, classId, RoleKeys.MANAGEMENT);
		if(teacherManager != null && teacherManager.getUserId() == userId) {
			result = true;
		}
		return result;
	}
	
	public static boolean hasSubjectClassRole(int courses, long subjectId, long classId, 
			long userId, long roleId) {
		boolean result = false;
		try {
			TYSubjectClassUserRole temp = TYSubjectClassUserRoleLocalServiceUtil.hasSubjectClassRole(
					courses, subjectId, classId, userId, roleId);
			if(temp != null) {
				result = true;
			}
		} catch (NoSuchSubjectClassUserRoleException e) {
		} catch (SystemException e) {
		}
		return result;
	}
}
