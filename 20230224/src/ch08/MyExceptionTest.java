package ch08;

public class MyExceptionTest {

	public static void main(String[] args) {
		try {
			method();
		}catch(MyException e) {
			System.out.println(e.getERR_CODE());
			System.out.println(e.getMessage());
		}

	}
	static void method() throws MyException{
		throw new MyException("오류가 발생하였습니다.");
	}
}
