import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set {
	
	public static void main(String ars[]) {
		
		//Creating
		HashSet<Integer> set=new HashSet<>();
		
		
		//Inserting
		set.add(2);
		set.add(1);
		set.add(12);
		
		//Size
		System.out.println("Size of set= "+set.size());
		
		//All Elements
		System.out.println(set);
		
		//delete
		set.remove(12);
		System.out.println(set);
		
		//Searching
		if(set.contains(2))
			System.out.println("2 is present");
		
		
		//printing using iterator
		Iterator it=set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
	}

}
