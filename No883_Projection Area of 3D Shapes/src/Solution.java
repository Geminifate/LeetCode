
public class Solution {
	public int projectionArea(int[][] grid) {
		int sum=0;
        for (int i = 0; i < grid.length; i++) {
        	int XY=0;
    		int XZ=0;
    		int YZ=0;
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j]!=0) {
					XY++;
				}
				if (XZ<grid[i][j]) {//XZ=Math.max(XZ,grid[i][j]);
					XZ=grid[i][j];
				}
				if (YZ<grid[j][i]) {//YZ=Math.max(YZ,grid[j][i]);
					YZ=grid[j][i];
				}
			}
			sum+=(XZ+XY+YZ);
		}
        return sum;
    }
}
//这是题目提供的参考答案
class Solution {
    public int projectionArea(int[][] grid) {
        int N = grid.length;
        int ans = 0;

        for (int i = 0; i < N;  ++i) {
            int bestRow = 0;  // largest of grid[i][j]
            int bestCol = 0;  // largest of grid[j][i]
            for (int j = 0; j < N; ++j) {
                if (grid[i][j] > 0) ans++;  // top shadow
                bestRow = Math.max(bestRow, grid[i][j]);
                bestCol = Math.max(bestCol, grid[j][i]);
            }
            ans += bestRow + bestCol;
        }

        return ans;
    }
}