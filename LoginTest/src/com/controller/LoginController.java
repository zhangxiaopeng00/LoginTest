package com.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.Users;
import com.service.UsersService;

@Controller
public class LoginController extends GenericController {
	@Resource
	private UsersService usersService;

	public UsersService getUsersService() {
		return usersService;
	}

	public void setUsersService(UsersService usersService) {
		this.usersService = usersService;
	}

	@RequestMapping("/login.do")
	public ModelAndView login(String username, String password) {
		Users currentUser = this.usersService.findBy(username, password);
		if (currentUser == null) {
			return new ModelAndView("login", "error", "用户名或密码错误");
		} else {
			return new ModelAndView("index");
		}
	}
}
