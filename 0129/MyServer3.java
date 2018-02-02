import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;

public class MyServer3{
	public static void main(String[] args) {

		ServerSocket servSock = null;
		Socket clientSock = null;


		String argsPortNum = args[0];
		System.out.println("ポート番号: "+argsPortNum);

		int port = Integer.parseInt(argsPortNum);

		try{
			servSock = new ServerSocket(port, 30);
			while(true){
				clientSock = servSock.accept();
				System.out.println("接続を受けました");
			}
		} catch (IOException e) {
			System.err.println("サーバーエラー");
			System.exit(1);
		}
	}
}