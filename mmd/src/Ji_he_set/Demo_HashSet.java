package Ji_he_set;

import java.util.HashSet;

public class Demo_HashSet {
		/*
		 *set�����������������ظ������򣨴�ȡ��һ�£�
		 ** */
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();	//��������
		boolean b1 = hs.add("a");
		boolean b2 = hs.add("a");	//��Set�����д洢�ظ�Ԫ��ʱ����false
		hs.add("c");
		hs.add("b");
		hs.add("d");
		
		System.out.println(hs);		//HashSet�̳���ϵ����д��toString����
		System.out.println(b1);
		System.out.println(b2);
		
		for(String string : hs){		
			System.out.println(string);	
		}
	}

}
