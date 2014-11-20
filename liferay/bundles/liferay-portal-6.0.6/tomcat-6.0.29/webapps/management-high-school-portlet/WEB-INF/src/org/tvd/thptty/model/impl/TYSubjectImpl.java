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

import org.tvd.thptty.model.TYSubject;

/**
 * The model implementation for the TYSubject service. Represents a row in the &quot;TY_TYSubject&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * Helper methods and all application logic should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.tvd.thptty.model.TYSubject} interface.
 * </p>
 *
 * <p>
 * Never reference this class directly. All methods that expect a t y subject model instance should use the {@link TYSubject} interface instead.
 * </p>
 */
public class TYSubjectImpl extends TYSubjectModelImpl implements TYSubject {
	public TYSubjectImpl() {
	}
	
	public void setIndex(int index) {
		this.index = index;
	}
	
	public int getIndex() {
		return index;
	}
	
	private int index;
	
	//private String subjectCodeString;
}