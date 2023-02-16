package oop;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		
	
		/*객채 배열*/
		Square[] sArr = new Square[5]; 					//Square를 배열
		
		System.out.println(sArr); 						// 콘솔에 나오는게 "["객체가 배열이 되었다는 표시
		System.out.println(sArr[0]);
		System.out.println(Arrays.toString(sArr));
		
		for(int i=0; i<sArr.length; i++) {
		sArr[i] = new Square();
		}
		System.out.println(Arrays.toString(sArr));
		
		sArr[0].x = 20;
		sArr[0].y = 30;
		System.out.println("첫번째 사각형 넓이 : " + sArr[0].calcArea());
		System.out.println("첫번째 사각형 둘래 : " + sArr[0].calcRound());
		
	}

}
