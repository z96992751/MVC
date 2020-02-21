package com.accp.t1.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.accp.t1.pojo.Users;

@RestController
public class LoginAction {

	@RequestMapping(value = "/loginIn", method = RequestMethod.POST)
	public Map<String, String> loginIn(HttpSession session, String userName, Integer userPwd) {
		Map<String, String> message = new HashMap<String, String>();
		if ("admin".equals(userName) && userPwd == 123) {
			session.setAttribute("USER", new Users(userName, userPwd));
			message.put("code", "200");
		} else {
			message.put("code", "400");
		}
		return message;
	}

	@RequestMapping(value = "/getId", method = RequestMethod.GET)
	public String getSessionId(HttpSession session) {
		return session.getId();
	}

	@RequestMapping(value = "/getObj", method = RequestMethod.GET)
	public Users getSessionObj(HttpSession session) {
		return (Users) session.getAttribute("USER");
	}
}
