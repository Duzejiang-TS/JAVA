package Ji_he_de_Demo;

import java.util.ArrayList;
import java.util.ListIterator;

public class Li_zi {
		/*
		 * ����
		 * ��һ�����ϣ��ж������Ƿ��С�world�����Ԫ�أ�����У������һ����javaee��Ԫ��
		 * */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("a");			//��Ȼ������ַ��������Ǳ�����ΪObject,�൱��Object obj = new String();
		list.add("b");
		list.add("world");
		list.add("c");
		list.add("d");
		list.add("e");
		
		/*java.util.Iterator it = list.iterator();	//��ȡ������
		while(it.hasNext()) {
			String str = (String)it.next();		//����ת��
			if("worild".equals(str)){
				list.add("javaee");				//������ͬʱ����Ԫ�أ������޸� �����л����,�����ǽ������
			}
		}*/
		
		ListIterator lit = list.listIterator();		//��ȡ��������List�������У�
		while(lit.hasNext()) {
			String str = (String)lit.next();		//����ת��
			if("world".equals(str)){
				lit.add("javaee");
			}
		}
		System.out.println(list);
	}
}
