package repair;

public class Unit {
	int hitPoint;
	final int MAX_HP;
	
	Unit(int hp){
		MAX_HP= hp;				//생성할 때 매개변수를 통해서 값을 받으면 그다음부터 바꿀수 없다.
	}
}
