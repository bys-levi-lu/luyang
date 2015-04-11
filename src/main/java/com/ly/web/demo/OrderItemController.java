package com.ly.web.demo;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ly.model.OrderItemModel;
import com.ly.service.OrderItemService;

@Controller
@RequestMapping("/orderItem")
@Scope(value="prototype")
public class OrderItemController
{
	@Resource
	private OrderItemService orderItemService;
	
	@RequestMapping(value="/query/{desc}", method=RequestMethod.GET, produces="application/json;charset=UTF-8")
	@ResponseBody
	public List<OrderItemModel> getOrderListByDesc(@PathVariable String desc)
	{
    	System.out.println("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB");
		List<OrderItemModel> orderItemList = orderItemService.getOrderItemByDesc(desc);
		return orderItemList;
	}
	
	@RequestMapping(value="/queryjson/{desc}/*.json", method=RequestMethod.GET)
	@ResponseBody
	public List<OrderItemModel> getOrderJson(@PathVariable String desc)
	{
		List<OrderItemModel> orderItemList = orderItemService.getOrderItemByDesc(desc);
		return orderItemList;
	}
	
	@RequestMapping(value="/orderlist")
	public String forwardOrderList()
	{
		return "orderItem";
	}
	
}
