package chap03;

public class Exam06 {

	public static void main(String[] args) {
		int sum = 0; //합계를 저장하기 위한 변수.
		int i =0;
		/*for( i=1; i < 10; i++) {
			sum +=i; //sum = sum +1
		}
		System.out.printf("1부터 2%d 까지의 합: %2d%n", i , sum);*/
		for(i=0; i<100; i=i+2) {
			sum = sum+i;
		}
		System.out.println("1부터 100사이의 홀수의합"+sum);
	} 

}
