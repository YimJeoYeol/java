package ch1507;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class UserInfoTest2 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("UserInfo.dat");
			ObjectInputStream in = new ObjectInputStream(fis);
			ArrayList list = (ArrayList)in.readObject();
			System.out.println(list);
		}catch(Exception e) {
			
		}

	}

}
