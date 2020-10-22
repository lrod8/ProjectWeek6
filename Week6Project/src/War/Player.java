package War;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	//Fields
	
	private String name;
	private int score;
	private List<Card> hand = new ArrayList<Card>();

	//Constructor
	//Score set to 0 in constructor
	public Player(String name) {
		this.name = name;
		this.score = 0;
	}
	
	//Methods
	
	//Prints out information about the player and calls the describe method for each card in the Hand List
	public void describe()	{
		System.out.println("Player Name: " + name + "\nPlayer Score: " + score + "\nHand:  ");
		for(Card h : hand) {
			h.describe();
		}
	}
	
	//Removes and returns the top card of the Hand
	public Card flip()	{
		return hand.remove(0);
	} 
	
	//Takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	//Adds 1 to the Player's score field
	public void incrementScore() {
		score += 1;
	}
	
	//Getters
	
	public String getName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}

}
