package IO_ZiJie;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo_ArrayCopy {
	
	// �����ֿ�����С���鿽��
	public static void main(String[] args) throws IOException {
		//demo1();
		FileInputStream fis = new FileInputStream("xxx.txt");
		FileOutputStream fos = new FileOutputStream("yyy.txt");
		
		byte[] arr = new byte[2];	//ʵ��Ӧ���������Сһ����1024��������
		int len;
		while((len = fis.read(arr)) != -1){
			 //fos.write(arr);	//����д���ǻ����abcb,�������������
			fos.write(arr,0,len);	//��API����
		}
		
		fis.close();
		fos.close();
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("xxx.txt");
		byte[] arr = new byte[2];	//ʵ��Ӧ���������Сһ����1024��������
		int a = fis.read(arr);	//���ļ��ϵ��ֽڶ�ȡ���ֽ�������
	
		System.out.println(a);	//��������Ч�ֽڸ���
		for (byte b : arr) {	//��һ�λ�ȡ���ļ��ϵ�a��b
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
