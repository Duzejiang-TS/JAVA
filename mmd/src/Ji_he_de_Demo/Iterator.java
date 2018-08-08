package Ji_he_de_Demo;

import java.util.*;

@SuppressWarnings({ "unchecked", "rawtypes" })

public class Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c = new ArrayList();
		c.add(new student("yi",1));
		c.add(new student("er",2));
		c.add(new student("san",3));
		
		Object[] arr = c.toArray();                    //导入数组后遍历
			for (int i = 0; i < arr.length; i++) {
				student s = (student)arr[i];
				System.out.println(s.getName()+"---"+s.getAge());
			}
		
		java.util.Iterator it = c.iterator();	//获取迭代器
		while(it.hasNext()){
			student s1 = (student)it.next();
			System.out.println(s1.getName()+"---"+s1.getAge());
		//	System.out.println(it.next());
		}	
	}

}

class student{
	private String name;
	private int age;
	
	public student() {
		super();
	}

	public student(String name, int age) {
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
		return "student [name=" + name + ", age=" + age + "]";
	}
	
}