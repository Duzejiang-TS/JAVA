package Ji_he_Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Di_er_ci_kan {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("zhang", 13);
		map.put("wang", 23);
		map.put("li", 33);
		map.put("zhao", 43);
		
//		Integer i = map.get("zhang");
//		System.out.println(i);
		
		Set<String> keyset = map.keySet();
		Iterator<String> it = keyset.iterator();
		while(it.hasNext()){
			String key = it.next();
			Integer value = map.get(key);
			System.out.println(key + "=" + value);
		}
	}

}
