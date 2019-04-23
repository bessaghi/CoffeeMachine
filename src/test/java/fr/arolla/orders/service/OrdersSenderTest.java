package fr.arolla.orders.service;
import static org.junit.Assert.assertEquals;

import fr.arolla.orders.util.Order;

public class OrdersSenderTest {

	public void testSendOrders() {
		Order order = new Order("tea",1);
		assertEquals("T:1:0", OrdersSender.sendOrder(order));
	}
}
