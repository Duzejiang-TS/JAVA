package IO_ZiFu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo_Buffered {
	/*�������������е����ⷽ��
	 * readLine() ��ȡһ���ַ������������з��ţ�
	 * newLine() ���һ����ƽ̨�Ļ��з���"\r\n"
	 * newLine()��"\r\n"���������ڣ�newLine()�ǿ�ƽ̨�ģ���windows�Ȳ���ϵͳ�϶������з���"\r\n"ֻ��windows�����з�
	 * */
	public static void main(String[] args) throws IOException {
		//demo1();
		BufferedReader br = new BufferedReader(new FileReader("zzz.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("aaa.txt"));
		
		String line;
		while((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();		//д���س����з�		��ͬЧ������   bw.Write("\r\n");
		}
		
		br.close();
		bw.close();
	}

	private static void demo1() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("zzz.txt"));
		String line;
		
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
	}

}
