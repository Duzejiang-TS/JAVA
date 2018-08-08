package Ji_he_de_Demo;

import java.util.ArrayList;

public class Demo_for {
	
	/*
	 * * A:增强for概述
	 		* 简化数组和Collection集合的遍历
	 * B:格式：
	 *		 for(元素数据类型 变量 : 数组或者Collection集合) {
					使用变量即可，该变量就是元素
				}
	 * C:案例演示
	 	* 数组，集合存储元素用增强for遍历
	 * D:好处
	 	* 简化遍历
	 * 
	 * 增强for底层依赖迭代器
	 * 增强for没有删除操作
	 */
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		int[] arr = {11,22,33,44,55};
		for(int i : arr){		//遍历数组
			System.out.println(i );
		}
		
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		for(String string :list){		//遍历集合
			System.out.println(string);
		}
		
		ArrayList<Student> list1 = new ArrayList();
		list1.add(new Student("yi",1));
		list1.add(new Student("er",2));
		list1.add(new Student("san",3));
		list1.add(new Student("si",4));
		
		for(Student student : list1){
			System.out.println(student);
		}
	}

}

class Student{
	private String name;
	private int age;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	
}
