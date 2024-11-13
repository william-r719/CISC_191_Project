package package_1;
/**
 * Lead Author(s):
 * @author William Rodriguez
 * @author Scott Sihakoun
 * 
 * Other contributors:
 * <<add additional contributors (mentors, tutors, friends) here, with contact information>>
 * 
 * References:
 * Tasha Frankie
 *  
 * Version/date:  
 * 10/25/2024
 * 
 * Responsibilities of class: 
 * Retrieves the rank such as King, Queen, Jack, etc.... Also retrieves the suit of the card such as 
 * hearts, spades, etc....
 * 
 */
public class Card {

	// Attributes
	// Cards have a rank and a suit
	private int rank;
	private String suit;

	/**
	 * Purpose: Constructor of the Card class(rank, suit)
	 * 
	 * @return rank
	 * 
	 */
	public Card(int rank, String suit) 
	{
		this.rank = rank;
		this.suit = suit;
	}

	/**
	 * Purpose: Gets the rank of the card
	 * 
	 * @return rank
	 */
	public int getRank() 
	{
		return rank;
	}

	/**
	 * Purpose: Gets the suit of the card
	 * 
	 * @return suit
	 */
	public String getSuit() 
	{
		return suit;
	}
	
	/**
	 * Purpose: Returns the rank(int) as a string using 
	 * 			switch statement
	 * 
	 * @return A string corresponding with the rank
	 */
	public String getRankAsString() {
		switch (rank) {
		case 1: return "Ace";
		case 11: return "Jack";
		case 12: return "Queen";
		case 13: return "King";
		// Using valueOf method from String class
		default: return String.valueOf(rank);  //Returns 2-10 as a string "2", "5" etc.
		}
	}
	
	// Overrides toString() method to give a full description of the card
	 @Override
	 public String toString() {
		 return getRankAsString() + " of " + suit;
	 }

}
