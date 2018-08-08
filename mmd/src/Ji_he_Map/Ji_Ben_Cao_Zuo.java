package Ji_he_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Ji_Ben_Cao_Zuo {
	/*A:Map集合的功能概述
		* a:添加功能
			* V put(K key,V value):添加元素。
				* 如果键是第一次存储，就直接存储元素，返回null
				* 如果键不是第一次存在，就用值把以前的值替换掉，返回以前的值
		* b:删除功能
			* void clear():移除所有的键值对元素
			* V remove(Object key)：根据键删除键值对元素，并把值返回
		* c:判断功能
			* boolean containsKey(Object key)：判断集合是否包含指定的键
			* boolean containsValue(Object value):判断集合是否包含指定的值
			* boolean isEmpty()：判断集合是否为空
		* d:获取功能
			* Set<Map.Entry<K,V>> entrySet():
			* V get(Object key):根据键获取值
			* Set<K> keySet():获取集合中所有键的集合
			* Collection<V> values():获取集合中所有值的集合
		* e:长度功能
			* int size()：返回集合中的键值对的个数
	*/
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		Integer i1 = map.put("张三", 23);
		Integer i2 = map.put("李四", 24);
		Integer i3 = map.put("王五", 25);
		Integer i4 = map.put("赵六", 26);
		Integer i5 = map.put("张三", 26);		//相同的键不存储，值覆盖，把被覆盖的值返回
		
//a		
		System.out.println(map);	//因为是HashMap,不能保证怎么存怎么取
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);

//b
		Integer value = map.remove("张三");	//根据键删除元素，返回对应的值
		System.out.println(value);
		System.out.println(map);
		
//c
		System.out.println(map.containsKey("王五"));//判断是否包含传入的键
		System.out.println(map.containsValue(26));//判断是否包含传入的值
		System.out.println(map);
		
//d
		map.put("张三", 27);	
		Collection<Integer> c = map.values();//获取集合中所有值
		System.out.println(c);
		
//e
		System.out.println(map.size());//返回集合中的键值对的个数
	}

}
