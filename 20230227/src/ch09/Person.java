package ch09;

public class Person {
	long id;
	Person(long id){
		this.id = id;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Person) {
			return id == ((Person)obj).id; //Person은 형변환을 원래 해줘야하고 obj까지 형변환해줘야한다.
		}else {
			return false;
		}
//		if(obj != null || obj instanceof Person) {
//			return id == ((Person)obj).id; //Person은 형변환을 원래 해줘야하고 obj까지 형변환해줘야한다.
//		}else {
//			return false;
//		}
		
	}
}
