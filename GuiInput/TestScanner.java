import java.io.*;
import java.util.*;
public class TestScanner{

	public static void main(String[] args) {
		System.out.println("exitで終了");
		try {
        	FileWriter fw = new FileWriter("data.txt", true);
        	BufferedWriter bw = new BufferedWriter(fw);
          
        	String userData = "";
        	while(true) {
        		System.out.print("メッセージを入力> ");
            	userData = new Scanner(System.in).nextLine();
            
            	if(userData.equals("exit")) break;
            	bw.append(userData+"\r\n");
        	}
        	bw.close();
        } catch(IOException e) {
        	System.out.println("ファイルの操作に失敗しました。");
        }	
	}
}