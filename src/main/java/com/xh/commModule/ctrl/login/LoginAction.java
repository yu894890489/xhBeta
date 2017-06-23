package com.xh.commModule.ctrl.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xh.commModule.entry.UserBean;

@RequestMapping("/module")
@Controller
public class LoginAction {

	
	@RequestMapping(value = "/login", method = RequestMethod.GET, consumes = { "application/json" }, produces = { "application/json;charset=UTF-8" })
	public  String login(HttpServletRequest request,HttpSession httpSession,
			@Valid @RequestBody UserBean user){
		System.out.println(user);
		System.out.println(2);
		return "login";
		
	}
	
}
