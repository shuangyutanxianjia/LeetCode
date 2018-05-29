package arraylist;

public class A11 {
	public int maxArea(int[] height) {
        int maxArea =0;
        int i = 0;int j = height.length  -1;
        while(i<j){
        	maxArea = Math.max(maxArea, (j-i)*Math.min(height[i], height[j]));
        	if(height[j]<height[i]){
        		j--;
        	}else{
        		i++;
        	}
        }
        return maxArea;
    }
}
