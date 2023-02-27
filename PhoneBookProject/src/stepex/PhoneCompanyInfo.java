package stepex;

public class PhoneCompanyInfo extends PhoneInfo {
	String company;

	public PhoneCompanyInfo(String name, String phoneNumber, String birth,String company) {
		super(name, phoneNumber, birth);
		this.company = company;
	}

	@Override
	void showPhoneInfo() {
		if(birth == null) {
			System.out.printf("%s : %s : %s%n",name, phoneNumber, company);
		} else {
			System.out.printf("%s : %s : %s : %s%n",name, phoneNumber, birth, company);
		}
	}
	
	
}
