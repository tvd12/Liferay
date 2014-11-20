package org.tvd.exel.service.base;

import java.io.FileInputStream;
import java.util.List;

import org.tvd.exel.model.TVDSheet;

public interface ReadExcelFileService {
	public void read(String filePath);
	public void read(FileInputStream file);
	public List<TVDSheet> getSheets();
}
