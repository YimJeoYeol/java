package autoThread;

public class ThreadEx10 implements Runnable {
	
	static boolean autoSave = false;
	
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
	public void autoSave() {
		System.out.println("작업파일이 자동저장되었습니다.");
	}

}

