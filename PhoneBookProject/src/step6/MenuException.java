package step6;

@SuppressWarnings("serial")
public class MenuException extends Exception{
	int choice;
	public MenuException(int choice) {
		super();
	}
	int wrongChoice;
	
	
	void MenuChoiceException(){
		super("dhfb");
		wrongChoice = choice;
		
	}
	public void showWrongChoice() {
		System.out.println(wrongChoice+ "메뉴가 존자하지않습니다.");
	}

}
