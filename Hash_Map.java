import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hash_Map {

	public static void main(String[] args) {
		//Creating- (roll,name);
		HashMap<Integer,String> map=new HashMap<>();
		
		//Inserting
		map.put(1, "Subhradip");
		map.put(4, "Sarthak");
		map.put(2, "Vratesh");
		map.put(9, "Sarth");
		
		System.out.println(map);
		
		map.put(4, "Manas");
		System.out.println(map);
		
		System.out.println(map.containsKey(5));
		System.out.println(map.get(5));
		
		//Keyset
		System.out.println(map.keySet());
		//tech1
		/*Iterator it=map.keySet().iterator();
		while(it.hasNext()) {
			System.out.println(map.get(it.next()));
		}*/
		//tech 2
		for(int val:map.keySet()) {
			System.out.println(val+"="+map.get(val));
		}
		//tech3
		for(Map.Entry<Integer,String> e: map.entrySet()) {
			System.out.println(e.getKey()+" = "+e.getValue());
		}
		
		//remove
		map.remove(9);
		System.out.println(map);
		

	}

}
