package org.tvd.thptty.management.temporary;

import java.util.Comparator;

import org.tvd.thptty.model.TYClass;

public class CompareClasses implements Comparator<TYClass>{

	public int compare(TYClass o1, TYClass o2) {
		int n1 = Integer.parseInt(o1.getClassCode());
		int n2 = Integer.parseInt(o2.getClassCode());
		return n1 - n2;
	}
	
}
