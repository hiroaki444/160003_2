import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fukushu extends JFrame implements ActionListener {

	private JRadioButton[] radioB;
	private JCheckBox[] check;
	private JButton button;
	private JLabel lbl;

	Fukushu(String title){
		setTitle(title);
		setSize(400,400);
		setLocation(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenu fileMenu = new JMenu("File");
		JMenu helpMenu = new JMenu("Help");
		JMenu editMenu = new JMenu("Edit");

		JMenuBar menuBra = new JMenuBar();

		JMenuItem newFileItem = new JMenuItem("new");
		JMenuItem openFileItem = new JMenuItem("Open");
		JMenuItem closeFileItem = new JMenuItem("Close");

		JMenuItem cutFileItem = new JMenuItem("Cut");
		JMenuItem copyFileItem = new JMenuItem("Open");
		JMenuItem pasteFileItem = new JMenuItem("Paste");

		JMenuItem versionFileItem = new JMenuItem("Version");
		JMenuItem indexFileItem = new JMenuItem("Index");

		setJMenuBar(menuBra);
		fileMenu.add(newFileItem);
		fileMenu.add(openFileItem);
		fileMenu.add(closeFileItem);

		editMenu.add(cutFileItem);
		editMenu.add(copyFileItem);
		editMenu.add(pasteFileItem);

		helpMenu.add(versionFileItem);
		helpMenu.add(indexFileItem);

		menuBra.add(fileMenu);
		menuBra.add(helpMenu);
		menuBra.add(editMenu);

		JPanel panel = new JPanel();
		radioB = new JRadioButton[3];
		check = new JCheckBox[3];
		button = new JButton("Click!");
		lbl = new JLabel("nullだよ～");
		button.addActionListener(this);

		panel.setLayout(new GridLayout(3,3));

		check[0] = new JCheckBox("java");
		check[1] = new JCheckBox("C#");
		check[2] = new JCheckBox("C++");

		radioB[0] = new JRadioButton("寒い");	
		radioB[1] = new JRadioButton("暑い");
		radioB[2] = new JRadioButton("ちょうどいい");

		ButtonGroup radioGroup = new ButtonGroup();
		radioGroup.add(radioB[0]);
		radioGroup.add(radioB[1]);
		radioGroup.add(radioB[2]);

		panel.add(check[0]);
		panel.add(check[1]);
		panel.add(check[2]);

		panel.add(radioB[0]);
		panel.add(radioB[1]);
		panel.add(radioB[2]);

		panel.add(button);
		panel.add(lbl);

		Container cp = getContentPane();
		cp.add(panel,BorderLayout.NORTH);
		}
	public static void main(String[] args) {
		Fukushu frame = new Fukushu("Hello");
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		System.out.println("クリック！");
		String[] checkData = {"","",""};
		for (int n=0; n<3 ; n++ ) {
			if (this.check[n].isSelected()) {
				checkData[n] = this.check[n].getText();
			}
		}
		for (int i=0; i<3; i++ ) {
			if (this.radioB[i].isSelected()) {			
				this.lbl.setText(checkData[0]+checkData[1]+checkData[2]+this.radioB[i].getText()+"です");
			}
		}	
	}
}