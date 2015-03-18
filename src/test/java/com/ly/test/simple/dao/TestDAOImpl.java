package com.ly.test.simple.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

/**
 * <pre>
 * 
 *  Accela Automation
 *  File: TestDAOImpl.java
 * 
 *  Accela, Inc.
 *  Copyright (C): 2015
 * 
 *  Description:
 *  TODO
 * 
 *  Notes:
 * 	$Id: TestDAOImpl.java 72642 2009-01-01 20:01:57Z ACHIEVO\Levi.Lu $ 
 * 
 *  Revision History
 *  &lt;Date&gt;,			&lt;Who&gt;,			&lt;What&gt;
 *  Mar 16, 2015		Levi.Lu		Initial.
 *  
 * </pre>
 */
public class TestDAOImpl implements TestDAO
{
	private JdbcTemplate template;
	@Override
	public Object getData()
	{
		String sql = "SELECT * FROM TEST";
		Object o = template.query(sql, new Object[]{}, extractor);
		return o;
	}
	
	@Override
	public int update(String key, String value)
	{
		String sql = "UPDATE TEST SET NAME = ? WHERE ID = ?";
		return template.update(sql, new Object[]{value, key});
	}
	
	@Override
	public int delete(String key)
	{
		String sql = "DELETE TEST WHERE ID = ?";
		return template.update(sql, new Object[]{key});
	}

	@Override
	public int insert(String key, String value)
	{
		String sql = "INSERT INTO TEST (ID, NAME) VALUES(?, ?)";
		return template.update(sql, new Object[]{key, value});
	}
	
	private ResultSetExtractor extractor = new ResultSetExtractor()
	{
		public Object extractData(ResultSet rs) throws SQLException, DataAccessException
		{
			Map result = new HashMap();
			while (rs.next())
			{
				result.put(rs.getString("id"), rs.getString("name"));
			}
			return result;
		};
	};
	
	public static void main(String[] args)
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-test.xml");
		TestDAO testDao = (TestDAO)ctx.getBean("testDao");
		String sql = "SELECT * FROM TEST";
		Object result= testDao.getData();
		System.out.println(result);
	}

	/**
	 * @return the template
	 */
	
	public JdbcTemplate getTemplate()
	{
		return template;
	}

	/**
	 * @param template the template to set
	 */
	public void setTemplate(JdbcTemplate template)
	{
		this.template = template;
	}

}

/*
*$Log: av-env.bat,v $
*/