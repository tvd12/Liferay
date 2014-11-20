package org.tvd.exel.model;

import java.util.List;
import java.util.Map;

public class TVDRow {
	
	public TVDRow() {
		
	}
	
	public TVDRow(List<TVDCell> listCells) {
		this.listCells = listCells;
	}
	
	private Map<Integer, TVDCell> cells;
	
	private List<TVDCell> listCells;

	public List<TVDCell> getListCells() {
		return listCells;
	}

	public void setListCells(List<TVDCell> listCells) {
		this.listCells = listCells;
	}

	public Map<Integer, TVDCell> getCells() {
		return cells;
	}

	public void setCells(Map<Integer, TVDCell> cells) {
		this.cells = cells;
	}

	
}
