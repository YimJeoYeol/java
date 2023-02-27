package step5;

//CRUD 담당하는 클래스
public class PhoneBookManager {
	final int MAX_CNT = 10000;
	//PhoneInfo[]  infoStorage = new PhoneInfo[100];
	PhoneInfo[]  infoStorage = new PhoneInfo[MAX_CNT];
	int curCnt = 0;
	private static PhoneBookManager p1= null;
	
/*	public  void inputData() {
		
		//2. 이름, 전번, 생일 입력받기
		System.out.print("이름을 입렵하세요.>");
		String name = ManuViewr.sc.nextLine();
		System.out.print("전화번호를 입력하세요.>");
		String phonenumber = ManuViewr.sc.nextLine();
		System.out.print("생일을 입력하세요.>");
		String birth = ManuViewr.sc.nextLine();
		
		//3.객체 생성하기
		infoStorage[curCnt++] =new PhoneInfo(name, phonenumber, birth);
		//curCnt++; //윗줄에 것을 쓰던가 둘중에 하나를 씀 
		//4.결과 출력
		//infoStorage[curCnt].showPhoneInfo();
				}
		
	
	public void CompanyinputData() {
		System.out.print("이름을 입렵하세요.>");
		String name = ManuViewr.sc.nextLine();
		System.out.print("전화번호를 입력하세요.>");
		String phonenumber = ManuViewr.sc.nextLine();
		System.out.print("생일을 입력하세요.>");
		String birth = ManuViewr.sc.nextLine();
		System.out.println("회사명을 입력하세요.>");
		String company = ManuViewr.sc.nextLine();
		
		//3.객체 생성하기
		infoStorage[curCnt++] = new PhoneCompanyInfo(name, phonenumber, birth, company);
		
		//curCnt++; //윗줄에 것을 쓰던가 둘중에 하나를 씀 
		//4.결과 출력
		//infoStorage[curCnt].showPhoneInfo();
	}
	

	public  void UnivinputData() {
		
		
		//2. 이름, 전번, 생일 입력받기
		System.out.print("이름을 입렵하세요.>");
		String name = ManuViewr.sc.nextLine();
		System.out.print("전화번호를 입력하세요.>");
		String phonenumber = ManuViewr.sc.nextLine();
		System.out.print("생일을 입력하세요.>");
		String birth = ManuViewr.sc.nextLine();
		System.out.print("대학을 입력하세요.>");
		String majo = ManuViewr.sc.nextLine();
		System.out.print("학과을 입력하세요.>");
		String grad = ManuViewr.sc.nextLine();
		
		//3.객체 생성하기
		infoStorage[curCnt++] =new PhoneUnivInfo(name, phonenumber, birth,majo,grad);
		//curCnt++; //윗줄에 것을 쓰던가 둘중에 하나를 씀 
		//4.결과 출력
		//infoStorage[curCnt].showPhoneInfo();
		
		}*/
	
	private PhoneBookManager() {}
	
	public static PhoneBookManager getInstance() {
		if(p1 ==null) //{
			p1 = new PhoneBookManager();
		/*}else {
		return p1;
		}
		return p1;*/
		return p1;
	}
	 
	
	
	private PhoneInfo readData() {
		System.out.println("이름 : ==>");
		String name = ManuViewr.sc.nextLine();
		System.out.println("전번 : ==>");
		String phoneNumber =  ManuViewr.sc.nextLine();
		System.out.println("생일 : ==>");
		String birth =  ManuViewr.sc.nextLine();
		//3.객체 생성하기
		return new PhoneInfo(name, phoneNumber, birth);
	}
	private PhoneInfo /*PhoneUnivInfo*/readUnivData() {							//다형성적용해서 다받을수 잇다 PhoneUnivInfo부모 한테 넘길수 잇음
		//2.이름, 전번, 생일 입력받아놓기
		System.out.println("이름 : ==>");
		String name = ManuViewr.sc.nextLine();
		System.out.println("전번 : ==>");
		String phoneNumber =  ManuViewr.sc.nextLine();
		System.out.println("생일 : ==>");
		String birth =  ManuViewr.sc.nextLine();
		System.out.println("전공 : ==>");
		String major = ManuViewr.sc.nextLine();
		System.out.println("학년 : ==>");
		int grade = Integer.parseInt(ManuViewr.sc.nextLine())  ;
		//3.객체 생성하기
		return new PhoneUnivInfo(name, phoneNumber, birth, major, grade);
	}
	private PhoneInfo/*PhoneCompanyInfo*/ readCompanyData() {
		//2.이름, 전번, 생일 입력받아놓기
		System.out.println("이름 : ==>");
		String name = ManuViewr.sc.nextLine();
		System.out.println("전번 : ==>");
		String phoneNumber =  ManuViewr.sc.nextLine();
		System.out.println("생일 : ==>");
		String birth =  ManuViewr.sc.nextLine();
		System.out.println("회사명 : ==>");
		String company = ManuViewr.sc.nextLine();

		//3.객체 생성하기
		return new PhoneCompanyInfo(name, phoneNumber, birth, company);
	}
	

		
	
