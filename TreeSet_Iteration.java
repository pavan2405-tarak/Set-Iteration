package Set_Iteration;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_Iteration {
	public static void main(String[] args) {
		Set<String> anime=new TreeSet<String>();
		anime.add("Naruto");
		anime.add("One Piece");
		anime.add("Bleach");
		anime.add("Dragon Ball");
		anime.add("Demon Slayer");
		anime.add("Black Clover");
		System.out.println(anime);
		Iterator<String> ite=anime.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
			
		
		
		
	}

}
