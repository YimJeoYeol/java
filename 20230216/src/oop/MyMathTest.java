package oop;

public class MyMathTest {

	public static void main(String[] args) {
		
		//overloading 책 283
		MyMath mm = new MyMath();
		
		//호출
		int r = mm.add(45, 33);
		//double r2 = mm.divide(10, 3);
		
		System.out.println(r);
		System.out.println(mm.substract(100, 50));
		System.out.println(mm.mutiply(100, 50));
		System.out.println(mm.divide(100, 33));
		System.out.println(mm.add(1.5, 3.8));
		System.out.println(mm.add(9999999999999L, 9999999999999L));
		System.out.println(mm.add(10, 20, 30));
		//System.out.println(mm.add2(1.5, 1.8));
		

	}

}
