public class Solution {
    public int[][] imageSmoother(int[][] M) {
    	int[][] res = new int[M.length][M[0].length];
        for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[i].length; j++) {
				int count=1;
				int tem=M[i][j];
				if (i-1>=0) {
					tem+=M[i-1][j];
					count++;
					if (j-1>=0) {
						tem+=M[i-1][j-1];
						count++;
					}
					if (j+1<M[i].length) {
						tem+=M[i-1][j+1];
						count++;
					}
				}
				if (i+1<M.length) {
					tem+=M[i+1][j];
					count++;
					if (j-1>=0) {
						tem+=M[i+1][j-1];
						count++;
					}
					if (j+1<M[i].length) {
						tem+=M[i+1][j+1];
						count++;
					}
				}
				if (j-1>=0) {
					tem+=M[i][j-1];
					count++;
				}
				if (j+1<M[i].length) {
					tem+=M[i][j+1];
					count++;
				}
				res[i][j]=(int)Math.floorDiv(tem, count);
			}
        }
		return res;
    }
}