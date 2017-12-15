import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Fukushu extends JFrame implements ActionListener{
	private JButton btn;
	private JLabel lbl;
	private JCheckBox cb;
	Fukushu(String title) {
		setTitle(title);
		setSize(400,400);
		setLocation(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		btn = new JButton("Push!");
		lbl = new JLabel("Label");
		cb = new JCheckBox("Check Box");
		JPanel pnl = new JPanel();

		pnl.setLayout(new GridLayout(2,2));
		btn.addActionListener(this);
		pnl.add(lbl);
		pnl.add(cb);
		pnl.add(btn);

		Container cp = getContentPane();
		cp.add(pnl,BorderLayout.NORTH);

	}	
	public static void main(String[] args) {
		Fukushu frame = new Fukushu("Fukushu");
		frame.setVisible(true);

	}
	public void actionPerformed(ActionEvent e) {
		System.out.println("click!");
		if(this.cb.isSelected()){
			this.lbl.setText(this.cb.getText()+"Check!");
		}else{
			this.lbl.setText("No Check!");
		}
	}
}