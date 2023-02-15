package array;

public class Exam03 {

	public static void main(String[] args) {
		int[] age = {10, 5,4};//선언 & 초기화
		double[] height = new double[10]; // 선언
		height[0] = 187.9;
		
		char[] str = {'a','b','c'};
		boolean[] flag= {true, false,false,true};
		System.out.println(age);
		
		for(int i=0; i<age.length; i++) 
		{
			System.out.println(age[i]);
		}

	}

}
