/**
 *The question has not been answered by myself.I referred the anwsers.
 */
public class Solution {
    public String longestPalindrome(String s) {
    	if (s.length()<2) {
			return s;
		}
    	int start=0;
    	int end=0;	
        for (int i = 0; i < s.length(); i++) {
        	int odd = palindrome(s,i,i);
        	int eve = palindrome(s,i,i+1);
        	int len=Math.max(odd, eve);
        	if (len>(end-start)) {
				end=i+len/2;
				start=i-end/2;
			}
		}
        return s.substring(start,end);
    }

	private int palindrome(String s, int i, int j) {
		// TODO Auto-generated method stub
		int L=i;
		int R=j;
		int len=R-L;
		if (L>0&&R<s.length()&&s.charAt(L)==s.charAt(R)) {
			L--;
			R++;
			int D=palindrome(s, L,R);
			if ((R-L)>len) {
				return R-L;
			}
			System.out.println(s.charAt(L)+" "+s.charAt(R));
		}
		return len;
	}
}