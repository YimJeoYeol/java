package polymorphism;

public class Tv {
	boolean power;
	int channel;
	int channelUp;
	int channeldown;

	void power(){
		power = !power; 		//toggle
	}
	
	void  channelUP() {
		++channelUp;
	}

	 void channelDown() {
		 --channeldown;
	}
}
