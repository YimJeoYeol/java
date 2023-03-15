package ch13;

public class ThreadEx8_2 extends Thread {
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.println("|");
			for(int x = 0; x < 10000000; x++);
		}
	}
}
