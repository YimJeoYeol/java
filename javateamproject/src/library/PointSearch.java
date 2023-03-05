package library;

import java.util.ArrayList;
import java.util.Scanner;

public class PointSearch {
	private Scanner sc;
    private ArrayList<String> numList;
    private ArrayList<String> nameList;

    public PointSearch(Scanner sc, ArrayList<String> numList, ArrayList<String> nameList) {
        this.sc = sc;
        this.numList = numList;
        this.nameList = nameList;
    }

    public void pointSearch() {
        String num = "";

        System.out.print("검색할 회원번호 입력: ");
        num = sc.next();

        System.out.println("===찾아낸 회원===");
        int index = numList.indexOf(num);
        if (index != -1) {
            System.out.printf("회원번호: %s, 회원이름: %s\n", numList.get(index), nameList.get(index));
        } else {
            System.out.println("해당 회원번호로 검색된 회원이 없습니다.");
        }
    }
}
