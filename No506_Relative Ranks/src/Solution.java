import java.util.Arrays;

public class Solution {
    public String[] findRelativeRanks(int[] nums) {
        int[] tem =Arrays.copyOf(nums, nums.length);
        Arrays.sort(tem);
        String[] str = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
			int res=nums.length-Arrays.binarySearch(tem,nums[i]);
			if (res==1) {
				str[i]="Gold Medal";
			}else if (res==2) {
				str[i]="Silver Medal";
			}else if (res==3) {
				str[i]="Bronze Medal";
			}else {
				str[i]=Integer.toString(res);
			}
		}
        return str;
    }
}