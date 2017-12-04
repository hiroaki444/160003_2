import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Container;
import java.awt.BorderLayout;

public class Hello extends JFrame{

	Hello(String title){
		setTitle(title);
		setSize(400,400);
		setLocation(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btn = new JButton("ボタン１");
		JPanel panel = new JPanel();
		panel.add(btn);
		Container cp = getContentPane();
		//Container cp = new Container();
		cp.add(panel, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		Hello hello = new Hello("ALOHA");
		hello.setVisible(true);
	}

}
