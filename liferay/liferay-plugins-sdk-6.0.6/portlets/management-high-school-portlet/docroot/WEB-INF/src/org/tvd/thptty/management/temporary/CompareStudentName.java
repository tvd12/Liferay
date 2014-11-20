package org.tvd.thptty.management.temporary;

import java.util.Comparator;

import org.tvd.thptty.model.TYStudent;
import org.tvd.util.CompareStringVietnamese;

public class CompareStudentName implements Comparator<TYStudent> {

	public int compare(TYStudent a, TYStudent b) {
		return CompareStringVietnamese.compare(
				a.getStudentLastName(), b.getStudentLastName());
	}

}
