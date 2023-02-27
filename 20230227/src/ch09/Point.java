package ch09;

public class Point /*implements Cloneable */{
	int x, y;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "x = "+ x + ", y = " + y;
	}
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public Object clone()  {
		Object obj = null;
		try {
			obj = super.clone();
		}catch(CloneNotSupportedException e) {
			System.out.println(e.getMessage());
			return obj;
		}
		return obj;
	}
	/*public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}*/
}
