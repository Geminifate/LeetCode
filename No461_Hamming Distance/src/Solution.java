
public class Solution {
	public int hammingDistance(int x, int y) {
        int count=0;
        int i,j;
        while (x!=0|y!=0) {
        	i=x&1;
        	j=y&1;
        	if (i!=j) {
        		count++;
        	}
        	x=x>>>1;
        	y=y>>>1;
        }
        return count; 
    }
}
