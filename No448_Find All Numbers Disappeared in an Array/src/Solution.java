import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
//This answer does not meet the time complexity of the question,
public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
    	List<Integer> list = new ArrayList<>();
    	TreeSet<Integer> set = new TreeSet();
    	Arrays.sort(nums);
    	int res =nums.length+1;
    	for (int i = 0; i < nums.length; i++) {
    		list.add(i+1);
			set.add(nums[i]);	
		}
    	for (Integer val : set) {
    		if (list.contains(val)) {
				list.remove(list.indexOf(val));
			}
		}
    	return list;
    }
}