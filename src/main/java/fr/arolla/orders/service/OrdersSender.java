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
		return order.getDrink().getAcronym() + ":" + order.getSugar() + ":" + order.getStick();
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
