package fr.arolla.orders.util;

/**
 * The Order Object.
 * @author bessaghi
 *
 */
public class Order {

	private Drinks drink;
	private int sugar;
	private String stick;
	
	/**
	 * The constructor.
	 * 
	 * @param drink the drink type chosen.
	 * @param sugar the amount of sugar chosen.
	 */
	public Order(Drinks drink, int sugar) {
		super();
		this.drink = drink;
		this.sugar = sugar;
		this.stick = getStick();
	}

	// getters
	public String getStick() {
		if (sugar > 0) {
			return "0";
		}
		return "";
	}

	public Drinks getDrink() {
		return drink;
	}

	public int getSugar() {
		return sugar;
	}
	
}
