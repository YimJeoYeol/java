package step1;

public class ReferenceParamEx2 {

	public static void main(String[] args) {
		int[] x = {10};
		System.out.println("main () : x = " + x[0]);
		
		chang (x);
		System.out.println("After chang(x)");
		System.out.println("main () : x = " + x[0]);
	}
	static void chang(int[] x) {
		x[0] = 1000;
		System.out.println("chang() : x " + x[0]);
	}

}
