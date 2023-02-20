package chapter0702;

public class Triangle extends Shape {
	Point[] p = new Point[3];
	Triangle(Point[] p) {
		this.p = p;
	}
	/*void draw() {
		System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n", p[0].getXY(), p[1].getXY(), p[1].getXY(), color);
	}*/
	@Override
	void draw() {
		// TODO Auto-generated method stub
		//super.draw();
		System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n", p[0].getXY(), p[1].getXY(), p[1].getXY(), color);
	}
	
	
}
