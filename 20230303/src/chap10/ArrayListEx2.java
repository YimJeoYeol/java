package chap10;

import java.util.ArrayList;
import java.util.List;



public class ArrayListEx2 {

	public static void main(String[] args) {
		final int LIMIT = 10;												//자르고자하는 글자의 개수를 지정한다.
		String source = "0123456789abcdefghijABCDEFHGJ!@#$%^&*()ZZZ";
		int length = source.length();
		
		List ls = new ArrayList(length/LIMIT + 10);							// 크기를 약간 여유 있게 잡는다.
		
		for(int i = 0; i < length; i += LIMIT) {
			if(i+LIMIT <length) {
				ls.add(source.substring(i));
			}else {
				ls.add(source.substring(i));
			}
		}
		for(int i = 0; i < ls.size(); i++) {
			System.out.println(ls.get(i));
		}
	}

}
