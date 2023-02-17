package step3;

//CRUD 담당하는 클래스
public class PhoneBookManager {
	final int MAX_CNT = 100;
	//PhoneInfo[]  infoStorage = new PhoneInfo[100];
	PhoneInfo[]  infoStorage = new PhoneInfo[MAX_CNT];
	int curCnt=0;
	
	
	public /*static*/ void inputData() {
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
	
	//전체 출력
	public void displayAll() {
		for(int i = 0; i < curCnt; i++) {
			infoStorage[i].showPhoneInfo(); 
		}
	}
	
}
