public class Solution {
    public boolean isMonotonic(int[] A) {
    	boolean upper = false;
    	boolean lower = false;
    	boolean balance =true;
        for (int i = 0; i < A.length-1; i++) {
			if (A[i]>A[i+1]) {
				lower=true;
			}else if (A[i]<A[i+1]) {
				upper=true;
			}
			if (A[i]!=A[i+1]) {
				balance =false;
			}
		}
        if (balance|lower^upper) {
			return true;
		}
        return false;
    }
}