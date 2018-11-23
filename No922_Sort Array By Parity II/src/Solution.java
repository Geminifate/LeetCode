import java.util.ArrayList;

public class Solution {
	public int[] sortArrayByParityII(int[] A) {
		ArrayList<Integer> li_even = new ArrayList<Integer>();//index=odd,value=even
		ArrayList<Integer> li_odd = new ArrayList<Integer>();//index=even,value=odd
		int tem;
		for (int i = 0; i < A.length; i++) {
			if (i%2==0&&A[i]%2==0|i%2==1&&A[i]%2==1) {
				continue;
			} else if (i%2==0&&A[i]%2==1) {
				li_odd.add(i);
			}else if (i%2==1&&A[i]%2==0) {
				li_even.add(i);
			}
		}
		for (int i = 0; i < li_even.size(); i++) {
			tem=A[li_even.get(i)];
			A[li_even.get(i)]=A[li_odd.get(i)];
			A[li_odd.get(i)]=tem;
		}
		return A; 
    }
}
