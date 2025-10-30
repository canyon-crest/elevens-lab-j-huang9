package Activity2;

import Activity1.Card1;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester2 {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {

		String[] ranks = {"jack", "queen", "king"}; 
		String[] suits = {"blue", "red"}; 
		int[] pointValues = {11, 12, 13}; 
		Deck2 d = new Deck2(ranks, suits, pointValues);
		
		d.deal();
		d.toString();
		d.isEmpty();

	}
}
