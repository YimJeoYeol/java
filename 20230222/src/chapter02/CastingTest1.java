package chapter02;

public class CastingTest1 {

	

	public static void main(String[] args) {
		Car 	   car  = null;
		Car 	   car2 = null;
		FireEngine fe   = new FireEngine();
		FireEngine fe2  = null;
		Ambulance  am   = new Ambulance();
		Ambulance  am2  = null;
		
		am =(Ambulance)car2; 
		fe.water();
		car = fe;
		//c.water();
		car.drive();
		car.stop();
		am.siren();
		car2 = am;
		fe2 = (FireEngine)car;
		fe2.water();
		am2 = (Ambulance)car2;
		am2.siren();
	}
}
