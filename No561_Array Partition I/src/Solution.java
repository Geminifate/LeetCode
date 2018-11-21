import java.util.Arrays;

public class Solution {
	public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int max=0;
        for (int i = 0; i < nums.length/2; i++) {
			max+=nums[2*i];
		}
        return max;
    }
}
