package exam;

public class MyCard implements PlayingCard {
	int number;
	String kind;
	
	MyCard(String kind, int number){
		this.number = number;
		this.kind = kind;
	}
	
	
	@Override
	public String getCardNumber() {
		// TODO Auto-generated method stub
		/*return null;*/
		return "" + number;
	}

	@Override
	public String getCardKind() {
		// TODO Auto-generated method stub
		//return null;
		return kind;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
