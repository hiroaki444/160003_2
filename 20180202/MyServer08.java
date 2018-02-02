import java.io.*;
import java.net.*;

public class MyServer08{
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
				outs = sock.getOutputStream();
				PrintWriter pw = new PrintWriter(outs);

				String data = "";
				data = br.readLine();
				if (data.equals("exit")) {
					sock.close();
				}else{
					pw.println(data);
					pw.flush();
					sock.close();
				}
			}
		}catch (IOException e){
			System.exit(1);
		}
	}
}