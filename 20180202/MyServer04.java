import java.io.*;
import java.net.*;

public class MyServer04{
	public static void main(String[] args) {
		ServerSocket servSock ;
		Socket sock ;
		OutputStream outs;
		byte[] buff = new byte[1024];
		try{
			servSock = new ServerSocket(5000,10);
			while(true){
				sock = servSock.accept();

				outs = sock.getOutputStream();
				PrintWriter pw = new PrintWriter(outs);
				String data = "Hello!";
				pw.println(data);
				pw.flush();
				sock.close();
			}
		}catch (IOException e){
			System.exit(1);
		}
	}
}