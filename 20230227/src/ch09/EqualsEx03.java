package ch09;

public class EqualsEx03 {

	public static void main(String[] args) {
		Person p1 = new Person(801108111122L);
		//Person p2 = new Person(801108111122L);
		Value2 p2 = new Value2(801108111122L);
		
//		if(p1 ==p2) {
//			System.out.println("p1과 p2는 같은 사람입니다.");
//		}else {
//			System.out.println("p1과는  p2는 다른사람입니다.");
//		}
		
		if(p1.equals(p2)) {
			System.out.println("p1과 p2는 같은 사람입니다.");
		}else {
			System.out.println("p1과는 p2는 다른사람입니다.");
		}
	}

}
