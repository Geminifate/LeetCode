
public class Solution {
	public int removeElement(int[] nums, int val) {
        Arrays.sort(nums);
		int count=nums.length;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]==val) {
				nums[i]=Integer.MAX_VALUE;
                count--;
				continue;
			}
		}
		Arrays.sort(nums);
		System.out.println(count);
		return count;
    }
}
