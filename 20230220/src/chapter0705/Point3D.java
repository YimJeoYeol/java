package chapter0705;
public class Point3D extends Point {
	int z = 30;
	// 책 334 예제 7-8
	Point3D(){
		this(100, 200, 300);
	}
	//책 332 예제 7-7
	Point3D(int x, int y, int z) {
		
		/*super(x,y);	//super 앞에는 아무것도 없어야한다. 이상한것이 앞에 있을경우 오류를 낸다.
		
		//this.x = x;
		//this.y = y;
		this.z = z;*/
		super(x, y);
		this.z = z;
	}/*//책 332 예제 7-7
	@Override
	String getLocation() {
		return "x : " + x + "y" + y + "z" + z;
	}
*/
	
}
