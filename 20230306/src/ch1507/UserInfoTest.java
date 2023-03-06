package ch1507;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class UserInfoTest {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("UserInfo.dat");
			ObjectOutputStream out = new ObjectOutputStream(fos);
			UserInfo u1 = new UserInfo();
			UserInfo u2 = new UserInfo("shin", "2222", 10);
			ArrayList list = new ArrayList();
			list.add(u1);
			list.add(u2);
			
			out.writeObject(new UserInfo());
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
