package chap02;

import java.util.Scanner;

public class Exam12 {

	public static void main(String[] args) {
		System.out.println("현재 월을 입력하세요.>");
		
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		switch(month) {
		case 3:
		case 4:
		case 5:
			System.out.println("현재의 계절은 봄입니다.");
			break;
		case 6:	case 7: case 8:
			System.out.println("현재의 계절은 여름입니다.");
			break;
		case 9:	case 10: case 11:
			System.out.println("현재의 계절은 가을입니다.");
			break;
		default :
			//case 12:	case 1: case 2:
			System.out.println("현재의 계절은 겨울입니다.");
			break;
		}
		if(month==3 || month ==4 || month ==5) {
			System.out.println("현재의 계절은 봄입니다.");
		}else if(month==6 ||month ==7 || month ==8) {
			System.out.println("현재의 계절은 여름입니다.");
		}else if(month==9 ||month ==10 || month ==11) {
			System.out.println("현재의 계절은 가을입니다.");
		}else {
			System.out.println("현재의 계절은 겨울입니다.");
		}
		
	}
	}


