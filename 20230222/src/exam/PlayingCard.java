package exam;

public interface PlayingCard {
	public static final int SPADE =4;
	final int DIAMOND =3;	//public static final int DIAMOND = 3;
	static int HEART = 2;	//public static final int HEART   = 2;
	int CLOVER =1;			//public static final int CLOVER  = 1;
	
	public abstract String getCardNumber();
	String getCardKind();
}
