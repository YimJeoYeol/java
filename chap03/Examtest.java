package chap03;

import java.util.Scanner;

public class Examtest {

	public static void main(String[] args) {
		/*1.
		서울에서 부산까지 거리는 400km라고 가정하고
		자동차의 최대 속도를 입력받아
		도착까지 거리는 시간을 구하고
		2시간 이하이면 "high high speed"
		3시간 이하이면 "high speed"
		4시간 이하이면 "good speed"
		라고 출력하게 되게 하시오*/
		Scanner sc = new Scanner(System.in);
		/*System.out.print("속도를 입력하세요.>");
		int x = sc.nextInt();
		int y = 400;
		int z = y/x;
		
		if(z<=2) {
			
			System.out.println("high high speed");
		}else if(z<=3) {
			
			System.out.println("high speed");
		}else if(z>=4) {
			
			System.out.println("good speed");
		}
		*/
		int d = 400;
		int s =0;
		double h = 0.0;
		
		System.out.print("최대속도 입력=>");
		s = sc.nextInt();
		h= d/(double)s;//거리 시간 시간 = 거리 / 속도
		
		if(h<=2) {
			
			System.out.println("high high speed");
		}else if(h<=3) {
			
			System.out.println("high speed");
		}else if(h>=4) {
			
			System.out.println("good speed");
		}
	}

}
