import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
    	String str = "z";
    	char[] ch = licensePlate.toLowerCase().toCharArray();
    	for (int i = 0; i < ch.length; i++) {
			if (ch[i]<='z'&&ch[i]>='a') {
				str+=ch[i];
			}
		}
    	char[] c =str.toCharArray();
    	Arrays.sort(c);
    	for (int i = 0; i < c.length-1; i++) {
			ArrayList<String> list = new ArrayList();
			for (int j = 0; j < words.length; j++) {
				if (words[j].contains(""+c[i])) {
					if (c[i]==c[i+1]) {
						words[j]=words[j].replaceFirst(""+c[i], ""+(char)(c[i]-32));
					}
					list.add(words[j]);
				}
			}
            
			words=list.toArray(new String[list.size()]);
		}
    	str= words[0];
    	for (int i = 1; i < words.length; i++) {
			if (str.length()>words[i].length()) {
				str= words[i];
			}
		}
        return str.toLowerCase();
    }
}  