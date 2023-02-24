package ch08;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.println("숫자를 입력하세요");
				int input = Integer.parseInt(sc.nextLine());
				System.out.println("입력한 숫자는 " + input + " 입니다.");
			}catch(NumberFormatException e) {
				System.out.println("숫자로 입력!!!");
			}catch(Exception e) {
				System.out.println("오류발생");
			}
		
		
		
		
	}

	}
}
