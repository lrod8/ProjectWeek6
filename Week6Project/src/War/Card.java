package War;

public class Card {
	
	//Fields
	
	private int value;
	private String name;
	
	public Card(int value, String name) {
		this.value = value;
		this.name = name;
	}
	
	//Methods
	
	//Prints out information about a card
	public void describe() {
		System.out.println("Card: " + this.name + "\tValue: " +  this.value);
	}
	
	//Getters

	public int getValue() {
		return value;
	}

	public String getName() {
		return name;
	}
	
}
