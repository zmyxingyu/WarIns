package com.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.domain.LoginForm;
import com.services.UserService;

@Controller
@RequestMapping("/test.do")
public class LoginController {

	@Resource(name = "userService")
	private UserService service;

	@RequestMapping(params = "method=1")
	public ModelAndView login(HttpServletRequest request,
			HttpServletResponse response, LoginForm command) {
		String username = command.getUsername();
		System.out.println("name:" + username);
		ModelAndView mv = new ModelAndView("jsp/index.jsp");
		mv.addObject("username", username);
		return mv;
	}

	@RequestMapping(params = "method=2")
	public ModelAndView conunt() {
		int c = service.userCount();
		System.out.println("size:" + c);
		ModelAndView mv = new ModelAndView("jsp/users.jsp");
		mv.addObject("count", c);
		return mv;
	}
	@RequestMapping(params = "method=3")
	public ModelAndView index() {
		System.out.println("method 3");
		ModelAndView mv = new ModelAndView("html/demo.html");
		return mv;
		
	}
}
