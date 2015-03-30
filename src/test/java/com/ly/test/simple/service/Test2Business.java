package com.ly.test.simple.service;

import org.springframework.stereotype.Controller;


/**
 * <pre>
 * 
 *  Accela Automation
 *  File: Test2Business.java
 * 
 *  Accela, Inc.
 *  Copyright (C): 2015
 * 
 *  Description:
 *  TODO
 * 
 *  Notes:
 * 	$Id: Test2Business.java 72642 2009-01-01 20:01:57Z ACHIEVO\Levi.Lu $ 
 * 
 *  Revision History
 *  &lt;Date&gt;,			&lt;Who&gt;,			&lt;What&gt;
 *  Mar 24, 2015		Levi.Lu		Initial.
 *  
 * </pre>
 */
@Controller
public class Test2Business implements Test2Service
{
	private String output = "hello";

	@Override
	public void print()
	{
		System.out.println(output);
		
	}

}

/*
*$Log: av-env.bat,v $
*/