package step1;

public class PhonBookVer01 {

	public static void main(String[] args) {
		PhoneInfo p1 = new PhoneInfo();
		PhoneInfo p2 = new PhoneInfo();
		//PhoneInfo p3 = new PhoneInfo("shin", "010-8989-1234", "1999/12/31");
		PhoneInfo p4 = new PhoneInfo("Oh", "010-1346-6666");
		PhoneInfo p5 = new PhoneInfo("shin", "010-8989-1234", "1999/12/31");
		
		p1.name="이정희";
		p1.phoneNumber="010-3398-9750";
		p1.birth="99/07/08";
		p2.name="임재열";
		p2.phoneNumber="010-6653-9776";
		p2.birth="93/07/26";
		
		
		p1.showPhoeInfo();
		p2.showPhoeInfo();
		//p3.showPhoeInfo();
		p4.showPhoeInfo();
		p5.showPhoeInfo();
	}

}
