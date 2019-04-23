package fr.arolla.orders.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * The CoffeeMachineReport tester. 
 * 
 * @author bessaghi
 *
 */
public class CoffeeMachineReportTest {

	@Test
	public void testPrintReport() {
		assertEquals("The number of drinks sold so far is: 9.\nThe money earned is: 3.5", CoffeeMachineReport.printReport());
	}
}
