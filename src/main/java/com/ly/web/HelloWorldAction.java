package com.ly.web;

import java.lang.annotation.Annotation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
public class HelloWorldAction
{
    @RequestMapping("/helloWorld")
    public String helloWorld(Model model)
    {
	model.addAttribute("message", "Hello World!");
	return "helloWorld";
    }
}

/*
*$Log: av-env.bat,v $
*/