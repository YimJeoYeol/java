package ex;

import java.util.ArrayList;

public class Box<T> {
	//책 675 예제 12-1 
	ArrayList<T> list = new ArrayList<T> ();

	void add(T item) { 
		list.add(item); 
		}
	
	T get(int i) { 
		return list.get (i);
		}
	
	ArrayList<T> getList () { 
		return list; 
		}
	
	int size() { 
		return list.size(); 
		}

	@Override
	public String toString() {
		return list.toString();
	}
	
	 
	}
	

