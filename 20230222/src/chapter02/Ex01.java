package chapter02;



public class Ex01 {

	public static void main(String[] args) {
		Car c = new Ambulance();
		/*
		System.out.println(c instanceof FireEngine);
		System.out.println(c instanceof Car);
		System.out.println(c instanceof Object);*/
		if(c instanceof Ambulance) {
			System.out.println("This is a Ambulance instance");
		}
		if(c instanceof Car) {
			System.out.println("This is a Car instance");
		}
		if(c instanceof Object) {
			System.out.println("This is a Ambulance instance");
		}
		if(c instanceof FireEngine) {
			System.out.println("This is a FireEngine instance");
		}
		System.out.println(c.getClass().getName());
	}
}
