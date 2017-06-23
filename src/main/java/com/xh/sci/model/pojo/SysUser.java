package com.xh.sci.model.pojo;

import java.util.Date;

public class SysUser extends MybatisObject {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_user.USER_ID
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	private String userId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_user.USER_ACC
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	private String userAcc;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_user.USER_PWD
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	private String userPwd;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_user.USER_NAME
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	private String userName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_user.HEAD_IMG_URL
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	private String headImgUrl;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_user.GENDER_ID
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	private String genderId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_user.STUDENT_NUM
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	private String studentNum;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_user.NATION_ID
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	private String nationId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_user.NATIVE_PLACE
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	private String nativePlace;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_user.EDUCATION_ID
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	private String educationId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_user.SCHOOL
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	private String school;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_user.MAJOR
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	private String major;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_user.USER_BIRTHDAY
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	private String userBirthday;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_user.CHINA_ID_NO
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	private String chinaIdNo;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_user.USER_MOBILE
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	private String userMobile;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_user.USER_PHONE
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	private String userPhone;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_user.USER_EMAIL
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	private String userEmail;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_user.ADDRESS
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	private String address;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_user.POSTCODE
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	private Integer postcode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_user.ORG_ID
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	private String orgId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_user.DEPT_ID
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	private String deptId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_user.USER_DESC
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	private String userDesc;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_user.STATUS_ID
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	private String statusId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_user.OPEN_ID
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	private String openId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_user.POSITION
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	private String position;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_user.SKILL
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	private String skill;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_user.CERTIFICATE
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	private String certificate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_user.RECORD_STATE
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	private String recordState;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_user.CREATE_USER_ID
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	private String createUserId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_user.CREATE_TIME
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	private Date createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_user.MODIFY_USER_ID
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	private String modifyUserId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_user.MODIFY_TIME
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	private Date modifyTime;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_user.USER_ID
	 * @return  the value of sys_user.USER_ID
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_user.USER_ID
	 * @param userId  the value for sys_user.USER_ID
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_user.USER_ACC
	 * @return  the value of sys_user.USER_ACC
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public String getUserAcc() {
		return userAcc;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_user.USER_ACC
	 * @param userAcc  the value for sys_user.USER_ACC
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public void setUserAcc(String userAcc) {
		this.userAcc = userAcc;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_user.USER_PWD
	 * @return  the value of sys_user.USER_PWD
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public String getUserPwd() {
		return userPwd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_user.USER_PWD
	 * @param userPwd  the value for sys_user.USER_PWD
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_user.USER_NAME
	 * @return  the value of sys_user.USER_NAME
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_user.USER_NAME
	 * @param userName  the value for sys_user.USER_NAME
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_user.HEAD_IMG_URL
	 * @return  the value of sys_user.HEAD_IMG_URL
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public String getHeadImgUrl() {
		return headImgUrl;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_user.HEAD_IMG_URL
	 * @param headImgUrl  the value for sys_user.HEAD_IMG_URL
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public void setHeadImgUrl(String headImgUrl) {
		this.headImgUrl = headImgUrl;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_user.GENDER_ID
	 * @return  the value of sys_user.GENDER_ID
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public String getGenderId() {
		return genderId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_user.GENDER_ID
	 * @param genderId  the value for sys_user.GENDER_ID
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public void setGenderId(String genderId) {
		this.genderId = genderId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_user.STUDENT_NUM
	 * @return  the value of sys_user.STUDENT_NUM
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public String getStudentNum() {
		return studentNum;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_user.STUDENT_NUM
	 * @param studentNum  the value for sys_user.STUDENT_NUM
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_user.NATION_ID
	 * @return  the value of sys_user.NATION_ID
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public String getNationId() {
		return nationId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_user.NATION_ID
	 * @param nationId  the value for sys_user.NATION_ID
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public void setNationId(String nationId) {
		this.nationId = nationId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_user.NATIVE_PLACE
	 * @return  the value of sys_user.NATIVE_PLACE
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public String getNativePlace() {
		return nativePlace;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_user.NATIVE_PLACE
	 * @param nativePlace  the value for sys_user.NATIVE_PLACE
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_user.EDUCATION_ID
	 * @return  the value of sys_user.EDUCATION_ID
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public String getEducationId() {
		return educationId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_user.EDUCATION_ID
	 * @param educationId  the value for sys_user.EDUCATION_ID
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public void setEducationId(String educationId) {
		this.educationId = educationId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_user.SCHOOL
	 * @return  the value of sys_user.SCHOOL
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public String getSchool() {
		return school;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_user.SCHOOL
	 * @param school  the value for sys_user.SCHOOL
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public void setSchool(String school) {
		this.school = school;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_user.MAJOR
	 * @return  the value of sys_user.MAJOR
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public String getMajor() {
		return major;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_user.MAJOR
	 * @param major  the value for sys_user.MAJOR
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public void setMajor(String major) {
		this.major = major;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_user.USER_BIRTHDAY
	 * @return  the value of sys_user.USER_BIRTHDAY
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public String getUserBirthday() {
		return userBirthday;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_user.USER_BIRTHDAY
	 * @param userBirthday  the value for sys_user.USER_BIRTHDAY
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public void setUserBirthday(String userBirthday) {
		this.userBirthday = userBirthday;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_user.CHINA_ID_NO
	 * @return  the value of sys_user.CHINA_ID_NO
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public String getChinaIdNo() {
		return chinaIdNo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_user.CHINA_ID_NO
	 * @param chinaIdNo  the value for sys_user.CHINA_ID_NO
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public void setChinaIdNo(String chinaIdNo) {
		this.chinaIdNo = chinaIdNo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_user.USER_MOBILE
	 * @return  the value of sys_user.USER_MOBILE
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public String getUserMobile() {
		return userMobile;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_user.USER_MOBILE
	 * @param userMobile  the value for sys_user.USER_MOBILE
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_user.USER_PHONE
	 * @return  the value of sys_user.USER_PHONE
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public String getUserPhone() {
		return userPhone;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_user.USER_PHONE
	 * @param userPhone  the value for sys_user.USER_PHONE
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_user.USER_EMAIL
	 * @return  the value of sys_user.USER_EMAIL
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public String getUserEmail() {
		return userEmail;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_user.USER_EMAIL
	 * @param userEmail  the value for sys_user.USER_EMAIL
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_user.ADDRESS
	 * @return  the value of sys_user.ADDRESS
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_user.ADDRESS
	 * @param address  the value for sys_user.ADDRESS
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_user.POSTCODE
	 * @return  the value of sys_user.POSTCODE
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public Integer getPostcode() {
		return postcode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_user.POSTCODE
	 * @param postcode  the value for sys_user.POSTCODE
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public void setPostcode(Integer postcode) {
		this.postcode = postcode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_user.ORG_ID
	 * @return  the value of sys_user.ORG_ID
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public String getOrgId() {
		return orgId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_user.ORG_ID
	 * @param orgId  the value for sys_user.ORG_ID
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_user.DEPT_ID
	 * @return  the value of sys_user.DEPT_ID
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public String getDeptId() {
		return deptId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_user.DEPT_ID
	 * @param deptId  the value for sys_user.DEPT_ID
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_user.USER_DESC
	 * @return  the value of sys_user.USER_DESC
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public String getUserDesc() {
		return userDesc;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_user.USER_DESC
	 * @param userDesc  the value for sys_user.USER_DESC
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public void setUserDesc(String userDesc) {
		this.userDesc = userDesc;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_user.STATUS_ID
	 * @return  the value of sys_user.STATUS_ID
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public String getStatusId() {
		return statusId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_user.STATUS_ID
	 * @param statusId  the value for sys_user.STATUS_ID
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public void setStatusId(String statusId) {
		this.statusId = statusId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_user.OPEN_ID
	 * @return  the value of sys_user.OPEN_ID
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public String getOpenId() {
		return openId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_user.OPEN_ID
	 * @param openId  the value for sys_user.OPEN_ID
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_user.POSITION
	 * @return  the value of sys_user.POSITION
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_user.POSITION
	 * @param position  the value for sys_user.POSITION
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_user.SKILL
	 * @return  the value of sys_user.SKILL
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public String getSkill() {
		return skill;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_user.SKILL
	 * @param skill  the value for sys_user.SKILL
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public void setSkill(String skill) {
		this.skill = skill;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_user.CERTIFICATE
	 * @return  the value of sys_user.CERTIFICATE
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public String getCertificate() {
		return certificate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_user.CERTIFICATE
	 * @param certificate  the value for sys_user.CERTIFICATE
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_user.RECORD_STATE
	 * @return  the value of sys_user.RECORD_STATE
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public String getRecordState() {
		return recordState;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_user.RECORD_STATE
	 * @param recordState  the value for sys_user.RECORD_STATE
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public void setRecordState(String recordState) {
		this.recordState = recordState;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_user.CREATE_USER_ID
	 * @return  the value of sys_user.CREATE_USER_ID
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public String getCreateUserId() {
		return createUserId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_user.CREATE_USER_ID
	 * @param createUserId  the value for sys_user.CREATE_USER_ID
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_user.CREATE_TIME
	 * @return  the value of sys_user.CREATE_TIME
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_user.CREATE_TIME
	 * @param createTime  the value for sys_user.CREATE_TIME
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_user.MODIFY_USER_ID
	 * @return  the value of sys_user.MODIFY_USER_ID
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public String getModifyUserId() {
		return modifyUserId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_user.MODIFY_USER_ID
	 * @param modifyUserId  the value for sys_user.MODIFY_USER_ID
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public void setModifyUserId(String modifyUserId) {
		this.modifyUserId = modifyUserId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_user.MODIFY_TIME
	 * @return  the value of sys_user.MODIFY_TIME
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public Date getModifyTime() {
		return modifyTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_user.MODIFY_TIME
	 * @param modifyTime  the value for sys_user.MODIFY_TIME
	 * @mbggenerated  Thu Sep 29 18:48:51 CST 2016
	 */
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
}
