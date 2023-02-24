package repair;

public class Marine extends GroundUnit {
	Marine(){
		super(125);
		hitPoint = MAX_HP;
	}

	@Override
	public String toString() {
		return "Marine []";
	}
	
}
