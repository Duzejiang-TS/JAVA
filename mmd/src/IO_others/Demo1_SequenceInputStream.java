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
	/*�������� ���������԰Ѷ���ֽ����������ϳ�һ��, ���������ж�ȡ����ʱ, ���ӱ����ϵĵ�һ������ʼ��, 
	 		����һ��֮��������ڶ���, �Դ�����.
	 		
	 * ��������: SequenceInputStream(InputStream, InputStream)
	 * ���϶��: SequenceInputStream(Enumeration)
	 * 
	 * �����迴���˸���˵����Ҫ���˽⿴�ͺ�emmmmmmm.......*/
	public static void main(String[] args) throws IOException {
		//demo1();
		FileInputStream fis1 = new FileInputStream("a.txt");
		FileInputStream fis2 = new FileInputStream("b.txt");
		FileInputStream fis3 = new FileInputStream("c.txt");
		
		Vector<FileInputStream> v = new Vector<>();		//�������϶���
		v.add(fis1);									//��������洢����
		v.add(fis2);
		v.add(fis3);
		
		Enumeration<FileInputStream> en = v.elements();
		SequenceInputStream sis = new SequenceInputStream(en);	//��ö���е����������ϳ�һ��
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
		sis.close();	//sis�ڹرյ�ʱ�򣬻Ὣ���췽���д����������Ҳ���ر�
		fos.close();
	}

}
