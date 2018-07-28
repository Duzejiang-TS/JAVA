package IO_others;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class Demo1_SequenceInputStream {
	/*序列流： 序列流可以把多个字节输入流整合成一个, 从序列流中读取数据时, 将从被整合的第一个流开始读, 
	 		读完一个之后继续读第二个, 以此类推.
	 		
	 * 整合两个: SequenceInputStream(InputStream, InputStream)
	 * 整合多个: SequenceInputStream(Enumeration)
	 * 
	 * 我他妈看完了给我说不重要，了解看就好emmmmmmm.......*/
	public static void main(String[] args) throws IOException {
		//demo1();
		FileInputStream fis1 = new FileInputStream("a.txt");
		FileInputStream fis2 = new FileInputStream("b.txt");
		FileInputStream fis3 = new FileInputStream("c.txt");
		
		Vector<FileInputStream> v = new Vector<>();		//创建集合对象
		v.add(fis1);									//将流对象存储进来
		v.add(fis2);
		v.add(fis3);
		
		Enumeration<FileInputStream> en = v.elements();
		SequenceInputStream sis = new SequenceInputStream(en);	//将枚举中的输入流整合成一个
		FileOutputStream fos = new FileOutputStream("d.txt");
		
		int b;
		while((b = sis.read()) != -1) {
			fos.write(b);
		}
		
		sis.close();
		fos.close();
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis1 = new FileInputStream("a.txt");
		FileInputStream fis2 = new FileInputStream("b.txt");
		SequenceInputStream sis = new SequenceInputStream(fis1,fis2);
		FileOutputStream fos = new FileOutputStream("c.txt");
		
		int b1;
		while((b1 = sis.read()) != -1) {
			fos.write(b1);
		}
		sis.close();	//sis在关闭的时候，会将构造方法中传入的流对象也都关闭
		fos.close();
	}

}
