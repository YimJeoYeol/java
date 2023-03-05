package library;

import java.util.ArrayList;
import java.util.Scanner;

public class CorrectMember {
    private final Scanner sc;
    private final ArrayList<String> numList;
    private final ArrayList<String> nameList;

    public CorrectMember(Scanner sc, ArrayList<String> numList, ArrayList<String> nameList) {
        this.sc = sc;
        this.numList = numList;
        this.nameList = nameList;
    }

    public void correctMember() {
        System.out.print("수정할 회원번호를 입력하세요: ");
        String targetNum = sc.next();
        int targetIndex = numList.indexOf(targetNum);

        if (targetIndex == -1) {
            System.out.println("일치하는 회원번호가 없습니다.");
            return;
        }

        System.out.print("새로운 회원번호를 입력하세요: ");
        String newNum = sc.next();

        if (numList.contains(newNum) && !newNum.equals(targetNum)) {
            System.out.println("이미 등록된 회원번호입니다.");
            return;
        }

        System.out.print("새로운 회원이름을 입력하세요: ");
        String newName = sc.next();

        numList.set(targetIndex, newNum);
        nameList.set(targetIndex, newName);

        System.out.println("회원번호: " + targetNum + ", 회원이름: " + nameList.get(targetIndex) + "이 수정되었습니다.");
        System.out.println("===수정결과===");
        System.out.println("회원번호: " + numList.get(targetIndex) + ", 회원이름: " + nameList.get(targetIndex));
    }
}