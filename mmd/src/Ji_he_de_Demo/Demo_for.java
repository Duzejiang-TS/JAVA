package Ji_he_de_Demo;

import java.util.ArrayList;

public class Demo_for {
	
	/*
	 * * A:��ǿfor����
	 		* �������Collection���ϵı���
	 * B:��ʽ��
	 *		 for(Ԫ���������� ���� : �������Collection����) {
					ʹ�ñ������ɣ��ñ�������Ԫ��
				}
	 * C:������ʾ
	 	* ���飬���ϴ洢Ԫ������ǿfor����
	 * D:�ô�
	 	* �򻯱���
	 * 
	 * ��ǿfor�ײ�����������
	 * ��ǿforû��ɾ������
	 */
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		int[] arr = {11,22,33,44,55};
		for(int i : arr){		//��������
			System.out.println(i );
		}
		
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		for(String string :list){		//��������
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
