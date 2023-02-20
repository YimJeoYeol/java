package chapter074;

import chapt0745.Time;

public class ChildTime2 extends Time {
	void method2() {
		//System.out.println(second2);	//private
		//System.out.println(second1);	//같은 패키지x
		System.out.println(minut);		//protected라서
		System.out.println(hour);		//public
	}
}
