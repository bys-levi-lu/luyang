package com.ly.framework;

public class QueryPageInfo
{
	
	private int currentPage;
	
	private int pageSize;
	
	private String orderBy;
	
	public QueryPageInfo()
	{
		
	}
	
	public QueryPageInfo(int currentPage, int pageSize)
	{
		this.currentPage = currentPage;
		this.pageSize = pageSize;
	}
	

	public int getCurrentPage()
	{
		return currentPage;
	}

	public void setCurrentPage(int currentPage)
	{
		this.currentPage = currentPage;
	}

	public int getPageSize()
	{
		return pageSize;
	}
	
	public int getStartRow()
	{
		return currentPage*pageSize + 1;
	}
	
	public int getEndRow()
	{
		return currentPage*pageSize + pageSize + 1;
	}

	public void setPageSize(int pageSize)
	{
		this.pageSize = pageSize;
	}

	public String getOrderBy()
	{
		return orderBy;
	}

	public void setOrderBy(String orderBy)
	{
		this.orderBy = orderBy;
	}

}
