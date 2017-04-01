package com.platform.common.contants;

/***
 * 
 * @author 
 *
 */
public class Constants {


    /* 分页操作时，每页只显示10条 */
    public static final Integer PAGE_SIZE = 10;
    
    //重定向
    public static final String YU="redirect:/";
    
    
	
    /**
     * Session  存储用户 key 值
     */
    public static  final String SESSION_USER = "user" ;  // 
    public static  final String SESSION_CHECKNUM = "checkNum" ;  // 验证码
    public static  final String SESSION_USER_APP = "APP_user";   //app用户
    
    
    /**
	 * 本地文件上传 地址
	 * 
	 */                                                           
	public static final String UPLOAD_USER_SINESSLICENSES_PATH = "/resources/upload/user";    //贴吧图片
	public static final String UPLOAD_XLS_PATH = "/resources/upload/xls";
	public static final String UPLOAD_PDF_PATH = "/resources/upload/pdf";
	public static final String UPLOAD_DTB_PATH = "/resources/upload/data";
	public static final String UPLOAD_ZIP_PATH = "/resources/upload/zip";
	public static final String UPLOAD_APK_PATH = "/resources/upload/apk";
	
	
	/**
	 * 阿里ＯＳＳ文件上传 地址
	 * 
	 */
	public static final String UP_OSS_FILEPATH_PDF = "resources/pdf/"   ;    // pdf
	public static final String UP_OSS_FILEPATH_DTB = "resources/dtb/"   ;    // dtb
	public static final String UP_OSS_FILEPATH_ZIP = "resources/zip/"   ;    // zip
	public static final String UP_OSS_FILEPATH_APK = "resources/apk/"   ;    // apk
	public static final String UP_OSS_FILEPATH_EXE = "resources/exe/"   ;    // apk
	
	
	
	
	
	/**
	 * 
	 * mail
	 * 
	 */
	public static final String Mail_Server_Host = "smtp.163.com" ; //"smtp.mxhichina.com"; //邮件服务器地址
	public static final String Mail_Server_Port ="25";             //邮件服务器端口
	public static final String Mail_UserName =  "13998641323"   ;//"agui@dengzixu.com";   //邮件用户名
	public static final String Mail_Password = "1216guikeer" ;  // "Agui123456789";   //邮件密码
	public static final String Mail_FromAddress ="13998641323@163.com" ; // "agui@dengzixu.com";   //发送邮件地址
	public static final String Mail_Subject_Success ="审核通过";   //邮件标题成功
	public static final String Mail_Subject_Fail="审核未通过";   //邮件标题失败
	public static final String Mail_Contents_Enterprise="账号审核通过,请登录!<p>http://www.hroop.com/views/index/HR.jsp</p>";   //邮件内容
	public static final String Mail_Contents_Enterprise_DENY="账号审核失败,请重新注册!<p>http://www.hroop.com/views/index/hrRegister.jsp</p>";   //邮件内容
	public static final String Mail_Contents_School="学校审核通过账号，密码";   //邮件内容

    
	
	/**
	 * 帖子发布状态 1  ：在线  2： 删除
	 */
	public static final int POST_TYPE_YOU= 1;
	public static final int POST_TYPE_WU= 2;
	
	
	
	/**
	 * 推送消息类别 ：1，帖子评论 2，帖子被升级
	 */
	public static final int Post_User_Comment = 1;
	public static final int Post_User_upate = 2;

	
	
	
	/**
	 * 贴吧 用户等级： 1 管理员 ， 2用户
	 */
	public static final int USER_Level_NumberOne  = 1;
	public static final int USER_Level_NumberTwo  = 2 ;
	
	
	
	/**
	 * 管理员置顶  ：置顶 1 ， 不置顶2
	 */
	public static final int User_Type_ZD= 1;
	public static final int User_Type_BZD = 2;
	
	
	/**
	 * 表名基本信息
	 */
	public static final String T_HOSPITAL = "t_hospital_" ;                          // 医院诊所
	public static final String T_DEVICE = "t_device_" ;                              // 设备
	public static final String T_DEVICE_STATE = "t_device_state_" ;                  // 设备存在状态 （干掉）
	public static final String T_DEVICE_TEST_RESULT  = "t_device_test_result_" ;     // 设备检测结果  (待定)
	public static final String T_STERILIZATION  = "t_sterilization_" ;               // 灭菌效果包
	public static final String T_STERILIZATION_DEVICE  = "t_sterilization_device_" ; // 灭菌设备检测
	public static final String T_DISINFECTED  = "t_disinfected_" ;                   // 消毒效果包
	public static final String T_UV  = "t_uv_" ;                                     // 紫外效果包
	public static final String T_BD_TEST  = "t_bd_test_" ;                           // bd测试
	public static final String T_ATP_TEST  = "t_atp_test_" ;                         // atp测试包
	public static final String T_ATP_TEST_SON  = "t_atp_test_son_" ;                 // atp子类测试包
	
	
	/**
	 * 卫监单位  和 医院 生成的uuID 前缀 拼接的常量
	 * QZ : ID的前缀
	 */
	public static final String Employers_QZ = "W"  ;         // 卫生监测
	public static final String Hospital_QZ_YY = "YY"  ;       // 医院
	public static final String Hospital_QZ_ZS = "ZS"  ;       // 诊所
	public static final String Hospital_QZ_QT = "QT"  ;       // 其他
	
	
	
