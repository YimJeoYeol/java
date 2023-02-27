package ch09;

public class PointTest {

	public static void main(String[] args) {
		Point org = new Point(3, 5);
//		try {
			Point copy = (Point)org.clone();
			System.out.println(org);
			System.out.println(copy);
		
//		}catch(CloneNotSupportedException e) {
//			System.out.println("복제할수 없습니다.");
//		}
		
		

	}

}
