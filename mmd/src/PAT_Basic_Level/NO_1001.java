package PAT_Basic_Level;

import java.util.Scanner;

public class NO_1001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		step(n);
	}
	
	public static void step(int n){
		int count = 0;
		while(n != 1){
			if(n%2 == 1){
				n = 3 * n + 1;
				n /= 2;
				count++;
			}	
			if(n%2 == 0){
				n /= 2;
				count++;
			}	
		}
		System.out.println(count);
	}
}
