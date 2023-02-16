package oop;

public class Exam01 {

	public static void main(String[] args) {
		/*int i 		  = 10; 				//변수
		final int MAX = 100;				//상수
		
		i = 99;
		i = 159;
		//MAX = 1000; //한번지정되서 못바꿈
		final int MAX_VALUE = 100; //전부 대문자면 _로 구분
		*/
		
		boolean flag = false;
		int i2 = 66;
		char ch = 'A';
		
		int i =199;
		//double d = 0.0;
		float d =0.0f;
		//i2 = ch;
		ch = (char)i2;
		i = (int)d; //강제 down casting
		d = i;		//자동형변환
		
		//flag = (boolean)i;
		
		
		//i = (int)d; 
		System.out.println(i);
		System.out.println(ch);
	}

}
