package chap03;

public class Exam13 {
	public static void main(String[] args) {
		//책 175 예제 4-30
		
		int sum =0;
		int i = 0;
		
		while(true) {
			++i;
			sum = sum + i;
			if(sum>100) {
				break;}
			
		}
		System.out.println(i);
		System.out.println(sum);
	}

}
