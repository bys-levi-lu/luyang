package com.ly.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.ly.dao.TestDAO;
import com.ly.framework.db.JdbcSupport;
import com.ly.model.TestModel;

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
public class TestDAOImpl extends JdbcSupport implements TestDAO
{
	@Override
	public List<TestModel> getData()
	{
		String sql = "SELECT * FROM TEST";
		return template.query(sql, new Object[]{}, extractor);
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
	
	private ResultSetExtractor<List<TestModel>> extractor = new ResultSetExtractor<List<TestModel>>()
	{
		public List<TestModel> extractData(ResultSet rs) throws SQLException, DataAccessException
		{
			List<TestModel> list = new ArrayList<TestModel>();
			while (rs.next())
			{
				TestModel model = new TestModel();
				model.setId(rs.getInt("id"));
				model.setName("name");
				list.add(model);
			}
			if (list.isEmpty())
			{
				return null;
			}
			return list;
		};
	};
	
}

/*
*$Log: av-env.bat,v $
*/