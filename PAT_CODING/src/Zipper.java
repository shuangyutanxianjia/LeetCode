
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
