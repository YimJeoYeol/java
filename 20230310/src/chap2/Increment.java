package chap2;

public class Increment {
	int num = 0;
	
	public void increment() {
		synchronized (this) {
			num++;	
		}
		
	}
	public int getNum() {
		return num;
	}
}