	/**
	 * 地图画色
	 */
	public static final String COLOR_TYPE_GRAY = "#bbb9b7"  ;            // 灰色
	public static final String COLOR_TYPE_RED = "#ff0000"  ;             // 红色
	public static final String COLOR_TYPE_ORANGE = "#ff6700"  ;          // 橙色
	public static final String COLOR_TYPE_YELLOW = "#ffd800"  ;          // 黄
	public static final String COLOR_TYPE_green = "#66ff00"  ;           // 浅绿
	public static final String COLOR_TYPE_Green = "#018824"  ;           // 深绿
	
	public static final String [] type = {"mj_","xd_","mjsb_","bd_","atp_","zw_"}   ;
	
	
   /**
    * redis  省市区  Key
    */
	public static final String RedisSet_SellerKey = "China"  ;     
	public static final String RedisSet_AdminKey = "ProvinceData"  ;     
	
	
	/**
	 * 管理员设定 数据包 检测时间 天数 
	 */
	public static  int DAY_NUMBER_FLUSH = 3  ;         //  刷新天数
	
	 
	
	/**
	 *用户权限判定
	 */
    public static String USER_ROLE_COUNTRY = "country"  ;     //全国
    public static String USER_ROLE_PROVINCE = "province"  ;   //省
    public static String USER_ROLE_CITY = "city"  ;           //市
    public static String USER_ROLE_AREA = "area"  ;           //区
    public static String USER_ROLE_HOSPITAL = "hospital"  ;   //医疗集团
	
	
	
	
	
	/**
	 * APP更新的路径
	 */
	
	public static String appUpdateUrl = "http://zhwj.oss-cn-beijing.aliyuncs.com/app/%E5%8D%AB%E7%94%9F%E7%9B%91%E6%B5%8B.apk";            //APP更新的路径
	
	
	
	/**
	 * 贴吧信息推送 ： 1 帖子评论 ， 2帖子被升级
	 */
	public static final String post_comment  = "1" ;
	public static final String post_ries     = "2" ;
	
	
	/**
	 *消息推送 ： 1 已读 ， 2未读
	 */
	public static final String isRead  = "1" ;
	public static final String noRead  = "2" ;
	
	
	/**
	 *消息推送  Title
	 */
	public static final String Title_01  = "监测到未合格数据上传" ;
	public static final String Title_02  = "不合格率超出预警值" ;
	public static final String Title_03  = "数据有效期过期提醒" ;
	
	/**
	 *消息推送  类别
	 */
	public static final int type_01  = 1 ;    // 推送1
	public static final int type_02  = 2 ;    // 推送2
	public static final int type_03  = 3 ;    // 推送3
	public static final int type_04  = 4 ;    // 推送4
	public static final int type_05  = 5 ;    // 推送5
	
	
	/**
	 * 设定 推送1   推送的间隔时间
	 */
	public static final int month_one    = 1 ;    // 推送1    一个月一推送
	public static final int month_three  = 3 ;    // 推送1    三个月一推送
	public static final int month_six    = 6 ;    // 推送1    六个月一推送
	
	
	/**
	 * 不同级别管理员 批量下载PDF --ZIP在OSS上存放的路径
	 */
	public static final String UP_OSS_PDFs_SystemAdmin = UP_OSS_FILEPATH_ZIP + "pdfs/SystemAdmin/PDF文件.zip";		//系统管理员
	public static final String UP_OSS_PDFs_CountryAdmin = UP_OSS_FILEPATH_ZIP + "pdfs/CountryAdmin/PDF文件.zip";	//国家管理员
	public static final String UP_OSS_PDFs_ProvinceAdmin = UP_OSS_FILEPATH_ZIP + "pdfs/ProvinceAdmin/PDF文件.zip";	//省级管理员
	public static final String UP_OSS_PDFs_CityAdmin = UP_OSS_FILEPATH_ZIP + "pdfs/CityAdmin/PDF文件.zip";			//市级管理员
	public static final String UP_OSS_PDFs_AreaAdmin = UP_OSS_FILEPATH_ZIP + "pdfs/AreaAdmin/PDF文件.zip";			//区级管理员
	public static final String UP_OSS_PDFs_HealthcareAdmin = UP_OSS_FILEPATH_ZIP + "pdfs/HealthcareAdmin/PDF文件.zip";	//医疗集团管理员
	
	
	
	
}
