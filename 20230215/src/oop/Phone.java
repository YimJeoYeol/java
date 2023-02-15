package oop;

public class Phone {
	
	String  Brand;
	int 	memory;
	int 	ram;
	int 	price;
	boolean power;
	int 	size;
	int 	volum;
	
	
	void power() 
	{
		power =! power;
	}
	
	void volumUp() 
	{
		volum = volum + 5;
	}
	
	void volumDown() {
		volum = volum - 5;
	}
}
