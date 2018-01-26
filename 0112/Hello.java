import javax.swing.*;
import java.awt.*;

public class Hello extends JFrame{
	Hello(String title){
		setTitle(title);
		setSize(680,460);
		setLocation(100,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


	public static void main(String[] args) {
		Hello frame = new Hello("ALOHA");
		System.out.println("Hello!");
		frame.setVisible(true);
	}
}