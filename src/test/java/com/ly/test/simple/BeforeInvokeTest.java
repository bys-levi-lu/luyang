package com.ly.test.simple;
/**
 * <pre>
 * 
 *  Accela Automation
 *  File: BeforeInvoke.java
 * 
 *  Accela, Inc.
 *  Copyright (C): 2014
 * 
 *  Description:
 *  TODO
 * 
 *  Notes:
 * 	$Id: BeforeInvoke.java 72642 2009-01-01 20:01:57Z ACHIEVO\Levi.Lu $ 
 * 
 *  Revision History
 *  &lt;Date&gt;,			&lt;Who&gt;,			&lt;What&gt;
 *  Oct 31, 2014		Levi.Lu		Initial.
 *  
 * </pre>
 */
public class BeforeInvokeTest implements IBaseHandlerTest
{

	@Override
	public void invoke(IBaseProcessTest process)
	{
		// TODO Auto-generated method stub
		System.out.println("---Before---");
		process.process();
	}

}

/*
*$Log: av-env.bat,v $
*/