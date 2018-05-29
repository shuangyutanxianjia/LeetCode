package weekly.week84;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P833 {
	public static String findReplaceString(String S, int[] indexes, String[] sources, String[] targets) {
        Map<Integer,Integer> map = new HashMap<>();
        StringBuffer result = new StringBuffer();
        result.append(S);
        for(int i =0;i<indexes.length;i++){
        	map.put(indexes[i],i);
        }
		Arrays.sort(indexes);
        
		for(int j = indexes.length-1;j>=0;j--){
			int n = indexes[j]; //获取最大的index
			int m = map.get(indexes[j]); //获取对应的正式index值
			String source = sources[m];
			int len = source.length();
			System.out.println("match_len"+len);
			System.out.println(source);
			String match = S.substring(n,n+sources[m].length());
			System.out.println(match);
				
			if(source.equals(match)){
				result.replace(n,n+sources[m].length(),targets[m]);
			}
			
		}
		return result.toString();
		
    }
	public static void main(String[] args) {
		String s = "abcdab";
		int[] indexes ={0,2};
		String[] sources={"ab","cd"};
		String[] targets={"eee","ffff"};
		System.out.println(P833.findReplaceString(s, indexes, sources, targets));
		
		
	}
}
