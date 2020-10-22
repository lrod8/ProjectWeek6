package War;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	//Fields
	
	private String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
	private String[] card = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
	private List<Card> cards = new ArrayList<Card>();
	
	//Constructor
	//When new Deck instantiated, the Cards field should be populated w/ standard 52 cards
	public Deck() { 
		for (int y = 0; y < suit.length; y++) {
			int z = 2;
			for (int x = 0; x < card.length; x++) {	
				cards.add(new Card(z, card[x] + " of " + suit[y]));
				z++;
			}
		}
	}

	//Methods
	
	//Randomizes the order of the cards
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	//Removes and returns the top card of the Cards field
	public Card draw() {
		return cards.remove(0);
	}

}
