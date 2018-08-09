package Text;

import java.util.Scanner;
import java.text.DecimalFormat;


public class Qizhong7_4 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat d = new DecimalFormat("#.####");
		Scanner input  = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		
		IShape rtr = new RTriangle(a,b);
		System.out.println(d.format(rtr.getArea()));
		System.out.println(d.format(rtr.getPerimeter()));
		
	}

}

interface IShape {// 接口
	// 抽象方法 求面积
	public abstract double getArea();
	// 抽象方法 求周长
	public abstract double getPerimeter(); 
	}

class RTriangle implements IShape{
	double a;
	double b;
	
	public RTriangle(double a,double b){
		this.a = a;
		this.b = b;
	}
	
	public double getArea(){
		return a*b*0.5;
	}
	
	public double getPerimeter(){
		return a+b+Math.sqrt(a*a+b*b);
	}
} 