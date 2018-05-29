package weekly.week85;

public class P836 {
	public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        boolean result = false;
		if(rec1[0]<rec2[0]){
        	if(rec2[0]>rec1[2] ||rec2[1]>rec1[3] || rec2[3]<rec1[1]) result = false;
        	else result = true;
        }else{
        	if(rec1[0]>rec2[2] ||rec1[1]>rec2[3] || rec1[3]<rec2[1]) result = false;
        	else result = true;       			
        }
		return result;
    }
}
