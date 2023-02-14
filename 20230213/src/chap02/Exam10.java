package chap02;

import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
		int score =0;
		char grade = ' ';
		
		System.out.print("점수를 입력하세요.>");
		Scanner sc = new Scanner(System.in);
		
		score = Integer.parseInt(sc.nextLine());
		
		
		
		if(score >= 90) {
			grade = 'A';
		} else if(score >= 80) {
			grade = 'B';
		} else if(score >= 70) {
			grade = 'C';
		} else if(score >= 60) {
			grade = 'D';
		}
		System.out.println("당신의 학점은 " +grade + "입니다.");

	}

}
