package com.ly.test.simple;

import java.util.List;

/**
 * <pre>
 * 
 *  Accela Automation
 *  File: MyProcess.java
 * 
 *  Accela, Inc.
 *  Copyright (C): 2014
 * 
 *  Description:
 *  TODO
 * 
 *  Notes:
 * 	$Id: MyProcess.java 72642 2009-01-01 20:01:57Z ACHIEVO\Levi.Lu $ 
 * 
 *  Revision History
 *  &lt;Date&gt;,			&lt;Who&gt;,			&lt;What&gt;
 *  Oct 31, 2014		Levi.Lu		Initial.
 *  
 * </pre>
 */
public class MyProcessTest implements IBaseProcessTest
{

	private List<Object> chain;
	
	private int currentIndex = -1;
	
	public MyProcessTest(List<Object> li)
	{
		chain = li;
	}
	
	@Override
	public void process()
	{
		if (chain.size() > 0 && currentIndex < chain.size() - 1)
		{
			IBaseHandlerTest invoker = (IBaseHandlerTest) chain.get(++currentIndex);
			invoker.invoke(this);
		}
	}

}

/*
*$Log: av-env.bat,v $
*/