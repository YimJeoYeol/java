package oop;

public class TimeTest {

	public static void main(String[] args) {
		Time t1 = new Time();
		
		/*
		t1.hour = 25;
		t1.minute = 78;
		t1.second =99;
		*/
		
		t1.setHour(23);
		t1.setMinute(23);
		t1.setSecond(23);
		
		t1.showTime();
		

	}

}
