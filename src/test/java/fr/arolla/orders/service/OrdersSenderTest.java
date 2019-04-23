package fr.arolla.orders.service;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.arolla.orders.util.Drinks;
import fr.arolla.orders.util.Order;

public class OrdersSenderTest {
	
	@Test
	public void testSendOrder() {
		Order orderTeaSugar = new Order(Drinks.TEA,1);
		assertEquals("T:1:0", OrdersSender.sendOrder(orderTeaSugar));
		
		Order orderChocolateNoSugar = new Order(Drinks.CHOCOLATE,0);
		assertEquals("H::", OrdersSender.sendOrder(orderChocolateNoSugar));
	}
}
