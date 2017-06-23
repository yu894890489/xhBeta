package com.xh.sci.common.core;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.xh.sci.model.pojo.SysUser;
import com.xh.sci.utils.XHConstant;

public class HttpServletContext {

	private static ThreadLocal<HttpServletRequest> requestLocal = new ThreadLocal<HttpServletRequest>();
	private static ThreadLocal<HttpServletResponse> responseLocal = new ThreadLocal<HttpServletResponse>();

	public static HttpServletRequest getRequest() {
		return (HttpServletRequest) requestLocal.get();
	}

	public static void setRequest(HttpServletRequest request) {
		requestLocal.set(request);
	}

	public static HttpServletResponse getResponse() {
		return (HttpServletResponse) responseLocal.get();
	}

	public static void setResponse(HttpServletResponse response) {
		responseLocal.set(response);
	}

	public static HttpSession getSession() {
		if (null == getRequest()) {
			return null;
		}
		return (HttpSession) getRequest().getSession();
	}

	public static SysUser getCurrentUser() {
		if (null == getSession()) {
			return null;
		}
		SysUser currUser = (SysUser) getSession().getAttribute(XHConstant.CURR_USER);
		return currUser;
	}

	public static void setSessionAttribute(String key, Object obj) {
		getSession().setAttribute(key, obj);
	}

	public static Object getSessionAttribute(String key) {
		return getSession().getAttribute(key);
	}

}

