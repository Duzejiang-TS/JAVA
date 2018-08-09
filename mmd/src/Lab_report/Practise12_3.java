package Lab_report;

import java.util.*;

public class Practise12_3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[100];
		for (int i = 0; i < 100; i++)
		      arr[i] = (int)(Math.random() * 10000);
		Scanner sc = new Scanner(System.in);
		System.out.println("ÊäÈëÏÂ±ê£º");
		int i = sc.nextInt();
		try{
			System.out.println(arr[i]);
		}catch(Exception e){
			System.out.println("Out of Bounds");
		}
	}

}
