package Ji_he_set;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class HashSet_Text3 {
	/*�������е��ظ�Ԫ��ȥ��
	 * ������
	 * 1.����List���ϴ洢���ɸ��ظ�Ԫ��
	 * 2.�������巽��ȥ���ظ� 
	 * 3.��ӡList����
	 * */
	
	public static void main(String[] args) {
		//1.����List���ϴ洢���ɸ��ظ�Ԫ��
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("c");
		list.add("c");
		list.add("c");
		
		//2.�������巽��ȥ���ظ�
		getSingle(list);
		
		
		//3.��ӡList����
		System.out.println(list);
	}

	/*������
	 * ȥ��List�����е��ظ�Ԫ��
	 * 1.����һ��LinkedHashSet����
	 * 2.��List���������е�Ԫ��LinkedHashSet����
	 * 3.��List�е�Ԫ�����
	 * 4.��LinkedHashSet�����е�Ԫ����ӻ�List������
	 * */
	 public static void getSingle(ArrayList<String> list) {
		//1.����һ��LinkedHashSet����
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		// 2.��List���������е�Ԫ��LinkedHashSet����
		lhs.addAll(list);
		//3.��List�е�Ԫ�����
		list.clear();
		//4.��LinkedHashSet�����е�Ԫ����ӻ�List������
		list.addAll(lhs);
	}
	

}
