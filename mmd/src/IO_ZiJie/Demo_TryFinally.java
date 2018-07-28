package IO_ZiJie;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo_TryFinally {

	public static void main(String[] args) throws IOException {
		//demo1();		//1.6�汾
		//demo2();		//1.7�汾
	}

	private static void demo2() throws IOException, FileNotFoundException {
		try(
		/*��tryС����������ݣ���ִ������������ŵ����ݺ���Զ����йرղ���������Ҫ�Լ�дclose
		 * Ҫע�����С������ֻ��д�߱��ر������Ķ���*/
		FileInputStream fis = new FileInputStream("xxx.txt");
		FileOutputStream fos = new FileOutputStream("yyy.txt");
		){
			int b;
			while((b = fis.read()) != -1){
				fos.write(b);
			}
		}
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = null;	//���븳ֵ��������渳ֵû�гɹ�����fis.close()��ǰ�����Ҫ��ֵ�����Ҫ��ǰ��ֵΪnull
		FileOutputStream fos = null;	
		try{
			fis = new FileInputStream("xxx.txt");
			fos = new FileOutputStream("yyy.txt");
			
			int b;
			while((b = fis.read()) != -1){
				fos.write(b);
			}
		}finally{
			try{
				if(fis != null)
					fis.close();
			}finally{			//�˴�try finallyǶ�׵�Ŀ���Ǿ����ܹ�һ����һ��
				if(fos != null)
					fos.close();
			}
		}
	}

}
