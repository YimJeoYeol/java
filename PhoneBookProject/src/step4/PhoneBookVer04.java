package step4;

public class PhoneBookVer04 {
	


	public static void main(String[] args) {
		/*스캐너사용해서 입력받은 값으로 객체 생성하고 출력
		1.필요한 변수선언
		2. 이름, 전번, 생일입력받아놓기
		3.객채 생성하기
		4, 결과 출력*/
		PhoneBookManager pm = new PhoneBookManager(); 
		int choice = 0;
		while(true) {
		ManuViewr.showMenu();
		choice = Integer.parseInt(ManuViewr.sc.nextLine());
		
		switch(choice) {
		case 1:
			pm.inputData();
		break;
		case 2:
			pm.searchData();
			break;
		case 3:
			pm.deleteData();
			break;
		case 4:
			pm.updateData();
			break;
		case 5:
			pm.displayAll();
			break;
		case 6:
			System.out.println("프로그램 종료..........");
			//break;
			return;
			}
		}
	}
}