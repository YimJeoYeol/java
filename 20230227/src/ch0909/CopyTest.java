package ch0909;

public class CopyTest {

	public static void main(String[] args) {
		Circle c1 = new Circle(new Point(1,1),2.0);
		Circle c2 = (Circle)c1.clone();
		System.out.println(c1);
		System.out.println(c2);
		
		c1.p.x = 9;
		c1.p.y = 9;
		c1.r   = 5.5;
		
		System.out.println(c1);
		System.out.println(c2);
	}

}
