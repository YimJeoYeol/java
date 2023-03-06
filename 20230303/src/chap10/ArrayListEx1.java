package chap10;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx1 {

	public static void main(String[] args) {
		//책 585 예제 11-1 문제
		
		ArrayList ls1 = new ArrayList();
		ls1.add(5);
		ls1.add(4);
		ls1.add(2);
		ls1.add(0);
		ls1.add(1);
		ls1.add(3);
		
		ArrayList ls2 = new ArrayList(ls1.subList(1, 4));
//		System.out.println(ls1);
//		System.out.println(ls2);
		Collections.sort(ls1);									//ls1과 ls2를 정렬한다.
		Collections.sort(ls2);									//Corllections.Sort(Ls 1)
		print(ls1, ls2);
		
		System.out.println("ls1.containAll(ls2):" + ls1.containsAll(ls2));
		
		ls2.add("B");
		ls2.add("C");
		ls2.add("A");
		print(ls1, ls2);
		ls2.set(3, "AA");
		
		//ls1에서 ls2와 겹치는 부분만 남기고 나머지 삭제한다.
		System.out.println("list1.retainAll(ls2) : " + ls1.retainAll(ls2));
		print(ls1, ls2);
		
		//ls2에서 ls1에 포함된 객체들을 삭제한다.
		for(int i = ls2.size()-1; i >= 0; i--) {
			if(ls1.contains(ls2.get(i))) {
				ls2.remove(i);
			}
			print(ls1, ls2);
		}
		
		
	}

	private static void print(ArrayList ls1, ArrayList ls2) {
		System.out.println("ls1 : " + ls1);
		System.out.println("ls2 : " + ls2);
		System.out.println();
		
	}

}
