package IO_ZiJie;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo_ArrayCopy {
	
	// 第三种拷贝，小数组拷贝
	public static void main(String[] args) throws IOException {
		//demo1();
		FileInputStream fis = new FileInputStream("xxx.txt");
		FileOutputStream fos = new FileOutputStream("yyy.txt");
		
		byte[] arr = new byte[2];	//实际应用中数组大小一般是1024的整数倍
		int len;
		while((len = fis.read(arr)) != -1){
			 //fos.write(arr);	//这样写还是会输出abcb,因此用下面的这个
			fos.write(arr,0,len);	//在API中找
		}
		
		fis.close();
		fos.close();
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("xxx.txt");
		byte[] arr = new byte[2];	//实际应用中数组大小一般是1024的整数倍
		int a = fis.read(arr);	//将文件上的字节读取到字节数组中
	
		System.out.println(a);	//读到的有效字节个数
		for (byte b : arr) {	//第一次获取到文件上的a和b
			System.out.println(b);
		}
		System.out.println("-------------");
		int c = fis.read(arr);
		System.out.println(c);
		for (byte b : arr) {
			System.out.println(b);
		}
		
		fis.close();
	}

}
