package Lab_report;

import java.util.Scanner;

public class Practise13_9 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double r1 = sc.nextDouble();
		double r2 = sc.nextDouble();
		
		Circle c1 =new Circle();
		c1.setR(r1);
	    Circle c2 = new Circle();
	    c2.setR(r2);

	    System.out.println(c1.equals(c2));
	    System.out.println(c1.compareTo(c2));

}

static class GeometricObject{
}

interface Comparable<E>{
	public double compareTo(E o);
}

static class Circle extends GeometricObject implements Comparable<Circle>{
	private double r;
	final double PI = 3.14;
	
	public Circle(){}
	
	public Circle(double r){
		this.r = r;
	}
	
	public void setR(double r){
		this.r = r;
	}
	
	public double getR(){
		return r;
	}
	
	public double getArea(){
		return r*r*PI;
	}

	@Override
	public double compareTo(Circle obj) {
		if (this.r > obj.r)
		      return 1;
		else if (this.r < obj.r)
		      return -1;
		else
		      return 0;	
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.r == ((Circle)obj).r;
	}
  }
}