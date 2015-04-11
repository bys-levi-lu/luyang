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
			StringBuilder sb = new StringBuilder(sql.toUpperCase());
			if (pageInfo.getOrderBy() != null && !"".equals(pageInfo.getOrderBy()))
			{
				int startPos = sb.lastIndexOf(SqlBuiler._ORDERBY_ + SqlBuiler._ORDERBY_.length());
				int length = sb.substring(startPos).length();
				sb.replace(startPos, length, pageInfo.getOrderBy());
			}
			int startRow = pageInfo.getStartRow();
			int count = pageInfo.getPageSize();
			sb.append(" LIMIT ").append(startRow).append(",").append(count);
			return sb.toString();
		}
	}

}
