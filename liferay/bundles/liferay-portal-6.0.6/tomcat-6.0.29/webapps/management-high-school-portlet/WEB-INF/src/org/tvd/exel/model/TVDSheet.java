package org.tvd.exel.model;

import java.util.List;
import java.util.Map;

public class TVDSheet {
	
	private String sheetName;
	
	private List<TVDRow> rows;
	
	private Map<String, Integer> columns;
	
	public Map<String, Integer> getColumns() {
		return columns;
	}
	public void setColumns(Map<String, Integer> columns) {
		this.columns = columns;
	}
	
	public String getSheetName() {
		return sheetName;
	}
	public void setSheetName(String sheetName) {
		this.sheetName = sheetName;
	}
	public List<TVDRow> getRows() {
		return rows;
	}
	public void setRows(List<TVDRow> rows) {
		this.rows = rows;
	}
}
