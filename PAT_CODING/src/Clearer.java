
public class Clearer {
	 public int[][] clearZero(int[][] mat, int n) {
	        // write code here
	     boolean[] flagrow = new boolean[n];
	     boolean[] flagclm = new boolean[n];
	     
	     for(int i =0;i<n;i++){
	    	 for(int j =0;j<n;j++){
	    		 if(mat[i][j] == 0)
	    		 {
	    			 flagrow[i] = true;
	    			 flagclm[j] = true;
	    		 }
	    	 }
	     }
	     for(int i =0;i<n;i++){
	    	 for(int j=0;j<n;j++){
	    		 if(flagrow[i] || flagclm[j]){
	    			 mat[i][j] =0;
	    		 }
	    	 }
	     }
	     return mat;
	 }
}
