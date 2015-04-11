package com.ly.framework.db;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface DataProccessor<T>
{
	public T populate(ResultSet rs) throws SQLException;
}
