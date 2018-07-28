package IO_ZiJie;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo_TryFinally {

	public static void main(String[] args) throws IOException {
		//demo1();		//1.6版本
		//demo2();		//1.7版本
	}

	private static void demo2() throws IOException, FileNotFoundException {
		try(
		/*在try小括号里的内容，在执行完后面中括号的内容后会自动进行关闭操作，不需要自己写close
		 * 要注意的是小括号里只能写具备关闭条件的东西*/
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
		FileInputStream fis = null;	//必须赋值，如果下面赋值没有成功，而fis.close()的前提必须要赋值，因此要提前赋值为null
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
			}finally{			//此处try finally嵌套的目的是尽量能关一个是一个
				if(fos != null)
					fos.close();
			}
		}
	}

}
