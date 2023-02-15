package oop;

public class TvTest {

	public static void main(String[] args) {
		Tv t1 = new Tv();				//Tv라는 객체 선언 객체상태 인스턴스ghk
		
		System.out.println(t1.power);
		
		t1.channel = 10;
		t1.size    = 65;
		t1.color   ="red";
		t1.power   = true;
		t1.volum   = 50;
		
		t1.channelUp(); 				//메소드 호출
		
		System.out.println(t1.volum);
		

	}

}
