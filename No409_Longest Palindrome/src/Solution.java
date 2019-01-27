import java.util.TreeMap;

public class Solution {
    public int longestPalindrome(String s) {
    	TreeMap<Character, Integer> map = new TreeMap();
        int len=0;
        for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}else {
				map.put(s.charAt(i),1);
			}
		}
        for (Character key : map.keySet()) {
			if (map.get(key)%2==0||len%2==0) {
				len+=map.get(key);
			}else{
                len+=map.get(key)-1;
            }
		}
        return len;
    }
}