package com.ly.test.service;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ly.framework.QueryPageInfo;
import com.ly.model.OrderItemModel;
import com.ly.service.OrderItemService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class OrderItemServiceTestCase
{
	@Autowired
	private OrderItemService service;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
	}

	@Before
	public void setUp() throws Exception
	{
	}

	@After
	public void tearDown() throws Exception
	{
	}

	@Test
	public void testPage()
	{
		QueryPageInfo pageInfo = new QueryPageInfo(3, 10);
		List<OrderItemModel> list = service.getOrderItemByAddress("南山",pageInfo);
		assertNotNull(list);
	}
	
	@Test
	public void test()
	{
		OrderItemModel model = service.getOrderItemByPk(1);
		assertNotNull(model);
	}

}
