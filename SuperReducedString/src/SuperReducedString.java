import java.util.Scanner;
import java.util.Stack;

public class SuperReducedString {
	public static void main(String [] args) {
        /* Save input */
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        scan.close();
        
        Stack<Character> stack = new Stack<Character>();
        char[] c = str.toCharArray();
        for(Character x:c){
        	if(!stack.isEmpty() && stack.peek() == x){
        		stack.pop();
        	} else{
        	stack.push(x);
        	}
        }
        
        StringBuilder sb =new StringBuilder();
        for(Character s:stack){
        	sb.append(s);
        }
        
        System.out.println(sb.toString());
    }

}
