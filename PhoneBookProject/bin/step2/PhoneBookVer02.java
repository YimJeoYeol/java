package step2;

import java.util.Scanner;

public class PhoneBookVer02 {
	static Scanner sc = new Scanner(System.in);
	public static void showMenu() {
		System.out.println("선택하세요???");
		 System.out.println("1. 데이터 입력.");
		 
		 System.out.println("6. 프로그램 종료.");
		 System.out.print("메뉴선택====>");
		 
	}
	public static void inputData() {
		//2. 이름, 전번, 생일 입력받기
		System.out.print("이름을 입렵하세요.>");
		String name = sc.nextLine();
		
		System.out.print("전화번호를 입력하세요.>");
		String phonenumber = sc.nextLine();
		
		System.out.print("생일을 입력하세요.>");
		String birth = sc.nextLine();		
		
		PhoneInfo p1 =new PhoneInfo(name, phonenumber, birth);
		
		p1.showPhoneInfo();
	}

	public static void main(String[] args) {
		/*스캐너사용해서 입력받은 값으로 객체 생성하고 출력
		1.필요한 변수선언
		2. 이름, 전번, 생일입력받아놓기
		3.객채 생성하기
		4, 결과 출력*/
		
		int choice = 0;
		while(true) {
		showMenu();
		choice = Integer.parseInt(sc.nextLine());
		
		switch(choice) {
		case 1:
			inputData();
		break;
		case 6:
			System.out.println("프로그램 종료..........");
			//break;
			return;
			}
		}
	}
}
