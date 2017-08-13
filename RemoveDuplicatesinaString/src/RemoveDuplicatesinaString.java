import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesinaString {

	public static void main(String[] args) {
		String s = "aabccdrhab";
		
		char[] c = s.toCharArray();
		/* As it maintains the (Insertion)order of the string */
		Set<Character> set = new LinkedHashSet<Character>();
		 for(Character x: c){
			 set.add(x);
		 }
		 StringBuilder sb = new StringBuilder();
		 for(Character z: set){
			 sb.append(z);
		 }
    System.out.println("The result is :" + sb.toString());
	}

}
