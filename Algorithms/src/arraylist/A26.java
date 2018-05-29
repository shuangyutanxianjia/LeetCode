package arraylist;

import java.util.Arrays;


public class A26 {
	public int removeDuplicates(int[] nums) {
        Arrays.sort(nums);
        int k =0;
        for(int i =1;i<nums.length;i++){
        	if(nums[i] != nums[k]){
        		nums[++k] = nums[i];
        	}
        }
        return k+1;
    }
}
