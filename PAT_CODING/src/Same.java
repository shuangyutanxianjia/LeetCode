
public class Same {
	public boolean checkSam(String stringA, String stringB) {		
        // write code here
		if(stringA.length()!= stringB.length()) return false;
		int[] strA = new int[256];
		int[] strB = new int[256];
		for(int i = 0;i<stringA.length();i++){
			strA[stringA.charAt(i)]++;
			strB[stringB.charAt(i)]++;
		}
		for(int i = 0;i<256;i++){
			if(strA[i]!=strB[i]) return false;
		}
		return true;
    }
}
