package com.ly.test.simple;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.sql.DataSource;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ly.test.simple.model.Test2Model;
import com.ly.test.simple.model.TestModel;
import com.ly.test.simple.service.Test2Service;


/**
 * <pre>
 * 
 *  Accela Automation
 *  File: SimpleTestCase.java
 * 
 *  Accela, Inc.
 *  Copyright (C): 2014-2015
 * 
 *  Description:
 *  TODO
 * 
 *  Notes:
 * 	$Id: SimpleTestCase.java 72642 2009-01-01 20:01:57Z ACHIEVO\Levi.Lu $ 
 * 
 *  Revision History
 *  &lt;Date&gt;,			&lt;Who&gt;,			&lt;What&gt;
 *  Oct 29, 2014		Levi.Lu		Initial.
 *  
 * </pre>
 */
public class SimpleTestCase extends TestCase
{
	ApplicationContext ctx = null;
	@Override
	protected void setUp() throws Exception
	{
		// TODO Auto-generated method stub
		super.setUp();
		ctx = new ClassPathXmlApplicationContext("applicationContext-test.xml");
	}
	
	public void test() throws SQLException
	{
		Object o = ctx.getBean("simple");
		DataSource ds = (DataSource)ctx.getBean("dataSource");
		Connection conn = ds.getConnection();
		assertNotNull(ds);
		assertNotNull(conn);
		assertNotNull(o);
	}
	
	public void testBeforeAfter()
	{
		List<Object> li = new ArrayList<Object>(10);
		Random rand = new Random();
		for (int i = 0; i <= 10; i++)
		{
			int f = rand.nextInt();
			if (f%2 == 0)
			{
				li.add(new BeforeInvokeTest());
			}
			else
			{
				li.add(new AfterInvokeTest());
			}
		}
		
		System.out.println("Output list>>>>>>>>>>>");
		for (Object obj : li)
		{
			IBaseHandlerTest invoker = (IBaseHandlerTest)obj;
			System.out.println(invoker);
		}
		IBaseProcessTest process = new MyProcessTest(li);
		process.process();
	}
	
	public void testConstructorDI() throws InterruptedException
	{
		TestModel testModel = (TestModel)ctx.getBean("testModel");
		System.out.println(testModel.getId());
		
		Test2Service test2service = ctx.getBean(Test2Service.class);
		test2service.print();
		
		//Test2Model test2 = (Test2Model)ctx.getBean("test2Model");
	}
}

/*
*$Log: av-env.bat,v $
*/
