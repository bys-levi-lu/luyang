package com.ly.test.simple.model;

import org.springframework.beans.factory.annotation.Required;

/**
 * <pre>
 * 
 *  Accela Automation
 *  File: Test2Model.java
 * 
 *  Accela, Inc.
 *  Copyright (C): 2015
 * 
 *  Description:
 *  TODO
 * 
 *  Notes:
 * 	$Id: Test2Model.java 72642 2009-01-01 20:01:57Z ACHIEVO\Levi.Lu $ 
 * 
 *  Revision History
 *  &lt;Date&gt;,			&lt;Who&gt;,			&lt;What&gt;
 *  Mar 24, 2015		Levi.Lu		Initial.
 *  
 * </pre>
 */
public class Test2Model
{
	private String id2;
	
	private String name2;

	@Required
	public void setId2(String id2)
	{
		this.id2 = id2;
	}

	public String getId2()
	{
		return id2;
	}

	public void setName2(String name2)
	{
		this.name2 = name2;
	}

	public String getName2()
	{
		return name2;
	}
	
	

}

/*
*$Log: av-env.bat,v $
*/