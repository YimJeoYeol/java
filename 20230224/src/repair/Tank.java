package repair;

public class Tank extends GroundUnit implements Repairable {
	Tank(){
		super(50);
		hitPoint = MAX_HP;
	}

	@Override
	public String toString() {
		return "Tank";
	}
	
}
