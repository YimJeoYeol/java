package chap03;

import java.util.Scanner;

public class Examtest02 {

	public static void main(String[] args) {
		/*두개의 숫자를 입력받아 두개의 수가 모두 짝수이거나 모두 홀수이면
		 * "두 숫자는 같은 짝수 또는 홀수입니다."를 출력하는 프로그램 작성하시오.*/
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;
		String result;
		System.out.print("숫자를 입력하시오 : ");
		x = Integer.parseInt(sc.nextLine());
		//x = sc.nextInt();
		System.out.print("숫자를 입력하시오 : ");
		//y = sc.nextInt();
		y = Integer.parseInt(sc.nextLine());
		/*
		if(x%2 == 0 && y%2 == 0) {
			result = "두 숫자는 같은 짝수입니다.";
		}else if(x%2 == 1 && y%2 == 1 ){
			result= "두 숫자는 같은 홀수입니다.";
		}else {
			result= "두 숫자는 같은 짝수 또는 홀수가 아닙니다.";
		}*/
		
		if((x%2 ==0 && y%2==0) || (x%2 ==1 && y%2==1)) {
			result="두 숫자는 같은 짝수 또는 홀수입니다.";
		}else {
			result= "두 숫자는 같은 짝수  홀수가 입니다.";
		}
		
		System.out.println(result);
	}

}
