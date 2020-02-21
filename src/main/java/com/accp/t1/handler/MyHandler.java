package com.accp.t1.handler;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class MyHandler implements Controller {
	

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("处理请求:"+request.getParameter("name"));
		//mvc数据转发渲染   重定向redirect:/WEB-INF/view/test.jsp
		ModelAndView mav=new ModelAndView("/WEB-INF/view/test.jsp");
		//存放在request
		List<String> data=new ArrayList<String>();
		data.add("阿坤");
		data.add("阿辉");
		data.add("阿园");
		mav.addObject("DATA",data);
		return mav;
	}

}
