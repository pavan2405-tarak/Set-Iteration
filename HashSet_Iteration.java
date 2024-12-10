package Set_Iteration;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet_Iteration {
	public static void main(String[] args) {
		Set<Integer> set=new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		set.add(20);
		System.out.println(set);
		Iterator<Integer> ite=set.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
	}

}
