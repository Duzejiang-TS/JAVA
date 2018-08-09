package Text;

import java.util.HashMap;
import java.util.Scanner;


public class Shang_Ji_13_2_5 {

	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<>();
		hm.put("陕西", "西安");
		hm.put("四川", "成都");
		hm.put("河北", "石家庄");
		hm.put("湖北", "武汉");
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个省（州）(可输入：陕西、四川、河北、湖北)：");
		String province = sc.nextLine();
		System.out.println("省会为  " + hm.get(province));
	}

}
