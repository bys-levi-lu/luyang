package com.ly.test.simple.aop;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * <pre>
 * 
 *  Accela Automation
 *  File: AroundMyAdvice.java
 * 
 *  Accela, Inc.
 *  Copyright (C): 2014
 * 
 *  Description:
 *  TODO
 * 
 *  Notes:
 * 	$Id: AroundMyAdvice.java 72642 2009-01-01 20:01:57Z ACHIEVO\Levi.Lu $ 
 * 
 *  Revision History
 *  &lt;Date&gt;,			&lt;Who&gt;,			&lt;What&gt;
 *  Oct 30, 2014		Levi.Lu		Initial.
 *  
 * </pre>
 */
public class AroundMyAdvice implements MethodInterceptor
{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable
	{
		System.out.println("===========进入around环绕方法！=========== \n");
        // 调用目标方法之前执行的动作
        System.out.println("调用方法之前: 执行！\n");
        // 调用方法的参数
        Object[] args = invocation.getArguments();
        // 调用的方法
        Method method = invocation.getMethod();
        // 获取目标对象
        Object target = invocation.getThis();
        // 执行完方法的返回值：调用proceed()方法，就会触发切入点方法执行
        Object returnValue = invocation.proceed();
        System.out.println("===========结束进入around环绕方法！=========== \n");
       
        System.out.println("输出：" + args[0] + ";" + method + ";" + target + ";" + returnValue + "\n");
        System.out.println("调用方法结束：之后执行！\n");
        return returnValue;
	}

}

/*
*$Log: av-env.bat,v $
*/