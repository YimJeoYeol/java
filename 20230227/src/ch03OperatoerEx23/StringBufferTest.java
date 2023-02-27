package ch03OperatoerEx23;

public class StringBufferTest {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));
		
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		System.out.println(sb1);
		System.out.println(System.identityHashCode(sb1));
		sb1.append("def").append("1234");
		System.out.println(System.identityHashCode(sb1));
	}

}
