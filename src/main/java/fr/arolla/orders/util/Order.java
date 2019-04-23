package fr.arolla.orders.util;

/**
 * The Order Object.
 * @author bessaghi
 *
 */
public class Order {

	private String drink;
	private int sugar;
	
	/**
	 * The constructor.
	 * 
	 * @param drink the drink type chosen.
	 * @param sugar the amount of sugar chosen.
	 */
	public Order(String drink, int sugar) {
		super();
		this.drink = drink;
		this.sugar = sugar;
	}
	
	
}
