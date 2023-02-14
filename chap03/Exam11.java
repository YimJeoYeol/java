package chap03;

public class Exam11 {

	public static void main(String[] args) {
		int sum =0;
		int i =11;
		
		do {
			sum = sum +i;
			i++;
		}while(i<=10);
		System.out.println(sum); // 조건에 맞게 무조건 한번은 도는데 sum의 값이 11이 나온다
	}

}
