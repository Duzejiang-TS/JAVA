package IO_ZiJie;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo_FileInputStream {

	public static void main(String[] args) throws IOException {
		Demo1();	
		Demo2();	//��׼��ʽ
	}

	private static void Demo2() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("xxx.txt");	//����������	//xxx.txt������
		int a;	//��Ϊread��int���ͽ���
		/*Ϊʲô��int���ղ���byte?
			 * ��Ϊ�ֽ����������Բ����������͵��ļ�,����ͼƬ��Ƶ��,��Щ�ļ��ײ㶼���Զ�������ʽ�Ĵ洢��,
			 * ���ÿ�ζ�ȡ������byte,�п����ڶ����м��ʱ������111111111��ô��11111111��byte
			 * ���͵�-1,���ǵĳ���������-1�ͻ�ֹͣ������,��������ݾͶ�������,�����ڶ�ȡ��ʱ����int��
			 * �ͽ���,���11111111������ǰ�油��24��0����4���ֽ�,��ôbyte���͵�-1�ͱ��int����
			 * ��255���������Ա�֤�������ݶ���,��������ǵ�-1����int����
		 * */
		while((a = fis.read()) != -1) {	//-1���ļ������ı�־,�����Ǳ�׼��ʽ
			System.out.println(a);
		}
		fis.close();	//�����ͷ���Դ
	}

	private static void Demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("xxx.txt");	//����������
		int x = fis.read();	//��Ӳ�̵��϶�ȡһ���ֽ�
		System.out.println(x);
		int y = fis.read();
		System.out.println(y);
		fis.close();	//�����ͷ���Դ
	}

}
