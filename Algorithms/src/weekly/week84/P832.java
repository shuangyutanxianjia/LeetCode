package weekly.week84;

public class P832 {
	public int[][] flipAndInvertImage(int[][] A) {
        if(A == null) return null;
        for(int i =0;i<A.length;i++){
        	revol(A[i]);
        }
		return A;
    }
	
	public int[] revol(int[] L){
		int count = L.length;
		int i = count -1 ;
		for(int j = i-1>>1;j>=0;j--){
			int a = L[j];
			int b = L[i-j];
			L[j] = (b == 0? 1:0);
            L[i - j] = (a == 0? 1:0);
		}
		if(count %2 !=0){
			int m = count/2;
			L[m] = (L[m]== 0?1:0);
		}
		return L;
	}
}
