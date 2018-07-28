package IO_ZiJie;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo_FileInputStream {

	public static void main(String[] args) throws IOException {
		Demo1();	
		Demo2();	//标准形式
	}

	private static void Demo2() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("xxx.txt");	//创建流对象	//xxx.txt必须有
		int a;	//因为read用int类型接收
		/*为什么用int接收不用byte?
			 * 因为字节输入流可以操作任意类型的文件,比如图片音频等,这些文件底层都是以二进制形式的存储的,
			 * 如果每次读取都返回byte,有可能在读到中间的时候遇到111111111那么这11111111是byte
			 * 类型的-1,我们的程序是遇到-1就会停止不读了,后面的数据就读不到了,所以在读取的时候用int类
			 * 型接收,如果11111111会在其前面补上24个0凑足4个字节,那么byte类型的-1就变成int类型
			 * 的255了这样可以保证整个数据读完,而结束标记的-1就是int类型
		 * */
		while((a = fis.read()) != -1) {	//-1是文件结束的标志,这种是标准形式
			System.out.println(a);
		}
		fis.close();	//关流释放资源
	}

	private static void Demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("xxx.txt");	//创建流对象
		int x = fis.read();	//从硬盘的上读取一个字节
		System.out.println(x);
		int y = fis.read();
		System.out.println(y);
		fis.close();	//关流释放资源
	}

}
