package fr.arolla.orders.util;

/**
 * Enumeration for the available Drinks. 
 * @author bessaghi
 *
 */
public enum Drinks {

	CHOCOLATE ("H"),
	COFFEE ("C"),
	TEA ("T");
	
	private String acronym;
	
	Drinks (String acronym) {
		this.acronym = acronym;
	}
	
	public String getAcronym() {
		return acronym;
	}
}
