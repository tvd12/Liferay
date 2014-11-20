package org.tvd.thptty.management.util;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.tvd.thptty.model.TYClass;
import org.tvd.thptty.model.TYStudent;
import org.tvd.thptty.model.TYSubject;

import com.liferay.portal.kernel.util.Validator;

public class ValidationInput {
	
	public static boolean validateClass(TYClass tyClass, List<String> errors) {
		boolean valid = true;
		if(Validator.isNull(tyClass.getClassName())) {
			errors.add("class-name-required");
			valid = false;
		}
		if(tyClass.getClassGroup() <= 0) {
			errors.add("class-group-required");
			valid = false;
		}
		
		return valid;
	}
	
	public static boolean validateStudentPublic(TYStudent student, List<String> errors) {
		boolean valid = true;
		if(Validator.isNull(student.getStudentFirstName())) {
			errors.add("firstname-required");
			valid = false;
		}
		
		if(Validator.isNull(student.getStudentLastName())) {
			errors.add("lastname-required");
			valid = false;
		}
		
		if (Validator.isNotNull(student.getBirthDay())) {
            Calendar calendar = new GregorianCalendar();
            calendar.setTime(student.getBirthDay());
            if (!Validator.isDate(
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH),
                calendar.get(Calendar.YEAR))) {
                errors.add("enter-valid-date");
                valid = false;
            } else {
            	int yearBirth = calendar.get(Calendar.YEAR);
            	int yearNow = (Calendar.getInstance().get(Calendar.YEAR));
            	if(yearNow - yearBirth < 14) {
            		errors.add("enter-valid-date");
            		valid = false;
            	}
            }
        }
        else {
            errors.add("birthdate-required");
            valid = false;
        }
		
		if(Validator.isNotNull(student.getEmailAddress())) {
			if(!Validator.isEmailAddress(student.getEmailAddress())) {
				errors.add("email-invalid");
				valid = false;
			}
		}
		
		if(Validator.isNull(student.getAddress())) {
			errors.add("address-required");
			valid = false;
		}
		
		if(Validator.isNull(student.getFatherName())) {
			errors.add("father-name-required");
			valid = false;
		}
		
		if(!Validator.isPhoneNumber(student.getFatherPhone())) {
			errors.add("phone-number-required");
			valid = false;
		}
		
		if(Validator.isNull(student.getMotherName())) {
			errors.add("mother-name-required");
			valid = false;
		}
		
		if(!Validator.isPhoneNumber(student.getMotherPhone())) {
			errors.add("phone-number-required");
			valid = false;
		}
		
		return valid;
	}
	
	public static boolean validEmailStudent(TYStudent oldStudent, List<TYStudent> students, List<String> errors) {
		boolean valid = true;
		if(oldStudent.getEmailAddress().equals("")) {
			return valid;
		}
		for( TYStudent student : students) {
			if(student.getEmailAddress().equals(oldStudent.getEmailAddress()) && 
					student.getStudentId() != oldStudent.getStudentId()) {
				valid = false;
				errors.add("email-exists");
				break;
			}
		}
		return valid;
	}
	
	public static boolean validFullName(String firstName, String lastName) {
		boolean valid = true;
		if(Validator.isNotNull(firstName) && Validator.isNull(lastName)) {
			valid = false;
		}
		
		if(Validator.isNotNull(lastName) && Validator.isNull(firstName)) {
			valid = false;
		}
		
		return valid;
	}
	
	public static boolean validSubject(TYSubject subject, List<String> errors) {
		boolean valid = true;
		if(Validator.isNull(subject.getSubjectName())) {
			errors.add("subject-name-required");
			valid = false;
		}
		
		return valid;
	}
}
