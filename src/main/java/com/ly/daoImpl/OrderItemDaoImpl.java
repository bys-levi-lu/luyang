/**
 * Author:Administrator
 * Create time:下午2:11:04
 */
package com.ly.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ly.dao.OrderItemDao;
import com.ly.framework.QueryPageInfo;
import com.ly.framework.db.DataProccessor;
import com.ly.framework.db.JdbcSupport;
import com.ly.model.OrderItemModel;

/**
 * @author Administrator
 *
 */
@Repository
public class OrderItemDaoImpl extends JdbcSupport implements OrderItemDao, DataProccessor<OrderItemModel>
{
	public static final String SELECTSQL = "SELECT ORDER_NO, ORDER_DESC, ORDER_ADDRESS, ORDER_PHONE FROM ORDER_ITEM";

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ly.dao.OrderItemDao#getOrderItemByPk(int)
	 */
	@Override
	public OrderItemModel getOrderItemByPk(int orderNo)
	{
		StringBuilder sql = new StringBuilder(SELECTSQL);
		sql.append(" WHERE ORDER_NO = ?");
		List<OrderItemModel> list = select(sql.toString(), new Object[]{orderNo}, this);
		if (list != null && list.size() > 0)
		{
			return list.get(0);
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ly.dao.OrderItemDao#getOrderItemByAddress(java.lang.String)
	 */
	@Override
	public List<OrderItemModel> getOrderItemByAddress(String address)
	{
		StringBuilder sql = new StringBuilder(SELECTSQL);
		sql.append(" WHERE ORDER_ADDRESS LIKE ?");
		return select(sql.toString(), new Object[]{"%" + address+ "%"}, this);
	}
	
	@Override
	public List<OrderItemModel> getOrderItemByAddress(String address, QueryPageInfo pageInfo)
	{
		StringBuilder sql = new StringBuilder(SELECTSQL);
		sql.append(" WHERE ORDER_ADDRESS LIKE ?");
		return select(sql.toString(), new Object[]{"%" + address+ "%"}, pageInfo, this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ly.dao.OrderItemDao#getOrderItemByDesc(java.lang.String)
	 */
	@Override
	public List<OrderItemModel> getOrderItemByDesc(String orderDesc)
	{
		StringBuilder sql = new StringBuilder(SELECTSQL);
		sql.append(" WHERE ORDER_DESC = ?");
		return select(sql.toString(), new Object[]{orderDesc}, this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ly.dao.OrderItemDao#createOrderItem(com.ly.model.OrderItemModel)
	 */
	@Override
	public void createOrderItem(OrderItemModel orderItem)
	{
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ly.dao.OrderItemDao#updateOrderItem(com.ly.model.OrderItemModel)
	 */
	@Override
	public void updateOrderItem(OrderItemModel orderItem)
	{
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ly.dao.OrderItemDao#deleteOrderItemByPk(int)
	 */
	@Override
	public void deleteOrderItemByPk(int orderNo)
	{
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ly.dao.OrderItemDao#deleteOrderItemByAddress(java.lang.String)
	 */
	@Override
	public void deleteOrderItemByAddress(String address)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public OrderItemModel populate(ResultSet rs) throws SQLException
	{
		OrderItemModel model = new OrderItemModel();
		model.setOrderNo(rs.getInt("ORDER_NO"));
		model.setOrderDesc(rs.getString("ORDER_DESC"));
		model.setOrderAddress(rs.getString("ORDER_ADDRESS"));
		model.setOrderPhone(rs.getString("ORDER_PHONE"));
		return model;
	}

	@Override
	public List<OrderItemModel> getOrderItemByDesc(String orderDesc,
			QueryPageInfo pageInfo)
	{
		StringBuilder sql = new StringBuilder(SELECTSQL);
		sql.append(" WHERE ORDER_DESC = ?");
		return select(sql.toString(), new Object[]{orderDesc}, pageInfo, this);
	}

}
