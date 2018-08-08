package Ji_he_set;

import java.util.TreeSet;


public class Demo_TreeSet {
	/*
	 * TreeSet������������Ԫ�ؽ�������ģ�ͬ����Ҳ���Ա�֤Ԫ�ص�Ψһ
	 * 
	 * TreeSet�ײ��Ƕ�������
	 * 		�����棬С�Ĵ洢����ߣ����ظ���������Ĵ洢���ұߣ���������������ȾͲ���
	 * compareTo������TreeSet������δ洢Ԫ��ȡ����compareTo�����ķ���ֵ
	 * 
	 * ����һ��
	 *		 ��compareTo��������0ʱ��������ֻ��һ��Ԫ��
	 * 		��compareTo������������ʱ��������ô�����ôȡ
	 * 		��compareTo�������ظ���ʱ�����ϻᵹ��洢
	 * ��������
	 * 		��� return this.score - o.score; ���ɼ�����
	 * ��������
	 * 		��������Ū��覴ã���������ͬ���ɼ���ͬʱֻ�����һ���ˣ����
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<student> ts = new TreeSet<>();
		ts.add(new student("����",23));
		ts.add(new student("����",24));
		ts.add(new student("keke",24));
		ts.add(new student("����",25));
		ts.add(new student("����",26));
		
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
		return -1;								//����һ			
	}*/
	
	/*public int compareTo(student o) {
		return this.score - o.score;			//������
	}*/
	
	public int compareTo(student o) {
		int num = this.score - o.score;			//������
		return num == 0 ? this.name.compareTo(o.name) : num;
		
	}
	//���������������ǰ��ճɼ����
	
	//�������ִ�
	/*
	 * public int compareTo(student o) {
		int num = this.name.compareTo(o.name);				
		return num == 0 ? this.score - o.score : num;		//��������ͬ�ڱȳɼ�
		}*/
	
	//�������ֳ��ȴ�
	/*
	 * public int compareTo(student o) {
	 *  int length = this.name.length() - o.name.length();		
		int num = length == 0 ? this.name.compareTo(o.name) : length��//�����ֳ�����ͬ�ٱȽ�����
		return num == 0 ? this.score - o.score : num;		//��������ͬ�ٱȽϳɼ�
		}*/
	
}
