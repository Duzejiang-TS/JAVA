package Ji_he_set;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet_Text1 {
	/* 在一个集合中存储了无序并且重复的字符串,定义一个方法,让其有序(字典顺序),而且还不能去除重复
	 * 
	 * 分析：
	 * 1.定义一个List集合，并存储重复的无序的字符串
	 * 2.定义方法对其排序并保留重复
	 * 3.打印List集合
	 * */
	public static void main(String[] args) {
		//1.定义一个List集合，并存储重复的无序的字符串
		ArrayList<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("aaa");
		list.add("ccc");
		list.add("ddd");
		list.add("fffffffffff");
		list.add("sdf");
		list.add("bbbbb");
		list.add("aaaa");
		list.add("aaaa");
		
		//2.定义方法对其排序并保留重复
		sort(list);
		
		//3.打印List集合
		System.out.println(list);
	}
	/*排序并保留重复
	 * 
	 * 分析：
	 * 1.创建TreeSet集合对象，因为String本身具备比较功能，但重复不保留，因此需要比较器
	 * 2.将List集合中所有元素添加到TreeSet集合中，排序保留重复
	 * 3.清空List集合
	 * 4.将TreeSet集合中的元素添加到List中
	 * */
	public static void sort(ArrayList<String> list) {
		//1.创建TreeSet集合对象，因为String本身具备比较功能，但重复不保留，因此需要比较器
		TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {	//使用匿名内部类制作比较器

			@Override
			public int compare(String s1, String s2) {
				int num = s1.compareTo(s2);
				return num == 0 ? 1 : num;
			}
		});
		//2.将List集合中所有元素添加到TreeSet集合中，排序保留重复
		ts.addAll(list);
		//3.清空List集合
		list.clear();
		//4.将TreeSet集合中的元素添加到List中
		list.addAll(ts);
	}

}
