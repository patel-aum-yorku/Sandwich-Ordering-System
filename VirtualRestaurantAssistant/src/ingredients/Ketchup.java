package ingredients;

import model.Ingredient;

public class Ketchup extends Ingredient{
	protected String name;
	protected double price;
	protected String type;
	
	/**
	 * Instantiates meat ball object with the given parameters 
	 * @param name
	 * @param price
	 * @param type
	 */
	public Ketchup(String name, double price, String type) {
		super.name = name;
		super.price = price;
		super.type = type;
	}
	
}
