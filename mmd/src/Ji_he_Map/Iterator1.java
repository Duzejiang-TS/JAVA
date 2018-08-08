package Ji_he_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Iterator1 {
	/*通过查看Map集合的API，没有Iterator方法，那如何迭代Map集合
	 * 
	 * */
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("张三", 23);
		map.put("李四", 24);
		map.put("王五", 25);
		map.put("赵六", 26);
		Integer i = map.get("张三");	//根据键获取值
		System.out.println(i);
		
		//获取所有的键
	  /*Set<String> keySet = map.keySet(); //获取所有键的集合
		java.util.Iterator<String> it = keySet.iterator();//获取迭代器
		while(it.hasNext()) {		//判断集合中是否有元素
			String key = it.next();	//获取每一个键
			Integer value = map.get(key);	//根据键获取值
			System.out.println(key + "=" + value);
		}*/
		
		//使用增强FOR循环
		for (String key : map.keySet()) {		//map.keySet()是所有键的集合
			System.out.println(key + "=" + map.get(key));
		}
		
	}

}




