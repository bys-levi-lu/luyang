package com.ly.framework.db;

import java.sql.ResultSet;

public interface DataProccessor<T>
{
	public T populate(ResultSet rs);
}
