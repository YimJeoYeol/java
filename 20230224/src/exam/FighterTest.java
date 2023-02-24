package exam;

public class FighterTest {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		
		if(f instanceof Unit)
			System.out.println("f는 Unit클래스의 자손입니다.");
		if(f instanceof Fightable)
			System.out.println("f는 Fighteable인터페이스를 구현했습니다.");
		if(f instanceof Movable)
			System.out.println("f는 Movable인터페이스를 구현했습니다.");
		if(f instanceof Attackable)
			System.out.println("f는 Attackable인터페이스를 구현했습니다.");
		if(f instanceof Object)
			System.out.println("f는 Object클래스의 자손입니다.");
		
		Unit u = new Unit();
		
		if (u instanceof Unit) {
			System.out.println("u는 Unit클래스 자손니다.");
		}
		if(u instanceof Fightable)
			System.out.println("f는 Fighteable인터페이스를 구현했습니다.");
		if(u instanceof Movable)
			System.out.println("f는 Movable인터페이스를 구현했습니다.");
		if(u instanceof Attackable)
			System.out.println("f는 Attackable인터페이스를 구현했습니다.");
		if(u instanceof Object)
			System.out.println("f는 Object클래스의 자손입니다.");
		

	}

}
