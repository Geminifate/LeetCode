import java.util.TreeMap;

public class Solution {
    public int findShortestSubArray(int[] nums) {
    	Integer[] res;
        TreeMap<Integer, Integer[]> map = new TreeMap();
        int num=0;
        int len=0;
        int key=0;
        for (int i = 0; i < nums.length; i++) {
			if (!map.containsKey(nums[i])) {
				res = new Integer[]{1,i,i};
                map.put(nums[i], res);
			} else {
                res = new Integer[]{map.get(nums[i])[0]+1,map.get(nums[i])[1],i};
                map.put(nums[i], res);
			}
			if (map.get(nums[i])[0]>num) {
	        	num=map.get(nums[i])[0];
	        	key=nums[i];
	        	len=map.get(nums[i])[2]-map.get(nums[i])[1];
			}else if (map.get(nums[i])[0]==num&&(map.get(nums[i])[2]-map.get(nums[i])[1])<len) {
				num=map.get(nums[i])[0];
	        	key=nums[i];
	        	len=map.get(nums[i])[2]-map.get(nums[i])[1];
			}
		}  
        return len+1;
    }
}