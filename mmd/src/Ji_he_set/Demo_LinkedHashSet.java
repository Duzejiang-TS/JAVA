package Ji_he_set;

import java.util.LinkedHashSet;

public class Demo_LinkedHashSet {

	/*LinkedHashSet
	 * �ײ�������ʵ�ֵģ���set������Ψһһ���ܱ�֤��ô�����ôȡ�ü��϶���
	 * ��Ϊ��HashSet�����࣬����Ҳ�Ǳ�֤Ԫ��Ψһ�ģ���HashSetԭ��һ��
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("a");
		lhs.add("a");
		lhs.add("a");
		lhs.add("b");
		lhs.add("c");
		lhs.add("d");
		
		System.out.println(lhs);
	}

}
