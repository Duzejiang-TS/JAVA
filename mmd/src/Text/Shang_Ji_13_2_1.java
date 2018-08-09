package Text;

import java.util.Scanner;

public class Shang_Ji_13_2_1 {

	 public static <E extends Comparable<E>> int binarySearch (E[] list,E key){  
	        int low = 0, high = list.length-1, middle = 0, flag = 0;  
	        while (low <= high) {  
	            middle = (low+high)/2;  
	            flag = key.compareTo (list[middle]);  
	            if (flag > 0) {  
	                low = middle+1;  
	            } else if (flag < 0) {  
	                high = middle - 1;  
	            } else {  
	                return middle;  
	            }  
	        }  
	          
	        return - ( low + 1 );  
	    }  	
	
	public static void main(String[] args) {
		System.out.print("请输入要输入数字个数：");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Integer[] list = new Integer[n];
		System.out.print("请输入数字：");
		
		for(int i = 0;i < n;i++){
			list[i] = sc.nextInt();
		}  
		System.out.print("请输入要查找的数字：");
		int s = sc.nextInt();
		
		System.out.println ("要查找的数字在第  " + binarySearch (list, s) + " 位");  
	}

}





