package ch13;

public class ThreadEx1_2 implements Runnable {

	@Override
	public void run() {
		//책 724~725 예제13-1
		for(int i = 0; i < 50; i++) {
//			Threard.currentThread();		//현재 실행중인 Thread를 반환한다.
			System.out.println(Thread.currentThread().getName());
		}

	}

}
