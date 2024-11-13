package package_1;

import java.util.ArrayList;
import java.util.Collections;
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
 * Tasha Frankie
 *  
 * Version/date:  
 * 10/25/2024
 * 
 * Responsibilities of class: 
 * 
 * 
 */
public class Deck 
{

	private List<Card> Deck;
	
	/**
	 * Purpose: Constructor of Deck class. Initializes a new 
	 * 			deck of cards with 13 ranks and 4 suits	(52 cards)
	 * 
	 */
	public Deck() 
	{	
		// Initializes an empty list
		this.Deck = new ArrayList<>();
		
		// Define the suits of the deck
		// *Look into e-nums
		String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
		
		// Loop through each suit and create 13 cards for each suit (Ace to King)
		for (String suit : suits) 
		{
			for (int rank = 1; rank <= 13; rank++) 
			{	
				// Create a new Card object with the current rank and suit and add it to the deck
				Deck.add(new Card(rank, suit));
			}
		}

	}
	
	/**
	 * Purpose: Shuffles(randomizes) deck(ArrayList)
	 * 
	 * @return  A new set of deck or a new ArrayList of the deck 
	 * 
	 */
	public void shuffle() 
	{	// Using shuffle method from Collection class
		Collections.shuffle(Deck);
	}
	
	/**
	 * Purpose: Deals a new card from the top using
	 * 			if-statement. If the deck is not 
	 * 			empty remove the first card.
	 * 
	 * @return  The card from the top of the deck (index 0).
	 * 			Otherwise if deck is empty return null.
	 * 
	 */
	public Card dealCard() 
	{	// Checking if deck is empty
		// Using isEmpty() method from List class
		if (!Deck.isEmpty()) {
			// Using remove method from List class
			return Deck.remove(0);
		} else {
			// No cards left to deal
			return null; 
		}
	}
	
	/**
	 * Purpose: Resets the the deck by clearing all existing cards(elements)
	 * 			in the deck(array) and creating a new set of 52 cards
	 * 			(13 ranks, 4 suits)
	 *
	 */
	public void resetDeck() {
		
		// Clear cards from deck using clear() method from
		// the List class
		Deck.clear();
		
		// Populating deck 
		String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
		
		// Same logic from constructor 
		for (String suit : suits) 
		{
			for (int rank = 1; rank <= 13; rank++) 
			{
				Deck.add(new Card(rank, suit));
			}
		}
	}
}
