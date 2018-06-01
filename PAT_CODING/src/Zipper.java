/**
 * 基本字符串压缩
 * 利用字符重复出现的次数，编写一个方法，实现基本的字符串压缩功能。比如，字符串“aabcccccaaa”经压缩会变成“a2b1c5a3”。若压缩后的字符串没有变短，则返回原先的字符串。

	给定一个string iniString为待压缩的串(长度小于等于10000)，保证串内字符均由大小写英文字母组成，返回一个string，为所求的压缩后或未变化的串。
 * @author Administrator
 *
 */
public class Zipper {
	public static String zipString(String iniString) {
        // write code here
		StringBuffer str = new StringBuffer();
		if (iniString.length() <=0)return null;
		int i = 0;		
		while(i<iniString.length()){
			char temp = iniString.charAt(i);
			int count = 1;
			while( i<iniString.length()-1 && iniString.charAt(i) == iniString.charAt(i+1))
			{
				i++;
				count++;
			}
			str.append(temp);
			str.append(count);
			i++;
		}		
		return str.length() >= iniString.length() ?iniString:str.toString();
    }
	public static void main(String[] args) {
		String s = "aabcccccaaa";
		System.out.println(Zipper.zipString(s));
	}
}
