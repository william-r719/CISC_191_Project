package package_1;

public class Dealer {
	/**
	 * Lead Author(s):
	 * @author William Rodriguez
	 * @author Scott Sihakoun
	 * 
	 * Other contributors:
	 * <<add additional contributors (mentors, tutors, friends) here, with contact information>>
	 * 
	 * References:
	 *  
	 * Version/date:  
	 * 10/25/2024
	 * 
	 * Responsibilities of class: 
	 * 
	 * 
	 */
	private Deck dealer;
	
	/**
	 * Purpose: Constructor of dealer
	 * 
	 */
	//dealer gets a hand too maybe?
	public Dealer() {
		this.dealer = new Deck();
		
	}
	
	/**
	 * Purpose: Has the dealer shuffle the deck
	 * 
	 */
	public void shuffleDeck() {
		dealer.shuffle();
	}
	
	/**
	 * Purpose: Has the dealer deal a card
	 * 
	 * @return  The card from the top of the deck
	 * 			(index 0) 
	 * 
	 */
	public Card dealCard() {
		return dealer.dealCard();
	}
	
	/**
	 * Purpose: Has the dealer create a new deck
	 *  
	 */
	public void resetDeck() {
		dealer.resetDeck();
	}
}
