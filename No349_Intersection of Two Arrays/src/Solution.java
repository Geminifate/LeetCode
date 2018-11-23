
public class Solution {
	public int[] intersection(int[] nums1, int[] nums2) {
	    ArrayList<Integer> list = new ArrayList();
	    for (int i = 0; i < nums1.length; i++) {
	    	for (int j = 0; j < nums2.length; j++) {
	    		if (nums1[i]==nums2[j]&&(!list.contains(nums1[i]))) {
	    			list.add(nums2[j]);
						break;
	    		}
	    	}
		}
	    int[] res = new int[list.size()];
	    int i=0;
	    for (int s : list) {
			res[i]=s;
			i++;
		}
	    return res;
	}
}
