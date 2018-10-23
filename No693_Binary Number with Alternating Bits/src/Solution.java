public class Solution {
	public boolean hasAlternatingBits(int n) {
		char[] ch= Integer.toBinaryString(n).toCharArray();
		char c = ch[0];
		System.out.println();
		for (int i = 1; i < ch.length; i++) {
			if (ch[i]==c) {
				return false;
			}
			c=ch[i];
		}
		return true;
    }
}
