package com.ly.framework.db;

public class SqlBuiler
{
	public static String SELECT_ = "SELELCT ";
	
	public static String _FROM_ = " FROM ";
	
	public static String _WHERE_ = " WHERE ";
	
	public static String _ORDERBY_= " ORDER BY ";
	
	public static String JOIN = " JOIN ";
	
	public static String ON = " ON ";
	
	private String instruction;
	
	private String columnClause;
	
	private String tableClause;
	
	private String whereClause;
	
	private String orderByClause;
	
	private void parse(String sql)
	{
		StringBuilder sqlBuilder = new StringBuilder(sql.toUpperCase());
		
		int pos = sqlBuilder.indexOf(SELECT_);
		instruction = sqlBuilder.substring(sqlBuilder.indexOf(SELECT_), SELECT_.length());
		columnClause = sqlBuilder.substring(pos + SELECT_.length(), sqlBuilder.indexOf(_FROM_));
		String 
		tableClause = sqlBuilder.substring(sqlBuilder.indexOf(_FROM_) + _FROM_.length(), -1);
		
		
		
	}
	
}
