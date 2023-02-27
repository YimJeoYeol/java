package ch03OperatoerEx23;

import java.util.Arrays;

public class Strigntest {

	public static void main(String[] args) {
		String a = "abcde";
		String b = "ABCDEF";
		String c = " dog, cat, bear ";
//		a = a + b;
		
		System.out.println(a);
		System.out.println(a.charAt(0));
		System.out.println(a.charAt(a.length()-1));
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println("a".compareTo("b"));
		System.out.println(b.indexOf("C"));
		System.out.println(b.lastIndexOf("C"));
		String[] arr = c.split(",");
		
		System.out.println(Arrays.toString(arr));
		System.out.println(c.toString());
		System.out.println(c);
		System.out.println(c.trim());
		
		//String bb = true;
	}

}
