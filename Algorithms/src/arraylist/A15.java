package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class A15 {
	public static List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> result = new ArrayList<>();
		for (int i = 0; i < nums.length - 2; i++) {
			int twoSum = -nums[i];
			int p1 = i + 1;
			int p2 = nums.length - 1;
			while (p1 < p2) {
				int sum = nums[p1] + nums[p2];
				if (sum == twoSum) {
					result.add(Arrays.asList(nums[i], nums[p1], nums[p2]));
					int prevP1 = p1;
					while (p1 < p2 && nums[p1] == nums[prevP1]) // Here
						p1++;
					p2--;
				} else if (sum < twoSum) {
					p1++;
				} else if (sum > twoSum) {
					p2--;
				}
			}
			int prevI = i;
			while (i < nums.length && nums[i] == nums[prevI]) // And Here
				i++;
			i--;
		}
		return result;
    }
	
	public static void main(String[] args) {
		//int[] nums = {-1, 0, 1, 2, -1, -4};
		//threeSum(nums);
		
		
	}
}
