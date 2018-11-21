import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		int res[] = new int[nums1.length];
		ArrayList<Integer> list = new ArrayList();
		for (int i = 0; i < nums2.length; i++) {
			list.add(nums2[i]);
		}
        for (int i = 0; i < nums1.length; i++) {
        	int index=list.indexOf(nums1[i])+1;
        	res[i]=-1;
        	for (; index < nums2.length; index++) {
				if (nums2[index]>nums1[i]) {
					res[i]=nums2[index];
                    break;
				}
			}
		}	
        return res;
    }
}
