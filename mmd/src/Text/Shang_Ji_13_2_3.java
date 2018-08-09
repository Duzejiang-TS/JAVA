package Text;

import java.util.ArrayList;
import java.util.TreeSet;

public class Shang_Ji_13_2_3 {

	public static <E extends Comparable<E>> void sort(ArrayList<E> list){
		TreeSet<E> ts = new TreeSet<E>();
		ts.addAll(list);
		list.clear();
		list.addAll(ts);
	}
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("r");
		list.add("d");
		list.add("c");
		
		sort(list);
		System.out.println("ÅÅÐò½á¹û£º" + list);

	}

}
