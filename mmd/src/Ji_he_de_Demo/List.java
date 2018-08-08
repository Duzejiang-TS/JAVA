package Ji_he_de_Demo;

import java.util.ArrayList;

public class List {
	/*List集合特有功能：
	 * void add(int index,E element)   在指定位置添加元素
	 * E remove(int index)				通过索引删除
	 * E get(int index)					通过索引获取元素
	 * E set(int index,E element)		通过索引修改元素
	 * */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add(1,"e");
		//list.add(10,"e");     //索引越界异常
		list.add(4,"e");		//所以index可以小于等于size，并且大于等于0，都不会报异常
		System.out.println(list);
		
		Object obj = list.get(2);
		System.out.println(obj);		//返回查找到的元素
		for (int i = 0; i < list.size(); i++)		//通过索引遍历List集合
		System.out.println(list.get(i));
		
		
		
	}

}
