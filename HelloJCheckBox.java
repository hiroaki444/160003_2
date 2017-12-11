import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class HelloJCheckBox extends JFrame implements ActionListener{
	JCheckBox cb1;
	JCheckBox cb2;
	JCheckBox cb3;
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JLabel lbl1;
	JLabel lbl2;
	JLabel lbl3;
	JRadioButton rb1;
	JRadioButton rb2;
	JRadioButton rb3;
	public static void main(String[] args) {
		HelloJCheckBox frame = new HelloJCheckBox("Hello");
		frame.setVisible(true);
		
	}
	HelloJCheckBox(String title){
		setTitle(title);
		setSize(300,300);
		setLocation(100,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cb1 = new JCheckBox("Check1");
		cb2 = new JCheckBox("Check2");
		cb3 = new JCheckBox("Check3");
 		btn1 = new JButton("Button1");
 		lbl1 = new JLabel("1");
		lbl2 = new JLabel("2");
		lbl3 = new JLabel("3");
		rb1 = new JRadioButton("A");
		rb2 = new JRadioButton("B");
		rb3 = new JRadioButton("C");
		JPanel pnl = new JPanel();
		pnl.setLayout(new GridLayout(6,2));
		btn1.addActionListener(this);
		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);

		pnl.add(lbl1);
		pnl.add(cb1);
		
		pnl.add(lbl2);
		pnl.add(cb2);

		pnl.add(lbl3);
		pnl.add(cb3);
		pnl.add(btn1);

		pnl.add(rb1);
		pnl.add(rb2);
		pnl.add(rb3);

		Container cp = getContentPane();
		cp.add(pnl,BorderLayout.NORTH);

	}
	public void actionPerformed(ActionEvent e){
		System.out.println("click");
		if (this.cb1.isSelected()) {
			this.lbl1.setText("Check!");
			System.out.println("Box1 Check!");
		}else{
			this.lbl1.setText("No Check!");
			System.out.println("Box1 No Check!");
		}
		
		if (this.cb2.isSelected()) {
			this.lbl2.setText("Check!");
			System.out.println("Box2 Check!");
		}else{
			this.lbl2.setText("No Check!");
			System.out.println("Box2 No Check!");
		}

		if (this.cb3.isSelected()) {
			this.lbl3.setText("Check!");
			System.out.println("Box3 Check!");
		}else{
			this.lbl3.setText("No Check!");
			System.out.println("Box3 No Check!");
		}	
	}
}