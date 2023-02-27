package step6;

public class PhoneInfo {
	String name;
	String phoneNumber;
	String birth;
	
	PhoneInfo(){}
	
	//생성자 오버로딩
	PhoneInfo(String name, String phoneNumber, String birth){
		this(name, phoneNumber);
		this.birth = birth;
	}
	
	PhoneInfo(String name, String phoneNumber){
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	void showPhoneInfo() {
		if(birth == null) {
			System.out.printf("%s : %s%n",name, phoneNumber);
		} else {
			System.out.printf("%s : %s : %s%n",name, phoneNumber, birth);
		}
	}
}
