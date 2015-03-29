package com.ly.test.simple.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ly.test.simple.dao.TestDAOTest;

/**
 * <pre>
 * 
 *  Accela Automation
 *  File: TestBusiness.java
 * 
 *  Accela, Inc.
 *  Copyright (C): 2015
 * 
 *  Description:
 *  TODO
 * 
 *  Notes:
 * 	$Id: TestBusiness.java 72642 2009-01-01 20:01:57Z ACHIEVO\Levi.Lu $ 
 * 
 *  Revision History
 *  &lt;Date&gt;,			&lt;Who&gt;,			&lt;What&gt;
 *  Mar 18, 2015		Levi.Lu		Initial.
 *  
 * </pre>
 */
public class TestBusinessTest implements TestServiceTest
{
    
	private TestDAOTest dao;
	

	/**
	 * @return the dao
	 */
	
	public TestDAOTest getDao()
	{
		return dao;
	}

	/**
	 * @param dao the dao to set
	 */
	public void setDao(TestDAOTest dao)
	{
		this.dao = dao;
	}

	@Override
	public Object getData()
	{
		// TODO Auto-generated method stub
		return dao.getData();
	}

	@Override
	public void updateData()
	{
		String id = "100";
		String value = "100TEST";
		int i = dao.insert(id, value);
		System.out.println(i);
		//throw new RuntimeException();
	}
	
	public static void main(String[] args)
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-test.xml");
		TestServiceTest testService = (TestServiceTest)ctx.getBean("testService");
		testService.updateData();
	}

}

/*
*$Log: av-env.bat,v $
*/