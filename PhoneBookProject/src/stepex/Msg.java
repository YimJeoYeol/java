package stepex;

public class Msg extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4572073860069843540L;
	static String errmsg;
	 static String msg;
	Msg(){
		this(msg);
	}

	

	public String getERRMSG( ) {
		System.out.println("");
		return errmsg;
	}
	
	
	public Msg(String ERRMSG) {
		
		
		ERRMSG = errmsg;
	}
}