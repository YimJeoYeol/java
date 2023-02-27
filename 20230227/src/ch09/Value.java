package ch09;

public class Value {
	int Value;
	
	Value(int value){
		this.Value = value;
	}

	public boolean equals(Object obj, int value) {
		if(obj != null && obj instanceof Person) {
			return value == ((Value)obj).Value;
		}else {
			return false;
		}
	}
}
