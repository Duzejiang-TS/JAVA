package Ji_he_de_Demo;

import java.util.ArrayList;

public class ArrayList_QianTao_ArrayList {
		/*
		 * A:����
		 * ����Ƕ�ף�ArrayList Ƕ�� ArrayList��
		 * ����רҵ�Ǹ��󼯺ϣ��������˺ö�༶�����༶��������һ��С����
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
		
		//���༶��ӵ�רҵ��
		list.add(Class1);
		list.add(Class2);
		
		//����רҵ����
		for(ArrayList<Student> a  : list){
			for(Student s:a){
				System.out.println(s);
			}
		}
	}

}
