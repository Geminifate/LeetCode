public class Solution {
	public String reverseString(String s) {
        char[] ch = s.toCharArray();
        char temp;
        for (int i = 0; i < ch.length/2; i++) {
			temp = ch[i];
        	ch[i]=ch[ch.length-1-i];
        	ch[ch.length-1-i]=temp;
		}
        return String.copyValueOf(ch, 0, ch.length);
    }
}
