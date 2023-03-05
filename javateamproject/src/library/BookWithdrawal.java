package library;

import java.util.ArrayList;
import java.util.Scanner;

public class BookWithdrawal {
	private Scanner sc;
	private ArrayList<String> booknumList;
	private ArrayList<String> booknameList;
	private ArrayList<String> rantList;
	
	public BookWithdrawal(Scanner sc, ArrayList<String> booknumList, ArrayList<String> booknameList, ArrayList<String> rantList) {
		this.sc = sc;
		this.booknameList = booknameList;
		this.booknumList = booknumList;
		this.rantList = rantList;
	}

	public void BookWithdrawal() {
	     String booknum = sc.next();
	        ArrayList<Integer> removeIndexes = new ArrayList<>();

	        for (int i = 0; i < booknameList.size(); i++) {
	            if (booknumList.get(i).equals(booknum)) {
	                removeIndexes.add(i);
	            }
	        }

	        if (removeIndexes.size() > 0) {
	            for (int i = removeIndexes.size() - 1; i >= 0; i--) {
	                int removeIndex = removeIndexes.get(i);
	                System.out.println("도서번호: " + ((ArrayList<String>) booknumList).get(removeIndex) + ", 도서제목: " + booknameList.get(removeIndex) + "이 탈퇴되었습니다.");
	                booknameList.remove(removeIndex);
	                booknameList.remove(removeIndex);
	            }
	        } else {
	            System.out.println("일치하는 도서번호가 없습니다.");
	        }
		
	}

}
