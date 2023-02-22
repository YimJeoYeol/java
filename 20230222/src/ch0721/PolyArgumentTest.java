package ch0721;



public class PolyArgumentTest {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		Buyer b2 = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b2.buy(new Piano());
		b.buy(new Audio());
		b.summary();
		/*System.out.println("현재남은 돈은 " + b.money + "만원입니다.");
		System.out.println("현재보너스점수는 " + b.bonusPoint + "점입니다.");
		System.out.println("현재남은 돈은 " + b2.money + "만원입니다.");
		System.out.println("현재보너스점수는 " + b2.bonusPoint + "점입니다.");*/
	}

}
