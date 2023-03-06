package ex1130;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx01 {

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
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 안습니다."
						+ "다시 입력하세요.");
				continue;
			}
			if(!(map.get(id)).equals(password)) {
				System.out.println("비밀번호가 일치하지않습니다. 다시입력하세요.");
			}else {
				System.out.println("id와 비밀번호가 일치합니다.");
				break;
			}
			
		}																//while
			System.out.println("LOGIN SUCCESS!!");
	}																	//main의 끝

}
