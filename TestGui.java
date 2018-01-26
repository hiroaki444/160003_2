 import java.io.*;
 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;
 
 public class TestGui extends JFrame implements ActionListener{
  	JButton btn;
   	JTextField textF;
     JLabel[] label;
     JRadioButton radioA;
     JRadioButton radioB;
     JRadioButton radioO;
     JRadioButton radioAB;
     
     
      
 	TestGui(String title){
  		//windowの設定
  		setTitle(title);
    		setSize(500,500);
      	setLocation(400,500);
       	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         JPanel panel = new JPanel();
         
         this.btn = new JButton("入力");	
         btn.addActionListener(this);
         textF = new JTextField();
         label = new JLabel[3];

         label[0] = new JLabel("氏名");
         label[1] = new JLabel("血液型");
         label[2] = new JLabel("");

         ButtonGroup btnG = new ButtonGroup();
         this.radioA = new JRadioButton("A",true);
         this.radioB = new JRadioButton("B");
         this.radioO = new JRadioButton("O");
         this.radioAB = new JRadioButton("AB");
         
         btnG.add(radioA);
         btnG.add(radioB);
         btnG.add(radioO);
         btnG.add(radioAB);
         
         panel.add(label[0]);
         panel.add(textF);
         panel.add(label[1]);
         panel.add(label[2]);
         panel.add(radioA);
         panel.add(radioB);
         panel.add(radioO);
         panel.add(radioAB);
         panel.add(btn);
         
         panel.setLayout(new GridLayout(7,2));
         
         Container cp = getContentPane();
         cp.add(panel,BorderLayout.NORTH);
         
 	}          
 	public static void main(String[] args){
			TestGui frame = new TestGui("Hello");
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
             	bw.append("氏名:"+data+", 血液型:"+ketueki+"\r\n");
              System.out.println("氏名:"+data+", 血液型:"+ketueki);
              	textF.setText("");
              	bw.close();
         }catch(IOException a){
         	System.out.println("エラー");
         }
   	}
 }
 