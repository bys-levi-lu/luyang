package com.ly.test.simple.aop;
/**
 * <pre>
 * 
 *  Accela Automation
 *  File: BaseBusiness.java
 * 
 *  Accela, Inc.
 *  Copyright (C): 2014
 * 
 *  Description:
 *  TODO
 * 
 *  Notes:
 * 	$Id: BaseBusiness.java 72642 2009-01-01 20:01:57Z ACHIEVO\Levi.Lu $ 
 * 
 *  Revision History
 *  &lt;Date&gt;,			&lt;Who&gt;,			&lt;What&gt;
 *  Oct 30, 2014		Levi.Lu		Initial.
 *  
 * </pre>
 */
public class BaseBusiness implements IBaseBusiness
{

	@Override
	public void doAdd(String name)
	{
		// TODO Auto-generated method stub
		System.out.println("Ha Ha, doAdd method will be add:" + name);
	}

	@Override
	public void doDelete(String name)
	{
		// TODO Auto-generated method stub
		System.out.println("Ha Ha, doDelete method will be delete:" + name);
	}

	@Override
	public void doUpdate(String name)
	{
		// TODO Auto-generated method stub
		System.out.println("Ha Ha, doUpdate method will be update:" + name);
	}

}

/*
*$Log: av-env.bat,v $
*/