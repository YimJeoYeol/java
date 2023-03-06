package step8;

public class PhoneBookVer08 {
	
	public static void main(String[] args) {
		//PhoneBookManager pm = new PhoneBookManager();
		PhoneBookManager pm = PhoneBookManager.getInstance();
		int choice=0;
		
		while(true) {
			try {
				MenuViewer.showMenu();
				choice = Integer.parseInt(MenuViewer.sc.nextLine());
				
				//choice 체크해서 범위밖이면 MenuChoiceException 발생시키기
				if(choice < MainMenu.INPUT || choice > MainMenu.END) {
					throw new MenuChoiceException(choice);	
				} 
				
				switch(choice) {
					case MainMenu.INPUT:
						pm.inputData();
						break;
					case MainMenu.SEARCH:
						pm.searchData();
						break;
					case MainMenu.DELETE:
						pm.deleteData();
						break;
					case MainMenu.UPDATE:
						pm.updateDate();
						break;
					case MainMenu.DISPLAY:
						pm.displayAll();
						break;
					case MainMenu.SAVE:
						pm.saveToFile();
						System.out.println("저장되었습니다.");
						break;
					case MainMenu.END:
						System.out.println("프로그램 종료합니다.....");
						pm.saveToFile();
						return;
				}
			}catch(NumberFormatException e) {
				System.out.println("숫자만 입력가능");
			}catch(MenuChoiceException e) {
				e.showWrongChoice();
				System.out.println("처음부터 다시 진행됩니다!!!");
			}
		}
	}
}
