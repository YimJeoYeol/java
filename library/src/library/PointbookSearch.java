package library;

import java.util.ArrayList;
import java.util.Scanner;

public class PointbookSearch {
	private Scanner sc;
    private ArrayList<String> booknumList;
    private ArrayList<String> booknameList;
    private ArrayList<Boolean> rantList;

    public PointbookSearch(Scanner sc, ArrayList<String> booknumList, ArrayList<String> booknameList, ArrayList<Boolean> rantList) {
        this.sc = sc;
        this.booknumList = booknumList;
        this.booknameList = booknameList;
        this.rantList = rantList;
    }

    public void pointbookSearch() {
        String booknum = "";

        System.out.print("검색할 도서번호 입력: ");
        booknum = sc.next();

        System.out.println("===찾아낸 도서===");
        int index = booknumList.indexOf(booknum);
        if (index != -1) {
            System.out.printf("도서번호: %s, 도서이름: %s, 대여여부: %b\n", booknumList.get(index), booknameList.get(index), rantList.get(index));
        } else {
            System.out.println("해당 도서번호로 검색된 도서가 없습니다.");
        }
    }
}