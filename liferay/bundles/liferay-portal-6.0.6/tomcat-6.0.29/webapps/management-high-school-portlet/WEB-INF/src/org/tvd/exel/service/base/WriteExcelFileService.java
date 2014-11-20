package org.tvd.exel.service.base;

import java.util.List;

import org.tvd.exel.model.TVDSheet;

public interface WriteExcelFileService {
	public boolean write(String filePath);
	
	public void setSheets(List<TVDSheet> sheets);
	
	public List<TVDSheet> getSheets();
}
