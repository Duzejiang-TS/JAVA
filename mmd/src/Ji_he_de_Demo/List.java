package Ji_he_de_Demo;

import java.util.ArrayList;

public class List {
	/*List�������й��ܣ�
	 * void add(int index,E element)   ��ָ��λ�����Ԫ��
	 * E remove(int index)				ͨ������ɾ��
	 * E get(int index)					ͨ��������ȡԪ��
	 * E set(int index,E element)		ͨ�������޸�Ԫ��
	 * */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add(1,"e");
		//list.add(10,"e");     //����Խ���쳣
		list.add(4,"e");		//����index����С�ڵ���size�����Ҵ��ڵ���0�������ᱨ�쳣
		System.out.println(list);
		
		Object obj = list.get(2);
		System.out.println(obj);		//���ز��ҵ���Ԫ��
		for (int i = 0; i < list.size(); i++)		//ͨ����������List����
		System.out.println(list.get(i));
		
		
		
	}

}
