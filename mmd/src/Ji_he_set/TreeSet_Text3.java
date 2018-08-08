package Ji_he_set;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSet_Text3 {
	/*
	 * ����������, ���ԴӼ���������ն������, ֱ������quitʱ��������. ����������������������д�ӡ.
	 * 
	 * ����:
	 * 1.����¼��
	 * 2.����TreeSet���϶���TreeSet�����д���Ƚ���������
	 * 3.����ѭ�������Ͻ�������������quit�˳�����Ϊ�˳�quit���ַ�������˼���¼�붼���ַ�����ʽ¼��
	 * 4.�ж���quit���˳������Ǿͽ���ת��ΪInteger������ӵ�����
	 * 5.����TreeSet���ϲ���ӡ
	 * */
	public static void main(String[] args) {
		//1.����¼��
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		//2.����TreeSet���϶���TreeSet�����д���Ƚ���������
		TreeSet<Integer> ts = new TreeSet<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer i1, Integer i2) {
				int num = i2 - i1;
				return num == 0 ? 1 : num;
			}
		}); 
		
		//3.����ѭ�������Ͻ�������������quit�˳�����Ϊ�˳�quit���ַ�������˼���¼�붼���ַ�����ʽ¼��
		while(true){
			String line = sc.nextLine();
			if("quit".equals(line)) break;
			
			//4.�ж���quit���˳������Ǿͽ���ת��ΪInteger������ӵ�����
			Integer i = Integer.parseInt(line);
			ts.add(i);
		
		}
		
		/*�����쳣
		 * while(true) {
				String line = sc.nextLine();			//������¼����ַ����洢��line��
				if("quit".equals(line))					//����ַ��������ͱ����Ƚ�,������ǰ��,����������ֿ�ָ���쳣,����������ܴ洢null
					break;
				try {
					int num = Integer.parseInt(line);		//�������ַ���ת��������
					ts.add(num);
				} catch (Exception e) {
					System.out.println("��¼�����������,������һ������");
				}
				
			}
			*/
		
		//5.����TreeSet���ϲ���ӡ
		for (Integer integer : ts) {
			System.out.println(integer);
		}
	}

}
