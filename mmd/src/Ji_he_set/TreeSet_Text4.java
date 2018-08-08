package Ji_he_set;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSet_Text4 {
	/*需求：键盘录入5个学生信息(姓名,语文成绩,数学成绩,英语成绩),按照总分从高到低输出到控制台。
	 *
	 * 分析：
	 * 1.定义一个学生类
	 * 		成员变量：名字，语文成绩,数学成绩,英语成绩，总成绩
	 * 2.键盘录入
	 * 3.创建TreeSet集合对象，在TreeSet的构造函数中传入比较器，按总分比较
	 * 4.录入五个学生，以学生个数为判断条件，size小于5存储
	 * 5.将录入字符串切割，用逗号切割，会返回字符串数组，将字符串数组中从第二个元素转换成int数
	 * 6.将转换后的结果封装成student对象，将student添加到TreeSet集合中
	 * 7.遍历TreeSet集合打印每一个student对象*/
	public static void main(String[] args) {
		//2.键盘录入
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入学生信息：姓名,语文成绩,数学成绩,英语成绩");

		//3.创建TreeSet集合对象，在TreeSet的构造函数中传入比较器，按总分比较
		TreeSet<student1> ts = new TreeSet<>(new Comparator<student1>() {

			@Override
			public int compare(student1 s1, student1 s2) {
				int num = s2.getSum() - s1.getSum();
				return num == 0 ? 1 : num;
			}
		});
		
		//4.录入五个学生，以学生个数为判断条件，size小于5存储
		while(ts.size() < 2){
			//5.将录入字符串切割，用逗号切割，会返回字符串数组，将字符串数组中从第二个元素转换成int数
			String line = sc.nextLine();
			String[] arr = line.split(",");		//用逗号切割！！！！
			int chinese = Integer.parseInt(arr[1]);
			int math = Integer.parseInt(arr[2]);
			int english = Integer.parseInt(arr[3]);
			
			//6.将转换后的结果封装成student对象，将student添加到TreeSet集合中
			ts.add(new student1(arr[0],chinese,math,english));
		} 
		
		//7.遍历TreeSet集合打印每一个student对象
		System.out.println("排序后的学生信息：");
		for (student1 s : ts) {
			System.out.println(s);
		}
	}

}

class student1 {
	private String name;
	private int chinese;
	private int math;
	private int english;
	private int sum;
	
	public student1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public student1(String name, int chinese, int math, int english) {
		super();
		this.name = name;
		this.chinese = chinese;
		this.math = math;
		this.english = english;
		this.sum = this.chinese + this.math + this.english;
	}

	public int getSum() {
		return sum;
	}

	@Override
	public String toString() {
		return  name + "," + chinese + "," + math + "," + english + ","+ sum;
	}
}