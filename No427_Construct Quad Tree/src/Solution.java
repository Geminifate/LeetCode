import java.util.ArrayList;
import java.util.Arrays;

/*
// Definition for a QuadTree node.
class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    public Node() {}

    public Node(boolean _val,boolean _isLeaf,Node _topLeft,Node _topRight,Node _bottomLeft,Node _bottomRight) {
        val = _val;
        isLeaf = _isLeaf;
        topLeft = _topLeft;
        topRight = _topRight;
        bottomLeft = _bottomLeft;
        bottomRight = _bottomRight;
    }
};
*/
public class Solution {
    public Node construct(int[][] grid) {
    	if (grid.length==0) {
			return null;
		}
    	int res_0 = 0;
    	int res_1 = 0;
    	Node node = new Node();
    	for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j]==0) {
					res_0++;
				} else {
					res_1++;
				}
				if (res_0>0&&res_1>0) {
					break;
				}
            }
		}
    	if (res_0==(grid.length*grid.length)) {
    		node.val = false;
    		node.isLeaf = true;
			return node;
		}else if (res_1==(grid.length*grid.length)) {
			node.val = true;
    		node.isLeaf = true;
			return node;
		}
    	node.val = true;
		node.isLeaf = false;
		ArrayList<int[][]> list = split_matrix(grid);
		node.topLeft = construct(list.get(0));
		node.topRight = construct(list.get(1));
		node.bottomLeft = construct(list.get(2));
		node.bottomRight = construct(list.get(3));
		return node;
    }
	private ArrayList<int[][]> split_matrix(int[][] grid) {
		// TODO Auto-generated method stub
		ArrayList<int[][]> list = new ArrayList();
		int[][] arr1 = new int[grid.length/2][grid.length/2];
		int[][] arr2 = new int[grid.length/2][grid.length/2];
		int[][] arr3 = new int[grid.length/2][grid.length/2];
		int[][] arr4 = new int[grid.length/2][grid.length/2];
		for (int i = 0; i < grid.length/2; i++) {
			for (int j = 0; j < grid[i].length/2; j++) {
				arr1[i][j]=grid[i][j];
				arr2[i][j]=grid[i][j+grid.length/2];
				arr3[i][j]=grid[i+grid.length/2][j];
				arr4[i][j]=grid[i+grid.length/2][j+grid.length/2];
			}
		}
		list.add(arr1);
		list.add(arr2);
		list.add(arr3);
		list.add(arr4);
		return list;
	}
}