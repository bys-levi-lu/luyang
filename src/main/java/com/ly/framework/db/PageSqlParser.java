package com.ly.framework.db;

import com.ly.framework.QueryPageInfo;

public interface PageSqlParser
{
	public String parse(String sql, QueryPageInfo pageInfo);
}
