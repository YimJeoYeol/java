package library;


import java.util.ArrayList;
import java.util.Scanner;

public class MemberSign {
	private Scanner sc;
    private ArrayList<String> numList;
    private ArrayList<String> nameList;

    public MemberSign(Scanner sc, ArrayList<String> numList, ArrayList<String> nameList) {
        this.sc = sc;
        this.numList = numList;
        this.nameList = nameList;
    }

    public void memberSignUp() {
        String num = "";
        String name = "";

        System.out.print("회원번호 입력: ");
        num = sc.next();
        if (numList.contains(num)) {
            System.out.println("이미 존재하는 회원입니다.");
        } else {
            numList.add(num);
            System.out.print("회원이름 입력: ");
            name = sc.next();
            nameList.add(name);
        }
    }

    public ArrayList<String> getNumList() {
        return numList;
    }

    public ArrayList<String> getNameList() {
        return nameList;
    }
}

