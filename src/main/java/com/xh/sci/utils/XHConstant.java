package com.xh.sci.utils;

public class XHConstant {
	
	//******************  ϵͳ��¼��Ϣ   ******************
	
	public static final String ACCOUNT_OR_PASSWORD_ERROR = "�û������������";
	public static final String VALIDATECODE_ERROR = "��֤�벻��ȷ��";
	public static final String VALIDATECODE_INVALID = "��֤����ʧЧ��";
	public static final String NO_ACCOUNT = "�Ҳ������û���";
	public static final String UNACTIVATED = "���û���ע�ᣬ��ȴ�����Ա��ˡ���";
	
	public static final String LOGIN_SUCCESS = "��¼�ɹ���";
	public static final String LOGIN_FAIL = "��¼ʧ�ܣ�";
	public static final String PHONE_EXIST = "�ֻ����Ѵ��ڣ�";
	public static final String REGISTER_OK = "ע��ɹ�";
	
	public static final String CURR_USER = "currUser";// ��ǰ�û�
	public static final String CURR_USER_URL_LIST = "currUserUrlList";// ��ǰ�û����ܷ���URL
	public static final String CURR_USER_ROLE_LIST = "currUserRoleList";// ��ǰ�û�ȫ����ɫ
	
	public static final String CURR_USER_ROLE_ID = "currUserRoleId";// ��ǰ�û���ɫID
	public static final String CURR_USER_ROLE_IDENTIFY = "currUserRoleIdentify";// ��ǰ�û���ɫ��ʶ
	
	//��������
	public static final String RESET_PASSWORD = "123456";
	
	public static final String MENU_CATEGORY_ID_SYS = "sys";
	
	
	/**
	 * ���Ρ�������ʱ��  0:00- 12:00
	 */
	public static Integer[] COURSE_AUDIT_TIME = {0,12};
	
	//����Դ
	public static final String TRANSFER_SRC_STUDENT = "student";
	public static final String TRANSFER_SRC_SYSTEM = "system";
	
	
	//******************  ϵͳ���� ��   ******************
	/**
	 * ϵͳ��������
	 */
	public static final String SYS_TITLE_NAME = "sys_title_name";
	
	/**
	 * ��ɫ��ʶ
	 */
	//ϵͳ����Ա ROLE_ID
	public static final String SYS_ROLE_ID_SYS_MANAGER = "sysRoleId_sysManager";
	//��������Ա ROLE_ID
	public static final String SYS_ROLE_ID_ORG_MANAGER = "sysRoleId_orgManager";
	//��ʦ ROLE_ID
	public static final String SYS_ROLE_ID_TEACHER = "sysRoleId_teacher";
	//ѧ�� ROLE_ID
	public static final String SYS_ROLE_ID_STUDENT = "sysRoleId_student";
	
	/**
	 * �ļ��ϴ���֤
	 */
	//�����ϴ� �ļ� ��MIME����
	public static final String ACCEPT_FILE_MIME = "accept_file_mime";
	//�����ϴ� �ļ� �ĺ�׺��
	public static final String ACCEPT_FILE_SUFFIX = "accept_file_suffix";
	
	//�����ϴ� image ��MIME����
	public static final String ACCEPT_IMAGE_MIME = "accept_image_mime";
	//�����ϴ� image �ĺ�׺��
	public static final String ACCEPT_IMAGE_SUFFIX = "accept_image_suffix";
	//�ϴ��ļ���������·��
	public static final String UPLOAD_BASE_DIR = "upload_base_dir";
	
	//�ϴ�ͼƬ����ͼ��ǰ׺ add by lixh 2016-9-27
	public static final String UPLOAD_IMG_THUMB_PREFIX = "thumb-";
	
	public static final int UPLOAD_IMG_THUMB_WIDTH = 100;
	
	public static final int UPLOAD_IMG_THUMB_HEIGHT = 100;
	
	
	//��ʱ�ļ���
	public static final String TEMP = "temp";
	
	//�����ϴ� Excel ��MIME����
	public static final String ACCEPT_EXCEL_MIME = "accept_excel_mime";
	//�����ϴ� Excel �ĺ�׺��
	public static final String ACCEPT_EXCEL_SUFFIX = "accept_excel_suffix";
	
	//�����ϴ��ļ��Ĵ�С����
	public static final String ACCEPT_FILE_SIZE_LIMIT = "accept_file_size_limit";
	
	
	
	//********************************  �ļ��ϴ���֤ ��   **********************************
	
	public static final String FILE_SIZE_EXCEED = "�ļ���С���ܳ���";
	//�洢��λ  M
	public static final String FILE_UNIT_M = "M"; 
	//�洢��λΪ1024���ơ�
	public static final long FILE_HEX = 1024;
	//�洢��λ1024 ���η���  1024*1024��
	public static final long FILE_HEX_TWO_POWER = 1048576;
	
