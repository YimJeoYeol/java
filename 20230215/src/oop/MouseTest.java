package oop;

public class MouseTest {

	public static void main(String[] args) {
		
		Mouse ms = new Mouse();
		
		ms.brand = "logitech";
		ms.color = "black";
		ms.power = true;
		ms.price = 19000;
		ms.wired = true;
		ms.wireless = true;
		
		System.out.println(ms.brand);
		System.out.println(ms.color);
		System.out.println(ms.power);
		System.out.println(ms.price);
		System.out.println(ms.wired);
		System.out.println(ms.wireless);

	}

}
