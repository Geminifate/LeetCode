import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        for (int i = 0; i < words.length-1; i++) {
			for (int j = 0; j < words[i].length(); j++) {
				if (j==words[i+1].length()) {
					return false;
				}
				int index1=order.indexOf(words[i].charAt(j));
				int index2=order.indexOf(words[i+1].charAt(j));
				if (index1==index2) {
					continue;
				}else if (index1>index2) {
					return false;
				}else if (index1<index2) {
					break;
				}
			}
		}
    	return true;
    }
}