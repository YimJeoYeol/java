package ch15;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetLotto {

	public static void main(String[] args) {
		//책 641 예제 11-26
		Set set = new TreeSet();
		
		for(int i = 0; set.size()<6; i++) {
			int num =(int) (Math.random()*45) + 1;
			System.out.println(num);
			set.add(num); 	//set.add(new Integer(num));
		}
		
		System.out.println(set);
	}
}
