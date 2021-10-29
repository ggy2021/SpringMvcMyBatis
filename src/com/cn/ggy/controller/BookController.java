package com.cn.ggy.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cn.ggy.dao.BookMapper;

@Controller
public class BookController {
	Logger log = Logger.getLogger(BookController.class);
	
	@Autowired
	private BookMapper bookMapper;
	@RequestMapping("query/queryBooks/{user}")
	@ResponseBody
	public String queryBooks(@PathVariable(value = "user") String user){
		log.info("restful调用成功"+user);
		String str = bookMapper.qryBookName();
		log.info("id="+user+"的书名："+str);
		return str;
	}
	
//	@RequestMapping("query/queryBooks/{user}")
//	@ResponseBody
//	public String queryBooks(HttpServletRequest httprequest){
//		log.info("restful调用成功"+user);
//		String str = bookMapper.qryBookName();
//		log.info("id=1的书名："+str);
//		return str;
//	}
}
