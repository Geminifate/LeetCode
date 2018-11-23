
public class Solution {
	public int[] sortArrayByParity(int[] A) {
        int num=1;
		int count=0;
		int[] a = new int[A.length]; 
        for(int i=0;i<A.length;i++){
            if (A[i]%2==0) {
				a[count]=A[i];
				count++;
			} else {
				a[A.length-num]=A[i];
				num++;
			}
        }
		return a;
    }
}
