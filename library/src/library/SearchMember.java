package library;

import java.util.ArrayList;

public class SearchMember {
	private ArrayList<String> numList;
    private ArrayList<String> nameList;

    public SearchMember(ArrayList<String> numList, ArrayList<String> nameList) {
        this.numList = numList;
        this.nameList = nameList;
    }

    public void memberSearch() {
        System.out.println("===회원 목록===");
        for (int i = 0; i < numList.size(); i++) {
            System.out.println("회원번호: " + numList.get(i) + ", 회원이름: " + nameList.get(i));
        }
    }
}