package chap03;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		//2 X 1 
		//Scanner sc = new Scanner(System.in);
		//System.out.print("출력할 단은 ?>>>");
		//int dan = Integer.parseInt(sc.nextLine());
		//int dan = 0;
		
		for(int dan =2; dan<10; dan++)
		{
			for(int i = 1; i<10; i++) {
				//System.out.println(dan + "X" + i + "=" + (dan*i));
				System.out.printf("%d x %d = %d%n", dan, i, dan*i);
			}
		}	
	}

}
