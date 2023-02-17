package step1;

public class Car {
	//전역변수
	String color; 
	String gearType;
	int door;
	
	Car(){
		/*color = "white";
		gearType = "AUTO";
		door = 4;*/
		this("WHITE", "AUTO", 4);
	}
	Car(String color){
		this.color = color;
		gearType = "STIC";
		door = 2;
		//this(color, "STIC", 2);
	}

	public Car(/*지역변수*/String color, String gearType, int door) {
		
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	void showCar() {
		int i = 0;
		String ms = null;
		System.out.printf("(%s, %s, %d)%n", color, gearType, door);
		System.out.println(i);
	}
	
}
