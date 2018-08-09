package Lab_report;

import java.util.*;

public class Practise12_2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入两个整数：");
		int a,b;
		while(true){
			try{
				a = sc.nextInt();
				b = sc.nextInt();
				System.out.println(a+b);
				break;
			}catch(Exception e){
				System.out.println("输入错误，请重新输入：");
				sc.nextLine();
			}
		}
	}
}
