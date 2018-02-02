import java.io.*;
import java.net.*;

public class MyClient02{
	public static void main(String[] args) {
		Socket sock;
		OutputStream outs;
		try{
			sock = new Socket("localhost",5999);

			outs = sock.getOutputStream();
			PrintWriter pw = new PrintWriter(outs);

			String data = "Hello!";
			pw.println(data);
			pw.flush();
			sock.close();
		}catch(IOException e){

		}
	}
}