package library;

import java.util.ArrayList;
import java.util.Scanner;

public class BookSign {
	 private Scanner sc;
		private ArrayList<String> booknumList;
		private ArrayList<String> booknameList;
		private ArrayList<Boolean> rantList;

	    public BookSign(Scanner sc, ArrayList<String> booknumList, ArrayList<String> booknameList,  ArrayList<Boolean> rantList) {
	        this.sc = sc;
	        this.booknumList  = booknumList;
	        this.booknameList = booknameList;
	        this.rantList     = rantList;
	    }

	    public void BookSignUp() {
	        Boolean rant  = false;
	        String booknum    = "";
	        String bookname   = "";

	        System.out.print("도서번호 입력: ");
	        booknum = sc.next();

	        if(booknumList.contains(booknum)){
	            System.out.println("이미 있는 도서입니다.");
	        } else {
	            System.out.print("도서제목 입력: ");
	            bookname = sc.next();
	            booknumList.add(booknum);
	            booknameList.add(bookname);
	            rantList.add(rant);
	        }
	    }

	    public ArrayList<String> getBookNumList() {
	        return booknumList;
	    }

	    public ArrayList<String> getBookNameList() {
	        return booknameList;
	    }
	    public ArrayList<Boolean> getRantList(){
	    	return rantList;
	    }
	}

