import java.io.*;
import java.net.*;

public class MyServer03{
	public static void main(String[] args) {
		ServerSocket servSock ;
		Socket sock ;
		InputStream inputs;
		try{
			servSock = new ServerSocket(5999,10);
			while(true){
				sock = servSock.accept();
				

				inputs = sock.getInputStream();
				InputStreamReader isr = new InputStreamReader(inputs);
				BufferedReader br = new BufferedReader(isr);
				String data = "";
				data = br.readLine();
				System.out.println(data);
				sock.close();
			}
		}catch (IOException e){
			System.exit(1);
		}
	}
}