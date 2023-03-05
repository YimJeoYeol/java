package library;

import java.util.ArrayList;
import java.util.Scanner;

public class BookSign {
    private Scanner sc;
	private ArrayList<String> booknumList;
	private ArrayList<String> booknameList;
	private ArrayList<String> rantList;

    public BookSign(Scanner sc, ArrayList<String> booknumList, ArrayList<String> booknameList,  ArrayList<String> rantList) {
        this.sc = sc;
        this.booknumList  = booknumList;
        this.booknameList = booknameList;
        this.rantList     = rantList;
    }

    public void BookSignUp() {
        String num  = "";
        String name = "";
        String rant = "";

      
        booknameList.add(num);
        System.out.print("도서제목 입력: ");
        name = sc.next();
        if(booknameList.contains(name)){
        	System.out.println("이미 있습니다.");
        	booknameList.add(num);
            System.out.print("도서제목 입력: ");
            name = sc.next();
            booknumList.add(name);
            
        }
         else if (booknumList.contains(num)) {
             System.out.println("이미 있는 도서입니다.");
             
         }else {
        	rantList.add(num);
        	System.out.print("대출목록 : ");
        	rant = sc.next();
        	rantList.add(rant);
        }
    }

    public ArrayList<String> getBookNumList() {
        return booknameList;
    }

    public ArrayList<String> getBookNameList() {
        return booknumList;
    }
    public ArrayList<String> getRantList(){
    	return rantList;
    }
}

