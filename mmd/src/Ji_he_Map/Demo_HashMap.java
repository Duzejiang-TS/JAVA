package Ji_he_Map;

import java.util.HashMap;
	
public class Demo_HashMap {
	/*HashMap���ϼ���Studentֵ��String�İ���
	 * ����ѧ�����󣬴���ÿһ��ѧ��
	 * ֵ���ַ������󣬴���ѧ��������
	 * */
	public static void main(String[] args) {
		HashMap<Student,String> hm = new HashMap<>();
		hm.put(new Student("����",23), "����");
		hm.put(new Student("����",23), "�Ϻ�");
		hm.put(new Student("����",24), "����");
		hm.put(new Student("����",25), "����");
		System.out.println(hm);
	}

}