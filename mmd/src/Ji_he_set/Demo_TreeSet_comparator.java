package Ji_he_set;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo_TreeSet_comparator {
	
	/*比较器问题
	 * 
	 *  1.特点
	 		TreeSet是用来排序的, 可以指定一个顺序, 对象存入之后会按照指定的顺序排列
		2.使用方式
			a.自然顺序(Comparable)
				* TreeSet类的add()方法中会把存入的对象提升为Comparable类型
				* 调用对象的compareTo()方法和集合中的对象比较
				* 根据compareTo()方法返回的结果进行存储
			b.比较器顺序(Comparator)
				* 创建TreeSet的时候可以制定 一个Comparator
				* 如果传入了Comparator的子类对象, 那么TreeSet就会按照比较器中的顺序排序
				* add()方法内部会自动调用Comparator接口中compare()方法排序
				* 调用的对象是compare方法的第一个参数,集合中的对象是compare方法的第二个参数
		 	c.两种方式的区别
				* TreeSet构造函数什么都不传, 默认按照类中Comparable的顺序(没有就报错ClassCastException)
				* TreeSet如果传入Comparator, 就优先按照Comparator
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts = new TreeSet<>(new CompareByLen());
		ts.add("aaaaaaaaaaaa");
		ts.add("z");
		ts.add("wc");
		ts.add("nba");
		ts.add("cba");
		
		System.out.println(ts);
	}

}

class CompareByLen implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {		//按照字符串长度比较
		int num = s1.length() - s2.length();		//长度为主要条件
		return num == 0 ? s1.compareTo(s2) : num;	//内容为次要条件
	}
	
}







