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
		/*�ڶ��ֿ��������Ƽ�ʹ�ã��п����ڴ����
		 * */
		FileInputStream fis = new FileInputStream("ͼƬ.jpg");	//�������������󣬹��� ͼƬ.jpg
		FileOutputStream fos = new FileOutputStream("copy.jpg");	//������������󣬹��� copy.jpg
		//int len = fis.available();
		//System.out.println(len);
		
		byte[] arr = new byte[fis.available()];	//����һ�����ļ���Сһ��������
		fis.read(arr);	//���ļ��ϵ��ֽڶ�ȡ���ڴ���
		fos.write(arr);	//���ַ������е��ֽ�����д���ļ���
		
		fis.close();	//�����ͷ���Դ
		fos.close();
	}

	private static void demo1() throws FileNotFoundException, IOException {
		/*��һ�ֿ������ֽ���һ�ζ�һ���ֽ�дһ���ֽڸ��ƣ����Ƽ�ʹ��
		 * �׶ˣ�Ч��̫��
		 * */
		FileInputStream fis = new FileInputStream("ͼƬ.jpg");	//�������������󣬹��� ͼƬ.jpg
		FileOutputStream fos = new FileOutputStream("copy.jpg");	//������������󣬹��� copy.jpg
		
		int b;
		while((b = fis.read()) != -1){	//�ڲ��ϵĶ�ȡÿһ���ֽ�
			fos.write(b);	//��ÿһ���ֽ�д��
		}
		
		fis.close();	//�����ͷ���Դ
		fos.close();
	}

}
