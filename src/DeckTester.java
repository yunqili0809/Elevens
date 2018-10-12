/** * This is a class that tests the Deck class.* * */
public class DeckTester { 
	/** * The main method in this class checks the Deck operations for consistency. 
	 * * @param args is not used. */ 
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */ 
		// Deck 1
		System.out.println("---Deck 1 Tests----");
		String[] ranks1 = {"one","two","jack","queen","king"};
		String[] suits1 = {"blue","green","yellow"};
		int[] points1 = {1,2,3,10,11};
		Deck one = new Deck(ranks1,suits1,points1);
		System.out.println("Deck 1 isEmpty:" + one.isEmpty());
		System.out.println("Deck 1 toString:" + one.toString());
		System.out.println(one);
		// Deck 2
		System.out.println("---Deck 2 Tests----");
		String[] ranks2 = {"ace","two","three","fore","five","six","seven","eight","nine","ten","jack","queen","king"};
		String[] suits2 = {"spades","hearts","clubs","diamonds"};
		int[] points2 = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		Deck two = new Deck(ranks2,suits2,points2);
		System.out.println("Deck 2 isEmpty:" + two.isEmpty());
		System.out.println("Deck 2 toString:" + two.toString());
		System.out.println(two);
		// Deck 3
		System.out.println("---Deck 3 Tests----");
		Deck three = new Deck(ranks2,suits2,points2);
		System.out.println("Deck 3 isEmpty:" + three.isEmpty());
		System.out.println("_DEALING CARDS_");
		while(!three.isEmpty()){
			System.out.println(three.deal());
			}
		System.out.println("Deck 3 isEmpty:" + three.isEmpty());
	} }