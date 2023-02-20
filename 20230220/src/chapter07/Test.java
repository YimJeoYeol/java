package chapter07;

public class Test {

	public static void main(String[] args) {
		Child c1 = new Child();
		
		c1.age = 10;
		c1.play();
		
		Parent p1 = new Parent();
		p1.age = 20;
		
		Child2 c2 = new  Child2();
		c2.study();
		c2.eat();
	}

}
