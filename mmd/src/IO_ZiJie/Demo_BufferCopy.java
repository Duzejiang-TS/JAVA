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
		FileInputStream fis = new FileInputStream("xxx.txt");	//�������������󣬹���xxx.txt
		FileOutputStream fos = new FileOutputStream("yyy.txt");	//������������󣬹���yyy.txt
		
		BufferedInputStream bis = new BufferedInputStream(fis);	//�������������󣬶����������а�װ�����ø���ǿ��
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int b;
		while((b = bis.read()) != -1){
			bos.write(b);
		}
		bis.close();
		bos.close();
	}

}
