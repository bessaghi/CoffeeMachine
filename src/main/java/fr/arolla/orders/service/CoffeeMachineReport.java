package fr.arolla.orders.service;

/**
 * Utility class for the Coffee Machine's Report.
 * 
 * @author bessaghi
 *
 */
public class CoffeeMachineReport {

	/**
	 * Prints the Coffee Machine's Report.
	 * 
	 * @return a String resuming the number of drinks sold and the money earned.
	 */
	public static String printReport() {
		return "The number of drinks sold so far is: " + OrdersSender.getOrdersNumber() + ".\nThe money earned is: " + OrdersSender.getMoneyEarned() + ".";
	}
}
