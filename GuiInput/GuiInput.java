import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class GuiInput extends JFrame implements ActionListener {

	JTextField[] textfield;
	JRadioButton radiobutton;
	JCheckBox[] checkBox;


	GuiInput(String title){
		setTitle(title);
		setSize(400,400);
		setLocation(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			
	}
	public static void main(String[] args) {
		GuiInput frame = new GuiInput("Hello");
		frame.setVisible(true);
		
		File file = new File ("Test.txt");
		FileWriter fWriter = new FileWriter(file);
		BufferedWriter bWriter = new BufferedWriter(fWriter);	
	}
	public void actionPerformed(ActionEvent e){
	
	}
}