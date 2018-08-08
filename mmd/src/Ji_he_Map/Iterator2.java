package Ji_he_Map;

import java.util.HashMap;
import java.util.Map;

public class Iterator2 {
	/*
	 * Map集合的第二种迭代根据键值对对象，获取键和值
	 * 
	 * 键值对对象找键和值思路：
	 * 获取所有键值对对象的集合
	 * 遍历键值对对象的集合，获取到每一个键值对对象
	 * 根据键值对对象找键和值*/
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("张三", 23);
		map.put("李四", 24);
		map.put("王五", 25);
		map.put("赵六", 26);
		
		//Entry是Map里的一个内部接口,将键和值封装成了Entry对象，并存储在Set集合中
		/*Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
		//获取每一个对象
		java.util.Iterator<Entry<String, Integer>> it = entrySet.iterator();
		while(it.hasNext()){
			//获取每一个Entry对象
			Map.Entry<String,Integer> en = it.next();
			String key = en.getKey();		//根据键值对对象获取键
			Integer value = en.getValue();	//根据键值对对象获取值
			System.out.println(key + "=" + value);
		}*/
		
		for(Map.Entry<String,Integer> en : map.entrySet()){
			System.out.println(en.getKey() + "=" + en.getValue());
		}
	}

}
