
public class Solution {
	public int[][] flipAndInvertImage(int[][] A) {
        int[] tem=new int[A[0].length];
        int k;
        for (int i = 0; i < A.length; i++) {
        	k=A[i].length-1;
        	for (int j = 0; j < A[i].length; j++) {
        		tem[k]=A[i][j];
        		k--;
        	}
        	for (int j = 0; j < tem.length; j++) {
        		tem[j]=tem[j]^1;
        		A[i][j]=tem[j];
        	}
        }  
        return A;
    }
}
