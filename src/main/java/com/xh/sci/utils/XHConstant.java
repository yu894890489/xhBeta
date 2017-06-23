package com.xh.sci.utils;

public class XHConstant {
	
	//******************  系统登录信息   ******************
	
	public static final String ACCOUNT_OR_PASSWORD_ERROR = "用户名或密码错误！";
	public static final String VALIDATECODE_ERROR = "验证码不正确！";
	public static final String VALIDATECODE_INVALID = "验证码已失效！";
	public static final String NO_ACCOUNT = "找不到该用户！";
	public static final String UNACTIVATED = "该用户已注册，请等待管理员审核……";
	
	public static final String LOGIN_SUCCESS = "登录成功！";
	public static final String LOGIN_FAIL = "登录失败！";
	public static final String PHONE_EXIST = "手机号已存在！";
	public static final String REGISTER_OK = "注册成功";
	
	public static final String CURR_USER = "currUser";// 当前用户
	public static final String CURR_USER_URL_LIST = "currUserUrlList";// 当前用户所能访问URL
	public static final String CURR_USER_ROLE_LIST = "currUserRoleList";// 当前用户全部角色
	
	public static final String CURR_USER_ROLE_ID = "currUserRoleId";// 当前用户角色ID
	public static final String CURR_USER_ROLE_IDENTIFY = "currUserRoleIdentify";// 当前用户角色标识
	
	//重置密码
	public static final String RESET_PASSWORD = "123456";
	
	public static final String MENU_CATEGORY_ID_SYS = "sys";
	
	
	/**
	 * 调课、请假审核时间  0:00- 12:00
	 */
	public static Integer[] COURSE_AUDIT_TIME = {0,12};
	
	//调课源
	public static final String TRANSFER_SRC_STUDENT = "student";
	public static final String TRANSFER_SRC_SYSTEM = "system";
	
	
	//******************  系统配置 ！   ******************
	/**
	 * 系统标题名称
	 */
	public static final String SYS_TITLE_NAME = "sys_title_name";
	
	/**
	 * 角色标识
	 */
	//系统管理员 ROLE_ID
	public static final String SYS_ROLE_ID_SYS_MANAGER = "sysRoleId_sysManager";
	//机构管理员 ROLE_ID
	public static final String SYS_ROLE_ID_ORG_MANAGER = "sysRoleId_orgManager";
	//老师 ROLE_ID
	public static final String SYS_ROLE_ID_TEACHER = "sysRoleId_teacher";
	//学生 ROLE_ID
	public static final String SYS_ROLE_ID_STUDENT = "sysRoleId_student";
	
	/**
	 * 文件上传验证
	 */
	//允许上传 文件 的MIME类型
	public static final String ACCEPT_FILE_MIME = "accept_file_mime";
	//允许上传 文件 的后缀名
	public static final String ACCEPT_FILE_SUFFIX = "accept_file_suffix";
	
	//允许上传 image 的MIME类型
	public static final String ACCEPT_IMAGE_MIME = "accept_image_mime";
	//允许上传 image 的后缀名
	public static final String ACCEPT_IMAGE_SUFFIX = "accept_image_suffix";
	//上传文件保存物理路径
	public static final String UPLOAD_BASE_DIR = "upload_base_dir";
	
	//上传图片缩略图的前缀 add by lixh 2016-9-27
	public static final String UPLOAD_IMG_THUMB_PREFIX = "thumb-";
	
	public static final int UPLOAD_IMG_THUMB_WIDTH = 100;
	
	public static final int UPLOAD_IMG_THUMB_HEIGHT = 100;
	
	
	//临时文件夹
	public static final String TEMP = "temp";
	
	//允许上传 Excel 的MIME类型
	public static final String ACCEPT_EXCEL_MIME = "accept_excel_mime";
	//允许上传 Excel 的后缀名
	public static final String ACCEPT_EXCEL_SUFFIX = "accept_excel_suffix";
	
	//允许上传文件的大小限制
	public static final String ACCEPT_FILE_SIZE_LIMIT = "accept_file_size_limit";
	
	
	
	//********************************  文件上传验证 ！   **********************************
	
	public static final String FILE_SIZE_EXCEED = "文件大小不能超过";
	//存储单位  M
	public static final String FILE_UNIT_M = "M"; 
	//存储单位为1024进制。
	public static final long FILE_HEX = 1024;
	//存储单位1024 二次方：  1024*1024。
	public static final long FILE_HEX_TWO_POWER = 1048576;
	
	//********************************  自动签到、评价 ！   **********************************
	/**
	 * 自动签到、评价
	 */
	public static final String AUTO_SIGN_EVALUATE = "auto_sign_evaluate";
	
	
	//******************   短信接口用户名、密码 ***************************
	public static String ENCODING = "UTF-8";
	public static  final String API_KEY = "b23a1d958ab15ee29ee8d9a5a37fd903";
	public static final String SHORTMESSAGE_SERVICE_ID ="skyme8788";
	public static final String SHORTMESSAGE_SERVICE_PASSWD ="8613128";
	//******************   AJAX 返回 JSON 信息 ***************************
	
