package Text;

public class Ni_Ming_Nei_Bu_Lei {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*outer iu = new outer();
		iu.method();*/
		outer iu = new outer();
		iu.method();
	}

}

interface inter{
	public void show1();
	public void show2();
}

class outer{
	public void method(){
		new inter(){
			public void show1(){
				System.out.println("show1");
			}
			public void show2(){
				System.out.println("show10086");
			}
		}.show1();
	}
}


/*interface inter{
	public void print();
}

class outer{
	class inner implements inter{
		@Override
		public void print() {
			System.out.println("print");
		}
	 }
	 
	 public void method() {
		 new inter(){
			 public void print() {
					System.out.println("print10086");
				} 
		 }.print();
	 }
	 
}*/


