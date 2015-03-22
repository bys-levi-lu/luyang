package com.ly.test.simple.aop;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

/**
 * <pre>
 * 
 *  Accela Automation
 *  File: ThrowMyAdvice.java
 * 
 *  Accela, Inc.
 *  Copyright (C): 2014
 * 
 *  Description:
 *  TODO
 * 
 *  Notes:
 * 	$Id: ThrowMyAdvice.java 72642 2009-01-01 20:01:57Z ACHIEVO\Levi.Lu $ 
 * 
 *  Revision History
 *  &lt;Date&gt;,			&lt;Who&gt;,			&lt;What&gt;
 *  Oct 30, 2014		Levi.Lu		Initial.
 *  
 * </pre>
 */
public class ThrowMyAdviceTest implements ThrowsAdvice
{
	public void afterThrowing(Method method, Object[] args, Object target, Exception ex)
	{
		System.out.println(method.getName() + " is throw exception.");
	}
}

/*
*$Log: av-env.bat,v $
*/