package org.tvd.exel.service.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;

import org.tvd.exel.model.TVDSheet;
import org.tvd.exel.model.TVDCell;
import org.tvd.exel.model.TVDRow;
import org.tvd.exel.service.base.WriteExcelFileService;

public class WriteExcelFileServiceImpl implements WriteExcelFileService {
	
	public boolean write(String filePath) {
		HSSFWorkbook workbook = new HSSFWorkbook();
		
		for(TVDSheet tvdSheet : sheets) {
			HSSFSheet sheet = workbook.createSheet(tvdSheet.getSheetName());
			
			for(int i = 0 ; i < tvdSheet.getRows().size() ; i++) {
				Row row = sheet.createRow(i);
				TVDRow tvdRow = tvdSheet.getRows().get(i);
				
				for(int k = 0 ; k < tvdRow.getListCells().size() ; k++) {
					TVDCell tvdCell = tvdRow.getListCells().get(k);
					Cell cell = row.createCell(k);
					cell.setCellValue(tvdCell.getCellName());
					if(i == 1) {
						CellStyle cellStyle = cell.getCellStyle();
						Font font = workbook.createFont();
						font.setBoldweight(Font.BOLDWEIGHT_BOLD);
						cellStyle.setFont(font);
					}
					sheet.autoSizeColumn(k);
				}
			}
		}
		 
		try {
		    FileOutputStream out = 
		            new FileOutputStream(new File(filePath));
		    workbook.write(out);
		    out.close();
		    return true;
		     
		} catch (FileNotFoundException e) {
		    e.printStackTrace();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		return false;
	}
	
	private List<TVDSheet> sheets;

	public List<TVDSheet> getSheets() {
		return sheets;
	}

	public void setSheets(List<TVDSheet> sheets) {
		this.sheets = sheets;
	}
	
	public static void main(String args[]) {
		List<TVDCell> cells = new ArrayList<TVDCell>();
		cells.add(new TVDCell("Ho va ten"));
		cells.add(new TVDCell("Diem"));
		
		List<TVDRow> rows = new ArrayList<TVDRow>();
		TVDRow row = new TVDRow();
		row.setListCells(cells);
		rows.add(row);
		
		cells = new ArrayList<TVDCell>();
		cells.add(new TVDCell("Ta Van Dungfasdfsdf"));
		cells.add(new TVDCell("10 9 8"));
		
		row = new TVDRow();
		row.setListCells(cells);
		rows.add(row);
		
		List<TVDSheet> sheets = new ArrayList<TVDSheet>();
		TVDSheet sheet = new TVDSheet();
		sheet.setSheetName("toan");
		sheet.setRows(rows);
		sheets.add(sheet);
		
		sheet = new TVDSheet();
		sheet.setSheetName("ly");
		sheet.setRows(rows);
		sheets.add(sheet);
		
		WriteExcelFileService writeExcelFile = new WriteExcelFileServiceImpl();
		writeExcelFile.setSheets(sheets);
		writeExcelFile.write("E:/10A2.xls");
	}
}
