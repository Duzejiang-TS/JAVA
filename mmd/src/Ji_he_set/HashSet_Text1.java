package Ji_he_set;

import java.util.HashSet;
import java.util.Random;

public class HashSet_Text1 {

	/*������ʾ
	 *���󣺱�дһ�����򣬻�ȡ10��1��20���������Ҫ������������ظ����������յ���������������̨
	 *
	 * ������
	 * 1.��random�ഴ���������
	 * 2.��Ҫ�洢10����������Ҳ����ظ��������HashSet
	 * 3.���HashSet��size��С��10�ľͿ��Բ��ϴ洢�����ڵ���10��ֹͣ
	 * 4.ͨ��random���е�nextInt(n)������ȡ1��20������������洢��HashSet������
	 * 5.����HashSet*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();	//1.
		HashSet<Integer> hs = new HashSet<>();	//2.
		while(hs.size() < 10){	//4.
			hs.add(r.nextInt(20) + 1);	
		}
		for (Integer integer : hs) {	//5.
			System.out.println(integer);
		}
	}

}
