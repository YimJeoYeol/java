package chapter07;

public class CationTvText {

	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		System.out.println("Hello, World");
		ctv.caption = true;
		ctv.displayCaption("Hello, World!!");

	}

}
