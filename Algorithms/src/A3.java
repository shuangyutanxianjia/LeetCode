

/**
 * Longest Substring Without Repeating Characters
 * @author Administrator
 *
 */
public class A3 {
	 public int lengthOfLongestSubstring(String s) {
	         int[] indices = new int[256];
	         int max = 0, masked = 0;
	         for (int i=0; i<s.length();) {
	             char c = s.charAt(i++);
	             System.out.println("字符下标"+i+"字符"+c+indices[c]);
	             //获取最大下标
	             if (indices[c] != 0) {
	                 masked = Math.max(indices[c], masked);
	             }
	             int len = i - masked;
	             max = Math.max(len, max);
	             indices[c] = i;
	         }
	         return max;
	    }
	 
	 public static void main(String[] args) {
		A3 a3= new A3();
		 String s = "asddsfasdfdg";
		System.out.println(a3.lengthOfLongestSubstring(s));
	}
}
