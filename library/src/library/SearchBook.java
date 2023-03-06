package library;

import java.util.ArrayList;

public class SearchBook {
	private ArrayList<String> booknumList;
	private ArrayList<String> booknameList;
	private ArrayList<Boolean> rantList;

	public SearchBook(ArrayList<String> booknumList, ArrayList<String> booknameList,  ArrayList<Boolean> rantList) {
		this.booknameList = booknameList;
		this.booknumList = booknumList;
		this.rantList = rantList;
	}

	public void bookSearch() {
		System.out.println("=== 도서 목록 ===");
		for(int i = 0; i < booknameList.size(); i++) {
			System.out.println("도서 번호 : " + booknumList.get(i) + "도서 제목 : "  + booknameList.get(i) + "대출 이력 : " + rantList.get(i));
		}
	}
}