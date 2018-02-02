import java.io.*;
import java.net.*;

public class Wrnet{
	public static void main(String[] args) {
		byte[] buff = new byte[1024];
		Socket wrsocket = null;
		InputStream instr = null;
		OutputStream outstr = null;
		String outM;
		boolean cont = true;
		int i;

		//サーバへの接続
		try{
			wrsocket = new Socket(args[0], Integer.parseInt(args[1]));
			outM = "ALOHA!!!!!"+"\n";
			
			instr = wrsocket.getInputStream();
			outstr = wrsocket.getOutputStream();

     	 	/*for (i=0; i<outM.length(); i++) 
         	outstr.write((int)outM.charAt(i));
     		outstr.write('\n');*/
     		InputStreamReader isr = new InputStreamReader(instr);
     		BuffredReader dr = new BuffredReader(isr);
     		PrintWriter pw = new PrintWriter(outatr);

     		String data2 = "";
     		pw.println(data2);
     		pw.flush();

		
			int n = instr.read(buff);
			System.out.write(buff, 0, n);

			wrsocket.close();
		}catch (Exception e){
			System.err.println("ネットワークエラー");
			System.exit(1);
			cont = false;
		}
	}
}