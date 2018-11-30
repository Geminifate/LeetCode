import java.util.ArrayList;

public class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
    	ArrayList<ArrayList<Integer>> list = new ArrayList();
        int len=0;
    	while (len<matrix[0].length) {
			ArrayList<Integer> li = new ArrayList();
			li.add(matrix[0][len]);
            list.add(li);
            len++;
		}
    	for (int i = 1; i < matrix.length; i++) {
    		for (int j = 0; j < matrix[i].length; j++) {
				if (j==0) {
					ArrayList<Integer> li = new ArrayList();
					li.add(matrix[i][j]);
					list.add(0, li);
				}else {
					if (matrix[i][j]!=list.get(j).get(0)) {
						return false;
					}
				}
			}	
		}
    	return true;
    }
}