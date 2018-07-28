package IO_ZiJie;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo_FileOutputStream {
	/*FileOutputStream在创建对象的时候如果没有这个文件，会帮我们创建出来
	 * 如果有这个文件就会先将文件清空*/
	public static void main(String[] args) throws IOException {
		//demo1();
		FileOutputStream fos = new FileOutputStream("yyy.txt",true);//如果想续写（追加），就在第二个参数传true
		fos.write(97);
		fos.write(98);
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileOutputStream fos = new FileOutputStream("yyy.txt");	//yyy.txt可以自己运行时创建
		fos.write(97);	//虽然写出的是int数，但是到文件上的是一个字节，会自动去除前三个8位
		fos.write(98);
		fos.write(99);
		fos.close();
	}

}
