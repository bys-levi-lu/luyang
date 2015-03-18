package com.ly.test.simple.aop;
/**
 * <pre>
 * 
 *  Accela Automation
 *  File: AspectBusiness.java
 * 
 *  Accela, Inc.
 *  Copyright (C): 2014
 * 
 *  Description:
 *  TODO
 * 
 *  Notes:
 * 	$Id: AspectBusiness.java 72642 2009-01-01 20:01:57Z ACHIEVO\Levi.Lu $ 
 * 
 *  Revision History
 *  &lt;Date&gt;,			&lt;Who&gt;,			&lt;What&gt;
 *  Oct 31, 2014		Levi.Lu		Initial.
 *  
 * </pre>
 */
public class AspectBusiness
{
	public String delete(String name)
	{
		System.out.println(name + " have been deleted...");
		return "Delete " + name;
	}
	
	public String add(String name)
	{
		System.out.println(name + " have been added...");
		return "Add " + name;
	}
	
	public String update(String name)
	{
		System.out.println(name + " have been updated");
		return "Update " + name;
	}
}

/*
*$Log: av-env.bat,v $
*/