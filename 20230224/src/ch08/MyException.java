package ch08;

public class MyException extends Exception {
	private final int ERR_CODE;
	
	MyException(String msg){
		this(msg, 100);
	}

	public int getERR_CODE() {
		return ERR_CODE;
	}

	public MyException(String msg,int err_code) {
		
		ERR_CODE = err_code;
	}

	
}
