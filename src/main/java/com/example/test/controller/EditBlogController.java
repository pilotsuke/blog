package com.example.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.test.model.bean.EditBlog;

@Controller
public class EditBlogController {
	
	@RequestMapping("editBlog")
	@ResponseBody
	public String editBlogController(EditBlog eb){
		System.out.println("博客标题是:"+eb.getBlog_title()+", 博客的内容是:"+eb.getBlog_content());
		
		return "success";
	}
	
}
