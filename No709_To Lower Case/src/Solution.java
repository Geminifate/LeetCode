
public class Solution {
    public String toLowerCase(String str) {
    	StringBuilder str1 =new StringBuilder(str);
    	for (int i = 0; i < str.length(); i++) {
    		if (str.charAt(i)<=90&&str.charAt(i)>=65) {
    			str1.setCharAt(i,(char)(str.charAt(i)+32));
    		}
    	}
    	str=str1.toString();
    	return str;
    }
}
