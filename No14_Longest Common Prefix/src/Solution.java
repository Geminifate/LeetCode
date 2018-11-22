
public class Solution {
	public String longestCommonPrefix(String[] strs) {
        if (strs.length==0) {
        	return "";
        }
        int len=strs[0].length();
        int l=0;
        
        for (int i = 0; i < strs.length; i++) {
        	if(len>strs[i].length()) {
        		len=strs[i].length();
        		l=i;
        	}
        }
        String str=strs[l];
        boolean status=true;
        int count=0;
        while(status) {
        	for (int j = 0; j < strs.length; j++) {
        		if(!strs[j].startsWith(str)) {
        			str=str.substring(0,str.length()-1);
        			break;
					}
        		count++;
        		if(count==strs.length) {
        			status=false;
        			return str;
				}
        	}
		count=0;
        }
	return "0"; 
    }
}
