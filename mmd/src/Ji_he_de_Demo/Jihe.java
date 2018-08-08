package Ji_he_de_Demo;

public class Jihe {

	public static void main(String[] args) {   //数组存储引用数据类型
		// TODO Auto-generated method stub
		Students[] arr = new Students[2]; 
		arr[0] = new Students("=====张 66三",23);
		arr[1] = new Students("李四",24);
		
		for(int i = 0;i < arr.length;i++)
			System.out.println(arr[i]);
	}

}

class Students{
	private String name;
	private int age;
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Students(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}