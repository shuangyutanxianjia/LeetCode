import java.util.Stack;

/**
 * 最长回文子串
 * O(n^2)solution
 * DP : 
 * 找出回文中心点 ，应该为2n-1个
 * 从中心点向左，向右进行回文判断
 * @author Administrator
 *
 */
public class A5 {
	public String longestPalindrome(String s) {
		int n = s.length();
		if( n == 0 ) return "";
		String longestPalindrome = s.substring(0, 1);
		for(int i = 0;i<n-1;i++){
			String sp1 = expandAroundCenter(s, i, i);
			longestPalindrome= sp1.length() > longestPalindrome.length()?sp1:longestPalindrome;
			String sp2 = expandAroundCenter(s, i, i+1);
			longestPalindrome = sp2.length() > longestPalindrome.length()?sp2:longestPalindrome;
		}
		
		System.out.println(longestPalindrome);
		return longestPalindrome;
		
	}
	public String expandAroundCenter(String s,int i,int j){
		int l = i;
		int r = j;
		int n = s.length();
		while(l>=0 && r<=n-1 && s.charAt(l) == s.charAt(r)){
			l--;
			r++;
		}
			return s.substring(l+1,r);
		
	}
	
	public static void main(String[] args) {
		A5 a = new A5();
		String s= "babad";
		a.longestPalindrome(s);
	}
}
