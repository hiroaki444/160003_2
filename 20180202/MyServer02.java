import java.io.*;
import java.net.*;

public class MyServer02{
	public static void main(String[] args) {
		ServerSocket servSock ;
		Socket sock ;
		try{
			servSock = new ServerSocket(6000,10);
			while(true){
				sock = servSock.accept();
				System.out.println(sock.getInetAddress());
				sock.close();
			}
		}catch (IOException e){
			System.exit(1);
		}
	}
}