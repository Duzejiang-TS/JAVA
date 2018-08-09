package Text;
import java.util.*;

public class Practice_7_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list=new int[100000];
		
		for (int i=0;i<list.length;i++){
			list[i]=(int)(Math.random()*1000000);
		}
		
		int key=(int)(Math.random()*1000000);
		long startTime=System.currentTimeMillis();
		System.out.println(home.LinearSearch(list,key));
		
		long endTime=System.currentTimeMillis();
		long executionTime=endTime-startTime;
		System.out.println("Execution time for linear serch is"+executionTime);
		
		java.util.Arrays.sort(list);
		startTime=System.currentTimeMillis();
		System.out.println(Arrays.binarySearch(list, key));
		endTime=System.currentTimeMillis();
		executionTime=endTime-startTime;
		System.out.println("Execution time for binary search is"+executionTime);
	}

}

class home{
	public static int LinearSearch(int[] list,int key){
		for(int i=0;i<list.length;i++){
			if(key==list[i])
				return i;
		}
		return -1;
	}
}