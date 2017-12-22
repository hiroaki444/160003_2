import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class GuiInput extends JFrame implements ActionListener {

	JTextField[] textfield;
	JRadioButton radiobutton;
	JCheckBox[] checkBox;
	JButton btn;
	JTextField textf;
	JLabel lbl;
	int click = 0;

	GuiInput(String title){
		setTitle(title);
		setSize(400,400);
		setLocation(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		btn = new JButton("書き込み");
		textf = new JTextField();
		lbl = new JLabel("書き込んでね");
		btn.addActionListener(this);
		JPanel pnl = new JPanel();
		pnl.setLayout(new GridLayout(2,2));
		pnl.add(lbl);
		pnl.add(textf);
		pnl.add(btn);
		Container cp = getContentPane();
		cp.add(pnl,BorderLayout.NORTH);
	}
	public static void main(String[] args) {
		GuiInput frame = new GuiInput("Hello");
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent a){
		click++;
		System.out.println(click+"回書き込みました!");
		String data = textf.getText();
		try{
			//書き込み Writer
			FileWriter fWriter = new FileWriter("data.txt",true);
			BufferedWriter bWriter = new BufferedWriter(fWriter);
			bWriter.append(data+"\r\n"); // \r\n = 改行
			textf.setText("");
			bWriter.close();
		}catch(IOException e){
			System.out.println("ファイルの操作に失敗しました。");
		}
	}
}