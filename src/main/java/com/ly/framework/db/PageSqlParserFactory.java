/**
 * Author:Administrator
 * Create time:上午2:37:43
 */
package com.ly.framework.db;

import java.util.HashMap;
import java.util.Map;

import com.ly.framework.QueryPageInfo;

/**
 * @author Administrator
 *
 */
public class PageSqlParserFactory
{
	private static PageSqlParserFactory instance;
	
	private Map<String, PageSqlParser> cache = new HashMap<String, PageSqlParser>();
	
	private PageSqlParserFactory()
	{
		cache.put("MYSQL", new MysqlPageSqlParser());
	}
	
	public static PageSqlParserFactory getInstance()
	{
		if (instance == null)
		{
			instance = new PageSqlParserFactory();
		}
		return instance;
	}
	
	public PageSqlParser getPageSqlParser(DBType dbType)
	{
		return cache.get(dbType.getDBType());
	}
	
	private class MysqlPageSqlParser implements PageSqlParser
	{

		@Override
		public String parse(String sql, QueryPageInfo pageInfo)
		{
			// TODO Auto-generated method stub
			return null;
		}
		
	}

}
