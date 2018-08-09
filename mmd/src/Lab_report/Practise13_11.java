package Lab_report;

import Lab_report.Practise13_9.Comparable;
import Lab_report.Practise13_9.GeometricObject;

public class Practise13_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Octagon o1 = new Octagon(5);
		 System.out.println("Area is " + o1.getArea());
		 System.out.println("Perimeter is " + o1.getPerimeter());

		 Octagon o2 = (Octagon)(o1.clone());
		 System.out.println("Compare the methods " + o1.compareTo(o2));
	} 

}

class Octagon extends GeometricObject implements Comparable<Octagon> ,Cloneable{
	private double side;
	
	public Octagon(){}
	
	public Octagon(double side){
		this.side = side;
	}
	
	public void setSide(double side){
		this.side = side;
	}
	
	public double getSide(){
		return side;
	}
	
	public double getArea(){
		return (2 + 4 / Math.sqrt(2)) * side * side;
	}
	
	public double getPerimeter(){
		return 8 * side;
	}

	@Override
	public double compareTo(Octagon o) {
		// TODO Auto-generated method stub
		if (this.side > o.side)
		      return 1;
		else if (this.side == o.side)
		      return 0;
		else
		      return -1;
	}
	
	public Object clone() {
	    try {
	      return super.clone(); // Automatically perform a shallow copy
	    }
	    catch (CloneNotSupportedException ex) {
	      return null;
	    }
	  }
}


