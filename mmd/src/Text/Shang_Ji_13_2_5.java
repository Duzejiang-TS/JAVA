package Text;

import java.util.HashMap;
import java.util.Scanner;


public class Shang_Ji_13_2_5 {

	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<>();
		hm.put("����", "����");
		hm.put("�Ĵ�", "�ɶ�");
		hm.put("�ӱ�", "ʯ��ׯ");
		hm.put("����", "�人");
		Scanner sc = new Scanner(System.in);
		System.out.println("����һ��ʡ���ݣ�(�����룺�������Ĵ����ӱ�������)��");
		String province = sc.nextLine();
		System.out.println("ʡ��Ϊ  " + hm.get(province));
	}

}
