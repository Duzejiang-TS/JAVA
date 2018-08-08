package Ji_he_de_Demo;

import java.util.LinkedList;

public class Demo_LinkedList_ShiXianZhan {		//模拟栈结构

	public static void main(String[] args) {
		Stack s = new Stack();
		s.in("a");			//进栈
		s.in("b");
		s.in("c");
		s.in("d");
		
		while(!s.isEmpty()){		//判栈空
			System.out.println(s.out());		//弾栈
		}
	}

}

class Stack{
	@SuppressWarnings("rawtypes")
	private LinkedList list = new LinkedList();
	
	
	@SuppressWarnings("unchecked")
	public void in(Object obj){		//模拟进栈
		list.addLast(obj);
	}
	
	public Object out(){		//模拟出栈          
		return list.removeLast();		//如果改为list.removeFirst()就变成队列了（先进先出）
	}
	
	public boolean isEmpty(){		//模拟栈结构是否为空
		return list.isEmpty();
	}
	
}