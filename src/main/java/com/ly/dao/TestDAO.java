package com.ly.dao;
/**
 * <pre>
 * 
 *  Accela Automation
 *  File: TestDAO.java
 * 
 *  Accela, Inc.
 *  Copyright (C): 2015
 * 
 *  Description:
 *  TODO
 * 
 *  Notes:
 * 	$Id: TestDAO.java 72642 2009-01-01 20:01:57Z ACHIEVO\Levi.Lu $ 
 * 
 *  Revision History
 *  &lt;Date&gt;,			&lt;Who&gt;,			&lt;What&gt;
 *  Mar 18, 2015		Levi.Lu		Initial.
 *  
 * </pre>
 */
public interface TestDAO
{
	public Object getData();
	
	public int update(String key, String value);
	
	public int insert(String key, String value);
	
	public int delete(String key);
}


/*
*$Log: av-env.bat,v $
*/