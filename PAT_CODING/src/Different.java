/**
 * 请实现一个算法，确定一个字符串的所有字符是否全都不同。这里我们要求不允许使用额外的存储结构。

	给定一个string iniString，请返回一个bool值,True代表所有字符全都不同，False代表存在相同的字符。保证字符串中的字符为ASCII字符。字符串的长度小于等于3000。
 * @author Administrator
 *
 */
public class Different {
	public static boolean checkDifferent(String iniString) {
		//if(iniString.length()>26) return false;
		for(int i = 0;i<iniString.length();i++){
			for(int j =0;j<iniString.length() && j!= i;j++){
				if(iniString.charAt(i) == iniString.charAt(j)) return false;
			}
		}		
		return true;
    }
	
	public static void main(String[] args) {
		String s = "aeoiou";
		System.out.println(Different.checkDifferent(s));
		
	}
}
