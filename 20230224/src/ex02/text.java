package ex02;

public class text {

	public static void main(String[] args) {
		int i = 10;
		int y = 0;
		try {
			System.out.println(i/y);
		}catch(ArrayIndexOutOfBoundsException e){
			//System.out.println(e.getMessage());
			//System.out.println("0으로 나눌수 없습니다.");
			System.out.println("배열오류");
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다.");
		}catch(Exception e) {
			System.out.println("오류발생");
		}
	}

}
