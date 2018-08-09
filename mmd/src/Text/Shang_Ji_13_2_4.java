package Text;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Arrays;
import java.util.Scanner;




public class Shang_Ji_13_2_4 {

	//从文本文件中读取数据 
    static StringBuffer read(){ 
    	StringBuffer buffer=new StringBuffer(); 
        //1、在内存中打开要读取文件的字符流对象
        try { 
            Reader reader=new FileReader("d:/测试.txt"); 
            
            //2、从字符流中读取数据,循环读取，一次就读一个 
            int ch=reader.read(); 
            while(ch!=-1){ //读取成功 
                buffer.append((char)ch); 
                ch=reader.read(); 
            } 
            //3、关闭流 
            reader.close(); 
            
        } catch (FileNotFoundException e) { 
            System.out.println("要读取的文件不存在："+e.getMessage()); 
        } catch (IOException e) { 
            System.out.println("文件读取错误："+e.getMessage()); 
        }
        return buffer;  
    }
    
	//向文本文件中写入数据 

	static void write(){ 

        System.out.println("请输入五个单词，用空格隔开："); 
        Scanner input = new Scanner(System.in);
        String text=input.nextLine(); 

        try { 
            //1、打开流 
            Writer w=new FileWriter("d:/测试.txt",true); 
            
            //2、写入内容 
            w.write(text); 

            //3、关闭流 
            w.close(); 
        } catch (IOException e) { 
            System.out.println("文件写入错误："+e.getMessage()); 
        } 
    }
    
	public static void main(String[] args) {
		write();
		String sb = read().toString();
		String[] arr = sb.split(" ");
		
		Arrays.sort(arr);
		for(int i = 0;i < 5;i++){
			System.out.println(arr[i]);
		}
	}

}
