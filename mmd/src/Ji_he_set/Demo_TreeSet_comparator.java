package Ji_he_set;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo_TreeSet_comparator {
	
	/*�Ƚ�������
	 * 
	 *  1.�ص�
	 		TreeSet�����������, ����ָ��һ��˳��, �������֮��ᰴ��ָ����˳������
		2.ʹ�÷�ʽ
			a.��Ȼ˳��(Comparable)
				* TreeSet���add()�����л�Ѵ���Ķ�������ΪComparable����
				* ���ö����compareTo()�����ͼ����еĶ���Ƚ�
				* ����compareTo()�������صĽ�����д洢
			b.�Ƚ���˳��(Comparator)
				* ����TreeSet��ʱ������ƶ� һ��Comparator
				* ���������Comparator���������, ��ôTreeSet�ͻᰴ�ձȽ����е�˳������
				* add()�����ڲ����Զ�����Comparator�ӿ���compare()��������
				* ���õĶ�����compare�����ĵ�һ������,�����еĶ�����compare�����ĵڶ�������
		 	c.���ַ�ʽ������
				* TreeSet���캯��ʲô������, Ĭ�ϰ�������Comparable��˳��(û�оͱ���ClassCastException)
				* TreeSet�������Comparator, �����Ȱ���Comparator
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
	public int compare(String s1, String s2) {		//�����ַ������ȱȽ�
		int num = s1.length() - s2.length();		//����Ϊ��Ҫ����
		return num == 0 ? s1.compareTo(s2) : num;	//����Ϊ��Ҫ����
	}
	
}







