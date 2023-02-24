package repair;

public class RepairableTest {

	public static void main(String[] args) {
		Tank 	 t	  = new Tank();
		Dropship dr   = new Dropship();
		
		Marine 	 m    = new Marine();
		SCV 	 scv  = new SCV();
		Something s1  = new Something();  
		
		scv.repair(t);
		scv.repair(dr);
		//scv.repair(m);
		scv.repair(s1);
	}
}
