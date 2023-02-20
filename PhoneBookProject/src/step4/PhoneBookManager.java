package step4;

//CRUD 담당하는 클래스
public class PhoneBookManager {
	final int MAX_CNT = 100;
	//PhoneInfo[]  infoStorage = new PhoneInfo[100];
	PhoneInfo[]  infoStorage = new PhoneInfo[MAX_CNT];
	int curCnt=0;
	
	public /*static*/ void inputData() {
		switch(choice) {
		
		case 1:
		//2. 이름, 전번, 생일 입력받기
		System.out.print("이름을 입렵하세요.>");
		String name = ManuViewr.sc.nextLine();
		System.out.print("전화번호를 입력하세요.>");
		String phonenumber = ManuViewr.sc.nextLine();
		System.out.print("생일을 입력하세요.>");
		String birth = ManuViewr.sc.nextLine();
		
	
		//3.객체 생성하기
		infoStorage[curCnt++] =new PhoneInfo(name, phonenumber, birth);
		}
		//curCnt++; //윗줄에 것을 쓰던가 둘중에 하나를 씀 
		//4.결과 출력
		//infoStorage[curCnt].showPhoneInfo();
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