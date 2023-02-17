package step2;

public class PhoneInfo {
	
	String name;
	String phoneNumber;
	String birth;
	//메소드 일종 오버로딩
	PhoneInfo(){} 
	//생성자 오버로딩
	PhoneInfo(String name, String phoneNumber, String birth){
		/*this.name 			= name;
		this.phoneNumber 	= phoneNumber;
		*/
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birth 			= birth;
	}
	PhoneInfo(String name, String phoneNumber){
		this.name 		 	= name;
		this.phoneNumber 	= phoneNumber;
	}
	

	
	void showPhoneInfo() {
		if(birth == null) {
			System.out.printf("이름 :%s, 폰번호 : %s%n", name, phoneNumber);
		}else {
			System.out.printf("이름 :%s, 폰번호 : %s, 생일 : %s%n", name, phoneNumber, birth);
		}
		
	}
	
	
}
