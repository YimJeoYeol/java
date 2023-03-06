package ch11;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx1 {
	public static void main (String[] args) {
		//책 632 예제 11-20
		Object[] objArr = {"1", new Integer(1), "2","2","3","3","4","4","4"};
		System.out.println(objArr.length);
		Set set = new HashSet();
		
		for(int i = 0; i < objArr.length; i++) {
			//set.add(objArr[i]);							//HashSet에 objArr의 요소들을 저장한다.
			System.out.println(set.add(objArr[i]));
		}
		System.out.println(set);
	}
}
