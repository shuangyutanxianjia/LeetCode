
public class Replacement {
	public static String replaceSpace(String iniString, int length) {
        // write code here
		StringBuffer str = new StringBuffer(iniString);
		for(int i=0;i<length;i++){
			if(str.charAt(i) == ' ') str.replace(i, i+1, "%20");
		}
		return str.toString();
	}
	public static void main(String[] args) {
		String s = "sArcCNxjNaviToUsSN QiTtx j bgUhhIoiSfszja QfFkxk JwYOoFSg dhdMKgTxjRrcATfkb ELqIebLGZk kAESkrNJxbmci nyojZqX vawG kxvqf moWAA m aMuilydRRNvVuh Uss mJtnZb zA oF cx hUQD V dSLSLcbjXLydl V dReEozdi ZO IxbW CgcTeobRrmco ELs cQh K xlg Pj cGaO yXKXy hs kmJaSdNV Z InShcp AxoM hHLTsIMhcHKnArxgRVjh MclqtzFpl yzaWlhLfYlfxNFgb";
		int len = 331;
		System.out.println(Replacement.replaceSpace(s, len));
	}
}
