package chap03;

public class Exam02 {

	public static void main(String[] args) {
		int i = 5,j = 0;//책 94
		
		
		j = i++;
		System.out.println("j = i++; 실행후, i = "  + i + ", j = " + j);
							
		i = 5;
		j = 0;
		
		j = ++i;
		System.out.println("j = ++i; 실행후 ,  i = " + i  + ", j =" + j);
		
		int x = 5 , z = 5;
		
		System.out.println(x++);
		System.out.println(++z);
		System.out.println("x = " + x +" , z ="+ z);
	}

}
