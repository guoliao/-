package com.platform.common.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcle {
	
	
	
	/**
	 * 读取Excel  .xls 
	 * @param excelPath
	 */
	@SuppressWarnings("resource")
	public static HSSFSheet readExcel(String excelPath) {
		
		POIFSFileSystem fs;
		HSSFSheet sheet = null ; 
//		try {
//			fs = new POIFSFileSystem(new FileInputStream(excelPath));//读取Excel对象
//
//			HSSFWorkbook wb = new HSSFWorkbook(fs);//获取工作薄
//			
//			for(int i=0;i< wb.getNumberOfSheets(); i++){
//				System.out.println("第 "+ i+ "个sheet");
//				 sheet=wb.getSheetAt(i);
//				
//				//lsStrings =  ReadExcle.readExcelData(sheet);   //获取Excel的值插入到数据库
//		
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
	
		
		try {
			fs = new POIFSFileSystem(new FileInputStream(excelPath));//读取Excel对象

			HSSFWorkbook wb = new HSSFWorkbook(fs);//获取工作薄
			
			int ActivitySheet_num = wb.getActiveSheetIndex() ;
		System.out.println("活跃的 Sheet 的 下标 ：" + ActivitySheet_num );	
			
			//for(int i = 0 ; i< wb.getNumberOfSheets() ; i++){
				
				 sheet = wb.getSheetAt(ActivitySheet_num);
				
				//lsStrings =  ReadExcle.readExcelData(sheet);   //获取Excel的值插入到数据库
		
			//}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		
		
		return sheet  ;
		
	}
	
	
	
	
	
	/**
	 * 获取Excel里面的数据
	 * @param sheet
	 * @param userSchoolMapper
	 */
	public static  List<String> readExcelData(HSSFSheet sheet , int j){
		
		List<String>  datas  =  new  ArrayList<String>() ;
		
		    int  last = sheet.getRow(0).getLastCellNum();
	System.out.println("这个 Excel 模板 第 0 行  有 " + last +" 列-----");	    
			HSSFRow hssfRow = sheet.getRow(j);
			
			for (int cellNum = 0 ; cellNum <= last ; cellNum++) {
				System.out.println("第 " + j + "行  第   " + cellNum + " 列   ------是  String"  );
				HSSFCell hssfCell = hssfRow.getCell(cellNum);
				if(null!=hssfCell)
				hssfCell.setCellType(HSSFCell.CELL_TYPE_STRING);
				if (hssfCell == null|| "".equals(hssfCell)) {
					String a = "" ;
					datas.add(a); System.out.println("第 " + j + "行  第   " + cellNum + " 列   有 空值------");
					continue;
				}
				String cellValue = "";
				
				if (hssfCell.getCellType() == HSSFCell.CELL_TYPE_STRING) {
					System.out.println("第 " + j + "行  第   " + cellNum + " 列 ------是  数值"  );
					cellValue = hssfCell.getStringCellValue();
					if (cellValue.trim().equals("") || cellValue.trim().length() <= 0) {
						String a = "" ;
						datas.add(a);System.out.println("第 " + j + "行  第   " + cellNum + " 列   有 空值------");
						continue;
					}
					System.out.println("cellValue="+cellValue);
				}
				
				
				if (hssfCell.getCellType() == HSSFCell.CELL_TYPE_NUMERIC) {
					cellValue = ""+hssfCell.getNumericCellValue();     
					if (cellValue.trim().equals("") || cellValue.trim().length() <= 0) {
						String a = "" ;
						datas.add(a);System.out.println("第 " + j + "行  第   " + cellNum + " 列   有 空值------");
						continue;
					}
					System.out.println("cellValue="+cellValue);
				}
				
				
				datas.add(cellValue);
			 }
		 
		 return  datas ;
	}
	
	

	
	
	/**
	 * 读取Excel  .xlsx
	 * @param excelPath
	 */
	@SuppressWarnings("resource")
	public static XSSFSheet readExcelXlsx(String excelPath) {
		
		//POIFSFileSystem fs;
		XSSFSheet sheet = null ;
		try {
			//fs = new POIFSFileSystem(new FileInputStream(excelPath));//读取Excel对象

			XSSFWorkbook wb = new XSSFWorkbook( new FileInputStream(excelPath) );//获取工作薄
			int ActivitySheet_num = wb.getActiveSheetIndex() ;
			System.out.println("活跃的 Sheet 的 下标 ：" + ActivitySheet_num );	
				
			//for(int i = 0 ; i< wb.getNumberOfSheets() ; i++){
					
					 sheet = wb.getSheetAt(ActivitySheet_num);
	        
			//}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return sheet  ;
		
	}
	
	
	
	/**
	 * 获取Excel   .xlsx 里面的数据
	 * @param sheet
	 * @param userSchoolMapper
	 */
	public static  List<String> readExcelDataXlsx(XSSFSheet sheet , int j){
		
		List<String>  datas  =  new  ArrayList<String>() ;
		
			XSSFRow hssfRow = sheet.getRow(j);
			
			for (int cellNum = 0; cellNum <= hssfRow.getLastCellNum(); cellNum++) {
				XSSFCell hssfCell = hssfRow.getCell(cellNum);
				if(null!=hssfCell)
					hssfCell.setCellType(HSSFCell.CELL_TYPE_STRING);
				
				if (hssfCell == null|| "".equals(hssfCell)) {
					String a = "" ;
					datas.add(a); System.out.println("第 " + j + "行  第   " + cellNum + " 列   有 空值------");
					continue;
				}
				String cellValue = "";
				
				if (hssfCell.getCellType() == HSSFCell.CELL_TYPE_STRING) {
					cellValue = hssfCell.getStringCellValue();
					if (cellValue.trim().equals("") || cellValue.trim().length() <= 0) {
						String a = "" ;
						datas.add(a); System.out.println("第 " + j + "行  第   " + cellNum + " 列   有 空值------");
						continue;
					}
					System.out.println("cellValue="+cellValue);
				}
				
				
				if (hssfCell.getCellType() == HSSFCell.CELL_TYPE_NUMERIC) {
					cellValue = ""+hssfCell.getNumericCellValue();     
					if (cellValue.trim().equals("") || cellValue.trim().length() <= 0) {
						String a = "" ;
						datas.add(a); System.out.println("第 " + j + "行  第   " + cellNum + " 列   有 空值------");
						continue;
					}
					System.out.println("cellValue="+cellValue);
				}
				
				
				datas.add(cellValue);
			 }
		 
		 return  datas ;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
