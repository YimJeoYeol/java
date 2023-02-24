package ex01;

public class Tv {
	String color;
	int size;
	private static Tv t = new Tv();
	private Tv() {}
	/*
	public static Tv getInstance(){
		if(t == null)
			
			t = new Tv();
			
		return  t;
	}*/
	public static Tv getInstance() {
		if(t == null)
			t = new Tv();
		return t;
	}
}
