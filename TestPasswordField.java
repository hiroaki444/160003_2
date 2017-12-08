import javax.swing.*;
import java.awt.*;
public class TestPasswordField extends JFrame {
	public static void main(String[] args) {
		TestPasswordField frame = new TestPasswordField("Hello");
		frame.setVisible(true);
	}
	TestPasswordField(String title){
		setTitle(title);
		setSize(600,600);
		setLocation(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel pnl = new JPanel();
		pnl.setLayout(new GridLayout(2, 2));
		JTextField textm = new JTextField("",10);
		JPasswordField pwf = new JPasswordField("",10);
		JLabel lblm = new JLabel("Mail");
		JLabel lblp = new JLabel("Password");
		pnl.add(lblp);	
		pnl.add(pwf);
		pnl.add(lblm);
		pnl.add(textm);
		Container cp = getContentPane();
		cp.add(pnl,BorderLayout.NORTH);
	}
}