package org.tvd.exel.model;

public class TVDCell {
	
	public TVDCell() {}
	
	public TVDCell(String cellName) {
		this.cellName = cellName;
	}
	
	private String cellName;

	public String getCellName() {
		return cellName;
	}

	public void setCellName(String cellName) {
		this.cellName = cellName;
	}

	
	
}
