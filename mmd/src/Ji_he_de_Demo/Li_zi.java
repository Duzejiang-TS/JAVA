package Ji_he_de_Demo;

import java.util.ArrayList;
import java.util.ListIterator;

public class Li_zi {
		/*
		 * 例子
		 * 有一个集合，判断里面是否有“world”这个元素，如果有，就添加一个“javaee”元素
		 * */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("a");			//虽然存的是字符串，但是被提升为Object,相当于Object obj = new String();
		list.add("b");
		list.add("world");
		list.add("c");
		list.add("d");
		list.add("e");
		
		/*java.util.Iterator it = list.iterator();	//获取迭代器
		while(it.hasNext()) {
			String str = (String)it.next();		//向下转型
			if("worild".equals(str)){
				list.add("javaee");				//遍历的同时增加元素，并发修改 ，运行会出错,下面是解决方案
			}
		}*/
		
		ListIterator lit = list.listIterator();		//获取迭代器（List集合特有）
		while(lit.hasNext()) {
			String str = (String)lit.next();		//向下转型
			if("world".equals(str)){
				lit.add("javaee");
			}
		}
		System.out.println(list);
	}
}
