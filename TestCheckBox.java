import java.awt.*;
import javax.swing.*;
public class TestCheckBox extends JFrame{
	public static void main(String[] args) {
		TestCheckBox frame = new TestCheckBox("CheckBox");
		frame.setVisible(true);
	}
	TestCheckBox(String title){
		setTitle(title);
		setSize(200,200);
		setLocation(100,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JCheckBox cb1 = new JCheckBox("1");
		JCheckBox cb2 = new JCheckBox("2");
		JCheckBox cb3 = new JCheckBox("3");
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3,3));
		JLabel lbl1 = new JLabel("1番目");
		JLabel lbl2 = new JLabel("2番目");
		JLabel lbl3 = new JLabel("3番目");
		panel.add(lbl1);
		panel.add(cb1);
		panel.add(lbl2);
		panel.add(cb2);
		panel.add(lbl3);
		panel.add(cb3);
		Container cp = getContentPane();
		cp.add(panel,BorderLayout.NORTH);


	}
}