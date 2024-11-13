package package_1;

import java.util.ArrayList;
import java.util.List;
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
public class Player {
	
	// Player has a hand of cards
	private List<Card> hand;
	
	// should we make a score class?
	private int score = 0;
	
	/**
	 * Purpose: Constructor of player
	 * 
	 */
	public Player(){
		// Gives the players hand an empty list
		hand = new ArrayList<>();
	}
	
	/**
	 * Purpose: Adds a card to the players hand
	 * 
	 * @return  A card to the players hand 
	 * 
	 */
	public void addCardToHand(Card card) {
		// Adds using add() method from List class
		hand.add(card);
		
	}
	
	/**
	 * Purpose: Returns hand to player
	 * 
	 * @return Hand
	 * 
	 */
	public List<Card> getHand(){
		return hand;
	}
	
	/**
	 * Purpose: Returns the score of the player
	 * 
	 * @return  The score
	 * 
	 */
	public int getScore() {
		return score;
	}
	
	/**
	 * Purpose: Clears the hand of the player 
	 * 
	 */
	public void resetHand() {
		// Clears by using clear() method from List class
		hand.clear();
	}
}
