package IO_ZiJie;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo_FileOutputStream {
	/*FileOutputStream�ڴ��������ʱ�����û������ļ���������Ǵ�������
	 * ���������ļ��ͻ��Ƚ��ļ����*/
	public static void main(String[] args) throws IOException {
		//demo1();
		FileOutputStream fos = new FileOutputStream("yyy.txt",true);//�������д��׷�ӣ������ڵڶ���������true
		fos.write(97);
		fos.write(98);
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileOutputStream fos = new FileOutputStream("yyy.txt");	//yyy.txt�����Լ�����ʱ����
		fos.write(97);	//��Ȼд������int�������ǵ��ļ��ϵ���һ���ֽڣ����Զ�ȥ��ǰ����8λ
		fos.write(98);
		fos.write(99);
		fos.close();
	}

}
