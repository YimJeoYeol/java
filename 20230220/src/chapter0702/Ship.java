package chapter0702;

public class Ship extends Shape {
	Point[] p = new Point[4];
	Ship(Point[] p) {
		this.p = p;
	}
	

	@Override
	void draw() {
		super.draw();
		System.out.printf("[p1=%s, p2=%s, p3=%s,p4=%s]%n"
				, p[0].getXY(), p[1].getXY(), p[2].getXY(), p[3].getXY());
	}
	 
}
