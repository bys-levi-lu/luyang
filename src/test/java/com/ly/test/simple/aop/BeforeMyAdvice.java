package com.ly.test.simple.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/**
 * <pre>
 * 
 *  Accela Automation
 *  File: BeforeSimpleAdvice.java
 * 
 *  Accela, Inc.
 *  Copyright (C): 2014
 * 
 *  Description:
 *  TODO
 * 
 *  Notes:
 * 	$Id: BeforeSimpleAdvice.java 72642 2009-01-01 20:01:57Z ACHIEVO\Levi.Lu $ 
 * 
 *  Revision History
 *  &lt;Date&gt;,			&lt;Who&gt;,			&lt;What&gt;
 *  Oct 30, 2014		Levi.Lu		Initial.
 *  
 * </pre>
 */
public class BeforeMyAdvice implements MethodBeforeAdvice
{
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable
	{
		String methodName = method.getName();
		String targetType = target.getClass().getSimpleName();
		System.out.println("------------------------This is Before Advice start-------------------");
		System.out.println(methodName + " will be execute, " + targetType + "is the target");
		System.out.println("------------------------This is Before Advice end---------------------");
	}
}

/*
*$Log: av-env.bat,v $
*/