package oop;

public class Cardtest1 {

	public static void main(String[] args) {
		/*책 248 예제 6-5*/
		//System.out.println((card.num));//오류난다
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.num = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.num = 4;
		System.out.println("c1은 " + c1.kind + ", " + c1.num + "이며, 크기는 (" + c1.width +","+c1.height+ ")");
		System.out.println("c2은 " + c2.kind + ", " + c2.num + "이며, 크기는 (" + c2.width +","+c2.height+ ")");
		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
		/*
		 * c1.width  = 50;
		 * c1.height = 80;
		*/
		
		Card.height = 50;
		Card.width  = 80;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.num + "이며, 크기는 (" + c1.width +","+c1.height+ ")");
		System.out.println("c2은 " + c2.kind + ", " + c2.num + "이며, 크기는 (" + c2.width +","+c2.height+ ")");
		

	}

}
