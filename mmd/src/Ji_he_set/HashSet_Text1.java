package Ji_he_set;

import java.util.HashSet;
import java.util.Random;

public class HashSet_Text1 {

	/*案例演示
	 *需求：编写一个程序，获取10个1至20的随机数，要求随机数不能重复。并把最终的随机数输出到控制台
	 *
	 * 分析：
	 * 1.有random类创建随机对象
	 * 2.需要存储10个随机数，且不能重复，因此用HashSet
	 * 3.如果HashSet的size是小于10的就可以不断存储，大于等于10就停止
	 * 4.通过random类中的nextInt(n)方法获取1到20的随机数，并存储在HashSet集合中
	 * 5.遍历HashSet*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();	//1.
		HashSet<Integer> hs = new HashSet<>();	//2.
		while(hs.size() < 10){	//4.
			hs.add(r.nextInt(20) + 1);	
		}
		for (Integer integer : hs) {	//5.
			System.out.println(integer);
		}
	}

}
