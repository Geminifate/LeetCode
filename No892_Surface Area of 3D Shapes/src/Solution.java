public class Solution {
    public int surfaceArea(int[][] grid) {
        int square =0;
        for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j]==0) {
					continue;
				}
				square+=grid[i][j]*4+2;
				if (i>0&&grid[i-1][j]>0) {
					square-=Math.min(grid[i-1][j],grid[i][j])*2;
				}
				if (j>0&&grid[i][j-1]>0) {
					square-=Math.min(grid[i][j-1],grid[i][j])*2;
				}
			}
		}
        return square;
    }
}
