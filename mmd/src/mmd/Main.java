package mmd;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("�����������ε������ߣ��ÿո������");
		double s1 = input.nextDouble();
		double s2 = input.nextDouble();
		double s3 = input.nextDouble();
		
		Triangle tr = new Triangle(s1,s2,s3);
		
		System.out.print("��������ɫ��");
		String col=new String();
		col = input.next();
		//String col = input.nextLine();
		tr.setColor(col);
		
		System.out.print("�Ƿ���䣬�������1�����������0 ��");
		int xz = input.nextInt();
		boolean tc;
		if(xz == 1)	tc = true;	
		else	tc = false;
		tr.setFilled(tc);
		
		System.out.println("�����" + tr.getArea());
		
		System.out.println("�ܳ���" + tr.getPerimeter());
		
		System.out.println("��ɫ��" +  tr.getColor());
		
		System.out.println("�Ƿ���䣺" + tr.getFilled());
		
		System.out.println(tr.toString());	
	}
}