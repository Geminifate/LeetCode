import java.util.Arrays;

import javax.print.attribute.standard.RequestingUserName;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
			if (nums[i]==nums[i+1]) {
				return true;
			}
		}
        return false;
    }
}