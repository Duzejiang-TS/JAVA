package Ji_he_de_Demo;

import java.util.Arrays;
import java.util.List;

public class Demo_asList {			//数组转换为集合

	/*
	 * 注意：
	 * 基本数据类型转换为集合，会将整个数组当做一个对象转换
	 * 		例如：int[] arr = {11,22,33,44,55};
	 * 			List<int[]> list = Arrays.asList(arr);
	 * 			System.out.println(list);
	 * 如果想要输入基本类型，则可以找他们的包装类：
	 * 			Integer[] arr = {11,22,33,44,55};
	 * 			List<Ingeger> list = Arrays.asList(arr);
	 * 			System.out.println(list);
	 * */
	public  static void main(String[] args) {
		String[] arr = {"a","b","c"};
		List<String> list = Arrays.asList(arr);		//将数组转换成集合
		//list.add("d");		//数组转集合虽然不能增加或减少元素，但也已用集合的思想操作数组，即可以使用其它集合中的方法
		System.out.println(list);
	}
		
}
