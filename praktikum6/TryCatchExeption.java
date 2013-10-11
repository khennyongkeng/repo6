import java.io.*;

public class TryCatchExeption{
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	public static void main (String[] args) {
		try {
			System.out.println("choose one of the options,(1-3) "+ "\n\t1.) Steak" + "\n\t2.) Lobster" + "\n\t3.) Cheeseburger");
			System.out.println("masukkan pilihan anda : ");
			String choose =  input.readLine();
			if(choose.equals("1")){
				System.out.println("anda memilih steak :-)");
			} else if(choose.equals("2")){
				System.out.println("anda memilih lobster :-D");
			} else if(choose.equals("3")){
				System.out.println("anda memilih cheeseburger :-)");
			} else {
				throw new Exception("pilihan anda tidak ada !");
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}