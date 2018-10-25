/**
 * 
 * @author wumengfei
 *每存在一个1，便有周长4
 *对于1，验证左边和上方是否为1
 */
public class Solution {
	public int islandPerimeter(int[][] grid) {
		int peri=0;
        for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j]==0) {
					continue;
				}
				peri+=4;
				if (i>0&&grid[i-1][j]==1) {
					peri-=2;;
				}
				if (j>0&&grid[i][j-1]==1) {
					peri-=2;;
				}
			}
        }
        return peri;
	}
}