
public class Solution {
	public int countPrimeSetBits(int L, int R) {
		int num=0;
        for (int i = L; i <=R; i++) {
        	String str= Integer.toBinaryString(i).replaceAll("0", "");
        	boolean status=true;
        	if (str.length()==1) {
				continue;
			}else if (str.length()==2) {
				num++;
				continue;
			}
        	for (int j =2; j < str.length(); j++) {
				if (str.length()%j==0) {
					status=false;
					break;
				}
			}
        	if (status) {
				num++;
			}
		}
        return num;
    }
}
