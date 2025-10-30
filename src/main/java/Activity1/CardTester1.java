package Activity1;
/**
 * This is a class that tests the Card class.
 */
public class CardTester1 {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card1 c1 = new Card1("jack", "diamonds", 5);
		Card1 c2 = new Card1("king", "hearts", 6);
		Card1 c3 = new Card1("queen", "spades", 7);
		
		c1.suit();
		c2.rank();
		c3.pointValue();
		
		c1.matches(c2);
		c3.toString();
	}
}
