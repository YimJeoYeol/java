package ch09;

public class Card {
	@Override
	public String toString() {
		return "Card [number=" + number + ", kind=" + kind + "]";
	}
	int number;
	String kind;
	Card(){
		this("SPADE", 1);
	}
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
}
