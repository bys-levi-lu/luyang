package com.ly.test.simple;
/**
 * <pre>
 * 
 *  Accela Automation
 *  File: AfterInvoke.java
 * 
 *  Accela, Inc.
 *  Copyright (C): 2014
 * 
 *  Description:
 *  TODO
 * 
 *  Notes:
 * 	$Id: AfterInvoke.java 72642 2009-01-01 20:01:57Z ACHIEVO\Levi.Lu $ 
 * 
 *  Revision History
 *  &lt;Date&gt;,			&lt;Who&gt;,			&lt;What&gt;
 *  Oct 31, 2014		Levi.Lu		Initial.
 *  
 * </pre>
 */
public class AfterInvoke implements IBaseHandler
{

	@Override
	public void invoke(IBaseProcess process)
	{
		// TODO Auto-generated method stub
		process.process();
		System.out.println("---After---");
	}

}

/*
*$Log: av-env.bat,v $
*/