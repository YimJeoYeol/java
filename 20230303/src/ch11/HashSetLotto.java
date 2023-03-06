package ch11;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetLotto {


	public static void main(String[] args) {
		Set set = new HashSet();
		int cnt = 0;
		
		for (int i = 0;set.size() < 6; i++ ) {
			int num = (int)(Math.random() * 45) + 1;
			//set.add(new Integer(num));
			set.add(num);
			cnt++;
		}
		System.out.println(set);
		System.out.println(cnt + "만에 로또번호 완성");
//		List ls = new LinkedList(set);
		List ls = new ArrayList(set);
		Collections.sort(ls);
		System.out.println(ls);
	}

}
