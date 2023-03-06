package ex1130;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx02 {

	public static void main(String[] args) {
		//책 646 예제 11-30
		Scanner sc = new Scanner(System.in); 							//화면으로부터 라인단위로 입력받는다.
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");
		System.out.println(map);
		
		
		while(true) {
			System.out.println("id와 password를 입력해주세요.");
			System.out.print("id : ");
			String id = sc.nextLine().trim();
			
			System.out.println("password : ");
			String password = sc.nextLine().trim();
			System.out.println();
			
			if(map.containsKey(id) && map.get(id).equals(password)) {
				System.out.println("LOGIN SUCCESS!!");
				break;
			}else {
				System.out.println("ID 또는 PWD 오류. Login Fail");
				continue;
			}
			
		}																//while
			
	}																	//main의 끝

}
