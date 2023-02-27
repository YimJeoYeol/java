package step5;

public class PhoneBookVer05 {
	


	public static void main(String[] args) {
		/*스캐너사용해서 입력받은 값으로 객체 생성하고 출력
		1.필요한 변수선언
		2. 이름, 전번, 생일입력받아놓기
		3.객채 생성하기
		4, 결과 출력*/
		//PhoneBookManager pm = new PhoneBookManager();
		PhoneBookManager pm = PhoneBookManager.getInstance();
		PhoneBookManager pm1 = PhoneBookManager.getInstance();
		int choice = 0;
		while(true) {
		ManuViewr.showMenu();
		choice = Integer.parseInt(ManuViewr.sc.nextLine());
		
		switch(choice) {
		case MainMenu.INPUT:
			pm.inputData();
		break;
		/*case 2:
			pm.CompanyinputData();
		break;
		case 3:
			pm.UnivinputData();
		break;*/
		case MainMenu.SEARCH:
			pm1.searchData();
			break;
		case MainMenu.DELETE:
			pm.deleteData();
			break;
		case MainMenu.UPDATE:
			pm.updateData();
			break;
		case MainMenu.DISPLAY:
			pm.displayAll();
			break;
		case MainMenu.END:
			System.out.println("프로그램 종료..........");
			//break;
			return;
			}
		}
	}
}