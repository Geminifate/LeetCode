import java.util.Arrays;

public class Solution {
	public boolean isAnagram(String s, String t) {
        char[] ss = s.toCharArray();
        Arrays.sort(ss);
        char[] tt = t.toCharArray();
        Arrays.sort(tt);
        if (ss.length!=tt.length) {
			return false;
		}
        for (int i = 0; i < ss.length; i++) {
			if (ss[i]!=tt[i]) {
				return false;
			}
		}
        return true;
    }
}
