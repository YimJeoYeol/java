package chap2;

public class IncThread extends Thread {
	Increment inc;
	
	IncThread(Increment inc){
		this.inc = inc;
	}

	@Override
	public void run() {
		for(int i = 0; i < 1000000; i++)
		inc.increment();
	}
}