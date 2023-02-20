package chapter0702;

public class DrawShape {

	public static void main(String[] args) {
		
			Point[] p = {
					new Point(100, 100),
					new Point(140, 50),
					new Point(200, 100),
					new Point(190, 250)
			};
			
			Triangle t = new Triangle(p);
			Circle 	 c = new Circle(new Point(150,150), 50);
			Ship 	 s = new Ship(p);
			s.draw();
			c.draw();
			t.draw();	
		}
	}


