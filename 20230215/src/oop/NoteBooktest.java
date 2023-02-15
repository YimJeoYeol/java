package oop;

public class NoteBooktest {

	public static void main(String[] args) {
		NoteBook nb = new NoteBook();
		
		nb.color = "BLACK";
		nb.core  = "I9";
		nb.memory = "2TB";
		nb.ram = 32;
		nb.size = 17;
		nb.volum = 55;
		nb.power = true;
		nb.brand = "APPLE";
		nb.price = 999;
		
		System.out.println(nb.color);
		System.out.println(nb.power);
		System.out.println(nb.core);
		System.out.println(nb.memory);
		System.out.println(nb.ram);
		System.out.println(nb.volum);
		System.out.println(nb.size);
		

	}

}
