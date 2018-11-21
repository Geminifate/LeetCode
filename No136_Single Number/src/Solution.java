import java.util.Arrays;

public class Solution {
	public int singleNumber(int[] nums) {
		if (nums.length==1) {
			return nums[0];
		}
        Arrays.sort(nums);
        
	    if (nums[0]!=nums[1]) {
			return nums[0];
		}
	    for (int j = 1; j < nums.length-1; j++) {
			if (nums[j]!=nums[j-1]&&nums[j]!=nums[j+1]) {
				return nums[j];
			}
		}
	    return nums[nums.length-1];
	}
}
