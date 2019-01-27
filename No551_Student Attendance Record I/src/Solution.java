public class Solution {
    public boolean checkRecord(String s) {
        if (s.contains("LLL")|s.indexOf('A')!=s.lastIndexOf('A')) {
			return false;
		}
        return true;
    }
}