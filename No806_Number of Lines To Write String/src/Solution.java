
public class Solution {
	public int[] numberOfLines(int[] widths, String S) {
		int[] num = new int[S.length()];
        int count=1;
        int sum=0;
        for (int i = 0; i < S.length(); i++) {
			num[i] =widths[S.toCharArray()[i]-'a'];
			if ((sum+num[i])>100) {
				count++;
				sum=num[i];
			}else {
				sum=sum+num[i];
			}
		}
        return new int[] {count,sum};
    }
}
