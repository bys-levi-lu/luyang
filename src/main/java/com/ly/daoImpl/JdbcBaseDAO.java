package com.ly.daoImpl;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * <pre>
 * 
 *  Accela Automation
 *  File: JdbcBaseDAO.java
 * 
 *  Accela, Inc.
 *  Copyright (C): 2015
 * 
 *  Description:
 *  TODO
 * 
 *  Notes:
 * 	$Id: JdbcBaseDAO.java 72642 2009-01-01 20:01:57Z ACHIEVO\Levi.Lu $ 
 * 
 *  Revision History
 *  &lt;Date&gt;,			&lt;Who&gt;,			&lt;What&gt;
 *  Mar 18, 2015		Levi.Lu		Initial.
 *  
 * </pre>
 */
public class JdbcBaseDAO
{
	protected JdbcTemplate jdbcTemplate;

	/**
	 * @return the jdbcTemplate
	 */
	
	public JdbcTemplate getJdbcTemplate()
	{
		return jdbcTemplate;
	}

	/**
	 * @param jdbcTemplate the jdbcTemplate to set
	 */
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate = jdbcTemplate;
	}

}

/*
*$Log: av-env.bat,v $
*/