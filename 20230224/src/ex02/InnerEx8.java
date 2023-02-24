package ex02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerEx8 {

	public static void main(String[] args) {
		Button b = new Button("start");
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent occurred!!!");
				
			}
		});
	}

}
