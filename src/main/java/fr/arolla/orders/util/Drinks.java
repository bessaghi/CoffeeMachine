package fr.arolla.orders.util;

/**
 * Enumeration for the available Drinks. 
 * @author bessaghi
 *
 */
public enum Drinks {

	CHOCOLATE ("H", 0.5),
	COFFEE ("C", 0.6),
	HOT_COFFEE ("Ch", 0.6),
	ORANGE_JUICE ("O", 0.6),
	TEA ("T", 0.4);
	
	private String acronym;
	private double price;
	
	Drinks (String acronym, double price) {
		this.acronym = acronym;
		this.price = price;
	}
	
	public String getAcronym() {
		return acronym;
	}
	
	public double getPrice() {
		return price;
	}
}
