package com.xh.commModule.ctrl.comm;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("comm")
public class commAction {

	
	
	@RequestMapping(value = "/getCommData", method = RequestMethod.POST, consumes = { "application/json" }, produces = { "application/json;charset=UTF-8" })
	public @ResponseBody HashMap login(HttpServletRequest request){
		System.out.println(request.getRealPath("url"));

System.out.println(request.getRealPath("./"));    // 网页所在的目录
System.out.println(request.getRealPath("../"));
System.out.println(request.getContextPath());
System.out.println(request.getSession().getServletContext().getRealPath("/"));
System.out.println(request.getRequestURI());
System.out.println(request.getContextPath() );
System.out.println(request.getServletPath() );
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
		return new HashMap();
		
	}
}
