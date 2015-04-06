package com.ly.framework.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.ly.framework.QueryPageInfo;

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
public class JdbcSupport
{
	protected JdbcTemplate template;
	
	private DBTypeDataSource dataSource;
	
	public JdbcSupport()
	{
		template = new JdbcTemplate(dataSource);
	}
	
	public <T> List<T> select(String sql, Object[] args, DataProccessor<T> proccessor)
	{
		return template.query(sql, args, new JdbcMapping(proccessor));
	}
	
	public <T> List<T> select(String sql, Object[] args, QueryPageInfo pageInfo, DataProccessor<T> proccessor)
	{
		PageSqlParser pageParser = PageSqlParserFactory.getInstance().getPageSqlParser(dataSource);
		return template.query(pageParser.parse(sql, pageInfo), args, new JdbcMapping(proccessor));
	}
	
	public int update(String sql, Object[] args)
	{
		return template.update(sql, args);
	}
	
	public int batchUpdate(String sql, List<Object[]> args)
	{
		int[] resultArr = template.batchUpdate(sql, args);
		return calc(resultArr);
	}
	
	
	private int calc(int[] resultArr)
	{
		int result = 0;
		if (resultArr != null && resultArr.length > 0)
		{
			for (int i : resultArr)
			{
				result += resultArr[i];
			}
		}
		return result;
	}
	
	class JdbcMapping<T> implements RowMapper<T>
	{
		private DataProccessor<T> proccessor;

		public JdbcMapping(DataProccessor<T> proccessor)
		{
			this.proccessor = proccessor;
		}

		@Override
		public T mapRow(ResultSet rs, int rowNum) throws SQLException
		{
			return proccessor.populate(rs);
		}
	}
}

/*
*$Log: av-env.bat,v $
*/