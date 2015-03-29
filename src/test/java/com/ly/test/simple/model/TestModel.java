package com.ly.test.simple.model;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.context.support.DefaultLifecycleProcessor;

/**
 * <pre>
 * 
 *  Accela Automation
 *  File: TestModel.java
 * 
 *  Accela, Inc.
 *  Copyright (C): 2015
 * 
 *  Description:
 *  TODO
 * 
 *  Notes:
 * 	$Id: TestModel.java 72642 2009-01-01 20:01:57Z ACHIEVO\Levi.Lu $ 
 * 
 *  Revision History
 *  &lt;Date&gt;,			&lt;Who&gt;,			&lt;What&gt;
 *  Mar 24, 2015		Levi.Lu		Initial.
 *  
 * </pre>
 */
public class TestModel extends DefaultLifecycleProcessor
{
	private String name;
	private String id;
	
	@Resource(name="test3Model")
	private Test2Model test2Model;
	
	public TestModel(String name, String id)
	{
		this.setName(name);
        this.setId(id);
	}
	
	public void init()
	{
		System.out.println("=======Init method============");
	}
	
	public void destory()
	{
		System.out.println("=======Destory method============");
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getId()
	{
		return id;
	}

	@Override
	public boolean isRunning()
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void start()
	{
		// TODO Auto-generated method stub
		System.out.println("start" );
	}

	@Override
	public void stop()
	{
		// TODO Auto-generated method stub
		System.out.println("stop" );
	}

	public void setTest2Model(Test2Model test2Model)
	{
		this.test2Model = test2Model;
	}

	public Test2Model getTest2Model()
	{
		return test2Model;
	}
	
	@PostConstruct
	public void testPostConstruct()
	{
		System.out.println("@PostConstruct");
	}
	
}

/*
*$Log: av-env.bat,v $
*/