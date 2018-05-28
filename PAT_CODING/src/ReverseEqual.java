
public class ReverseEqual {
	public boolean checkReverseEqual(String s1, String s2) {
        // write code here
		if(s1.length() != s2.length() ||s1 == null ||s2 == null) return false;
		String str = s1+s1;
		if(str.indexOf(s2)==-1)return false;
		return true;
    }
}
