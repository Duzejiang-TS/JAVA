package Ji_he_de_Demo;

import java.util.Arrays;
import java.util.List;

public class Demo_asList {			//����ת��Ϊ����

	/*
	 * ע�⣺
	 * ������������ת��Ϊ���ϣ��Ὣ�������鵱��һ������ת��
	 * 		���磺int[] arr = {11,22,33,44,55};
	 * 			List<int[]> list = Arrays.asList(arr);
	 * 			System.out.println(list);
	 * �����Ҫ����������ͣ�����������ǵİ�װ�ࣺ
	 * 			Integer[] arr = {11,22,33,44,55};
	 * 			List<Ingeger> list = Arrays.asList(arr);
	 * 			System.out.println(list);
	 * */
	public  static void main(String[] args) {
		String[] arr = {"a","b","c"};
		List<String> list = Arrays.asList(arr);		//������ת���ɼ���
		//list.add("d");		//����ת������Ȼ�������ӻ����Ԫ�أ���Ҳ���ü��ϵ�˼��������飬������ʹ�����������еķ���
		System.out.println(list);
	}
		
}
