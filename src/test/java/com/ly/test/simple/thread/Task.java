package com.ly.test.simple.thread;
/**
 * <pre>
 * 
 *  Accela Automation
 *  File: Task.java
 * 
 *  Accela, Inc.
 *  Copyright (C): 2015
 * 
 *  Description:
 *  TODO
 * 
 *  Notes:
 * 	$Id: Task.java 72642 2009-01-01 20:01:57Z ACHIEVO\Levi.Lu $ 
 * 
 *  Revision History
 *  &lt;Date&gt;,			&lt;Who&gt;,			&lt;What&gt;
 *  Mar 13, 2015		Levi.Lu		Initial.
 *  
 * </pre>
 */
public interface Task<T>
{
	public void process();
	
	public T getResult();
}

/*
*$Log: av-env.bat,v $
*/