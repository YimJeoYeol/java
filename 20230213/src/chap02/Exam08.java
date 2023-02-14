package chap02;

import java.util.Scanner;

public class Exam08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //키보드 입력
		System.out.print("숫자를 입력하세요==>>");
		
		int input = sc.nextInt();
		//2의 배수, 3의배수
		if(input%2==0) {
			System.out.println("2의 배수입니다.");
		}else if(input%3==0) {
			System.out.println("3의 배수입니다.");
		}else if(input%5==0) {
			System.out.println("5의 배수입니다.");
		}else {
			System.out.println("그 외의 수입니다.");
		}
		/*
		if ((input%2)==0) {
			System.out.println("입력하신 숫자 "+input+"짝수입니다.");
		}
		else {
			System.out.println("입력하신 숫자 "+input+"홀수입니다.");
		}
		*/
	}

}
