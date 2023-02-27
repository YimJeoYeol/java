package ch0909;

public class Circle implements Cloneable
{
	Point p;
	double r;
	public Circle (Point p, double r) {
		this.p = p;
		this.r = r;
	}
	@Override
	public String toString() {
		return "Circle [p=" + p + ", r=" + r + "]";
	}
	@Override
	protected Object clone()  {
		Object obj = null;
		try {
			obj = super.clone();
		}catch (CloneNotSupportedException e) {
			System.out.println(e.getMessage());
		}
		
		Circle c = (Circle)obj;
		c.p      = new Point(this.p.x, this.p.y);
		
		return c;
	}
	
}
