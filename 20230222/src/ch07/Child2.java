package ch07;

public class Child2 extends Parent2 {
	int x = 200;

	@Override
	void method() {
		System.out.println("x = " + x);
		System.out.println("super.x = " + super.x);
		System.out.println("this.x = "  + this.x);
	}
	
}
