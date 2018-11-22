import java.util.Arrays;

public class Solution {
	public int removeDuplicates(int[] nums) {
        Arrays.sort(nums);
		int count=1;
		for (int i = 0; i < nums.length-1; i++) {
			if (nums[i]==nums[i+1]) {
				nums[i]=Integer.MAX_VALUE;
				continue;
			}
			count++;
		}
		Arrays.sort(nums);
		return count;
    }
}
