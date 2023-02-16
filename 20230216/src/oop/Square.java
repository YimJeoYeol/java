package oop;

public class Square {
	//선언
	int x; 										//가로
	int y;										//세로
	
	int calcArea() {
		
		/*
		int result = x * y;
		return result;
		*/
		return x*y;
	}
	
	int calcRound() {
		return 2*(x+y);
	}
	
}
