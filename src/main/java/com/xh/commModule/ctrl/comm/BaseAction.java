package com.xh.commModule.ctrl.comm;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;

import com.xh.commModule.entry.ResultBean;

@Controller
public class BaseAction {

	public ResultBean result;
	
	public HttpServletRequest request;
	
	public HttpServletResponse response;
	
	public BaseAction(){
	}

	public HttpServletRequest getRequest(HttpServletRequest request) {
		return this.request = request;
	}


	public HttpServletResponse getResponse(HttpServletResponse response) {
		return this.response = response;
	}

	
	
}
