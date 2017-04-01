package com.platform.common.utils;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.UUID;

import org.springframework.web.multipart.MultipartFile;

public class UploadUtil {

	public static String randomName() {
		UUID uuid = UUID.randomUUID();
		return uuid.toString().replaceAll("-", "");
	}

	public static String fileName;

	/**
	 * 文件上传 从新给文件命名
	 */
	public static String saveFile(MultipartFile file, String filePath, String user_id) {

		if (!file.isEmpty()) {
			try {
				
				//fileName = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
				String type = file.getOriginalFilename().indexOf(".") != -1 ? file.getOriginalFilename().substring(
						file.getOriginalFilename().lastIndexOf("."), file.getOriginalFilename().length()) : null;
				fileName = type.toLowerCase();
				
				System.out.println("filePath-----"+filePath);
				String fileName1 = user_id + fileName;
				File f = new File(filePath, fileName1);
				if (f.exists()) {
					f.delete();
				}
				file.transferTo(f);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return fileName;
	}
	
	
	/**
	 * 文件上传 从新给文件命名 返回改名后的文件名称
	 */
	public static String saveNewFile(MultipartFile file, String filePath, String user_id) {
		File f = null;
		if (!file.isEmpty()) {
			try {
				
				//fileName = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
				String type = file.getOriginalFilename().indexOf(".") != -1 ? file.getOriginalFilename().substring(
						file.getOriginalFilename().lastIndexOf("."), file.getOriginalFilename().length()) : null;
				fileName = type.toLowerCase();
				
				
				String fileName1 = user_id + fileName;
				f = new File(filePath, fileName1);
				if (f.exists()) {
					f.delete();
				}
				file.transferTo(f);
				return f.getName();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return f.getName();
	}
	
	/**
	 * 上传文件，文件名字不变
	 */
	public static String saveFile2(MultipartFile file, String filePath) {

		String fileName1 = file.getOriginalFilename();

		if (!file.isEmpty()) {
			try {
				File f = new File(filePath, fileName1);
				if (f.exists()) {
					f.delete();
				}
				file.transferTo(f);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return fileName1;
	}

	/*****
	 * 图片清晰度1
	 * 
	 * @throws IOException
	 *****/
	public static void img_01(MultipartFile file, String filePath, String user_id_01, String user_id)
			throws IOException {

		String url = UploadUtil.saveFile(file, filePath, user_id_01);

		System.out.println("图片一的  地址 ：" + filePath + "\\" + (user_id_01 + url));
		UploadUtil.img_max(3000, 3000, filePath, user_id_01 + url, user_id + url);
	}

	/******
	 * 图片清晰度2
	 * 
	 * @throws IOException
	 ****/
	public static void img_02(MultipartFile file, String filePath, String user_id_02, String user_id)
			throws IOException {

		String url = UploadUtil.saveFile(file, filePath, user_id_02);

		UploadUtil.img_max(2000, 2000, filePath, user_id_02 + url, user_id + url);

	}

	/**
	 * @throws IOException
	 *******/
	@SuppressWarnings("deprecation")
	public static void img_max(int weight, int height, String filepath, String imgname, String user_id)
			throws IOException {

		System.out.println("开始：" + new Date().toLocaleString());

		ImgCompress imgCom = new ImgCompress(filepath, imgname, user_id);
		imgCom.resizeFix(weight, height);

		System.out.println("结束：" + new Date().toLocaleString());
	}

	/***
	 * 验证图片格式
	 */
	public static boolean YzImgType(MultipartFile user_img) {

		String type = user_img.getOriginalFilename().indexOf(".") != -1 ? user_img.getOriginalFilename().substring(
				user_img.getOriginalFilename().lastIndexOf("."), user_img.getOriginalFilename().length()) : null;
		type = type.toLowerCase();
		if (type.equals(".jpg") || type.equals(".jpeg") || type.equals(".png")) {

			return true;
		} else {

			return false;
		}

	}

	/***
	 * 验证Excel格式
	 */
	public static boolean YzXlsType(MultipartFile user_xls) {

		String type = user_xls.getOriginalFilename().indexOf(".") != -1 ? user_xls.getOriginalFilename().substring(
				user_xls.getOriginalFilename().lastIndexOf("."), user_xls.getOriginalFilename().length()) : null;
		type = type.toLowerCase();
		if (type.equals(".xls")) {

			return true;
		} else {

			return false;
		}
	
	}
	/***
	 * 验证Excel格式
	 */
	public static String YzExcelType(MultipartFile user_xls) {
		
		String type = user_xls.getOriginalFilename().indexOf(".") != -1 ? user_xls.getOriginalFilename().substring(
				user_xls.getOriginalFilename().lastIndexOf("."), user_xls.getOriginalFilename().length()) : null;
				type = type.toLowerCase();
			return type;
				
	}
	
	/***
	 * 验证PDF格式
	 */
	public static boolean YzPdfType(MultipartFile user_xls) {
		
		String type = user_xls.getOriginalFilename().indexOf(".") != -1 ? user_xls.getOriginalFilename().substring(
				user_xls.getOriginalFilename().lastIndexOf("."), user_xls.getOriginalFilename().length()) : null;
				type = type.toLowerCase();
				
				if(type.equals(".pdf")){
					return true ;
				}
			return false ;
	}
	/***
	 * 验证dtb格式
	 */
	public static boolean YzDtbType(MultipartFile user_xls) {
		
		String type = user_xls.getOriginalFilename().indexOf(".") != -1 ? user_xls.getOriginalFilename().substring(
				user_xls.getOriginalFilename().lastIndexOf("."), user_xls.getOriginalFilename().length()) : null;
				type = type.toLowerCase();
				
				if(type.equals(".dtb")){
					return true ;
				}
			return false ;
	}
	
	
	
	

	/***
	 * 删除文件
	 */
	public static boolean delFile(String filepath) {     // 文件的路径
		System.out.println(filepath+"  删除文件路径");
		File file = new File(filepath);
		// 如果文件路径所对应的文件存在，并且是一个文件，则直接删除
		if (file.exists() && file.isFile()) {
			if (file.delete()) {
				System.out.println("删除单个文件" + filepath + "成功！");
				return true;
			} else {
				System.out.println("删除单个文件" + filepath + "失败！");
				return false;
			}
		} else {
			System.out.println("删除单个文件失败：" + fileName + "不存在！");
			return false;
		}
		
	}

}
