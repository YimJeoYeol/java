package oop;

public class SquareTest {

	public static void main(String[] args) {
		// Square라는 객체를 가져오는 선언. 참조용 new 인스턴스화, Square()->생성자(초기화해줌)
		Square s1 = new Square();
		Square s2 = new Square();
		
		
		s1.x = 5;
		s1.y = 7;
		s2.x = 10;
		s2.y = 10;
		
		System.out.println(s1.x);
		System.out.println(s1.y);
		System.out.println(s2.x);
		System.out.println(s2.y);
		System.out.println("S1 넓이 : "+s1.calcArea());
		System.out.println("S1 둘래 : "+s1.calcRound());
		System.out.println("S2 넓이 : "+s2.calcArea());
		System.out.println("S2 둘래 : "+s2.calcRound());
		
		/*
		int i;
		System.out.println(i);
		*/

	}

}
