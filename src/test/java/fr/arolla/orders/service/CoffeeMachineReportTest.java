package fr.arolla.orders.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.arolla.orders.util.Drinks;
import fr.arolla.orders.util.Order;

/**
 * The CoffeeMachineReport tester. 
 * 
 * @author bessaghi
 *
 */
public class CoffeeMachineReportTest {

	@Test
	public void testPrintReport() {
		assertEquals("T:1:0", OrdersSender.sendOrder(new Order(Drinks.TEA, "1", 0.4)));
		assertEquals("T:1:0", OrdersSender.sendOrder(new Order(Drinks.TEA, "1", 0.4)));
		assertEquals("T:1:0", OrdersSender.sendOrder(new Order(Drinks.TEA, "1", 0.4)));
		assertEquals("T:1:0", OrdersSender.sendOrder(new Order(Drinks.TEA, "1", 0.4)));
		assertEquals("T:1:0", OrdersSender.sendOrder(new Order(Drinks.TEA, "1", 0.4)));
		assertEquals("The number of drinks sold so far is: 5.\nThe money earned is: 2.0.", CoffeeMachineReport.printReport());
	}
}
