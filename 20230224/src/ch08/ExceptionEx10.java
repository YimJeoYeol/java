package ch08;

public class ExceptionEx10 {

	public static void main(String[] args)/* throws Exception */{
		/*throw new Exception("고의로 발생시켰다....");*/
		try {
			method();
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
	}
	public static void method() throws Exception{
		//throw new Exception("강제오류");
		//throw new Exception("처리요망");
		throw new Exception("강제발생");
	}

}
