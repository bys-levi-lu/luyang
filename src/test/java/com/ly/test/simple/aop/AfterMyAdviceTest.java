package com.ly.test.simple.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

/**
 * <pre>
 * 
 *  Accela Automation
 *  File: AfterMyAdvice.java
 * 
 *  Accela, Inc.
 *  Copyright (C): 2014
 * 
 *  Description:
 *  TODO
 * 
 *  Notes:
 * 	$Id: AfterMyAdvice.java 72642 2009-01-01 20:01:57Z ACHIEVO\Levi.Lu $ 
 * 
 *  Revision History
 *  &lt;Date&gt;,			&lt;Who&gt;,			&lt;What&gt;
 *  Oct 30, 2014		Levi.Lu		Initial.
 *  
 * </pre>
 */
public class AfterMyAdviceTest implements AfterReturningAdvice
{
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable
	{
		String methodName = method.getName();
		String targetType = target.getClass().getSimpleName();
		System.out.println("------------------------This is After Advice start-------------------");
		System.out.println(methodName + " have executed, " + targetType + "is the target");
		System.out.println("Return Value:" + returnValue);
		System.out.println("------------------------This is After Advice end---------------------");
	}

}

/*
*$Log: av-env.bat,v $
*/