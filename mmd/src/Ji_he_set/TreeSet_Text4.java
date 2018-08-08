package Ji_he_set;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSet_Text4 {
	/*���󣺼���¼��5��ѧ����Ϣ(����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�),�����ִܷӸߵ������������̨��
	 *
	 * ������
	 * 1.����һ��ѧ����
	 * 		��Ա���������֣����ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ����ܳɼ�
	 * 2.����¼��
	 * 3.����TreeSet���϶�����TreeSet�Ĺ��캯���д���Ƚ��������ֱܷȽ�
	 * 4.¼�����ѧ������ѧ������Ϊ�ж�������sizeС��5�洢
	 * 5.��¼���ַ����и�ö����и�᷵���ַ������飬���ַ��������дӵڶ���Ԫ��ת����int��
	 * 6.��ת����Ľ����װ��student���󣬽�student��ӵ�TreeSet������
	 * 7.����TreeSet���ϴ�ӡÿһ��student����*/
	public static void main(String[] args) {
		//2.����¼��
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("������ѧ����Ϣ������,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�");

		//3.����TreeSet���϶�����TreeSet�Ĺ��캯���д���Ƚ��������ֱܷȽ�
		TreeSet<student1> ts = new TreeSet<>(new Comparator<student1>() {

			@Override
			public int compare(student1 s1, student1 s2) {
				int num = s2.getSum() - s1.getSum();
				return num == 0 ? 1 : num;
			}
		});
		
		//4.¼�����ѧ������ѧ������Ϊ�ж�������sizeС��5�洢
		while(ts.size() < 2){
			//5.��¼���ַ����и�ö����и�᷵���ַ������飬���ַ��������дӵڶ���Ԫ��ת����int��
			String line = sc.nextLine();
			String[] arr = line.split(",");		//�ö����и������
			int chinese = Integer.parseInt(arr[1]);
			int math = Integer.parseInt(arr[2]);
			int english = Integer.parseInt(arr[3]);
			
			//6.��ת����Ľ����װ��student���󣬽�student��ӵ�TreeSet������
			ts.add(new student1(arr[0],chinese,math,english));
		} 
		
		//7.����TreeSet���ϴ�ӡÿһ��student����
		System.out.println("������ѧ����Ϣ��");
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