public class Solution {
    public int countBinarySubstrings(String s) {
    	int count=0;
        for (int i = 0; i < s.length()-1; i++) {
        	int L=i;
        	int R=i+1;
        	while(s.charAt(L)!=s.charAt(R)) {
				count++;
				L--;
				R++;
				if (!(L>=0&&R<s.length()&&s.charAt(L)==s.charAt(L+1))) {
					break;
				}
			}
		}
        return count;
    }
}