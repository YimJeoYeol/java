package ex;

public class FruitBoxEx1 {

	public static void main(String[] args) {
		//책 675 예제 12-1  책 677 예제12-2
		Box<Fruit> fruitBox = new Box<Fruit>();
		Box<Apple> appleBox = new Box<Apple>();
		Box<Toy> toyBox     = new Box<Toy>();
//		Box<Grape> grapeBox = new Box<Apple>();		//에러. 타입불일치
		Box<Grape> grapeBox = new Box<Grape>();
//		FruitBox<Toy> fb2 = new FruitBox<Toy>();
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());					//OK. void add(Fruit item)
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
		appleBox.add(new Apple());
//		appleBox.add(new Toy());					//에러. Box<apple>에는 Apple만 담을수 있음
		
		grapeBox.add(new Grape());
		grapeBox.add(new Grape());
		
		toyBox.add(new Toy());
//		toyBox.add(new Apple());					//에러. Box<Toy>에는 Apple을 담을 수 없음
		
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(grapeBox);
		System.out.println(toyBox);
	}												//main 끝
}