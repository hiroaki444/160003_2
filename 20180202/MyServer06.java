import java.io.*;
import java.net.*;

public class MyServer06{
	public static void main(String[] args) {
		ServerSocket servSock ;
		Socket sock ;
		InputStream inputs;
		OutputStream outs;
		try{
			servSock = new ServerSocket(3999,10);
			while(true){
				sock = servSock.accept();
				

				inputs = sock.getInputStream();
				InputStreamReader isr = new InputStreamReader(inputs);
				BufferedReader br = new BufferedReader(isr);

				String data = "";
				data = br.readLine();

				outs = sock.getOutputStream();
				PrintWriter pw = new PrintWriter(outs);

				pw.println(data);
				pw.flush();

				sock.close();
			}
		}catch (IOException e){
			System.exit(1);
		}
	}
}