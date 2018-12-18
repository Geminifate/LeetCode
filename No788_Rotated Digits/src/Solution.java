public class Solution {
	public int rotatedDigits(int N) {
		int i=1;
		int count=0;
		while (i<=N) {
			String str1 = Integer.toString(i);
            i++;
            if (str1.contains("4")|str1.contains("7")|str1.contains("3")) {
				continue;
			}else if (!(str1.contains("2")|str1.contains("5")|str1.contains("6")|str1.contains("9"))) {
				continue;
			}
			count++;
		}
		return count;
    }
}