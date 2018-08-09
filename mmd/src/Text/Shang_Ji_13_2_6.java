package Text;

import java.util.Scanner;

public class Shang_Ji_13_2_6 {
	
	public static <E extends Comparable<E>> void selectionSort(E[] list){
		int i,j;
		E k;
		for(i = 0;i < list.length - 1;i++){
			for(j = i + 1;j < list.length;j++){
				if(list[i].compareTo(list[j]) > 0){
					k = list[i];
					list[i] = list[j];
					list[j] = k;
				}
			}
		}
		for (E e : list) {
			System.out.print(e + " ");
		}
		
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

		selectionSort(list);
	}

}
