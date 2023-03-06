package chap10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedListTest {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
	ArrayList al = new ArrayList(2000000);
	LinkedList ll = new LinkedList();
	System.out.println("= 순차적으로 추가하기 =");
	System.out.println("ArrayList : " + add1(al));
	System.out.println("LinkedList : " + add1(ll));
	System.out.println();
	System.out.println("= 중간에 추가하기 =");
	System.out.println("ArrayList : " + add2(al));
	System.out.println("LinkedList : " + add2(ll));
	System.out.println();
	System.out.println("= 중간에 삭제하기 =");
	System.out.println("ArrayList : " + remove2(al));
	System.out.println("LinkedList : " + remove2(ll));
	System.out.println();
	System.out.println("= 순차적으로 삭제하기 =");
	System.out.println("ArrayList : " + remove1(al));
	System.out.println("LinkedList : " + remove1(ll));

	}


	public static long add1(List ls) {
		long start = System.currentTimeMillis();
		for(int i = 0; i < 1000000; i++) ls.add(i+"");
		long end = System.currentTimeMillis();
		return end - start;
	}
	

	public static long add2(List ls) {
		long start = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++) ls.add(500, "X");
		long end = System.currentTimeMillis();
		return end - start;
	}

	public static long remove1(List ls) {
		long start = System.currentTimeMillis();
		for(int i = ls.size() - 1; i >= 0; i--) ls.remove(i);
		long end = System.currentTimeMillis();
		return end - start;
	}

	public static long remove2(List ls) {
		long start = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++) ls.remove(i);
		long end = System.currentTimeMillis();
		return end - start;
	}
}
