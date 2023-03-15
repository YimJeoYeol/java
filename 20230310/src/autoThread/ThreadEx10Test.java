package autoThread;

public class ThreadEx10Test implements Runnable {
static boolean autoSave = false;
	
	

	public static void main(String[] args) {
		Thread t = new Thread(new ThreadEx10());
		t.setDaemon(true);
		
		t.start();
		
		for(int i = 0; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
			System.out.println(i);
			if(i == 5)
				autoSave();
				
		}

	}
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(3000);
			}catch(Exception e) {}
			if(autoSave) {
				autoSave();
			}
		}
	}
	public static void autoSave() {
		System.out.println("작업파일이 자동저장되었습니다.");
	}

}
