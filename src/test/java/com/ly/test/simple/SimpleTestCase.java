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
				li.add(new BeforeInvoke());
			}
			else
			{
				li.add(new AfterInvoke());
			}
		}
		
		System.out.println("Output list>>>>>>>>>>>");
		for (Object obj : li)
		{
			IBaseHandler invoker = (IBaseHandler)obj;
			System.out.println(invoker);
		}
		IBaseProcess process = new MyProcess(li);
		process.process();
	}
}

/*
*$Log: av-env.bat,v $
*/
