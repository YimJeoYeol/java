package chapter0705;

public class Point {
	int x = 0, y = 0;
	
	Point(){
		this(0,0);
	}
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	
	

	String getLocation() {
		return "x : " + x + "y"+ y;
	}


}
