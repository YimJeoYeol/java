package oop;

public class MyMath {
	
	//overloading 책 283
	int add(int x, int y) {
		return x+y;
	}
	/*
	int add(int a, int b) {
		return a+b;
	}
	
	int add(int x, int y){
		return x + int y;
	*/
	//overloading
	double add(double x, double y) { //오버로딩 타입, 갯이 틀리면 , 형변환 
		return x + y;
	}
	
	long add(long x, long y) {
		return x + y;
	}
	long add(long a, long b, long c) {
		return a + b + c;
	}
	
	
	
	int substract(int x, int y) {
		return x-y;
	}
	
	int mutiply(int x, int y) {
		return x * y;
	}
	
	double divide(double x, double y) {
		return x / y;		//정수 나누기 정수라서 더블로 함
	}
}
