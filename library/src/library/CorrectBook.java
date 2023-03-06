package library;

import java.util.ArrayList;
import java.util.Scanner;

public class CorrectBook {
	 private final Scanner sc;
	    private final ArrayList<String> booknumList;
	    private final ArrayList<String> booknameList;
		private final ArrayList<Boolean> rantList;
	    public CorrectBook(Scanner sc, ArrayList<String> booknumList, ArrayList<String> booknameList, ArrayList<Boolean> rantList) {
	        this.sc = sc;
	        this.booknameList = booknameList;
	        this.booknumList = booknumList;
			this.rantList = rantList;
	    }

	    public void CorrectBook() {
	        System.out.print("수정할 도서번호를 입력하세요: ");
	        String targetNum = sc.next();
	        int targetIndex = booknumList.indexOf(targetNum);

	        if (targetIndex == -1) {
	            System.out.println("일치하는 도서번호가 없습니다.");
	            return;
	        }

	        System.out.print("새로운 도서번호를 입력하세요: ");
	        String newNum = sc.next();

	        if (booknumList.contains(newNum) && !newNum.equals(targetNum)) {
	            System.out.println("이미 등록된 도서번호입니다.");
	            return;
	        }

	        System.out.print("새로운 도서제목을 입력하세요: ");
	        String newName = sc.next();

			System.out.print("도서대출 여부 입력하세요: ");
			Boolean newrant = sc.nextBoolean();

	        booknumList.set(targetIndex, newNum);
	        booknameList.set(targetIndex, newName);
			rantList.set(targetIndex, newrant);

	        System.out.println("도서번호 : " + targetNum + ", 도서제목 : " + booknumList.get(targetIndex) + "이 수정되었습니다.");
	        System.out.println("===수정결과===");
	        System.out.println("도서번호 : " + booknameList.get(targetIndex) + ", 도서제목 : " + booknumList.get(targetIndex) + ", 대출여부 : " + rantList.get(targetIndex));
	    }
}

