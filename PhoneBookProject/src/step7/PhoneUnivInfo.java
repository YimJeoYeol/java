package step7;

public class PhoneUnivInfo extends PhoneInfo {
	String major;
	int grade;
	
	public PhoneUnivInfo(String name, String phoneNumber, String birth,String major, int grade) {
		super(name, phoneNumber, birth);
		this.major = major;
		this.grade = grade;
	}

	@Override
	void showPhoneInfo() {
		if(birth == null) {
			System.out.printf("%s : %s : %s : %d%n",name, phoneNumber, major, grade);
		} else {
			System.out.printf("%s : %s : %s : %s : %d%n",name, phoneNumber, birth, major, grade);
		}
	}
	
	
	
}
