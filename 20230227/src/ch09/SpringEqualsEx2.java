package ch09;

public class SpringEqualsEx2 {

	public static void main(String[] args) {
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		
		/*String str1 = "Hello";
		String str2 = "Hello";
		*/
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));

		System.out.println(str1.equals(str2)); //오버라이딩쓰게한다
		System.out.println(str1 == str2);
	}

}
