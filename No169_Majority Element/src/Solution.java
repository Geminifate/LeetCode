import java.util.TreeMap;
import java.util.TreeSet;

public class Solution {
	public int majorityElement(int[] nums) {
        TreeMap<Integer, Integer> map = new TreeMap();
        int count=nums.length/2;
        for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i])+1);
			}else {
				map.put(nums[i], 1);
			}
			if (map.get(nums[i])>count) {
				return nums[i];
			}
		}
        return 0;
    }
}
