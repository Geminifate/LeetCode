public class Solution {
    public int[] shortestToChar(String S, char C) {
    	int[] dis =new int[S.length()];
    	int start=S.indexOf(C, 0);
    	int last = S.lastIndexOf(C);
    	int next;
    	if (start!=last) {
    		next=S.indexOf(C, start+1);
		} else {
			next=last;
		}
    	for (int i = 0; i < S.length(); i++) {	
			if (i>next&&next!=last) {
				start=next;
				next=S.indexOf(C,next+1);
			}
			dis[i]=(Math.abs(start-i)<=Math.abs(next-i))?Math.abs(start-i):Math.abs(next-i);
		}
    	return dis;
    }
}
