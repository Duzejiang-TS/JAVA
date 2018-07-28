package IO_ZiJie;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo_chinese {

	public static void main(String[] args) throws IOException {
		/*字节流读取中文的问题
		 * 字节流在读中文的时候有可能会读到半个中文,造成乱码 
		 * 字节流写出中文的问题
			* 字节流直接操作的字节,所以写出中文必须将字符串转换成字节数组 
			* 写出回车换行 write("\r\n".getBytes());
		*/
		//demo1();	//字节流读取中文
		FileOutputStream fos = new FileOutputStream("zzz.txt");
		fos.write("杜泽江".getBytes());
		fos.write("\r\n".getBytes());	//写出回车换行
		fos.close();
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("yyy.txt"); //要给yyy.txt里面写中文
		byte[] arr = new byte[2];
		int len;
		while((len = fis.read(arr)) != -1){
			System.out.println(new String(arr,0,len));
		}
		fis.close();
		/*但是字节流读取中文还是会乱码，因此需要用到字符流，之后会学习*/
	}

}
