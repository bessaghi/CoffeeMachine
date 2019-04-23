package fr.arolla.orders.util;

import java.util.Arrays;

/**
 * The Order Object.
 * @author bessaghi
 *
 */
public class Order {
	
	private static final String[] sugarValues = new String[] {"1", "2"};

	private Drinks drink;
	private String sugar;
	private String stick;
	private double money;
	
	/**
	 * The constructor.
	 * 
	 * @param drink the drink type chosen.
	 * @param sugar the amount of sugar chosen.
	 * @param money the money inserted for the drink.
	 */
	public Order(Drinks drink, String sugar, double money) {
		super();
		this.drink = drink;
		this.sugar = isSugar(sugar) ? sugar : "";
		this.money = money;
		this.stick = getStick();
	}

	private boolean isSugar(String sugar) {
		return Arrays.asList(sugarValues).contains(sugar);
	}
	
	// getters
	public String getStick() {
		if (sugar != "") {
			return "0";
		}
		return "";
	}

	public Drinks getDrink() {
		return drink;
	}

	public String getSugar() {
		return sugar;
	}

	public double getMoney() {
		return money;
	}
	
}
