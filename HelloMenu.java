import java.awt.*;
import javax.swing.*;
public class HelloMenu extends JFrame  {
	HelloMenu(String title){
		setTitle(title);
		setSize(400,400);
		setLocation(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JMenu menu = new JMenu("Fiel");
		JMenuBar menuB = new JMenuBar();
		JMenuItem menuI = new JMenuItem("new");
		JMenuItem menuI2 = new JMenuItem("open");

		setJMenuBar(menuB);
		menu.add(menuI);
		menu.add(menuI2);
		menuB.add(menu);

	}
	public static void main(String[] args) {
		HelloMenu frame = new HelloMenu("Hello");
		frame.setVisible(true);
	}
}