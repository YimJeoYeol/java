package array;

public class Exam10 {

	public static void main(String[] args) {
		// 치환
		int x = 10, y = 20;
		int tmp = 0;
		
		tmp=x;
		x = y;
		y = tmp;
		
		System.out.println(x);
		System.out.println(y);
	}

}
