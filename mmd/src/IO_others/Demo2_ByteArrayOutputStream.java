package IO_others;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo2_ByteArrayOutputStream {
	/*ByteArrayOutputStream
	 * 内存输出流:该输出流可以向内存中写数据, 把内存当作一个缓冲区, 写出之后可以一次性获取出所有数据
	 * */
	public static void main(String[] args) throws IOException {
		demo1();
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("e.txt");
		ByteArrayOutputStream baos = new ByteArrayOutputStream();//在内存中创建了可以增长的内存数组
		
		int b;
		while((b = fis.read()) != -1){
			baos.write(b);
		}
		
		byte[] arr = baos.toByteArray();
		System.out.println(new String(arr));
		
		fis.close();
	}

}
