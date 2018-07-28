package IO_ZiJie;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo_Copy {
	

	public static void main(String[] args) throws IOException {
		//demo1();
		//demo2();
	}

	private static void demo2() throws FileNotFoundException, IOException {
		/*第二种拷贝，不推荐使用，有可能内存溢出
		 * */
		FileInputStream fis = new FileInputStream("图片.jpg");	//创建输入流对象，关联 图片.jpg
		FileOutputStream fos = new FileOutputStream("copy.jpg");	//创建输出流对象，关联 copy.jpg
		//int len = fis.available();
		//System.out.println(len);
		
		byte[] arr = new byte[fis.available()];	//创建一个与文件大小一样的数组
		fis.read(arr);	//将文件上的字节读取到内存中
		fos.write(arr);	//将字符数组中的字节数据写到文件上
		
		fis.close();	//关流释放资源
		fos.close();
	}

	private static void demo1() throws FileNotFoundException, IOException {
		/*第一种拷贝：字节流一次读一个字节写一个字节复制，不推荐使用
		 * 弊端：效率太低
		 * */
		FileInputStream fis = new FileInputStream("图片.jpg");	//创建输入流对象，关联 图片.jpg
		FileOutputStream fos = new FileOutputStream("copy.jpg");	//创建输出流对象，关联 copy.jpg
		
		int b;
		while((b = fis.read()) != -1){	//在不断的读取每一个字节
			fos.write(b);	//将每一个字节写出
		}
		
		fis.close();	//关流释放资源
		fos.close();
	}

}
