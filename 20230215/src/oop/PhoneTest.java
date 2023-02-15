package oop;

public class PhoneTest {

	public static void main(String[] args) {
		Phone pn = new Phone();
		
		
		
		pn.Brand  = "APPLE";
		pn.memory = 256;
		pn.price  = 10000000;
		pn.ram    = 8;
		pn.size   = 7;
		pn.volum  =	50;
		pn.power  = true;
		
		System.out.println(pn.Brand);
		System.out.println(pn.memory);
		System.out.println(pn.price);
		System.out.println(pn.ram);
		System.out.println(pn.size);
		System.out.println(pn.volum);
		System.out.println(pn.power);
	}

}
