package com.xh.sci.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.xh.sci.common.core.HttpServletContext;
import com.xh.sci.utils.XHConstant;

public class HttpContextFilter implements Filter {
	private static Logger logger = LoggerFactory.getLogger(HttpContextFilter.class);
	
	public void destroy() { }

	public void doFilter(ServletRequest request, ServletResponse response,FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpRequest =(HttpServletRequest) request;
		HttpServletResponse httpResponse =(HttpServletResponse) response;
		String getPath = StringUtils.defaultString(httpRequest.getRequestURL().toString());
		if(StringUtils.isNotBlank(httpRequest.getQueryString()) ){
			getPath = getPath+"?"+httpRequest.getQueryString();
		}
		String servletPath = httpRequest.getServletPath();
		httpRequest.setAttribute(XHConstant.PAGE_SERVLET_PATH, servletPath);
		//logger.debug("HttpContextFilter......{}",getPath);
		HttpServletContext.setRequest((HttpServletRequest) request);
		HttpServletContext.setResponse((HttpServletResponse) response);
		
		/*String[] notFilter = new String[] { "/szyyms/login/accessLogin", 
											"/szyyms/login/captcha",
											"/szyyms/",
											"/szyyms/login/forwardLogin"
											};
		String uri = httpRequest.getRequestURI();
		boolean doFilter = true;// �Ƿ����
		for (String s : notFilter) {
			if (uri.equals(s)) {
				doFilter = false;
				break;
			} else {
				if (uri.indexOf("/js/") != -1 || uri.indexOf("/css/") != -1 || uri.indexOf("/images/") != -1) {
					doFilter = false;
					break;
				}
			}
		}
		if (doFilter) {
			SysUser currUser = (SysUser)httpRequest.getSession().getAttribute("currUser");
			if (currUser == null) {
				httpRequest.setCharacterEncoding("UTF-8");
				httpResponse.setCharacterEncoding("UTF-8");
				httpResponse.sendRedirect("/szyyms/");
			}
		}*/
		chain.doFilter(request, response);	
	}

	public void init(FilterConfig arg0) throws ServletException { }
}