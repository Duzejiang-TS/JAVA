package Ji_he_de_Demo;

import java.util.LinkedList;;

public class Demo_LinkedList {

	/*LinkedList�����й���
	* public void addFirst(E e)��addLast(E e)
	* public E getFirst()��getLast()
	* public E removeFirst()��public E removeLast()
	* public E get(int index);
	* */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addFirst("a");
		list.addFirst("b");
		list.addFirst("c");
		list.addFirst("d");
		list.addLast("e");
		
		System.out.println(list.getLast());
		System.out.println(list);
	}

}
