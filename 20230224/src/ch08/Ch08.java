package ch08;

public class Ch08 {


public static void main(String[] args) {
	int number = 100;
	int result = 10;

	for(int i = 0; i < 10; i++) {
		try{
			result = number / (int)(Math.random() * 10);
			System.out.println(result);
		}catch(ArithmeticException e) {
			System.out.println("000");
		}finally {
			System.out.println("----------------");
		}
		System.out.println(result);
	}
	
	}



}