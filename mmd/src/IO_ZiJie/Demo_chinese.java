package IO_ZiJie;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo_chinese {

	public static void main(String[] args) throws IOException {
		/*�ֽ�����ȡ���ĵ�����
		 * �ֽ����ڶ����ĵ�ʱ���п��ܻ�����������,������� 
		 * �ֽ���д�����ĵ�����
			* �ֽ���ֱ�Ӳ������ֽ�,����д�����ı��뽫�ַ���ת�����ֽ����� 
			* д���س����� write("\r\n".getBytes());
		*/
		//demo1();	//�ֽ�����ȡ����
		FileOutputStream fos = new FileOutputStream("zzz.txt");
		fos.write("����".getBytes());
		fos.write("\r\n".getBytes());	//д���س�����
		fos.close();
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("yyy.txt"); //Ҫ��yyy.txt����д����
		byte[] arr = new byte[2];
		int len;
		while((len = fis.read(arr)) != -1){
			System.out.println(new String(arr,0,len));
		}
		fis.close();
		/*�����ֽ�����ȡ���Ļ��ǻ����룬�����Ҫ�õ��ַ�����֮���ѧϰ*/
	}

}
