package step7;

import java.util.HashSet;
import java.util.Iterator;

//CRUD 담당하는 클래스
public class PhoneBookManager {
	final int MAX_CNT = 1000;
//	PhoneInfo[] infoStorage = new PhoneInfo[MAX_CNT];
//	int curCnt=0; //새정보 저장 위치 
	HashSet infoStorage = new HashSet();
	private static PhoneBookManager pm = null;
	
	//싱글톤
	//1.private 생성자
	//2.private static 자신을 가리키는 참조변수 = null
	//3.public static 자신을 반환하는 메소드  
	
	private PhoneBookManager() {}
	public static PhoneBookManager getInstance() {
		if(pm == null) {
			pm = new PhoneBookManager();
		}
		
		return pm;
			
	}
	
	//생성
	private PhoneInfo readData() {
		//이름 전번, 생년월일
		System.out.println("이름 : ==>");
		String name = MenuViewer.sc.nextLine();
		System.out.println("전번 : ==>");
		String phoneNumber =  MenuViewer.sc.nextLine();
		System.out.println("생일 : ==>");
		String birth =  MenuViewer.sc.nextLine();
		//3.객체 생성하기
		return new PhoneInfo(name, phoneNumber, birth);
	}
	private PhoneInfo readUnivData() {
		//이름 전번, 생년월일, 전공, 학년
		System.out.println("이름 : ==>");
		String name = MenuViewer.sc.nextLine();
		System.out.println("전번 : ==>");
		String phoneNumber =  MenuViewer.sc.nextLine();
		System.out.println("생일 : ==>");
		String birth =  MenuViewer.sc.nextLine();
		System.out.println("전공 : ==>");
		String major =  MenuViewer.sc.nextLine();
		System.out.println("학년 : ==>");
		int grade = Integer.parseInt(MenuViewer.sc.nextLine());
		
		return new PhoneUnivInfo(name, phoneNumber, birth, major, grade);
	}
	
	private PhoneInfo readCompanyData() {
		//이름 전번, 생년월일, 회사명
		System.out.println("이름 : ==>");
		String name = MenuViewer.sc.nextLine();
		System.out.println("전번 : ==>");
		String phoneNumber =  MenuViewer.sc.nextLine();
		System.out.println("생일 : ==>");
		String birth =  MenuViewer.sc.nextLine();
		System.out.println("회사명 : ==>");
		String company =  MenuViewer.sc.nextLine();
		
		return new PhoneCompanyInfo(name, phoneNumber, birth, company);
	}
	
	
	public void inputData() throws NumberFormatException, MenuChoiceException {
		//분류를 입력받고 분류별로 입력을 다르게 받기
		System.out.print("1:일반, 2:대학, 3:회사");
		int choice =  Integer.parseInt(MenuViewer.sc.nextLine());
		PhoneInfo tmp = null;
		
		if(choice < SubMenu.NORMAL || choice > SubMenu.COMPANY) {
			throw new MenuChoiceException(choice);
		}
		
		switch(choice) {
			case SubMenu.NORMAL :
				tmp = readData();
				break;
			case SubMenu.UNIV:
				tmp = readUnivData();				
				break;
			case SubMenu.COMPANY:
				tmp = readCompanyData();
				break;
		}
		//저장하기
//		infoStorage[curCnt] = tmp;
//		curCnt++;
		if(infoStorage.add(tmp)) {

		System.out.println("저장완료");
		}else {
			System.out.println("동일이름 저장 실패");
		}
		//System.out.println("curCnt:==>"+curCnt);
	}
	
	//전체출력
	public void displayAll() {
//		for(int i=0; i<curCnt; i++) {
//			infoStorage[i].showPhoneInfo();
//		}
		Iterator it = infoStorage.iterator();
		while(it.hasNext()) {
			PhoneInfo tmp = (PhoneInfo)it.next();
			tmp.showPhoneInfo();
		}
	}
	//조회
	public void searchData() {
		System.out.print("검색할 이름 ===> ");
		String name = MenuViewer.sc.nextLine();
//		int idx = search(name);  //찾은 정보의 배열인덱스
		PhoneInfo findinfo =  search(name);
		/*
		for(int i=0; i<curCnt; i++) {
			if(name.equals(infoStorage[i].name)) {
				idx = i;
				infoStorage[i].showPhoneInfo();
				break;
			}
		}
		*/
		if(findinfo == null) {   //못찾은 경우
			System.out.println("해당하는 정보가 존재하지 않습니다.");
		} else {   // 찾은 경우
			findinfo.showPhoneInfo();;
		}
	}
	
	//삭제
	public void deleteData() {
		//삭제할 이름 입력
		System.out.print("삭제할 이름은===>");
		String name = MenuViewer.sc.nextLine();
		//int idx = search(name);
		PhoneInfo findinfo =  search(name);
		/*
		//삭제할 이름 조회(배열의 위치 찾기)
		for(int i=0; i<curCnt;i++) {
			if(name.equals(infoStorage[i].name)) {
				idx = i;
				break;
			}
		}
		*/
		
		//찾으면 삭제 or 못찾으면 오류 메세지 출력
//		if(findinfo < 0) {   //못찾은 경우
//			System.out.println("삭제할 정보가 존재하지 않습니다.");
//		} else {     	//찾은 경우
//			for(int i=findinfo; i<curCnt-1; i++) {
//				findinfo[i] = infoStorage[i+1]; //overwrite --> 삭제
//			}
//			curCnt--;  //생략하면 무슨일이?
//			System.out.println("삭제완료");
//		}
		if(findinfo == null) {   //못찾은 경우
			System.out.println("해당하는 정보가 존재하지 않습니다.");
		} else {   // 찾은 경우
			findinfo.showPhoneInfo();;
		}
	}
	
	private PhoneInfo search(String name) {
//		for(int i=0; i<curCnt; i++) {
//			if(name.equals(infoStorage[i].name)) {
//				return i;   //찾은 경우
//			}
//		}
		Iterator it = infoStorage.iterator();
		while(it.hasNext()) {
			PhoneInfo tmp = (PhoneInfo)it.next();
			if(name.equals(tmp.name)) {
				return tmp;
			}
		}
		return null;
//		return -9999;    // 못찾은 경우
		
	}
	
	//수정
	void updateDate() {
		//1.수정할 이름을 찾기
		System.out.print("수정할 이름은==> ");
		String name = MenuViewer.sc.nextLine();
		//int idx = search(name);
		//2. 못찾으면 --> 오류메세지
		//3.찾으면 -> 새로운 전번, 새로운 생일을 입력해서 저장
		PhoneInfo findinfo =  search(name);
		
		if(findinfo == null) {
			System.out.println("수정할 데이터 존재하지 않습니다.");
		} else {
			System.out.print("new전번을 입력하세요-->");
			findinfo.phoneNumber = MenuViewer.sc.nextLine();
			System.out.print("new생일을 입력하세요-->");
			findinfo.birth = MenuViewer.sc.nextLine();
			System.err.println("수정완료");
		}
	}
}








