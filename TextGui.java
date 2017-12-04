import javax.swing.*;
import java.awt.*;
public class TextGui extends JFrame {
	TextGui(String title){
		setTitle(title);
		setSize(600,400);
		setLocation(100,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();

		JTextField tf = new JTextField("",20);
		JPasswordField psf = new JPasswordField("Hello");

		panel.add(psf,BorderLayout.NORTH);
		panel.add(tf,BorderLayout.NORTH);

		Container cp = getContentPane();
		cp.add(panel,BorderLayout.NORTH);
	}
	public static void main(String[] args){
		TextGui frame = new TextGui("Hello");
		frame.setVisible(true);

	}
}
