package cn.kkl.action;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import cn.kkl.service.UserService;

public class UserController implements Controller{
	
	private UserService userService;


	public UserService getUserService() {
		return userService;
	}


	public void setUserService(UserService userService) {
		this.userService = userService;
	}


	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		System.out.println("****UserController.handleRequest()*****");
		req.setAttribute("name", "liweihai");
		String uname=req.getParameter("uname");
		userService.add(uname);
		return new ModelAndView("index");
	}

}
