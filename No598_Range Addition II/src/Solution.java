public class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int r_min=m;
        int c_min=n;
        for (int i = 0; i < ops.length; i++) {
			if (ops[i][0]<r_min) {
				r_min=ops[i][0];
			}
			if (ops[i][1]<c_min) {
				c_min=ops[i][1];
			}
		}
        return r_min*c_min;
    }
}