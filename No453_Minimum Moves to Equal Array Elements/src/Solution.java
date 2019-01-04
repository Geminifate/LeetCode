public class Solution {
    public int minMoves(int[] nums) {
    	if (nums.length==1) {
			return 0;
		}
        int dis = 0;
        int min=nums[0];
        for (int i = 0; i < nums.length; i++) {
			dis+=nums[i];
			if (nums[i]<min) {
				min=nums[i];
			}
		}
        return dis-min*nums.length;
    }
}