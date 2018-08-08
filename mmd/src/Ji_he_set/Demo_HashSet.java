package Ji_he_set;

import java.util.HashSet;

public class Demo_HashSet {
		/*
		 *set集合无索引，不可重复，无序（存取不一致）
		 ** */
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();	//创建对象
		boolean b1 = hs.add("a");
		boolean b2 = hs.add("a");	//向Set集合中存储重复元素时返回false
		hs.add("c");
		hs.add("b");
		hs.add("d");
		
		System.out.println(hs);		//HashSet继承体系中重写了toString方法
		System.out.println(b1);
		System.out.println(b2);
		
		for(String string : hs){		
			System.out.println(string);	
		}
	}

}
