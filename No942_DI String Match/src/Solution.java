public class Solution {
    public int[] diStringMatch(String S) {
    	int[] res= new int[S.length()+1];
    	int small=0;
    	int large=S.length();
        for (int i = S.length()-1; i >=0 ; i--) {
			if (S.charAt(i)=='D') {
				res[i+1]=small;
				small++;
			}else {
				res[i+1]=large;
				large--;
			}
		}
        res[0]=large;
        return res;
    }
}
