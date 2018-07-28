package IO_ZiFu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo_Buffered {
	/*带缓冲区的流中的特殊方法
	 * readLine() 读取一行字符（不包含换行符号）
	 * newLine() 输出一个跨平台的换行符号"\r\n"
	 * newLine()与"\r\n"的区别在于：newLine()是跨平台的，在windows等操作系统上都代表换行符，"\r\n"只在windows代表换行符
	 * */
	public static void main(String[] args) throws IOException {
		//demo1();
		BufferedReader br = new BufferedReader(new FileReader("zzz.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("aaa.txt"));
		
		String line;
		while((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();		//写出回车换行符		相同效果的有   bw.Write("\r\n");
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