	//********************************  �Զ�ǩ�������� ��   **********************************
	/**
	 * �Զ�ǩ��������
	 */
	public static final String AUTO_SIGN_EVALUATE = "auto_sign_evaluate";
	
	
	//******************   ���Žӿ��û��������� ***************************
	public static String ENCODING = "UTF-8";
	public static  final String API_KEY = "b23a1d958ab15ee29ee8d9a5a37fd903";
	public static final String SHORTMESSAGE_SERVICE_ID ="skyme8788";
	public static final String SHORTMESSAGE_SERVICE_PASSWD ="8613128";
	//******************   AJAX ���� JSON ��Ϣ ***************************
	
	public static final String SUCCESS = "success";
	public static final String FAIL = "fail";

	public static final String SAVE_SUCCESSED = "����ɹ���";
	public static final String SAVE_FAIL = "����ʧ�ܣ�";
	
	public static final String CONNECT_SUCCESSED= "���ӳɹ���";
	public static final String CONNECT_FAIL = "����ʧ�ܣ�";

	public static final String UPDATE_SUCCESSED = "�޸ĳɹ���";
	public static final String UPDATE_FAIL = "�޸�ʧ�ܣ�";

	public static final String DELETE_SUCCESSED = "ɾ���ɹ���";
	public static final String DELETE_FAIL = "ɾ��ʧ�ܣ�";

	public static final String OPERATE_SUCCESSED = "�����ɹ���";
	public static final String OPERATE_FAIL = "����ʧ�ܣ�";

	public static final String SUBMIT_SUCCESSED = "�ύ�ɹ���";
	public static final String SUBMIT_FAIL = "�ύʧ�ܣ�";

	public static final String UPLOAD_SUCCESSED = "�ϴ��ɹ���";
	public static final String UPLOAD_FAIL = "�ϴ�ʧ�ܣ�";
	
	public static final String SORT_SUCCESSED = "����ɹ���";
	public static final String SORT_FAIL = "����ʧ�ܣ�";
	
	public static final String SIGN_SUCCESSED = "ǩ���ɹ���";
	public static final String SIGN_FAIL = "ǩ��ʧ�ܣ�";
	
	public static final String REFRESH_SUCCESSED = "ˢ�³ɹ���";
	
	public static final String QUARTZ_SUCCESSED = "������ʱ����ɹ���";
	public static final String QUARTZ_REMOVE_SUCCESSED = "�رն�ʱ����ɹ���";
	
	public static final String SAVE_FILE_TO_DIR_FAIL = "�����ļ�������ʧ�ܣ�";
	public static final String DELETE_FILE_FROM_DIR_FAIL = "ɾ�������ļ�ʧ�ܣ�";
	
	//******************  ���ݿ��¼״̬ ��   ***************************

	public static final String Y = "Y";// ʹ�ñ��
	public static final String N = "N";// ɾ�����
	public static final String S = "S";// ������  Special -- rootʹ��
	
	// ��Ӱ�������
	public static final int ZERO = 0;
	public static final int ONE = 1;
	
	//�Զ���������
	public static final int FIVE = 5;
	
	
	//*********************  �����ֶ�   !  *******************************

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
	public static final String SORT_KEY_CREATE_TIME_DESC = "SORT_KEY, CREATE_TIME DESC"; //�ֵ䡢�豸�Զ������ԡ�����ģ������� ʹ�ã�
	
	//Ĭ�Ϸ�ҳ��С
	public static final int DEFAULT_PAGE_SIZE = 10;
	//��ҳ����·��
	public static final String PAGE_SERVLET_PATH = "pageServletPath";


	
	
	//******************  encoding  �ַ����� ��  **********************
	
	public static final String ISO_8859_1 = "ISO-8859-1";
	public static final String GBK = "GBK";
	public static final String UTF_8 = "UTF-8";
	
	
	
	//******************  ���� String ���� ��  **********************
	
	/**
	 * ���ַ���
	 */
	public static final String EMPTY = "";
	/**
	 * �ٷֺţ����� ģ����ѯ
	 */
	public static final String PERCENT = "%";
	/**
	 * ���ţ����� split(",")
	 */
	public static final String COMMA = ",";
	/**
	 * �㣬���� lastIndexOf(".")
	 */
	public static final String DOT = ".";
	/**
	 * ð�ţ�����excel������split(":")
	 */
	public static final String COLON = ":";
	
	
	//**********************   excel ���롢������   ***************************
	
	//�û�����
	public static final String USER_AGENT = "USER-AGENT";
	//�û�����
	public static final String DOT_XLS = ".xls";
	//ָʾ MIME �û����������ʾ���ӵ��ļ���
	public static final String CONTENT_DISPOSITION = "Content-Disposition";
	//response ��contentType
	public static final String OCTET_STREAM = "application/octet-stream;charset=UTF-8";
	
	public static final String SUMMARY_REPORT = "��Ҫ����";
	public static final String DETAILED_REPORT = "��ϸ����";
	public static final String SCRIPT_RECORD = "�ű���¼";
	
	
	//******************  ��������Ա ��   ********************
	
	//��������Ա  ��¼�˺�
	public static final String ROOT_USER_ACC = "root";
	public static final String ROOT_USER_NAME = "��������Ա";
	//��������Ա  ����
	public static final String ROOT_USER_ID="00000000000000000000000000000000";
	//��������Ա  ����
	public static final String ROOT_PASSWORD="xhrj@2016";
	
}