/*import java.net.ServerSocket;
import java.net.Socket;*/
import java.net.*;
/*import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;*/
import java.io.*;
import java.util.*;

public class Netclock{
  public static void main(String[] args) {
    //データを準備する
    ServerSocket servsock = null;
    Socket socket = null;
    OutputStream out = null;
    InputStream inp = null;
    String outstr;
    int i;
    byte[] buff = new byte[1024];

    //サーバとして動作
    try{
      servsock = new ServerSocket(6000, 300);
      //クライアントから接続を待つ
      while(true){
        socket = servsock.accept();
        System.out.println("\n"+socket);

        outstr = "\n"+"Hello!"+"\n";


        
        //データを出力する
        out = socket.getOutputStream();
        for (i=0; i<outstr.length(); i++) 
          out.write((int)outstr.charAt(i));
        out.write('\n');
        //読み込み
        inp = socket.getInputStream();
        int n = inp.read(buff);
        System.out.write(buff, 0, n);
        //終わり
        socket.close();
      }
    }catch(Exception e){
      System.exit(1);
    }
    //
  }
}








/*import	java.io.*;
import	java.net.*;
import	java.util.*;
  
  class	Netclock
  {
  	public static void	main(String[]	args)
  	{
  		ServerSocket	servsock	=	null;
  		Socket	sock;
  		OutputStream	out;					
  		String	outstr;
  		int	i;
  		Date	d;
      long addrData = 0;
  		try	{

  			servsock	=	new	ServerSocket(6000,	300);
         

  			while(true)
  			{
  				sock	=	servsock.accept();
          addrData++;
          System.out.println(sock.getInetAddress()+"Access"+addrData);
          
          
  
  				d	=	new	Date();
  				outstr	=	"\n" 
  								+	"Hello, this is rororo Netclock server."
  								+	"\n"	+	d.toString()	+	"\n"
  								+	"Thank you."	+	"\n";   
  				out	=	sock.getOutputStream();
  				for(i=0;	i<outstr.length();	i++)
  					out.write((int)	outstr.charAt(i));
  				out.write('\n');
  
  				sock.close();
  			}
  		}
  		catch	(IOException	e)	{
  			System.exit(1);
  		}
  	}
  }*/