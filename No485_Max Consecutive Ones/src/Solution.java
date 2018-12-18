import java.util.ArrayList;

public class Solution {
	public int findMaxConsecutiveOnes(int[] nums) {
		ArrayList<Integer> list = new ArrayList();
		list.add(-1);
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]==0) {
				list.add(i);
			}
		}
		list.add(nums.length);
		int len=0;
		for (int i = 1; i < list.size(); i++) {
			len = len>(list.get(i)-list.get(i-1)-1)?len:(list.get(i)-list.get(i-1)-1);
		}
		return len;
    }
}
