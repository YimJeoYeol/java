package oop;

public class ChargerTest {

	public static void main(String[] args) {
		Charger ch = new Charger();
		
		ch.brand = "APPLE";
		ch.price = 25000;
		ch.size  = 2.0;
		ch.type  = "CType";
		
		System.out.println(ch.brand);
		System.out.println(ch.price);
		System.out.println(ch.type);
		System.out.println(ch.size);

	}

}
