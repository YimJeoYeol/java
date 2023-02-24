package ch08;

public class ExceptionEx9 {

	public static void main(String[] args) {
		try{
			Exception e = new Exception("고의로 발생 시켰음");
		
		throw e;
		//throw new Exception ("고의로 발생시켰음");
		}catch(Exception e2) {
			System.out.println(e2.getMessage());
			e2.printStackTrace();
		}
		System.out.println("정상종료");
	}

}
