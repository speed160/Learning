package com.abhi.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class AbhishalController {
	
	/*
	 * @RequestMapping(method= RequestMethod.GET,value = "/method1")
	 * 
	 * @ResponseBody
	 */
	 @RequestMapping(method= RequestMethod.GET,value = "/method1")
	 
	public String  method1() {
		
		return "index.jsp";
	}

}
