package com.accp.t1.handler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.accp.t1.pojo.Users;

@Controller
public class UsersLoginAction {

	@RequestMapping(value="/c/loginin",method=RequestMethod.POST)
	//String userName,Integer userPwd,String[] ops
	public String loginIn(Model model,Users users) {
		System.out.println("接收数据:"+users.getUserName()+"\t"+users.getUserPwd()+"\t"+users.getOps());
		if("admin".equals(users.getUserName())&&123==users.getUserPwd()) {
			model.addAttribute("USER_NAME",users.getUserName());
			return "/WEB-INF/view/index.jsp";
		}else {
			model.addAttribute("MSG","用户名或密码错误");
			return "/login.jsp";
		}
	}
}
