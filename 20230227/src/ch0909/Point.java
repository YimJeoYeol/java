package ch0909;

public class Point /*implements Cloneable */{
		int x, y;

		Point (int x, int y ){
			this.x = x;
			this.y = y;
		}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + x + ", " + y + ")";
	}

}
