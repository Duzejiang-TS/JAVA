package Ji_he_de_Demo;

import java.util.ArrayList;

public class ArrayList_QianTao_ArrayList {
		/*
		 * A:案例
		 * 集合嵌套（ArrayList 嵌套 ArrayList）
		 * 就像专业是个大集合，它包含了好多班级，而班级各自又是一个小集合
		 **/
	public static void main(String[] args) {
		ArrayList<ArrayList<Student>> list = new ArrayList<>();
		
		ArrayList<Student> Class1 = new ArrayList<>();
		
		Class1.add(new Student("aa",1));
		Class1.add(new Student("bb",2));
		Class1.add(new Student("cc",3));
		
		ArrayList<Student> Class2 = new ArrayList<>();
		Class2.add(new Student("dd",4));
		Class2.add(new Student("ee",5));
		Class2.add(new Student("ff",6));
		
		//将班级添加到专业里
		list.add(Class1);
		list.add(Class2);
		
		//遍历专业集合
		for(ArrayList<Student> a  : list){
			for(Student s:a){
				System.out.println(s);
			}
		}
	}

}
