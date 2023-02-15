package oop;

public class Tv {
	//특징. 속성 		--> 맴버 변수 property
	int size;
	String color;
	int volum;
	int channel;
	boolean power;
	
	//행위. action	--> 맴법 메소드 function
	void power() 
	{
		power =! power;
	}
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
	
	void volumUp() {
		volum = volum + 5;
	}
	void volumDown() {
		volum = volum - 5;
	}
	
	
}
