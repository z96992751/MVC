package com.accp.t1.handler;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyAction {

	//@RequestMapping(value= "/a",method=RequestMethod.GET)
	@RequestMapping("/a")
	public String showPage(Model model,String name) {
		System.out.println("处理请求:"+name);
		//存放在request
		List<String> data=new ArrayList<String>();
		data.add("阿坤");
		data.add("阿辉");
		data.add("阿园");
		model.addAttribute("DATA", data);
		return "/WEB-INF/view/test.jsp";
	}
}
