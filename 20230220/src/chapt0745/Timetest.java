package chapt0745;

import chapter0705.Child;

public class Timetest {

	public static void main(String[] args) {
		Child ct = new ChilTime();
		
		ct.hour = 10;					//모든클래스 가능
		System.out.println(ct.hour);
		
		ct.minut = 55; 					//protected : 같은 패키지. and 다른패키지의 자손클래스
		ct.second1 = 15;				//deault 	: 같은 패키지
		
	}

}
