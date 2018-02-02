import java.io.*;
import java.net.*;

public class MyClient05{
	public static void main(String[] args) {
		Socket sock;
		OutputStream outs;
		InputStream inputs;
		try{
			sock = new Socket("localhost",4000);

			outs = sock.getOutputStream();
			PrintWriter pw = new PrintWriter(outs);

			inputs = sock.getInputStream();
			InputStreamReader isr = new InputStreamReader(inputs);
			BufferedReader br = new BufferedReader(isr);

			String data2 = ":160003";
			pw.println(data2);
			pw.flush();

			for (int i = 0;i<2 ; i++) {
				String data = "";
				data = br.readLine();
				System.out.println(data);
			}

			sock.close();

		}catch(IOException e){

		}
	}
}