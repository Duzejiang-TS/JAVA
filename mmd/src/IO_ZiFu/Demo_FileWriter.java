package IO_ZiFu;

import java.io.FileWriter;
import java.io.IOException;

public class Demo_FileWriter {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("yyy.txt");
		fw.write("��Ҫ���ס��");

		fw.close();
	}

}
