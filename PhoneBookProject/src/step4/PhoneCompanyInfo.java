package step4;

public class PhoneCompanyInfo extends PhoneInfo {
	String company;
	
	PhoneCompanyInfo(String name, String phoneNumber, String birth,String company){
		super (name, phoneNumber,birth);
		this.company = company;
		
		
	}

	
	

	@Override
	void showPhoneInfo() {
		if(birth == null) {
			System.out.printf("이름 :%s, 폰번호 : %s, 회사 :%s%n", name, phoneNumber, company);
		}else {
			System.out.printf("이름 :%s, 폰번호 : %s, 생일 : %s,회사 :%s%n", name, phoneNumber, birth, company);
		}
	}
}
