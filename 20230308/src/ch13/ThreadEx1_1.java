package ch13;

public class ThreadEx1_1 extends Thread {

	@Override
	public void run() {
		//책 724~725 예제13-1
		for(int i = 0; i < 50; i++) {
			System.out.println(getName());	//조상인 Thread의 getName()을 호출
		}
	}
	
}
