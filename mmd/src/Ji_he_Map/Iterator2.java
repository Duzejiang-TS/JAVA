package Ji_he_Map;

import java.util.HashMap;
import java.util.Map;

public class Iterator2 {
	/*
	 * Map���ϵĵڶ��ֵ������ݼ�ֵ�Զ��󣬻�ȡ����ֵ
	 * 
	 * ��ֵ�Զ����Ҽ���ֵ˼·��
	 * ��ȡ���м�ֵ�Զ���ļ���
	 * ������ֵ�Զ���ļ��ϣ���ȡ��ÿһ����ֵ�Զ���
	 * ���ݼ�ֵ�Զ����Ҽ���ֵ*/
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("����", 23);
		map.put("����", 24);
		map.put("����", 25);
		map.put("����", 26);
		
		//Entry��Map���һ���ڲ��ӿ�,������ֵ��װ����Entry���󣬲��洢��Set������
		/*Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
		//��ȡÿһ������
		java.util.Iterator<Entry<String, Integer>> it = entrySet.iterator();
		while(it.hasNext()){
			//��ȡÿһ��Entry����
			Map.Entry<String,Integer> en = it.next();
			String key = en.getKey();		//���ݼ�ֵ�Զ����ȡ��
			Integer value = en.getValue();	//���ݼ�ֵ�Զ����ȡֵ
			System.out.println(key + "=" + value);
		}*/
		
		for(Map.Entry<String,Integer> en : map.entrySet()){
			System.out.println(en.getKey() + "=" + en.getValue());
		}
	}

}
