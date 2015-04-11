/**
 * Author:Administrator
 * Create time:2015  下午2:40:47
 */
package com.ly.service;

import java.util.List;

import com.ly.framework.QueryPageInfo;
import com.ly.model.OrderItemModel;

/**
 * @author Administrator
 *
 */
public interface OrderItemService
{
	public OrderItemModel getOrderItemByPk(int orderNo);
	
	public List<OrderItemModel> getOrderItemByAddress(String address);
	
	public List<OrderItemModel> getOrderItemByDesc(String orderDesc);
	
	public List<OrderItemModel> getOrderItemByDesc(String orderDesc,
			QueryPageInfo pageInfo);

	List<OrderItemModel> getOrderItemByAddress(String address,
			QueryPageInfo pageInfo);

}
