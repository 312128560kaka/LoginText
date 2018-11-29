package com.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.Users;
import com.service.UsersService;

@Controller
public class LoginConteroller extends GenericController{
	@Resource(name="usersService")
     private UsersService usersService;

	public UsersService getUsersService() {
		return usersService;
	}

	public void setUsersService(UsersService usersService) {
		this.usersService = usersService;
	}
	@RequestMapping("loginUsers.do")
	public ModelAndView login(Users users) {
		Users loginValidate = this.usersService.loginValidate(users.getUsername());
		if(loginValidate==null) {
			return new ModelAndView("login","error","用户名不存在");
		}else {
			if(loginValidate.getPassword().equals(users.getPassword())) {
				this.session.setAttribute("loginValidate", loginValidate);
				return new ModelAndView("index");
			}else {
				return new ModelAndView("login","error","密码错误");
			}
		}
		
		
	}
}
