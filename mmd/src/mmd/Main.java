package mmd;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("请输入三角形的三条边，用空格隔开：");
		double s1 = input.nextDouble();
		double s2 = input.nextDouble();
		double s3 = input.nextDouble();
		
		Triangle tr = new Triangle(s1,s2,s3);
		
		System.out.print("请输入颜色：");
		String col=new String();
		col = input.next();
		//String col = input.nextLine();
		tr.setColor(col);
		
		System.out.print("是否填充，填充输入1，不填充输入0 ：");
		int xz = input.nextInt();
		boolean tc;
		if(xz == 1)	tc = true;	
		else	tc = false;
		tr.setFilled(tc);
		
		System.out.println("面积：" + tr.getArea());
		
		System.out.println("周长：" + tr.getPerimeter());
		
		System.out.println("颜色：" +  tr.getColor());
		
		System.out.println("是否填充：" + tr.getFilled());
		
		System.out.println(tr.toString());	
	}
}