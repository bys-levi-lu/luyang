package com.ly.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.ly.dao.TestDAO;

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
public class TestDAOImpl extends JdbcBaseDAO implements TestDAO
{
	@Override
	public Object getData()
	{
		String sql = "SELECT * FROM TEST";
		Object o = jdbcTemplate.query(sql, new Object[]{}, extractor);
		return o;
	}
	
	@Override
	public int update(String key, String value)
	{
		String sql = "UPDATE TEST SET NAME = ? WHERE ID = ?";
		return jdbcTemplate.update(sql, new Object[]{value, key});
	}
	
	@Override
	public int delete(String key)
	{
		String sql = "DELETE TEST WHERE ID = ?";
		return jdbcTemplate.update(sql, new Object[]{key});
	}

	@Override
	public int insert(String key, String value)
	{
		String sql = "INSERT INTO TEST (ID, NAME) VALUES(?, ?)";
		return jdbcTemplate.update(sql, new Object[]{key, value});
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
	
}

/*
*$Log: av-env.bat,v $
*/