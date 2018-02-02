public class MyServer{
	public static void main(String[] args) {
		int num = args.length;
		System.out.println("コマンドライン引数の個数: "+num);
		for (int i = 0; i<num; i++ ) {
			System.out.println("args["+i+"]: "+args[i]);
		}
	}
}