package com.ly.model;

public class OrderItemModel
{
	private Integer orderNo;
	
	private String orderDesc;
	
	private String orderAddress;
	
	private String orderPhone;

	public Integer getOrderNo()
	{
		return orderNo;
	}

	public void setOrderNo(Integer orderNo)
	{
		this.orderNo = orderNo;
	}

	public String getOrderDesc()
	{
		return orderDesc;
	}

	public void setOrderDesc(String orderDesc)
	{
		this.orderDesc = orderDesc;
	}

	public String getOrderAddress()
	{
		return orderAddress;
	}

	public void setOrderAddress(String orderAddress)
	{
		this.orderAddress = orderAddress;
	}

	public String getOrderPhone()
	{
		return orderPhone;
	}

	public void setOrderPhone(String orderPhone)
	{
		this.orderPhone = orderPhone;
	}

}
