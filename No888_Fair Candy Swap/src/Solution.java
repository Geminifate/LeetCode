import java.util.Arrays;

public class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int sum1 = Sum(A);
        int sum2 = Sum(B);
        int dif = (sum1-sum2)/2;
        int[] res= new int[2];
        for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				if (A[i]-B[j]==dif) {
					res[0]=A[i];
					res[1]=B[j];
					return res;
				}
			}
		}
        return res;
    }

	private int Sum(int[] a) {
		// TODO Auto-generated method stub
		int res=0;
		for (int i = 0; i < a.length; i++) {
			res+=a[i];
		}
		return res;
	}
}