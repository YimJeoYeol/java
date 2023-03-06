package step8;

import java.io.Serializable;

public class PhoneInfo implements Serializable{
	String name;
	String phoneNumber;
	String birth;
	
	PhoneInfo(){}
	
	//생성자 오버로딩
	PhoneInfo(String name, String phoneNumber, String birth){
		this(name, phoneNumber);
		this.birth = birth;
	}
	
	@Override
	public int hashCode() {
		return (name).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof PhoneInfo) {
			PhoneInfo tmp = (PhoneInfo)obj;
			return name.equals(tmp.name) ;
		}
		return false;
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
