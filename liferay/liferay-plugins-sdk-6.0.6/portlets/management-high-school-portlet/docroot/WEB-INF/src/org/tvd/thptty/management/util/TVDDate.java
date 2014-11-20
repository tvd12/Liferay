package org.tvd.thptty.management.util;

public class TVDDate implements Comparable<TVDDate> {
	
	public TVDDate() {}
	
	public TVDDate(int date, int month, int year) {
		this.date = date;
		this.month = month;
		this.year = year;
	}
	
	private int date;
	private int month;
	private int year;
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int compareTo(TVDDate o) {
		if(this.year != o.getYear()) {
			return this.year - o.getYear();
		} else if(this.month != o.month) {
			return this.month - o.month;
		} else {
			return this.date - o.date;
		}
	}
}
