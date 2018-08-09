package Text;

import java.util.Scanner;

public class Practice_9_10 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("ÇëÊäÈëa,b,c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		QuadraticEquation one = new QuadraticEquation(a,b,c);
		
		
		double f = one.getDiscriminant();
		System.out.println(f);
		if(f > 0){
			System.out.println("root1 = " + one.getRoot1() + " root2 = " + one.getRoot2());
		}
		else if(f == 0){
			System.out.println("root = " + one.getRoot1());
		}
		else{
			System.out.println("The equation has no roots." );
		}
		
	}

}

class QuadraticEquation{
	private double a;
	private double b;
	private double c;
	
	public QuadraticEquation(double a,double b,double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double getA(){
		return a;
	}
	
	public double getB(){
		return b;
	}
	
	public double getC(){
		return c;
	}
	
	public double getDiscriminant(){
		return b * b - 4 * a * c;
	}
	
	public double getRoot1(){
		return ((-b + Math.sqrt(getDiscriminant()))/(2 * a));
	}
	
	public double getRoot2(){
		return ((-b - Math.sqrt(getDiscriminant()))/(2 * a));
	}
}
