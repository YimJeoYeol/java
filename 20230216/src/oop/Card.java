package oop;

public class Card {
	/*책 248 예제 6-5*/
	
	
	//int number;
	String kind;
	int num;
	static int width = 100;
	static int height = 250;
	
	
	void showCard() {
		System.out.printf("%s, %d, %d, %d%n", kind, num, width, height);
	}
}
