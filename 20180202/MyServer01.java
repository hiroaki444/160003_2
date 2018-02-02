import java.io.*;
import java.net.*;

public class MyServer01{
	public static void main(String[] args) {
		ServerSocket servSock ;
		Socket sock ;
		try{
			servSock = new ServerSocket(6000,10);
			while(true){
				sock = servSock.accept();
				sock.close();
			}
		}catch (IOException e){
			System.exit(1);
		}
	}
}