	public static final String SUCCESS = "success";
	public static final String FAIL = "fail";

	public static final String SAVE_SUCCESSED = "保存成功！";
	public static final String SAVE_FAIL = "保存失败！";
	
	public static final String CONNECT_SUCCESSED= "连接成功！";
	public static final String CONNECT_FAIL = "连接失败！";

	public static final String UPDATE_SUCCESSED = "修改成功！";
	public static final String UPDATE_FAIL = "修改失败！";

	public static final String DELETE_SUCCESSED = "删除成功！";
	public static final String DELETE_FAIL = "删除失败！";

	public static final String OPERATE_SUCCESSED = "操作成功！";
	public static final String OPERATE_FAIL = "操作失败！";

	public static final String SUBMIT_SUCCESSED = "提交成功！";
	public static final String SUBMIT_FAIL = "提交失败！";

	public static final String UPLOAD_SUCCESSED = "上传成功！";
	public static final String UPLOAD_FAIL = "上传失败！";
	
	public static final String SORT_SUCCESSED = "排序成功！";
	public static final String SORT_FAIL = "排序失败！";
	
	public static final String SIGN_SUCCESSED = "签到成功！";
	public static final String SIGN_FAIL = "签到失败！";
	
	public static final String REFRESH_SUCCESSED = "刷新成功！";
	
	public static final String QUARTZ_SUCCESSED = "启动定时任务成功！";
	public static final String QUARTZ_REMOVE_SUCCESSED = "关闭定时任务成功！";
	
	public static final String SAVE_FILE_TO_DIR_FAIL = "保存文件至磁盘失败！";
	public static final String DELETE_FILE_FROM_DIR_FAIL = "删除磁盘文件失败！";
	
	//******************  数据库记录状态 ！   ***************************

	public static final String Y = "Y";// 使用标记
	public static final String N = "N";// 删除标记
	public static final String S = "S";// 特殊标记  Special -- root使用
	
	// 受影响的行数
	public static final int ZERO = 0;
	public static final int ONE = 1;
	
	//自动评价五星
	public static final int FIVE = 5;
	
	
	//*********************  排序字段   !  *******************************

	//CREATE_TIME
	public static final String CREATE_TIME = "CREATE_TIME";
	public static final String CREATE_TIME_DESC = "CREATE_TIME DESC";
	public static final String MODIFY_TIME = "MODIFY_TIME";
	public static final String MODIFY_TIME_DESC = "MODIFY_TIME DESC";
	//SORT_KEY
	public static final String SORT_KEY = "SORT_KEY";
	public static final String SORT_KEY_DESC = "SORT_KEY DESC";
	//SORT_KEY, CREATE_TIME
	public static final String SORT_KEY_CREATE_TIME = "SORT_KEY, CREATE_TIME";
	public static final String SORT_KEY_CREATE_TIME_DESC = "SORT_KEY, CREATE_TIME DESC"; //字典、设备自定义属性、场景模块关联表 使用！
	
	//默认分页大小
	public static final int DEFAULT_PAGE_SIZE = 10;
	//分页请求路径
	public static final String PAGE_SERVLET_PATH = "pageServletPath";


	
	
	//******************  encoding  字符编码 ！  **********************
	
	public static final String ISO_8859_1 = "ISO-8859-1";
	public static final String GBK = "GBK";
	public static final String UTF_8 = "UTF-8";
	
	
	
	//******************  用于 String 方法 ！  **********************
	
	/**
	 * 空字符串
	 */
	public static final String EMPTY = "";
	/**
	 * 百分号，用于 模糊查询
	 */
	public static final String PERCENT = "%";
	/**
	 * 逗号，用于 split(",")
	 */
	public static final String COMMA = ",";
	/**
	 * 点，用于 lastIndexOf(".")
	 */
	public static final String DOT = ".";
	/**
	 * 冒号，用于excel导出的split(":")
	 */
	public static final String COLON = ":";
	
	
	//**********************   excel 导入、导出！   ***************************
	
	//用户代理
	public static final String USER_AGENT = "USER-AGENT";
	//用户代理
	public static final String DOT_XLS = ".xls";
	//指示 MIME 用户代理如何显示附加的文件。
	public static final String CONTENT_DISPOSITION = "Content-Disposition";
	//response 的contentType
	public static final String OCTET_STREAM = "application/octet-stream;charset=UTF-8";
	
	public static final String SUMMARY_REPORT = "概要报告";
	public static final String DETAILED_REPORT = "详细报告";
	public static final String SCRIPT_RECORD = "脚本记录";
	
	
	//******************  超级管理员 ！   ********************
	
	//超级管理员  登录账号
	public static final String ROOT_USER_ACC = "root";
	public static final String ROOT_USER_NAME = "超级管理员";
	//超级管理员  主键
	public static final String ROOT_USER_ID="00000000000000000000000000000000";
	//超级管理员  密码
	public static final String ROOT_PASSWORD="xhrj@2016";
	
}