import java.util.Arrays;

public class Solution {
	public int smallestRangeI(int[] A, int K) {
       Arrays.sort(A); 
       if (A[A.length-1]-A[0]<=2*K) {
    	   return 0;
       }
       return A[A.length-1]-A[0]-2*K;
    }
}
