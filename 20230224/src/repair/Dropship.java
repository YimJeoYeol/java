package repair;

public class Dropship extends Airunit implements Repairable {
	Dropship(){
		super(125);
		hitPoint = MAX_HP;
	}
	@Override
	public String toString() {
		return "Dropship";
	}
}
