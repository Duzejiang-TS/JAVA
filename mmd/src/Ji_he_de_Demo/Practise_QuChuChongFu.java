package Ji_he_de_Demo;

import java.util.ArrayList;

public class Practise_QuChuChongFu {
	/**
	 *  A:������ʾ
	 * ����ArrayListȥ���������ַ������ظ�ֵ(�ַ�����������ͬ)
	 * ˼·�������¼��Ϸ�ʽ
	 * 
	 * ע�⣺
	 * contains�����ж��Ƿ�������ײ�����equals����    
	 * remove�����ж��Ƿ�ɾ�����ײ���������equals����
	 * ��ȥ��ArrayList���ظ��Զ������Ԫ�أ����磺�Զ���Person�࣬һ��Ԫ�ذ���name��age����һ��Ҫ��дequals����    
	 * 
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("c");
		
		ArrayList newList = getSingle(list);
		System.out.println(newList);
	}
	/*
	 *�����¼��Ͻ��ظ�Ԫ��ȥ��
	 * 1.��ȷ����ֵ���ͣ�����ArrayList
	 * 2.��ȷ�����б�ArrayList
	 * 
	 * ������
	 * 1.�����¼���
	 * 2.�����ϼ��ϻ�ȡ������
	 * 3.�����ϼ���
	 * 4.ͨ���¼����ж��ϼ�����Ԫ�أ��������������ӣ���֮�����
	 * */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static ArrayList getSingle(ArrayList list) {
		ArrayList newList = new ArrayList();		//1.�����¼���
		java.util.Iterator it = list.iterator();		// 2.�����ϼ��ϻ�ȡ������
		
		while (it.hasNext()){		//3.�����ϼ���
			Object obj = it.next();		
			if(!newList.contains(obj)){		// 4.ͨ���¼����ж��ϼ�����Ԫ�أ��������������ӣ���֮�����
				newList.add(obj);		
			}
		}
		return newList;
	}

}
