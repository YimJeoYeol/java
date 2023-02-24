package ex02;

public class Outer {
	int iv = 0;
	static int cv = 0;
	
	void myMethod() {
		int lv = 0;
	}
	class Inner {}
	static class staticInner{}
	
	void myMethod2() {
		class LocalInner{}
	}
}
