package com.ly.test.simple.aop;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <pre>
 * 
 *  Accela Automation
 *  File: SimpleAOPTestCase.java
 * 
 *  Accela, Inc.
 *  Copyright (C): 2014
 * 
 *  Description:
 *  TODO
 * 
 *  Notes:
 * 	$Id: SimpleAOPTestCase.java 72642 2009-01-01 20:01:57Z ACHIEVO\Levi.Lu $ 
 * 
 *  Revision History
 *  &lt;Date&gt;,			&lt;Who&gt;,			&lt;What&gt;
 *  Oct 30, 2014		Levi.Lu		Initial.
 *  
 * </pre>
 */
public class SimpleAOPTestCase extends TestCase
{
	private ApplicationContext ctx;
	
	@Override
	protected void setUp() throws Exception
	{
		super.setUp();
		ctx = new ClassPathXmlApplicationContext("aop-test.xml");
	}
	
	public void testAOPByInterface()
	{
		IBaseBusiness baseBusiness = (IBaseBusiness)ctx.getBean("businessProxy");
		baseBusiness.doAdd("HelloCat");
		baseBusiness.doDelete("DOG");
	}
	
	public void testAOPXML()
	{
		AspectBusiness biz = (AspectBusiness)ctx.getBean("aspectBusiness");
		biz.add("tomcat");
		biz.delete("abx");
	}

}

/*
*$Log: av-env.bat,v $
*/