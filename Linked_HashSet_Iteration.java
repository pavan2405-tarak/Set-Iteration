package Set_Iteration;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Linked_HashSet_Iteration {
	public static void main(String[] args) {
		Set<Integer> numbers=new LinkedHashSet<Integer>();
		numbers.add(20);
		numbers.add(30);
		numbers.add(50);
		numbers.add(40);
		numbers.add(60);
		numbers.add(70);
		System.out.println(numbers);
		Iterator<Integer> ite=numbers.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
	}

}
