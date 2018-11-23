public class Solution {
    public String countAndSay(int n) {
        String str =new String("11");
		int len;
		int count;
		char tem;
		if (n==1) {
			return "1";
		}else if (n==2) {
			return "11";
		}
		for (int i = 3; i <= n; i++) {
			count=1;
			len=str.length();
			tem=str.charAt(0);
			for (int j = 1; j < len; j++) {
				if (str.charAt(j)==tem) {
					count++;
					if (j==len-1) {
						str=str+count+tem;
					}
					continue;
				}else {
					str=str+count+tem;
					tem=str.charAt(j);
					count=1;
					if (j==len-1) {
						str=str+count+tem;
					}
				}
			}
			str=str.substring(len);
		}
		return str;
    }
}