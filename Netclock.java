import	java.io.*;
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
  }