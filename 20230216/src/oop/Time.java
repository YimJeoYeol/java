package oop;

public class Time {
	
	
	private int hour;												//접근제어지시자 , proteted, public,()dafult
	private int minute;
	private float second;
	
	
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		//if(hour <0 || hour>23) return;
		if(hour >=0 && hour<24)
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if(minute >=0 && minute <60 )
		this.minute = minute;
	}
	public float getSecond() {
		return second;
	}
	public void setSecond(float second) {
		if(second >=0 && second <60)
		this.second = second;
	}
	void showTime() {
		
		System.out.printf("%d:%d:%f%n",hour,minute,second);
		
	}
}
