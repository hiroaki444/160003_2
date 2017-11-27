import javax.swing.JFrame;
public class Hello2 extends JFrame {
	Hello2(String title){
		setTitle(title);
		setSize(400,400);
		setLocation(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		Hello2 hello = new Hello2("HELLO");
		hello.setVisible(true);
	}
}