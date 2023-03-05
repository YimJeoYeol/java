package library;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberWithdrawal{
    private Scanner sc;
    private ArrayList<String> numList;
    private ArrayList<String> nameList;

    public MemberWithdrawal(Scanner sc, ArrayList<String> numList, ArrayList<String> nameList) {
        this.sc = sc;
        this.numList = numList;
        this.nameList = nameList;
    }

    public void memberWithdrawal() {
        String memberNum = sc.next();
        ArrayList<Integer> removeIndexes = new ArrayList<>();

        for (int i = 0; i < numList.size(); i++) {
            if (numList.get(i).equals(memberNum)) {
                removeIndexes.add(i);
            }
        }

        if (removeIndexes.size() > 0) {
            for (int i = removeIndexes.size() - 1; i >= 0; i--) {
                int removeIndex = removeIndexes.get(i);
                System.out.println("회원번호: " + numList.get(removeIndex) + ", 회원이름: " + nameList.get(removeIndex) + "이 탈퇴되었습니다.");
                numList.remove(removeIndex);
                nameList.remove(removeIndex);
            }
        } else {
            System.out.println("일치하는 회원번호가 없습니다.");
        }
    }
}