	//생성
	public void inputData() {
		//분류를 입력받고 분류별로 입력을 다르게 받기
		System.out.print("0:일반, 1:대학, 2:회사");
		int choice = Integer.parseInt(ManuViewr.sc.nextLine());
		PhoneInfo tmp = null;
		
		switch(choice)
		{
		case subMenu.NOMAL:
			//2.이름, 전번, 생일 입력받아놓기
			tmp = readData();
			break;
			
		case subMenu.READUNIVDATA:
			tmp = readUnivData();
			break;
			
		case subMenu.READCOMPANYDATA:
			tmp = readCompanyData();
			break;
		}
		//저장하기
		infoStorage[curCnt] = tmp;
		//4.결과 출력하기
		//infoStorage[curCnt].showPhoneInfo();
		
		curCnt++;
		System.out.println("저장완료");
	}

	
	//전체 출력
	public void displayAll() {
		for(int i = 0; i < curCnt; i++) {
			infoStorage[i].showPhoneInfo(); 
		}
	}
	
	private int search(String name) {
		for (int i =0; i < curCnt; i ++) {
			if(name.equals(infoStorage[i].name)) {
				return i;
			}
		}
		//return -1; // 꼭 -1을 안해도 되는데 못찾은경우 -1을 한다.
		return -9999;
	}
	
	public void searchData() {
		System.out.print("검색할 이름을 입력하세요.");
		String name = ManuViewr.sc.nextLine();
		int idx = search(name); // 착은 정보의 인덱스
		//int idx = -1;
		
		//for (int i = 0; i < curCnt; i++) {
			//if(name.equals(infoStorage[i].name)) {
				//idx = i;
				//infoStorage[i].showPhoneInfo();
				//break;
			//}
			// for문이 조건이 돌아갈때마다  else 돌림 (내가한것인데 틀림)
			/*else if(infoStorage[i].name != null){
				System.out.println("해당하는 정보는 없는 정보입니다.");
				break;
			}else {
				System.out.println("다시 입력해주세요");
			}*/
		//}
		if(idx < 0 /* idx == -1 */) { 							//못찾은 경우
			System.out.println("해당정보가 존재하지 않습니다.");
		}else {													//찾은 경우
			infoStorage[idx].showPhoneInfo();
		}
	}
	public void deleteData() {
		//삭제할 이름 입력
		//삭제할 이름 조회
		//찾으면 삭제, 못찾으면 오류메세지 출력
		System.out.println("삭제할 이름을 입력하세요.>");
		String name = ManuViewr.sc.nextLine();
		//int idx = -1;
		int idx = search(name);
		//삭제할 이름 조회(배열의 위치 찾기)
		/*for (int i =0; i < curCnt; i ++) {
			if(name.equals(infoStorage[i].name)) {
				idx = i;
				break;
			}
		}*/
		//찾으면 삭제, 못찾으면 오류메세지 출력
		if(idx < 0 ) {											//못찾은 경우
			System.out.println("삭제할 정보가 존재하지 않습니다.");
		}else {													//찾은 겨우
			for(int i = idx; i < curCnt-1; i++) {
				infoStorage[i] = infoStorage[i+1];
			}
			curCnt--;											//생략하면 무슨일이 생길지 확인해보기
			System.out.println("삭제완료");
		}	
	}
	/*
	 * 수정
	 * 1.수정할 이름을 찾기
	 * 2.찾으면  -->새로운(전번, 생일) 입력해서 저장
	 * 3.못찾으면 --> 오류메세제
	*/
	public void updateData() {
		System.out.println("수정할 이름을 입력하세요");
		String name = ManuViewr.sc.nextLine();
		int idx = search(name);
		
		if(idx < 0 ) {											
			System.err.print("수정할 정보가 존재하지 않습니다.");
		}else {
			
			System.out.println("새 전화번호를 입력하세요");
			infoStorage[idx].phoneNumber = ManuViewr.sc.nextLine();
			System.out.println("새 생일을 입력하세요");
			infoStorage[idx].birth 	   = ManuViewr.sc.nextLine();
			
			
		}	
	}
	}