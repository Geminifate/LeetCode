import java.util.ArrayList;

public class Solution {
	public int findComplement(int num) {
		char[] ch=Integer.toBinaryString(num).toCharArray();
		int count=0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]=='0') {
				count=count*2+1;
			} else {
				count=count*2;
			}
		}
		 return count;
	}
}
