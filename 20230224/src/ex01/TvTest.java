package ex01;

public class TvTest {

	public static void main(String[] args) {
		Tv t1 = Tv.getInstance();
		Tv t2 = Tv.getInstance();
		Tv t3 = Tv.getInstance();
		
		t1.color = "red";
		t2.color = "blue";
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		
	}

}
