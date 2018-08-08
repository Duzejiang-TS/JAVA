package Ji_he_set;

import java.util.TreeSet;


public class Demo_TreeSet {
	/*
	 * TreeSet集合是用来对元素进行排序的，同样它也可以保证元素的唯一
	 * 
	 * TreeSet底层是二叉树：
	 * 		两个叉，小的存储在左边（返回负数），大的存储在右边（返回正数），相等就不存
	 * compareTo方法在TreeSet集合如何存储元素取决于compareTo方法的返回值
	 * 
	 * 方案一：
	 *		 当compareTo方法返回0时，集合中只有一个元素
	 * 		当compareTo方法返回正数时，集合怎么存就怎么取
	 * 		当compareTo方法返回负数时，集合会倒叙存储
	 * 方案二：
	 * 		最后 return this.score - o.score; 按成绩排序
	 * 方案三：
	 * 		按方案二弄有瑕疵，当姓名不同，成绩相同时只会输出一个人，因此
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<student> ts = new TreeSet<>();
		ts.add(new student("张三",23));
		ts.add(new student("李四",24));
		ts.add(new student("keke",24));
		ts.add(new student("王五",25));
		ts.add(new student("赵六",26));
		
		System.out.println(ts);
	}

}

class student implements Comparable<student>{
	private String name;
	private int score;
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", score=" + score + "]";
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	/*public int compareTo(student o) {
		return -1;								//方案一			
	}*/
	
	/*public int compareTo(student o) {
		return this.score - o.score;			//方案二
	}*/
	
	public int compareTo(student o) {
		int num = this.score - o.score;			//方案三
		return num == 0 ? this.name.compareTo(o.name) : num;
		
	}
	//以上三个方案都是按照成绩存的
	
	//按照名字存
	/*
	 * public int compareTo(student o) {
		int num = this.name.compareTo(o.name);				
		return num == 0 ? this.score - o.score : num;		//若名字相同在比成绩
		}*/
	
	//按照名字长度存
	/*
	 * public int compareTo(student o) {
	 *  int length = this.name.length() - o.name.length();		
		int num = length == 0 ? this.name.compareTo(o.name) : length；//若名字长度相同再比较名字
		return num == 0 ? this.score - o.score : num;		//若名字相同再比较成绩
		}*/
	
}
