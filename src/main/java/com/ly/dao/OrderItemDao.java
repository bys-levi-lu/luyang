package com.ly.dao;

import java.util.List;

import com.ly.framework.QueryPageInfo;
import com.ly.model.OrderItemModel;

public interface OrderItemDao
{
	public OrderItemModel getOrderItemByPk(int orderNo);
	
	public List<OrderItemModel> getOrderItemByAddress(String address);
	
	public List<OrderItemModel> getOrderItemByDesc(String orderDesc);
	
	public List<OrderItemModel> getOrderItemByDesc(String orderDesc, QueryPageInfo pageInfo);
	
	public void createOrderItem(OrderItemModel orderItem);
	
	public void updateOrderItem(OrderItemModel orderItem);
	
	public void deleteOrderItemByPk(int orderNo);
	
	public void deleteOrderItemByAddress(String address);

	public List<OrderItemModel> getOrderItemByAddress(String address,
			QueryPageInfo pageInfo);

}
