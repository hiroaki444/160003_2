import java.net.ServerSocket;
import java.io.IOException;

public class MyServer2{
	public static void main(String[] args) {
		ServerSocket serv = null;

		String argsPortNum = args[0];
		System.out.println("ポート番号: "+argsPortNum);

		int port = Integer.parseInt(argsPortNum);

		try{
			serv = new ServerSocket(port, 30);
		} catch (IOException e) {
			System.err.println("サーバーエラー");
			System.exit(1);
		}
	}
}