import java.io.*;
import java.net.*;

public class MyClient04{
	public static void main(String[] args) {
		Socket sock;
		OutputStream outs;
		try{
			sock = new Socket("172.16.21.56",4999);

			outs = sock.getOutputStream();
			PrintWriter pw = new PrintWriter(outs);

			String data = ":160003"+"\n"+" :hiroaki444"+"\n"+" :Hello!";
			pw.println(data);
			pw.flush();
			sock.close();
		}catch(IOException e){

		}
	}
}