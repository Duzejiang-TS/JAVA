package Ji_he_set;

import java.util.LinkedHashSet;

public class Demo_LinkedHashSet {

	/*LinkedHashSet
	 * 底层是链表实现的，是set集合中唯一一个能保证怎么存就怎么取得集合对象
	 * 因为是HashSet的子类，所以也是保证元素唯一的，与HashSet原理一样
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("a");
		lhs.add("a");
		lhs.add("a");
		lhs.add("b");
		lhs.add("c");
		lhs.add("d");
		
		System.out.println(lhs);
	}

}
