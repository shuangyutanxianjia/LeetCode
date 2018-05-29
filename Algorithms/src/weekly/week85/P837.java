package weekly.week85;

import java.util.Stack;

public class P837 {
	
	
	public String pushDominoes(String dominoes) {
		if (dominoes.length() <= 0) return null;
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        StringBuffer result = new StringBuffer();
 
        result.append(dominoes);
        for(int i = 0;i<dominoes.length();i++){
        	if(dominoes.charAt(i) == '.'){
        		
        		
        	}
        	if(dominoes.charAt(i) == 'L'){
        		
        	}
        	if(dominoes.charAt(i) == 'R'){
        		
        	}
        }
        for(int i = result.length()-1;i>=0;i--){
        	if(!stack1.isEmpty()){
	        	if(result.charAt(i) =='.'){
	        		result.replace(i, i+1, stack1.pop().toString());
	        	}
        	}
        }
        return result.toString();
    }
	
	public static void main(String[] args) {
		String s = "..LL...";
		P837 p = new P837();
		
		System.out.println(p.pushDominoes(s));
	}
}
