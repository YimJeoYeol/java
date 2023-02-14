package chap02;

import java.util.Scanner;

public class Exam11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호 7번째 자리 입력 --->");
		int gender = sc.nextInt();
		String result = "";
		switch (gender) {
		case 1: case 3:
			result="남자";
			break;
		case 2: case 4:
			result="여자";
			break;
		 
			
		
		default :
			result = "오류";
		}
		System.out.println("당신의 성별은 " + result + "입니다.");
		
		
		if(gender==1 || gender ==3) {
			result="남자";
		}else if(gender==2 || gender ==4) {
			result="여자";
		}else {
			result = "오류";
		}
		System.out.println("당신의 성별은 " + result + "입니다.");
	}

}
