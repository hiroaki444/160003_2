import java.io.*;
import java.net.*;

public class MyClient03{
	public static void main(String[] args) {
		Socket sock;
		InputStream inputs;
		try{
			sock = new Socket("localhost",5000);

			inputs = sock.getInputStream();
			InputStreamReader isr = new InputStreamReader(inputs);
			BufferedReader br = new BufferedReader(isr);
			String data = "";
			data = br.readLine();
			System.out.println(data);
			sock.close();

		}catch(IOException e){

		}
	}
}