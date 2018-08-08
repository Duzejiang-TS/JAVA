package Ji_he_set;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet_Text1 {
	/* ��һ�������д洢���������ظ����ַ���,����һ������,��������(�ֵ�˳��),���һ�����ȥ���ظ�
	 * 
	 * ������
	 * 1.����һ��List���ϣ����洢�ظ���������ַ���
	 * 2.���巽���������򲢱����ظ�
	 * 3.��ӡList����
	 * */
	public static void main(String[] args) {
		//1.����һ��List���ϣ����洢�ظ���������ַ���
		ArrayList<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("aaa");
		list.add("ccc");
		list.add("ddd");
		list.add("fffffffffff");
		list.add("sdf");
		list.add("bbbbb");
		list.add("aaaa");
		list.add("aaaa");
		
		//2.���巽���������򲢱����ظ�
		sort(list);
		
		//3.��ӡList����
		System.out.println(list);
	}
	/*���򲢱����ظ�
	 * 
	 * ������
	 * 1.����TreeSet���϶�����ΪString����߱��ȽϹ��ܣ����ظ��������������Ҫ�Ƚ���
	 * 2.��List����������Ԫ����ӵ�TreeSet�����У��������ظ�
	 * 3.���List����
	 * 4.��TreeSet�����е�Ԫ����ӵ�List��
	 * */
	public static void sort(ArrayList<String> list) {
		//1.����TreeSet���϶�����ΪString����߱��ȽϹ��ܣ����ظ��������������Ҫ�Ƚ���
		TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {	//ʹ�������ڲ��������Ƚ���

			@Override
			public int compare(String s1, String s2) {
				int num = s1.compareTo(s2);
				return num == 0 ? 1 : num;
			}
		});
		//2.��List����������Ԫ����ӵ�TreeSet�����У��������ظ�
		ts.addAll(list);
		//3.���List����
		list.clear();
		//4.��TreeSet�����е�Ԫ����ӵ�List��
		list.addAll(ts);
	}

}
