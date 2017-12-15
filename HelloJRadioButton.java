import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class HelloJRadioButton extends JFrame implements ActionListener {
	JButton btn;
	JRadioButton[] rb;
	JLabel lbl;

	HelloJRadioButton(String title) {
		setTitle(title);
		setSize(400,400);
		setLocation(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		btn = new JButton("Push!");
		rb = new JRadioButton[3];
		rb[0] = new JRadioButton("左");
		rb[1] = new JRadioButton("中");
		rb[2] = new JRadioButton("右");
		lbl = new JLabel("押してね！");



		JPanel pnl = new JPanel();
		pnl.setLayout(new GridLayout(2,3));
		btn.addActionListener(this);
		ButtonGroup radio = new ButtonGroup();
		radio.add(rb[0]);
		radio.add(rb[1]);
		radio.add(rb[2]);

		pnl.add(rb[0]);
		pnl.add(rb[1]);
		pnl.add(rb[2]);
		pnl.add(btn);
		pnl.add(lbl);

		Container cp = getContentPane();
		cp.add(pnl,BorderLayout.NORTH);
	}
	public static void main(String[] args) {
		HelloJRadioButton frame = new HelloJRadioButton("Hello");
		frame.setVisible(true);

	}
	public void actionPerformed(ActionEvent e){
		System.out.println("クリック！");
		for (int i=0; i<3; i++) {
			if(this.rb[i].isSelected()) {
			this.lbl.setText(this.rb[i].getText()+"だよ！");
			}
		}
		
	}
}