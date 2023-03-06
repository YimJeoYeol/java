package ch11;

import java.util.ArrayList;
import java.util.ListIterator;

public class InteratorEx1 {

	public static void main(String[] args) {
		ArrayList ls = new ArrayList();
		ls.add("1");
		ls.add("2");
		ls.add("3");
		ls.add("4");
		ls.add("5");
		
		//Iterator it = ls.iterator();
		ListIterator it = ls.listIterator();
		System.out.println();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
		System.out.println();
		
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
		
		
		
		System.out.println(ls);
		
		
		for(int i = 0; i < ls.size(); i++) {
			System.out.println(ls.get(i));
		}

	}

}
