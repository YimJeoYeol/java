package stepex;





public class PhoneBookVer05 {
	
	public static void main(String[] args)   {
		//PhoneBookManager pm = new PhoneBookManager();
		PhoneBookManager pm = PhoneBookManager.getInstance();
		
		int choice = 0;
		
		while(true) {
			MenuViewer.showMenu();
			try {
				
				choice = Integer.parseInt(MenuViewer.sc.nextLine());
				pm.MainNumberCheck(choice);
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
						case MainMenu.END:
							System.out.println("프로그램 종료합니다.....");	
							return;
					
						}
				}
			
			catch (NumberFormatException e) {
				
				System.out.println("글자를 입력하였습니다.");
				e.getMessage();
			}catch(Choice e) {
				
				System.out.println("1~6번 중 메뉴를 선택해 주세요");
				e.getMessage();
				
			}
			
			
	}
	}}
			

	
		
	
	

