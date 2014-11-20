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

package org.tvd.thptty.model.impl;

import org.tvd.thptty.model.TYStudent;

/**
 * The model implementation for the TYStudent service. Represents a row in the &quot;TY_TYStudent&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * Helper methods and all application logic should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.tvd.thptty.model.TYStudent} interface.
 * </p>
 *
 * <p>
 * Never reference this class directly. All methods that expect a t y student model instance should use the {@link TYStudent} interface instead.
 * </p>
 */
public class TYStudentImpl extends TYStudentModelImpl implements TYStudent {
	public TYStudentImpl() {
	}
	
	public String getGender() {

        return gender;
	}
	
	public void setGender(String gender) {
	
	        this.gender = gender;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public String getFullName() {
		return fullName;
	}
	
	public void setIndex(int index) {
		this.index = index;
	}
	
	public int getIndex() {
		return index;
	}
	
	private String gender;
	private String fullName = getStudentFirstName() + getStudentLastName();
	private int index;
}