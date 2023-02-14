package chap02;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
		//0~100 사이 입력 받아서 A~F
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0~100 점수를 입력하시오==>");
		
		int score = sc.nextInt();
		
		if (score >= 90) {
			System.out.println("A학점입니다.");
		} else if(score >= 80){
			System.out.println("B학점입니다.");
		} else if(score >= 70){
			System.out.println("C학점입니다.");
		} else if(score >= 60){
			System.out.println("D학점입니다.");
		} else {
			System.out.println("F학점입니다.");
		}
		
		/*
		if (score <= 100 && score > 90) {
			System.out.println("A학점입니다.");
		} else if(score < 90 && score >= 80){
			System.out.println("B학점입니다.");
		} else if(score < 80 &&score >= 70){
			System.out.println("C학점입니다.");
		} else if(score < 70 && score >= 60){
			System.out.println("D학점입니다.");
		} else if(score < 60 ){
			System.out.println("F학점입니다.");
		}else {
			System.out.println("그외의 수입니다.");
		}
		 */
	}

}
