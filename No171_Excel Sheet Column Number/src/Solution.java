
public class Solution {
	public int titleToNumber(String s) {
        char[] ch = s.toCharArray();
        int num = 0;
        for (int i = 0; i < ch.length; i++) {
			num= num+(int)(ch[i]-'A'+1);
			if (i<ch.length-1) {
				num=num*26;
			}
		}
        return num;
    }
}
