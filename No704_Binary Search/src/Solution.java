public class Solution {
    public int search(int[] nums, int target) {
    	int lo=0;
    	int hi=nums.length-1;
    	while (lo<=hi) {
			int mid=(lo+hi)/2;
			if (nums[mid]>target) hi=mid-1;
			if (nums[mid]<target) lo=mid+1;
			if (nums[mid]==target) return nums[mid];
		}
    	return -1;
	}
}