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

	//���ı��ļ��ж�ȡ���� 
    static StringBuffer read(){ 
    	StringBuffer buffer=new StringBuffer(); 
        //1�����ڴ��д�Ҫ��ȡ�ļ����ַ�������
        try { 
            Reader reader=new FileReader("d:/����.txt"); 
            
            //2�����ַ����ж�ȡ����,ѭ����ȡ��һ�ξͶ�һ�� 
            int ch=reader.read(); 
            while(ch!=-1){ //��ȡ�ɹ� 
                buffer.append((char)ch); 
                ch=reader.read(); 
            } 
            //3���ر��� 
            reader.close(); 
            
        } catch (FileNotFoundException e) { 
            System.out.println("Ҫ��ȡ���ļ������ڣ�"+e.getMessage()); 
        } catch (IOException e) { 
            System.out.println("�ļ���ȡ����"+e.getMessage()); 
        }
        return buffer;  
    }
    
	//���ı��ļ���д������ 

	static void write(){ 

        System.out.println("������������ʣ��ÿո������"); 
        Scanner input = new Scanner(System.in);
        String text=input.nextLine(); 

        try { 
            //1������ 
            Writer w=new FileWriter("d:/����.txt",true); 
            
            //2��д������ 
            w.write(text); 

            //3���ر��� 
            w.close(); 
        } catch (IOException e) { 
            System.out.println("�ļ�д�����"+e.getMessage()); 
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
