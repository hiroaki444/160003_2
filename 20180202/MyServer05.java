import java.io.*;
import java.net.*;
import java.util.*;

public class MyServer05{
	public static void main(String[] args) {
		ServerSocket servSock ;
		Socket sock ;
		InputStream inputs;
		OutputStream outs;
		try{
			servSock = new ServerSocket(4000,10);
			while(true){
				sock = servSock.accept();
				

				inputs = sock.getInputStream();
				InputStreamReader isr = new InputStreamReader(inputs);
				BufferedReader br = new BufferedReader(isr);

				String data = "";
				data = br.readLine();
				System.out.println(sock.getInetAddress()+data);

				Calendar now = Calendar.getInstance(); //インスタンス化

	  	 	  	int h = now.get(now.HOUR_OF_DAY);//時を取得
  	 	 		int m = now.get(now.MINUTE);     //分を取得
 	  	 		int s = now.get(now.SECOND);      //秒を取得

   	 			outs = sock.getOutputStream();
				PrintWriter pw = new PrintWriter(outs);

				data = h+"時"+m+"分"+s+"秒"+"\n"+"Hello!";
				pw.println(data);
				pw.flush();

				
				sock.close();
			}
		}catch (IOException e){
			System.exit(1);
		}
	}
}