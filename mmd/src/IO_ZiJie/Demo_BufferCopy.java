package IO_ZiJie;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.tree.FixedHeightLayoutCache;

public class Demo_BufferCopy {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("xxx.txt");	//创建输入流对象，关联xxx.txt
		FileOutputStream fos = new FileOutputStream("yyy.txt");	//创建输出流对象，关联yyy.txt
		
		BufferedInputStream bis = new BufferedInputStream(fis);	//创建缓冲区对象，对输入流进行包装让其变得更加强大
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int b;
		while((b = bis.read()) != -1){
			bos.write(b);
		}
		bis.close();
		bos.close();
	}

}
