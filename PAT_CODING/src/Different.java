
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
