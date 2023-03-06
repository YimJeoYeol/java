package ch1507;

import java.io.Serializable;

public class UserInfo implements Serializable{
	String name;
	String password;
	int age;
	
	public UserInfo() {
		this("hong", "1111", 20);
	}
	
	public UserInfo(String name, String password, int age) {
		this.name = name;
		this.password = password;
		this.age = age;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", password=" + password + ", age=" + age + "]";
	};
	
}
