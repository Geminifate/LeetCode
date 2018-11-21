public class Solution {
	public int[][] matrixReshape(int[][] nums, int r, int c) {
        if ((nums.length*nums[0].length)!=(r*c)) {
			return nums;
		}
        int[][] res = new int[r][c];
        int r_index=0;
        int c_index=0;
        for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				if (c_index==c) {
					c_index=0;
					r_index++;
				}
				res[r_index][c_index]=nums[i][j];
				c_index++;
			}
		}
        return res;
    }
}
