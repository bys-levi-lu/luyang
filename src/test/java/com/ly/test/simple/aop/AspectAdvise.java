package com.ly.test.simple.aop;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * <pre>
 * 
 *  Accela Automation
 *  File: AspectAdvise.java
 * 
 *  Accela, Inc.
 *  Copyright (C): 2014
 * 
 *  Description:
 *  TODO
 * 
 *  Notes:
 * 	$Id: AspectAdvise.java 72642 2009-01-01 20:01:57Z ACHIEVO\Levi.Lu $ 
 * 
 *  Revision History
 *  &lt;Date&gt;,			&lt;Who&gt;,			&lt;What&gt;
 *  Oct 31, 2014		Levi.Lu		Initial.
 *  
 * </pre>
 */
public class AspectAdvise
{
	public void doBefore(JoinPoint point)
	{
		System.out.println("---------Start before advise----------");
		String className = point.getThis().getClass().getSimpleName();
		String methodName = point.getSignature().getName();
		System.out.println("Ready to execute method [" + methodName + "] on " + className);
		System.out.println("Paramters: " + getSimpleArrayStr(point.getArgs()));
		System.out.println("---------End before advise----------");
	}
	
	public void doAfter(JoinPoint point, String result)
	{
		System.out.println("---------Start after advise----------");
		String className = point.getThis().getClass().getSimpleName();
		String methodName = point.getSignature().getName();
		System.out.println("[" + methodName + "] Have been executed on " + className);
		System.out.println("Return value is [" + result + "]");
		System.out.println("Paramters: " + getSimpleArrayStr(point.getArgs()));
		System.out.println("---------End after advise----------");
	}
	
	public void doAround(ProceedingJoinPoint ppoint) throws Throwable
	{
		System.out.println("---------Start around advise----------");
//		String className = ppoint.getThis().getClass().getSimpleName();
//		String methodName = ppoint.getSignature().getName();
		System.out.println("Before execute");
		ppoint.proceed();
		System.out.println("After execute");
		System.out.println("---------End around advise----------");
	}

	private String getSimpleArrayStr(Object[] objArr)
	{
		if (objArr != null)
		{
			StringBuilder val = new StringBuilder("[");
			for (Object obj : objArr)
			{
				val.append(obj.toString() + ",");
			}
			val.deleteCharAt(val.lastIndexOf(","));
			val.append("]");
			return val.toString();
		}
		else
		{
			return null;
		}
	}
}

/*
*$Log: av-env.bat,v $
*/