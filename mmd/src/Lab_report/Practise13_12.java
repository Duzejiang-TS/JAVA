package Lab_report;

public class Practise13_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeometricObject[] a = {new Circles(5), new Circles(6),
				new Rectangle(2, 3), new Rectangle(2, 3)};

				System.out.println("The total area is " + sumArea(a));
	}


	public static double sumArea(GeometricObject[] a) {
		double sum = 0;

		for (int i = 0; i < a.length; i++){
			sum += a[i].getArea();
		}
		return sum;
	}
}

abstract class GeometricObject {
	abstract double getArea();
}

class Rectangle extends GeometricObject {
	private double width;
	private double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
  

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getArea() {
		return width*height;
	}

	public double getPerimeter() {
		return 2*(width + height);
	}

	public boolean equals(Rectangle rectangle) {
		return (width == rectangle.getWidth()) && (height == rectangle.getHeight());
	}
}

class Circles extends GeometricObject {
	private double r;
	final double PI = 3.14;
	
	public Circles(){}
	
	public Circles(double r){
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

	public boolean equals(Circles circle) {
		// TODO Auto-generated method stub
		return this.r == circle.getR();
	}
}