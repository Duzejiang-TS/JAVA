package Ji_he_set;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSet_Text3 {
	/*
	 * 程序启动后, 可以从键盘输入接收多个整数, 直到输入quit时结束输入. 把所有输入的整数倒序排列打印.
	 * 
	 * 分析:
	 * 1.键盘录入
	 * 2.创建TreeSet集合对象，TreeSet集合中传入比较器（倒序）
	 * 3.无限循环，不断接受整数，遇到quit退出，因为退出quit是字符串，因此键盘录入都以字符串形式录入
	 * 4.判断是quit就退出，不是就将其转换为Integer，并添加到集合
	 * 5.遍历TreeSet集合并打印
	 * */
	public static void main(String[] args) {
		//1.键盘录入
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		//2.创建TreeSet集合对象，TreeSet集合中传入比较器（倒序）
		TreeSet<Integer> ts = new TreeSet<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer i1, Integer i2) {
				int num = i2 - i1;
				return num == 0 ? 1 : num;
			}
		}); 
		
		//3.无限循环，不断接受整数，遇到quit退出，因为退出quit是字符串，因此键盘录入都以字符串形式录入
		while(true){
			String line = sc.nextLine();
			if("quit".equals(line)) break;
			
			//4.判断是quit就退出，不是就将其转换为Integer，并添加到集合
			Integer i = Integer.parseInt(line);
			ts.add(i);
		
		}
		
		/*加入异常
		 * while(true) {
				String line = sc.nextLine();			//将键盘录入的字符串存储在line中
				if("quit".equals(line))					//如果字符串常量和变量比较,常量放前面,这样不会出现空指针异常,变量里面可能存储null
					break;
				try {
					int num = Integer.parseInt(line);		//将数字字符串转换成数字
					ts.add(num);
				} catch (Exception e) {
					System.out.println("您录入的数据有误,请输入一个整数");
				}
				
			}
			*/
		
		//5.遍历TreeSet集合并打印
		for (Integer integer : ts) {
			System.out.println(integer);
		}
	}

}
