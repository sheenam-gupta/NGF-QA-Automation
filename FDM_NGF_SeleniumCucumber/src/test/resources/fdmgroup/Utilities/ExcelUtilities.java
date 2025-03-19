package com.fdmgroup.Utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilities {

	public static FileInputStream fileInput;
	public static FileOutputStream fileOutput;
	public static XSSFWorkbook workBook;
	public static XSSFSheet workSheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static CellStyle style;

	public static int getRowCount(String xlFile, String xlSheet) throws IOException {
		fileInput = new FileInputStream(xlFile);
		System.out.println(fileInput);
		workBook = new XSSFWorkbook(fileInput);
		workSheet = workBook.getSheet(xlSheet);
		int rowCount = workSheet.getLastRowNum();
		workBook.close();
		fileInput.close();
		return rowCount;
	}

	public static int getCellCount(String xlFile, String xlSheet, int rowNum) throws IOException {
		fileInput = new FileInputStream(xlFile);
		workBook = new XSSFWorkbook(fileInput);
		workSheet = workBook.getSheet(xlSheet);
		row = workSheet.getRow(rowNum);
		int cellCount = row.getLastCellNum();
		workBook.close();
		fileInput.close();
		return cellCount;
	}

	public static String getCellData(String xlFile, String xlSheet, int rowNum, int colNum) throws IOException {
		fileInput = new FileInputStream(xlFile);
		workBook = new XSSFWorkbook(fileInput);
		workSheet = workBook.getSheet(xlSheet);
		row = workSheet.getRow(rowNum);
		cell = row.getCell(colNum);

		String data;
		try {
			DataFormatter formatter = new DataFormatter();
			data = formatter.formatCellValue(cell);
			return data;
		} catch (Exception e) {
			data = "";
		}

		workBook.close();
		fileInput.close();
		return data;
	}

	public static void setCellData(String xlFile, String xlSheet, int rowNum, int colNum, String data)
			throws IOException {
		fileInput = new FileInputStream(xlFile);
		workBook = new XSSFWorkbook(fileInput);
		workSheet = workBook.getSheet(xlSheet);
		row = workSheet.getRow(rowNum);
		cell = row.createCell(colNum);
		cell.setCellValue(data);
		fileOutput = new FileOutputStream(xlFile);
		workBook.write(fileOutput);
		workBook.close();
		fileInput.close();
		fileOutput.close();

	}

	public static void fillGreenColor(String xlFile, String xlSheet, int rowNum, int colNum) throws IOException {
		fileInput = new FileInputStream(xlFile);
		workBook = new XSSFWorkbook(fileInput);
		workSheet = workBook.getSheet(xlSheet);
		row = workSheet.getRow(rowNum);
		cell = row.getCell(colNum);

		style = workBook.createCellStyle();

		style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

		cell.setCellStyle(style);
		fileOutput = new FileOutputStream(xlFile);
		workBook.write(fileOutput);
		workBook.close();
		fileInput.close();
		fileOutput.close();
	}

	public static void fillRedColor(String xlFile, String xlSheet, int rowNum, int colNum) throws IOException {
		fileInput = new FileInputStream(xlFile);
		workBook = new XSSFWorkbook(fileInput);
		workSheet = workBook.getSheet(xlSheet);
		row = workSheet.getRow(rowNum);
		cell = row.getCell(colNum);

		style = workBook.createCellStyle();

		style.setFillForegroundColor(IndexedColors.RED.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

		cell.setCellStyle(style);
		fileOutput = new FileOutputStream(xlFile);
		workBook.write(fileOutput);
		workBook.close();
		fileInput.close();
		fileOutput.close();
	}
	
	public static void fillYellowColor(String xlFile, String xlSheet, int rowNum, int colNum) throws IOException {
		fileInput = new FileInputStream(xlFile);
		workBook = new XSSFWorkbook(fileInput);
		workSheet = workBook.getSheet(xlSheet);
		row = workSheet.getRow(rowNum);
		cell = row.getCell(colNum);

		style = workBook.createCellStyle();

		style.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

		cell.setCellStyle(style);
		fileOutput = new FileOutputStream(xlFile);
		workBook.write(fileOutput);
		workBook.close();
		fileInput.close();
		fileOutput.close();
	}

}
