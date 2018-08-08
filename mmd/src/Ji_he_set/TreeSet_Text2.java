package Ji_he_set;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSet_Text2 {

	/*�Ӽ��̽���һ���ַ���, ��������������ַ���������,�����������: helloitcast�����ӡ:acehillostt
	 * 
	 * ������
	 * 1.����¼���ַ���
	 * 2.���ַ���ת��Ϊ�ַ�����
	 * 3.����TreeSet���ϣ�����Ƚ������ַ����򲢱����ظ�
	 * 4.�����ַ����飬��ÿһ���ַ��洢��TreeSet������
	 * 5.����TreeSet���ϣ���ӡÿһ���ַ�
	 * */
	public static void main(String[] args) {
		//1.����¼���ַ���
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String line = sc.nextLine();
		
		//2.���ַ���ת��Ϊ�ַ�����
		char[] arr = line.toCharArray();
		
		//3.����TreeSet���ϣ�����Ƚ���(�ɶ��ַ����򲢱����ظ�)
		TreeSet<Character> ts = new TreeSet<>(new Comparator<Character>() {

			@Override
			public int compare(Character c1, Character c2) {
				int num = c1 - c2;
				return num == 0 ? 1 : num;
			}
		});
		
		//4.�����ַ����飬��ÿһ���ַ��洢��TreeSet������
		for (Character c : arr) {
			ts.add(c);
		}
		
		//5.����TreeSet���ϣ���ӡÿһ���ַ�
		for (Character c : ts) {
			System.out.print(c);
		}
	}

}
