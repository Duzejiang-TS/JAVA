package IO_others;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo2_ByteArrayOutputStream {
	/*ByteArrayOutputStream
	 * �ڴ������:��������������ڴ���д����, ���ڴ浱��һ��������, д��֮�����һ���Ի�ȡ����������
	 * */
	public static void main(String[] args) throws IOException {
		demo1();
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("e.txt");
		ByteArrayOutputStream baos = new ByteArrayOutputStream();//���ڴ��д����˿����������ڴ�����
		
		int b;
		while((b = fis.read()) != -1){
			baos.write(b);
		}
		
		byte[] arr = baos.toByteArray();
		System.out.println(new String(arr));
		
		fis.close();
	}

}
