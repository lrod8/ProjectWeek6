package War;

public class App {

	public static void main(String[] args) {
		
		Deck deck = new Deck();
		
		Player p1 = new Player("Bob");
		Player p2 = new Player("Sue");
		
		deck.shuffle();
		
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				p1.draw(deck);
			} else {
				p2.draw(deck);
			}
		}
		
		p1.describe();
		
		System.out.println("************************************");
		
		p2.describe();
		
		System.out.println("************************************");
		
		for (int i = 0; i < 26; i++) {
			System.out.println("Round " + (i + 1));
			System.out.println("");
			Card p1card = p1.flip();
			System.out.println(p1.getName() + " flips: " + "\t" + p1card.getName());
			Card p2card = p2.flip();
			System.out.println(p2.getName() + " flips: " + "\t" + p2card.getName());
			System.out.println("");
			if (p1card.getValue() > p2card.getValue()) {
				p1.incrementScore();
				System.out.println(p1.getName() + " wins the round!");
			} else if (p1card.getValue() < p2card.getValue()) {
				p2.incrementScore();
				System.out.println(p2.getName() + " wins the round!");
			} else if (p1card.getValue() == p2card.getValue()) {
				System.out.println("It's a tie!");
			}
			System.out.println("************************************");
		}
		
		System.out.println("Final Score: ");
		
		System.out.println("");
		
		System.out.println("Player 1 Score: " + p1.getScore());
		
		System.out.println("Player 2 Score: " + p2.getScore());
		
		System.out.println("");
		
		if (p1.getScore() > p2.getScore()) {
			System.out.println("Player 1 Wins!");
		} else if (p1.getScore() < p2.getScore()) {
			System.out.println("Player 2 Wins!");
		} else {
			System.out.println("It's a Draw!");
		}
		
	}	

}
