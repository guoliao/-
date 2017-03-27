package com.platform.common.utils;

import java.util.HashMap;
import java.util.Map;

public class MapModel {   // model 模型
	
	
	public static Map<String, Object>  getMapModel(Object value1 , Object value2 ,Object value3 ){
		
		 Map<String, Object>  resultMap = new HashMap<String, Object>() ;
		 resultMap.put("Success", value1) ;
		 resultMap.put("Data", value2) ;
		 resultMap.put("error", value3 ) ;
		
		return resultMap ;
		
	}
	
	
	public static Map<String, Object>  getMapModel2(Object value1 , Object value2 ,Object value3,Object value4 ){
		
		 Map<String, Object>  resultMap = new HashMap<String, Object>() ;
		 resultMap.put("Success", value1) ;
		 resultMap.put("DataDtb", value2) ;
		 resultMap.put("DataPdf", value3) ;
		 resultMap.put("error"  , value4 ) ;
		
		return resultMap ;
		
	}
	
	

}
