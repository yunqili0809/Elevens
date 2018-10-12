/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
	//card 1
		System.out.println("---Card 1 Tests----");
		Card one = new Card("ace", "spade",1);
		System.out.println("Card 1 suit:" + one.suit());
		System.out.println("Card 1 rank:" + one.rank());
		System.out.println("Card 1 point:" + one.pointValue());
	//card 2	
		System.out.println("---Card 2 Tests----");
		Card two = new Card("ace", "spade",1);
		System.out.println("Card 2 suit:" + two.suit());
		System.out.println("Card 2 rank:" + two.rank());
		System.out.println("Card 2 point:" + two.pointValue());
		System.out.println("Card 1 matches Card 2:" + one.matches(two ));
		//card3
		System.out.println("---Card 3 Tests----");
		Card three = new Card("oh","ha",2);
		System.out.println("Card 3 suit:" + three.suit());
		System.out.println("Card 3 rank:" + three.rank());
		System.out.println("Card 3 point:" + three.pointValue());
		System.out.println("Card 1 matches Card 3:" + one.matches(three ));
		
	}
}
