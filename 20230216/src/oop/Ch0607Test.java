package oop;

public class Ch0607Test {

	public static void main(String[] args) {
		
		firstMethod();
		System.out.println("main");
	}
	static void firstMethod() {
		secondMethod();
		System.out.println("first");
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()");
	}

}
