
public class Solution {
	public int binaryGap(int N) {
        char[] ch = Integer.toBinaryString(N).toCharArray();
        int distance=0;
        int index=-1;
        for (int i = 0; i < ch.length; i++) {
        	if (ch[i]!='1') {
				continue;
			}
			if (index==-1) {
				index=i;
			}
			if (i-index>distance) {
				distance=i-index;
			}
			index=i;
		}
        return distance;
    }
}
