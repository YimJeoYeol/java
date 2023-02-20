package chapter0702;

public class Circle extends Shape {
	Point center;
	int r;
	Circle(){
		this(new Point(0, 0), 100);
	}
	Circle(Point center, int r){
		this.center = center;
		this.r = r;
	}
	/*void draw() {
		System.out.printf("[center=(%d, %d), r=%d, color=%s]%n", center.x, center.y, r, color);
	}*/
	@Override //주석 : 컴파일러 무시 @: 애너테이션 : 컴파일러에게 정보제공
	void draw() {
		Circle c2 = new Circle();
		System.out.println(c2.center);
		//super.draw();
		System.out.printf("[center=(%d, %d), r=%d, color=%s]%n", center.x, center.y, r, color);
	}
}
