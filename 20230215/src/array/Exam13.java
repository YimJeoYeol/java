package array;

import java.util.Scanner;

public class Exam13 {

	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		String name = new String("Yim"); // 이구분이 정석이다
		String name2 = "park";			 // java에서 허용한다. 10번재 줄을 그래도쓰면 너무많이 쓰게되서 생략가능하도록해놓음
		char str = 's';
		char[] name3 = {'h','o','n','g'};
		*/
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("성별을 입력 ====>");
		String input = sc.nextLine();
		
		if(input.equals("M")) {
			System.out.println("남자입니다.");
		}else if(input.equals("F")){
			System.out.println("여자입니다.");
		}else{
			System.out.println("오류입니다.");
		}

	}

}
