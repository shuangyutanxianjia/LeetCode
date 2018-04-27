import java.util.HashMap;
import java.util.Map;

public class A1 {
	public int[] twoSum(int[] nums, int target) {
		int[] results = new int[2];
		HashMap map = new HashMap();
		for(int i =0;i<nums.length;i++ )
		{
			map.put(nums[i], i);
		}
		
		for(int i =0;i<nums.length;i++){
			int findnum = target - nums[i];
			if(map.containsKey(findnum))
				{
				results[0] = i;
				if((int) map.get(findnum) == i){continue;}
				else{
					results[1] = (int) map.get(findnum);
					break;
				}
				
				}
		}		
		return results;
	      
// 		改进（可以把map赋值放在运算的过程中去，这样不仅可以保证不会取到自身还可以降低复杂度）
//		int[] result = new int[2];
//        HashMap<Integer,Integer> res = new HashMap<Integer,Integer>();
//        for(int i = 0; i < nums.length; i++){
//            if(res.containsKey(target - nums[i])){
//                result[0] = res.get(target - nums[i]);
//                result[1] = i;
//                break;
//            }
//            res.put(nums[i],i);
//        }
//        return result;
    }
	
	public static void main(String[] args) {
		 A1 a= new A1();
		 int nums[] = {3,2,4};
		 int target = 6;
		 a.twoSum(nums, target);
	}
}
