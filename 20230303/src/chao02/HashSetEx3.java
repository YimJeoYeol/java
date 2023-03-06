package chao02;

import java.util.HashSet;

public class HashSetEx3 {
	
	public static void main(String[] args) {
		//책 634~635 예제 11-23,예제 11-24
		HashSet set= new HashSet();
		
		set.add("abc");
		set.add("abc");
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));
		System.out.println(set);
		

	}

}
