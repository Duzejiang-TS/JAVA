package Lab_report;

import java.util.Scanner;

public class Practise13_6 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double r1 = sc.nextDouble();
		double r2 = sc.nextDouble();
		ComparableCircle c1 = new ComparableCircle(r1);
		c1.setR(r1);
		ComparableCircle c2 = new ComparableCircle(r2);
		c2.setR(r2);
		if(new ComparableCircle(c1.getArea()).compareTo(new ComparableCircle(c2.getArea()))>0){
			System.out.println("前者较大");
		}
		else if(new ComparableCircle(c1.getArea()).compareTo(new ComparableCircle(c2.getArea()))<0){
			System.out.println("后者较大");
		}
		else{
			System.out.println("一样大");
		}
	}

}

interface Comparable<E>{
	public double compareTo(E o);
}

class ComparableCircle extends Circle implements Comparable<ComparableCircle>{
	double c;
	public ComparableCircle(double c) {  
        this.c=c; 
    }  
	
	@Override
	public double compareTo(ComparableCircle o) {
		return c-o.c;
	}
	
}


class Circle{
	private double r;
	final double PI = 3.14;
	
	public Circle(){}
	
	public Circle(double r){
		this.r = r;
	}
	
	public void setR(double r){
		this.r = r;
	}
	
	public double getArea(){
		return r*r*PI;
	}
	
}