import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class AlohaGui extends JFrame implements ActionListener{

	JButton btn;
	JLabel lbl;

	AlohaGui(String title){
		setTitle(title);
		setSize(400,400);
		setLocation(400,400);
		setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

		btn = new JButton();
		lbl = new JLabel();
		JPanel panel = new JPanel();

	}
	public static void main(String[] args) {
		
	}
}