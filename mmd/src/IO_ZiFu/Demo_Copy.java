package IO_ZiFu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo_Copy {
	/*�ַ���ֻ�ܿ������ı����ļ�*/
	public static void main(String[] args) throws IOException {
		//demo1();	//�����Ŀ�������
		//demo2();	//�Զ����ַ�����
		//demo3();	//�����������ַ�������
	}

	private static void demo3() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("xxx.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("yyy.txt"));
		
		int c;
		while((c = br.read()) != -1) {
			bw.write(c);
		}
		
		br.close();
		bw.close();
	}

	private static void demo2() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("xxx.txt");
		FileWriter fw = new FileWriter("yyy.txt");
		
		char[] arr = new char[1024];
		int len;
		while((len = fr.read(arr)) != -1) {		//���ļ��ϵ����ݶ�ȡ���ַ�������
			fw.write(arr,0,len);		//���ַ������е�����д���ļ���
		}
		
		fr.close();
		fw.close();
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("xxx.txt");
		FileWriter fw = new FileWriter("zzz.txt");
		
		int c;
		while((c = fr.read()) != -1){
			fw.write(c);
		}
		
		fr.close();
		fw.close();//Writer������һ��2K��С������ ������������ͻὫ����д��������������Ὣ����������ˢ�£��ٹر�
	}

}
