package com.SSM.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.SSM.common.SSMCommon;
import com.SSM.domain.User;
import com.SSM.service.UserService;


@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private UserService userService;
	
	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request,Model model){
		int userId =1; 
				//Integer.parseInt(request.getParameter("id"));
		User user = this.userService.getUserById(userId);
		HttpSession session = request.getSession();
		session.setAttribute("user", user);
		model.addAttribute("user", user);
		return "showUser";
	}
	
	@RequestMapping("/addUser")
	public String addNewUser(HttpServletRequest request,Model model){
		
		String name = request.getParameter("username");
		String pwd = request.getParameter("password");
		
		User user = new User();
		user.setId(3);
		user.setUserName(name);
		user.setPassword(pwd);
		user.setAge(20);
		userService.addNewUser(user);
		model.addAttribute("user", user);
		
		//获取用户IP
        String ip = SSMCommon.getInstance().getRealUserIP(request);
        
		System.out.println("当前访问的IP:" + ip);
		return "/success";
	}
	
}
