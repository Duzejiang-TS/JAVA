package Ji_he_set;

import java.util.HashSet;
import java.util.Scanner;

public class HashSet_Text2 {
	
	/*使用Scanner从键盘读取一行输入,去掉其中重复字符, 打印出不同的那些字符
	 * aaaabbbcccddd
	 * 分析：
	 * 1.创建Scanner对象 
	 * 2.创建HashSet对象，将字符存储，去掉重复
	 * 3.将字符串转换为字符数组，获取每一个字符存储在HashSet集合中，自动去处重复
	 * 4.遍历HashSet，打印每一个字符
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);	//1.
		System.out.println("请输入一行字符串：");
		
		HashSet<Character> hs = new HashSet<>();	//Character字符的包装类          2.
		
		String line = sc.nextLine();		//3.
		char[] arr = line.toCharArray();
		
		for (char c : arr) {		//遍历字符数组
			hs.add(c);
		}
		
		for (Character ch : hs) {		//4.
			System.out.print(ch);
		}
	}

}
