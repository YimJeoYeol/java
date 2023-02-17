package step1;

public class CarTest {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.showCar();
		c1.color = "WHITE";
		c1.gearType = "AUTO";
		c1.door = 4;
		
		Car c2 = new Car("RED", "STIC", 2);
		System.out.println("c1의 color = " + c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
		System.out.println("c2의 color = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);

	}

}
