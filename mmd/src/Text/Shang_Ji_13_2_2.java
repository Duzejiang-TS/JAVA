package Text;

import java.util.Scanner;

public class Shang_Ji_13_2_2 {

	public static <E extends Comparable<E>> E max(E[] list){
		E k = list[0];
		
		for(int i = 1;i < list.length;i++){
			if(list[i].compareTo(k) > 0){
				k = list[i];
			}
		}
		return  k;
	}
	
	public static void main(String[] args) {
		System.out.print("请输入数组元素个数：");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Integer[] list = new Integer[n];
		System.out.print("请输入元素：");
		
		for(int i = 0;i < n;i++){
			list[i] = sc.nextInt();
		}  
		
		System.out.println("数组中最大的元素为：" + max(list));
	}

}
