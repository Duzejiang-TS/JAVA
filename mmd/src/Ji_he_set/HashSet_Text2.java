package Ji_he_set;

import java.util.HashSet;
import java.util.Scanner;

public class HashSet_Text2 {
	
	/*ʹ��Scanner�Ӽ��̶�ȡһ������,ȥ�������ظ��ַ�, ��ӡ����ͬ����Щ�ַ�
	 * aaaabbbcccddd
	 * ������
	 * 1.����Scanner���� 
	 * 2.����HashSet���󣬽��ַ��洢��ȥ���ظ�
	 * 3.���ַ���ת��Ϊ�ַ����飬��ȡÿһ���ַ��洢��HashSet�����У��Զ�ȥ���ظ�
	 * 4.����HashSet����ӡÿһ���ַ�
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);	//1.
		System.out.println("������һ���ַ�����");
		
		HashSet<Character> hs = new HashSet<>();	//Character�ַ��İ�װ��          2.
		
		String line = sc.nextLine();		//3.
		char[] arr = line.toCharArray();
		
		for (char c : arr) {		//�����ַ�����
			hs.add(c);
		}
		
		for (Character ch : hs) {		//4.
			System.out.print(ch);
		}
	}

}
