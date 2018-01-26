 import java.io.*;
 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;
 
 public class GuiInput extends JFrame implements ActionListener{
  	JButton btn;
   	JTextField textF;
     JLabel label;
     JRadioButton radioA;
     JRadioButton radioB;
     JRadioButton radioO;
     JRadioButton radioAB;
  
 	GuiInput (String title){
  		//windowの設定
  		setTitle(title);
    		setSize(500,500);
      	setLocation(400,500);
       	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         JPanel panel = new JPanel();
         
         this.btn = new JButton("入力");	
         btn.addActionListener(this);
         textF = new JTextField();
         label = new JLabel("氏名");
         ButtonGroup btnG = new ButtonGroup();
         this.radioA = new JRadioButton("A",true);
         this.radioB = new JRadioButton("B");
         this.radioO = new JRadioButton("O");
         this.radioAB = new JRadioButton("AB");
         
         btnG.add(radioA);
         btnG.add(radioB);
         btnG.add(radioO);
         btnG.add(radioAB);
         
         panel.add(label);
         panel.add(textF);
         panel.add(radioA);
         panel.add(radioB);
         panel.add(radioO);
         panel.add(radioAB);
         panel.add(btn);
         
         panel.setLayout(new GridLayout(4,2));
         
         Container cp = getContentPane();
         cp.add(panel,BorderLayout.NORTH);
         
 	}          
 	public static void main(String[] args){
			GuiInput  frame = new GuiInput ("Hello");
    		frame.setVisible(true);
 	}
  	public void actionPerformed(ActionEvent e){
   		System.out.println("クリック！");
     	String data = textF.getText();
      	String ketueki = "";
      	if(this.radioA.isSelected()){
       		ketueki = "A";
       	}else if(this.radioB.isSelected()){
        		ketueki = "B";
         }else if(this.radioO.isSelected()){
         	ketueki = "O";
         }else if(this.radioAB.isSelected()){
         	ketueki = "AB";
         }
       	try{
         	FileWriter fw = new FileWriter("data.txt",true);
          	BufferedWriter bw = new BufferedWriter(fw);
             	bw.append(data+";"+ketueki+"\r\n");
              	textF.setText("");
              	bw.close();
         }catch(IOException a){
         	System.out.println("エラー");
         }
   	}
 }