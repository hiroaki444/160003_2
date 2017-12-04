import javax.swing.JFrame;
public class LargeFrame extends JFrame{
	LargeFrame(String title) {
		setTitle(title);
		setSize(1960,1080);
		setLocation(0,0);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		LargeFrame frame = new LargeFrame("Hello");
		frame.setVisible(true);
	}
}
