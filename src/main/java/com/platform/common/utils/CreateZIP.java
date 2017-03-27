package com.platform.common.utils;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CreateZIP {
	/**
	* @Description:将Excel打包成.zip的形式提供下载
	* @param createExcelPath:生成Excel的地址
	* @param createZipPath:生成.zip的地址
	*/ 
	public static void createZip(List<File> fileList ,  String createZipPath){
		try {
System.out.println(" zip  的 输出路径 ：" + createZipPath );			
			ZipOutputStream zipOut = null; 
			zipOut = new ZipOutputStream(new FileOutputStream(createZipPath));
			for(File file : fileList ){
				
				BufferedInputStream  input = new BufferedInputStream(new FileInputStream(file)) ;  // 将字节流 放入缓冲区
				zipOut.putNextEntry(new ZipEntry(file.getName()));
				
				int temp = 0;
				while ((temp = input.read()) != -1) { 
					zipOut.write(temp);
				}
				input.close(); 
			}
			zipOut.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) {
		
		
		String dtbPath = "G:123.dtb"  ;
		String pdfPath = "G:123.pdf"  ;
		
		String zipPath = "G:123.zip"  ;
		
		
		File dtbFile  = new File(dtbPath); 
		File pdfFile = new File(pdfPath); 
		//InputStream input = new FileInputStream(zipFile);
		
		List<File> fileList = new ArrayList<File>() ;
		fileList.add(dtbFile) ;
		fileList.add(pdfFile) ;
		
		createZip( fileList , zipPath ) ;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
