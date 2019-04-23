package fr.arolla.orders.util;

/**
 * The Order Object.
 * @author bessaghi
 *
 */
public class Order {

	private Drinks drink;
	private String sugar;
	private String stick;
	
	/**
	 * The constructor.
	 * 
	 * @param drink the drink type chosen.
	 * @param sugar the amount of sugar chosen.
	 */
	public Order(Drinks drink, String sugar) {
		super();
		this.drink = drink;
		this.sugar = isSugar(sugar) ? sugar : "";
		this.stick = getStick();
	}

	private boolean isSugar(String sugar) {
		return "1".equals(sugar) || "2".equals(sugar);
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
	
}
