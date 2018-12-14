import java.util.Arrays;

public class Solution {
	public char findTheDifference(String s, String t) {
		char[] ch_s = s.toCharArray();
		Arrays.sort(ch_s);
		char[] ch_t = t.toCharArray();
		Arrays.sort(ch_t);
        for (int i = 0; i < ch_s.length; i++) {
			if (ch_s[i]!=ch_t[i]) {
				return ch_t[i];
			}
		}
        return ch_t[ch_t.length-1];
    }
}
