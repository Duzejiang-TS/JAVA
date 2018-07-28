package IO_ZiJie;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test1 {
	/*�ڿ��Ƶ�̨¼���ļ���·�������ļ���������ǰ��Ŀ��
	 * 
	 * ������
	 * 1.���巽���Լ���¼���·�������жϣ�������ļ��ͷ���
	 * 2.���������н��ո��ļ�
	 * 3.����д���ļ�*/
	public static void main(String[] args) throws IOException {
		File file = getFile();		//��ȡ�ļ�
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file.getName()));
		
		int b;
		while((b = bis.read()) != -1){
			bos.write(b);
		}
		
		bis.close();
		bos.close();
	}

	/*
	 * ����һ��������ȡ����¼����ļ�·��������װ��File���󷵻�
	 * 1.����ֵ����File
	 * 2.�����б���
	 * */
	public static File getFile(){
		Scanner sc = new Scanner(System.in);	//��������¼�����
		System.out.println("������һ���ļ���·����");
		while(true){
			String line = sc.nextLine();	//���ռ���¼���·��
			File file = new File(line);
			if(!file.exists()){
				System.out.println("¼���ļ�·�������ڣ�������¼�룺");
			}else if(file.isDirectory()){
				System.out.println("¼������ļ����죬������¼�룺");
			}else{
				return file;
			}
		}
	}
}