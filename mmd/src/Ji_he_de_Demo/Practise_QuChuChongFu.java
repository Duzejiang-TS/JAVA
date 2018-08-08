package Ji_he_de_Demo;

import java.util.ArrayList;

public class Practise_QuChuChongFu {
	/**
	 *  A:案例演示
	 * 需求：ArrayList去除集合中字符串的重复值(字符串的内容相同)
	 * 思路：创建新集合方式
	 * 
	 * 注意：
	 * contains方法判断是否包含，底层依赖equals方法    
	 * remove方法判断是否删除，底层依赖的是equals方法
	 * 在去除ArrayList中重复自定义对象元素（例如：自定义Person类，一个元素包含name和age），一定要重写equals方法    
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
	 *创建新集合将重复元素去掉
	 * 1.明确返回值类型，返回ArrayList
	 * 2.明确参数列表ArrayList
	 * 
	 * 分析：
	 * 1.创建新集合
	 * 2.根据老集合获取迭代器
	 * 3.遍历老集合
	 * 4.通过新集合判断老集合中元素，如果不包含就添加，反之不添加
	 * */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static ArrayList getSingle(ArrayList list) {
		ArrayList newList = new ArrayList();		//1.创建新集合
		java.util.Iterator it = list.iterator();		// 2.根据老集合获取迭代器
		
		while (it.hasNext()){		//3.遍历老集合
			Object obj = it.next();		
			if(!newList.contains(obj)){		// 4.通过新集合判断老集合中元素，如果不包含就添加，反之不添加
				newList.add(obj);		
			}
		}
		return newList;
	}

}
