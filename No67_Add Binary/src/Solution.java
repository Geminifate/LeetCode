public class Solution {
    public String addBinary(String a, String b) {
    	String lo = a.length()>=b.length()?a:b;
		String sh = a.length()<b.length()?a:b;
    	int i=lo.length();
    	int j=sh.length();
    	int tem=0;
    	String str=new String();
    	while (i>0) {
    		i--;
    		j--;
    		int t;
    		if (j>=0) {
    			t=(int)lo.charAt(i)+(int)sh.charAt(j)+tem-96;
			}else {
				t=(int)lo.charAt(i)+tem-48;
			}
    		tem=t/2;
    		str=t%2+str;		
    	}
    	if (tem==1) {
    		str=1+str;
		}
    	return str;
    }
}