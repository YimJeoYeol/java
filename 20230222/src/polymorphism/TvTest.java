package polymorphism;

public class TvTest {

	public static void main(String[] args) {
		Tv 		   t  = new Tv();
		CaptionTv ct1 = new CaptionTv();
		Tv		  ct2 = new CaptionTv();
		Object 	   t1 = new Tv();
		Object    ct3 = new CaptionTv();
		
		t.channel  	  = 11;
		ct1.channel   = 125;
		ct2.channel	  = 500;	
		
		System.out.println(t.channel);
		System.out.println(ct1.channel);
		System.out.println(ct2.channel);
		
		ct1.text = "Hello";
		ct1.caption();
		/*
		ct2.text = "Hello2";
		ct2.caption();
		*/
		//부모타입의 참조변수는 물려준 멤버만 접근가능.
	}
}
