package chapter02;

public class CastingTest2 {

	public static void main(String[] args) {
		//Car car = new Car();
		Car car = new FireEngine();
		Car car2 = null;
		FireEngine fe = null;
		
		if(car instanceof Ambulance) {
			
			car.drive();
			fe = (FireEngine)car;
			fe.drive();
			car2 = fe;
			car2.drive();
		}
		if(car instanceof Car) {
			car.drive();
			fe = (FireEngine)car;
			fe.drive();
			car2 = fe;
			car2.drive();
		}
		if(car instanceof Object) {
			car.drive();
			fe = (FireEngine)car;
			fe.drive();
			car2 = fe;
			car2.drive();
		}
		if(car instanceof FireEngine) {
			car.drive();
			fe = (FireEngine)car;
			fe.drive();
			car2 = fe;
			car2.drive();
		}
		

	}
	}


