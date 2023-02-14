package chap03;

import java.util.Scanner;

public class Exam12 {

	public static void main(String[] args) {
		//책 173 예제4-28
		
		Scanner sc = new Scanner(System.in);
		int input =0, answer =0;
		int cnt = 0; //맞춘 횟수
		
		answer =(int)(Math.random() * 100) + 1;
		//System.out.println(answer);
		
		
		do {
			System.out.print("1과 100 사이의 정수를 입력하세요.>");
			input = Integer.parseInt(sc.nextLine());
			cnt++;
			
			if(input > answer) {
				System.out.println("더 작은 수로 다시 시도해보세요.");
			}else if(input < answer) {
				System.out.println("더 큰 수로 다시 시도해보세요");
			}
		}while(input != answer);
		
		System.out.println("정답입니다.");
		System.out.println(cnt+"번만에  맞췄습니다.");
	}

}
