package Ji_he_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Ji_Ben_Cao_Zuo {
	/*A:Map���ϵĹ��ܸ���
		* a:��ӹ���
			* V put(K key,V value):���Ԫ�ء�
				* ������ǵ�һ�δ洢����ֱ�Ӵ洢Ԫ�أ�����null
				* ��������ǵ�һ�δ��ڣ�����ֵ����ǰ��ֵ�滻����������ǰ��ֵ
		* b:ɾ������
			* void clear():�Ƴ����еļ�ֵ��Ԫ��
			* V remove(Object key)�����ݼ�ɾ����ֵ��Ԫ�أ�����ֵ����
		* c:�жϹ���
			* boolean containsKey(Object key)���жϼ����Ƿ����ָ���ļ�
			* boolean containsValue(Object value):�жϼ����Ƿ����ָ����ֵ
			* boolean isEmpty()���жϼ����Ƿ�Ϊ��
		* d:��ȡ����
			* Set<Map.Entry<K,V>> entrySet():
			* V get(Object key):���ݼ���ȡֵ
			* Set<K> keySet():��ȡ���������м��ļ���
			* Collection<V> values():��ȡ����������ֵ�ļ���
		* e:���ȹ���
			* int size()�����ؼ����еļ�ֵ�Եĸ���
	*/
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		Integer i1 = map.put("����", 23);
		Integer i2 = map.put("����", 24);
		Integer i3 = map.put("����", 25);
		Integer i4 = map.put("����", 26);
		Integer i5 = map.put("����", 26);		//��ͬ�ļ����洢��ֵ���ǣ��ѱ����ǵ�ֵ����
		
//a		
		System.out.println(map);	//��Ϊ��HashMap,���ܱ�֤��ô����ôȡ
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);

//b
		Integer value = map.remove("����");	//���ݼ�ɾ��Ԫ�أ����ض�Ӧ��ֵ
		System.out.println(value);
		System.out.println(map);
		
//c
		System.out.println(map.containsKey("����"));//�ж��Ƿ��������ļ�
		System.out.println(map.containsValue(26));//�ж��Ƿ���������ֵ
		System.out.println(map);
		
//d
		map.put("����", 27);	
		Collection<Integer> c = map.values();//��ȡ����������ֵ
		System.out.println(c);
		
//e
		System.out.println(map.size());//���ؼ����еļ�ֵ�Եĸ���
	}

}
