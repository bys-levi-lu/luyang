package com.ly.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <pre>
 * 
 *  Accela Automation
 *  File: HelloWorldAction.java
 * 
 *  Accela, Inc.
 *  Copyright (C): 2015
 * 
 *  Description:
 *  TODO
 * 
 *  Notes:
 * 	$Id: HelloWorldAction.java 72642 2009-01-01 20:01:57Z ACHIEVO\Levi.Lu $ 
 * 
 *  Revision History
 *  &lt;Date&gt;,			&lt;Who&gt;,			&lt;What&gt;
 *  Mar 31, 2015		Levi.Lu		Initial.
 *  
 * </pre>
 */
@Controller
@RequestMapping("/helloWorld")
public class HelloWorldAction
{
	@RequestMapping
	public String helloWorld(Model model)
	{
		model.addAttribute("message", "Hello World!");
		System.out.println("Hello World!");
		return "helloWorld";
	}
	
	@RequestMapping(value="/hello/{orderNo}")
	public String testPathValiable(@PathVariable String orderNo)
	{
		System.out.println(orderNo);
		return "orderItem";
	}
}

/*
*$Log: av-env.bat,v $
*/