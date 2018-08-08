package Ji_he_de_Demo;

import java.util.LinkedList;

public class Demo_LinkedList_ShiXianZhan {		//ģ��ջ�ṹ

	public static void main(String[] args) {
		Stack s = new Stack();
		s.in("a");			//��ջ
		s.in("b");
		s.in("c");
		s.in("d");
		
		while(!s.isEmpty()){		//��ջ��
			System.out.println(s.out());		//��ջ
		}
	}

}

class Stack{
	@SuppressWarnings("rawtypes")
	private LinkedList list = new LinkedList();
	
	
	@SuppressWarnings("unchecked")
	public void in(Object obj){		//ģ���ջ
		list.addLast(obj);
	}
	
	public Object out(){		//ģ���ջ          
		return list.removeLast();		//�����Ϊlist.removeFirst()�ͱ�ɶ����ˣ��Ƚ��ȳ���
	}
	
	public boolean isEmpty(){		//ģ��ջ�ṹ�Ƿ�Ϊ��
		return list.isEmpty();
	}
	
}