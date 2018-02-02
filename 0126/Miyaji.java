import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
        
        public class Miyaji extends JFrame implements ActionListener{
          JRadioButton[] check;
          JLabel[] lbl;
          JTextField jtf;
         Miyaji(String title){
           setTitle(title);
           setSize(400,300);
           setLocation(400,300);
           setDefaultCloseOperation(EXIT_ON_CLOSE);
           jtf = new JTextField("",20);
           ButtonGroup btnG = new ButtonGroup();
     
           this.check = new JRadioButton[4];
           this.check[0] = new JRadioButton("A");
           this.check[1] = new JRadioButton("B");
           this.check[2] = new JRadioButton("O");
           this.check[3] = new JRadioButton("AB");
           
           btnG.add(check[0]);
           btnG.add(check[1]);
           btnG.add(check[2]);
           btnG.add(check[3]);
     
           this.lbl = new JLabel[4];
           this.lbl[0] = new JLabel();
           this.lbl[1] = new JLabel();
           this.lbl[2] = new JLabel();
           this.lbl[3] = new JLabel();
        
           JPanel pnl = new JPanel();
            pnl.add(jtf);
           JPanel msg = new JPanel();
           pnl.setLayout(new GridLayout(1,3));
           msg.setLayout(new GridLayout(1,3));
           for(int i = 0; i<4 ; i++){
             pnl.add(this.check[i]);
             msg.add(this.lbl[i]);
           }
     
           JButton button = new JButton("OK");
           button.addActionListener(this);
           JPanel pnlbutton = new JPanel();
           pnlbutton.add(button);
        
           Container cont = getContentPane();
           cont.add(pnl, BorderLayout.NORTH);
           cont.add(msg, BorderLayout.CENTER);
           cont.add(pnlbutton, BorderLayout.SOUTH);
            }
           public void actionPerformed(ActionEvent e){
             System.out.println("CLICK!!");
             String data = jtf.getText();
             String Ketueki = "";
             if(this.check[0].isSelected()){
                 this.lbl[0].setText(this.check[0].getText()+"型です");
              }else {
                 this.lbl[0].setText("");
                 Ketueki = "A";
              }
              if(this.check[1].isSelected()){
                 this.lbl[1].setText(this.check[1].getText()+"型です");
              }else {
                 this.lbl[1].setText("");
                 Ketueki = "B";
              }
              if(this.check[2].isSelected()){
                 this.lbl[2].setText(this.check[2].getText()+"型です");
              }else {
                 this.lbl[2].setText("");
                 Ketueki = "O";
              }if(this.check[3].isSelected()){
                 this.lbl[3].setText(this.check[3].getText()+"型です");
              }else {
                 this.lbl[3].setText("");
                 Ketueki = "AB";
                 //こ↑こ↓に血液関連をいれればいいと思うんですけど
                 //たとえばketueki ="A";//的な。
             }
             try{
             		FileWriter fw = new FileWriter("data.txt",true);
               	BufferedWriter bw = new BufferedWriter(fw);
                	bw.append("血液型は"+Ketueki+"です");
                 //血液のdataを入れるStringを作って
                 //作ったら血液のdataをifで判別していれるプログラムを作って
                  jtf.setText("");
                  bw.close();
               }catch(IOException a){
               	System.out.println("エラー");
               }
             }
           public static void main(String[] args){
              Miyaji miyaji = new Miyaji("ALOHA");
              miyaji.setVisible(true);
              
           }
        }