package org.tvd.exel.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.tvd.exel.model.TVDCell;
import org.tvd.exel.model.TVDRow;
import org.tvd.exel.model.TVDSheet;
import org.tvd.exel.service.base.ReadExcelFileService;
import org.tvd.thptty.management.temporary.Column;
import org.tvd.util.TCVN3UnicodeConvertor;


public class ReadExcelFileServiceImpl implements ReadExcelFileService {
	public ReadExcelFileServiceImpl() {
	}
	
	public void read(String filePath) {
		try {
		     
			FileInputStream file = new FileInputStream(new File(filePath));
		     
		    //Get the workbook instance for XLS file 
		    HSSFWorkbook workbook = new HSSFWorkbook(file);
		    for(int i = 0 ; i < workbook.getNumberOfSheets() ; i++) {
			    //Get first sheet from the workbook
			    HSSFSheet sheet = workbook.getSheetAt(i);
			    
			    TVDSheet tvdSheet = new TVDSheet();
			    Map<String, Integer> columns = new HashMap<String, Integer>(); 
			     
			    //Iterate through each rows from first sheet
			    Iterator<Row> rowIterator = sheet.iterator();
			    List<TVDRow> tvdRows = new ArrayList<TVDRow>();
			    List<Integer> cols = new ArrayList<Integer>();
			    while(rowIterator.hasNext()) {
			        Row row = rowIterator.next();
			        TVDRow tvdRow = new TVDRow();
			         
			        //For each row, iterate through each columns
			        Iterator<Cell> cellIterator = row.cellIterator();
			        Map<Integer, TVDCell> tvdCells = new HashMap<Integer, TVDCell>();
			        while(cellIterator.hasNext()) {
			             
			            Cell cell = cellIterator.next();
			            TVDCell tvdCell =  new TVDCell();
			            String stringValue = ""; 
			            switch(cell.getCellType()) {
			                case Cell.CELL_TYPE_BOOLEAN:
			                    stringValue = String.valueOf(cell.getBooleanCellValue());
			                    break;
			                case Cell.CELL_TYPE_NUMERIC:
			                    stringValue = String.valueOf(cell.getNumericCellValue());
			                    break;
			                case Cell.CELL_TYPE_STRING:
			                    stringValue = String.valueOf(cell.getStringCellValue());
			                    break;
			            }
			           // System.out.println(stringValue);
			            stringValue = TCVN3UnicodeConvertor.convertToUnicode(stringValue);
			            tvdCell.setCellName(stringValue);
			            if(stringValue.trim().equalsIgnoreCase(Column.fullName)) {
			            	columns.put(Column.fullName, cell.getColumnIndex());
			            	cols.add(new Integer(cell.getColumnIndex()));
			            } else if(stringValue.trim().equalsIgnoreCase(Column.SPEAK_POINT)) {
			            	columns.put(Column.SPEAK_POINT, cell.getColumnIndex());
			            	cols.add(new Integer(cell.getColumnIndex()));
			            } else if(stringValue.trim().equalsIgnoreCase(Column.WRITE_15_POINT)) {
			            	columns.put(Column.WRITE_15_POINT, cell.getColumnIndex());
			            	cols.add(new Integer(cell.getColumnIndex()));
			            } else if(stringValue.trim().equalsIgnoreCase(Column.WRITE_45_POINT)) {
			            	columns.put(Column.WRITE_45_POINT, cell.getColumnIndex());
			            	cols.add(new Integer(cell.getColumnIndex()));
			            } else if(stringValue.trim().equalsIgnoreCase(Column.WRITE_90_POINT)) {
			            	columns.put(Column.WRITE_90_POINT, cell.getColumnIndex());
			            	cols.add(new Integer(cell.getColumnIndex()));
			            } else if(stringValue.trim().equalsIgnoreCase(Column.studentId)) {
			            	columns.put(Column.studentId, cell.getColumnIndex());
			            	cols.add(new Integer(cell.getColumnIndex()));
			            }
			            for(Integer inter : cols) {
			            	if(inter.equals(cell.getColumnIndex())) {
			            		tvdCells.put(cell.getColumnIndex(), tvdCell);
			            		break;
			            	}
			            }
			        }
			        if(tvdCells.size() > 0) {
			        	tvdRow.setCells(tvdCells);
			        	tvdRows.add(tvdRow);
			        }
			    }
			    if(tvdRows.size() > 0) {
			    	tvdSheet.setRows(tvdRows);
			    	tvdSheet.setColumns(columns);
			    	sheets.add(tvdSheet);
			    }
		    }
		    
		} catch (FileNotFoundException e) {
		    e.printStackTrace();
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}
	
	public void read(FileInputStream file) {
		try {
		    //Get the workbook instance for XLS file 
		    HSSFWorkbook workbook = new HSSFWorkbook(file);
		    for(int i = 0 ; i < workbook.getNumberOfSheets() ; i++) {
			    //Get first sheet from the workbook
			    HSSFSheet sheet = workbook.getSheetAt(i);
			    
			    TVDSheet tvdSheet = new TVDSheet();
			    Map<String, Integer> columns = new HashMap<String, Integer>(); 
			     
			    //Iterate through each rows from first sheet
			    Iterator<Row> rowIterator = sheet.iterator();
			    List<TVDRow> tvdRows = new ArrayList<TVDRow>();
			    while(rowIterator.hasNext()) {
			        Row row = rowIterator.next();
			        TVDRow tvdRow = new TVDRow();
			         
			        //For each row, iterate through each columns
			        Iterator<Cell> cellIterator = row.cellIterator();
			        Map<Integer, TVDCell> tvdCells = new HashMap<Integer, TVDCell>();
			        while(cellIterator.hasNext()) {
			             
			            Cell cell = cellIterator.next();
			            TVDCell tvdCell =  new TVDCell();
			            String stringValue = ""; 
			            switch(cell.getCellType()) {
			                case Cell.CELL_TYPE_BOOLEAN:
			                    stringValue = String.valueOf(cell.getBooleanCellValue());
			                    break;
			                case Cell.CELL_TYPE_NUMERIC:
			                    stringValue = String.valueOf(cell.getNumericCellValue());
			                    break;
			                case Cell.CELL_TYPE_STRING:
			                    stringValue = String.valueOf(cell.getStringCellValue());
			                    break;
			            }
			            stringValue = TCVN3UnicodeConvertor.convertToUnicode(stringValue);
			            tvdCell.setCellName(stringValue);
			            if(stringValue.trim().equalsIgnoreCase(Column.fullName)) {
			            	columns.put(Column.fullName, cell.getColumnIndex());
			            } else if(stringValue.trim().equalsIgnoreCase(Column.SPEAK_POINT)) {
			            	columns.put(Column.SPEAK_POINT, cell.getColumnIndex());
			            } else if(stringValue.trim().equalsIgnoreCase(Column.WRITE_15_POINT)) {
			            	columns.put(Column.WRITE_15_POINT, cell.getColumnIndex());
			            } else if(stringValue.trim().equalsIgnoreCase(Column.WRITE_45_POINT)) {
			            	columns.put(Column.WRITE_45_POINT, cell.getColumnIndex());
			            } else if(stringValue.trim().equalsIgnoreCase(Column.WRITE_90_POINT)) {
			            	columns.put(Column.WRITE_90_POINT, cell.getColumnIndex());
			            } else if(stringValue.trim().equalsIgnoreCase(Column.studentId)) {
			            	columns.put(Column.studentId, cell.getColumnIndex());
			            }
			            tvdCells.put(cell.getColumnIndex(), tvdCell);
			        }
			        tvdRow.setCells(tvdCells);
			        tvdRows.add(tvdRow);
			    }
			    tvdSheet.setRows(tvdRows);
			    tvdSheet.setColumns(columns);
			    sheets.add(tvdSheet);
			   
		    }
		    
		} catch (FileNotFoundException e) {
		    e.printStackTrace();
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}
	
	private List<TVDSheet> sheets = new ArrayList<TVDSheet>();
	
	private Map<String, Integer> columns = new HashMap<String, Integer>(); 
	
	public Map<String, Integer> getColumns() {
		return columns;
	}
	
	public List<TVDSheet> getSheets() {
		return sheets;
	}
}
