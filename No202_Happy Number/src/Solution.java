import java.util.ArrayList;

public class Solution {
	public boolean isHappy(int n) {
		int tem;
		ArrayList<Integer> list = new ArrayList();
        while (n!=1) {
        	tem=0;
			if (list.contains(n)) {
				return false;
			}
			list.add(n);
			while (n!=0) {
				tem+=Math.pow(n%10, 2);
				n=n/10;
			}
			n=tem;
		}
        return true;
    }
}
