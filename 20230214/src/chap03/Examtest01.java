package chap03;

import java.util.Scanner;

public class Examtest01 {

	public static void main(String[] args) {
		/*나이와 성적을 입력받아 나이가 30세미만이고,
		 *  성적이 3.5이상이면 "추천 대상입니다."를 
		 *  출력하고 그렇지 않으면 "추천 대상이 아닙니다"를
		 *  출력하는 프로그램을 작성하시오.*/
		Scanner sc = new Scanner(System.in);
		int age = 0;
		double score = 0.0;
		String result;
		System.out.print("나이를 입력하세요.> ");
		//age = sc.nextInt();
		age = Integer.parseInt(sc.nextLine());
		System.out.print("성적을 입력하세요.> ");
		//score = sc.nextDouble();
		score = Double.parseDouble(sc.nextLine());
		if((age < 30) && (score>=3.5)) {
			//System.out.println("추천 대상입니다.");
			result = "추천 대상입니다.";
		}else {
			//System.out.println("추천 대상이 아닙니다");
			result = "추천 대상이 아닙니다";
		}
		System.out.println(result);

	}

}
