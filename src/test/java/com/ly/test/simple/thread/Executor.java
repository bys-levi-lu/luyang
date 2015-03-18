package com.ly.test.simple.thread;
/**
 * <pre>
 * 
 *  Accela Automation
 *  File: Executor.java
 * 
 *  Accela, Inc.
 *  Copyright (C): 2015
 * 
 *  Description:
 *  TODO
 * 
 *  Notes:
 * 	$Id: Executor.java 72642 2009-01-01 20:01:57Z ACHIEVO\Levi.Lu $ 
 * 
 *  Revision History
 *  &lt;Date&gt;,			&lt;Who&gt;,			&lt;What&gt;
 *  Mar 13, 2015		Levi.Lu		Initial.
 *  
 * </pre>
 */
public interface Executor
{
	public void setTask(Task task);
	
	public void execute();
}

/*
*$Log: av-env.bat,v $
*/