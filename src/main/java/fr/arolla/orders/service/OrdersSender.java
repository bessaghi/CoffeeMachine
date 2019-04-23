package fr.arolla.orders.service;

import fr.arolla.orders.util.Order;

/**
 * Utility class that send Orders to the Coffee Maker.
 * 
 * @author bessaghi
 *
 */
public class OrdersSender {

	/**
	 * Translates the order to a String understandable by the coffee maker.
	 *  
	 * @param order the order to translate.
	 * @return a String containing the order.
	 */
	public static String sendOrder(Order order) {
		if (checkAmountInserted(order) == 0) {
			return order.getDrink().getAcronym() + ":" + order.getSugar() + ":" + order.getStick();
		}
		else {
			return forwardMessage("Credit not sufficient, please add " + checkAmountInserted(order) + " to complete your order.");
		}
	}
	
	/**
	 * Checks the amount inserted. 
	 * 
	 * @param order the order to check.
	 * @return 0 if the amount is higher or equal to the price, and the difference otherwise
	 */
	public static double checkAmountInserted(Order order) {
		if (order.getMoney() >= order.getDrink().getPrice()) {
			return 0;
		}
		return order.getDrink().getPrice() - order.getMoney();
	}
	
	/**
	 * Forwards a message to the User.
	 * 
	 * @param theMessage to forward. 
	 * @return
	 */
	public static String forwardMessage(String theMessage) {
		return "M:" + theMessage;
	}
}
