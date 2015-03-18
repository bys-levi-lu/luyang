package com.ly.test.simple.aop;

import java.lang.reflect.Method;

import org.springframework.aop.support.NameMatchMethodPointcut;

/**
 * <pre>
 * 
 *  Accela Automation
 *  File: MyPointCut.java
 * 
 *  Accela, Inc.
 *  Copyright (C): 2014
 * 
 *  Description:
 *  TODO
 * 
 *  Notes:
 * 	$Id: MyPointCut.java 72642 2009-01-01 20:01:57Z ACHIEVO\Levi.Lu $ 
 * 
 *  Revision History
 *  &lt;Date&gt;,			&lt;Who&gt;,			&lt;What&gt;
 *  Oct 30, 2014		Levi.Lu		Initial.
 *  
 * </pre>
 */
public class MyPointCut extends NameMatchMethodPointcut
{

	/**
	 * Comment for &lt;code&gt;serialVersionUID&lt;/code&gt;
	 */
	private static final long serialVersionUID = -9102162072621695944L;
	
	@Override
	public boolean matches(Method method, Class<?> targetClass)
	{
		 // 设置多个方法匹配
        String[] methods = { "doAdd" };
       
        //也可以用“ * ” 来做匹配符号
        // this.setMappedName("get*");
        this.setMappedNames(methods);
		return super.matches(method, targetClass);
	}

}

/*
*$Log: av-env.bat,v $
*/