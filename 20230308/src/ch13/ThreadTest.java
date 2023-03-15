package ch13;

public class ThreadTest {

	public static void main(String[] args) {
		//책 724~725 예제13-1
		ThreadEx1_1 t1 = new ThreadEx1_1();
		
//		Runnable r = new ThreadEx1_2();
//		Thread t2 = new Thread(r);			// 생성자Thread(Runnable target)
		Thread t2 = new Thread(new ThreadEx1_2());
		
		t1.start();
		t2.start();
		
//		t1.run();
//		t2.run();
	}

}
