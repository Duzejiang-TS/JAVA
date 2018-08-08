package Ji_he_Map;

import java.util.Comparator;
import java.util.TreeMap;

public class Dome_TreeMap {

	public static void main(String[] args) {
		/*TreeMap<Student,String> tm = new TreeMap<>();
		tm.put(new Student("张三",23), "北京");
		tm.put(new Student("李四",13), "上海");
		tm.put(new Student("王五",33), "广州");
		tm.put(new Student("赵六",43), "深圳");
		
		System.out.println(tm);*/
		TreeMap<Student,String> tm = new TreeMap<>(new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				int num = s1.getName().compareTo(s2.getName());		//按照姓名比较
				return num == 0 ? s1.getAge() - s2.getAge() : num;
			}
		});
		tm.put(new Student("张三",23), "北京");
		tm.put(new Student("李四",13), "上海");
		tm.put(new Student("王五",33), "广州");
		tm.put(new Student("赵六",43), "深圳");
		
		System.out.println(tm);
	}

}
