package ch15;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(); 	//ArrayList<Integer> 붙임으로서 밑에 형변환을 할필요성이 없어진다.
		
		list.add(10);
//		list.add(10.53);
//		list.add(true);
//		list.add("ABCD");
//		list.add(10f);
		
//		int i = (Integer)(list.get(0)); //형 변환 할필요성없어지낟.
		int i = list.get(0);
		System.out.println(i);

	}

}
