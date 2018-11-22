public class Solution {
    public boolean isPalindrome(int x) {
        if (x<0) {
        	return false;
        }else if (x==0) {
        	return true;
        }else if (x>0) {
        	char a;
        	int j =0;
        	char[] y= Integer.toString(x).toCharArray();
        	char[] z= new char[y.length];
        	for (int i = y.length-1; i >=0 ; i--) {
        		z[j]=y[i];
        		j++;
        	}
        	for (int  k =0; k<y.length ;k++) {
        		if (y[k]!=z[k]) {
				return false;
			}
		}
	}    
    return true;
    }
}