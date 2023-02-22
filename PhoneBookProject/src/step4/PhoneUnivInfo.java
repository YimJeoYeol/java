package step4;

public class PhoneUnivInfo extends PhoneInfo {

		String majo;
		int grad;
		
		
		PhoneUnivInfo(String name, String phoneNumber, String birth,String majo,int grade){
			super (name, phoneNumber,birth);
			this.majo = majo;
			this.grad = grade;
			
		}
		
		@Override
		void showPhoneInfo() {
			if(birth == null) {
				System.out.printf("이름 :%s, 폰번호 : %s, 대학 : %s, 학과 : %s%n", name, phoneNumber, majo, grad);
			}else {
				System.out.printf("이름 :%s, 폰번호 : %s, 생일 : %s, 대학 : %s, 학과 : %s%n", name, phoneNumber, birth, majo, grad);
			}
			
		}
	}


