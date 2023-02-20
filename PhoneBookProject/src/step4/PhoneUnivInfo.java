package step4;

/**
 * @author HKIT
 *
 */
public class PhoneUnivInfo extends PhoneInfo {
	String majo;
	String grad;
	
	PhoneInfo pi = new PhoneInfo();
	
	PhoneUnivInfo(String name, String phoneNumber, String birth,String majo,String grad){
		super (name, phoneNumber,birth);
		this.majo = majo;
		this.grad = grad;
		
	}
	
	@Override
	void showPhoneInfo() {
		if(pi.birth == null) {
			System.out.printf("이름 :%s, 폰번호 : %s, 대학 : %s, 학과 : %s%n", pi.name, pi.phoneNumber, majo, grad);
		}else {
			System.out.printf("이름 :%s, 폰번호 : %s, 생일 : %s%n, 대학 : %s, 학과 : %s%n", pi.name, pi.phoneNumber, pi.birth, majo, grad);
		}
		
	}
}
