package com.ly.business;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ly.dao.OrderItemDao;
import com.ly.framework.QueryPageInfo;
import com.ly.model.OrderItemModel;
import com.ly.service.OrderItemService;

@Service
public class OrderItemBusiness implements OrderItemService
{
	@Resource
	private OrderItemDao dao;

	@Override
	public OrderItemModel getOrderItemByPk(int orderNo)
	{
		return dao.getOrderItemByPk(orderNo);
	}

	@Override
	public List<OrderItemModel> getOrderItemByAddress(String address)
	{
		return dao.getOrderItemByAddress(address);
	}
	
	@Override
	public List<OrderItemModel> getOrderItemByAddress(String address, QueryPageInfo pageInfo)
	{
		return dao.getOrderItemByAddress(address, pageInfo);
	}

	@Override
	public List<OrderItemModel> getOrderItemByDesc(String orderDesc)
	{
		return dao.getOrderItemByDesc(orderDesc);
	}
	
	@Override
	public List<OrderItemModel> getOrderItemByDesc(String orderDesc,
			QueryPageInfo pageInfo)
	{
		return dao.getOrderItemByDesc(orderDesc, pageInfo);
	}

}
