package IO_ChuLiLiu;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Demo_Printstream {

	public static void main(String[] args) {
		try(
			FileOutputStream fos = new FileOutputStream("test.txt");
			PrintStream ps = new PrintStream(fos))
		{
			ps.println("ÆÕÍ¨×Ö·û´®");
			//ps.println(new PrintStreamTest());
		}
		catch (IOException ioe){
			ioe.printStackTrace();
		}
	}

}
