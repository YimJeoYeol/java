package library;

import java.util.ArrayList;
import java.util.Scanner;



public class Main {
static class Library{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> booknumList  = new ArrayList<>();
		ArrayList<String> booknameList = new ArrayList<>();
		ArrayList<Boolean> rantList     = new ArrayList<>();
        ArrayList<String> numList = new ArrayList<>();
        ArrayList<String> nameList = new ArrayList<>();
        MemberSign memberSign = new MemberSign(sc, numList, nameList);
        Member member = new Member(sc, memberSign);
        BookSign bookSign = new BookSign(sc, booknumList, booknameList, rantList);
        Book book = new Book(sc, bookSign);

        while (true) {
            MenuInfo.showMenuInfo();
            switch (sc.nextInt()) {
            	case 1:
            	book.showbookViewer();
            	break;
                case 2:
                    member.showMemberViewer();
                    break;
                case 3:
                    return;
            }
        }
    }

    public static void returnToMain() {
        main(null);
    }
}}