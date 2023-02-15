package oop;

public class NoteBook {
	
	String core;
	String memory;
	int size;
	int ram;
	String color;
	boolean power;
	int volum;
	String brand;
	int price;
	
	void power() {
		power =! power;
	}
	void volumUp() {
		volum = volum + 10;
	}
	void volumDown() {
		volum = volum -10;
	}
	

}
