package oop;

public class Cardtest {

	public static void main(String[] args) {
		
		//System.out.println("Card.wi");
		Card.width = 50;
		Card c1 = new Card();
		Card c2 = new Card();
		
		
		//Card.width = 50; // static 
		//c1.width = 150;
		//c2.height = 200;
		
		
		c1.showCard();
		c2.showCard();
		System.out.println(Math.random());
		
		

		
	}

}
