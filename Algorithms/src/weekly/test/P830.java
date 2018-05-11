package weekly.test;

import java.util.ArrayList;
import java.util.List;

/**
 * 830. Positions of Large Groups

In a string S of lowercase letters, these letters form consecutive groups of the same character.

For example, a string like S = "abbxxxxzyy" has the groups "a", "bb", "xxxx", "z" and "yy".

Call a group large if it has 3 or more characters.  We would like the starting and ending positions of every large group.

The final answer should be in lexicographic order.

提交问题出在 返回上。。

 * @author Administrator
 *
 */
public class P830 {
	public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> result = new ArrayList<>();
       
        int count =1;
        if(S.length()<3)
         {
        	return result;
         }else{
        	 for(int i =0;i<S.length();i++){
        		 if(i+1>=S.length()){
        			 if(count>=3){
        				 List<Integer> range = new ArrayList<>();
        				 range.add(i-count+1);
        				 range.add(i);
        				 result.add(range);
        			 }
        		 }else{
	        		 if(S.charAt(i) == S.charAt(i+1)){
	        			 count++;
	        		 }else{
	        			 if(count>=3){
	        				 List<Integer> range = new ArrayList<>();
	        				 range.add(i-count+1);
	        				 range.add(i);
	        				 result.add(range);
	        			 }
	        			 count = 1;
	        		 }
        		 }
        	 }
        	 
         }         
        return result;
    }
	
	public static void main(String[] args) {
		String S = "a";
		P830 p = new P830();
		p.largeGroupPositions(S);
	}
}
