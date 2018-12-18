import java.util.ArrayList;

public class Solution {
	public String[] reorderLogFiles(String[] logs) {
		ArrayList<String> nums = new ArrayList();
        ArrayList<String> alph = new ArrayList();
        for (int i = 0; i < logs.length; i++) {
			String[] str1 = logs[i].split(" ");
			if (str1[1].charAt(0)<='9'&&str1[1].charAt(0)>='0') {
				nums.add(logs[i]);
				continue;
			}else{
				alph.add(logs[i]);
			}
		}
        for (int i = 0; i < alph.size()-1; i++) {
        	String a = alph.get(i).substring(alph.get(i).indexOf(" "));
        	String tem;
        	String s;
        	for (int j = i+1; j < alph.size(); j++) {
    			s = alph.get(j).substring(alph.get(j).indexOf(" "));
    			if (s.compareTo(a)<=0) {  
    				tem=alph.get(j);
    				alph.set(j, alph.get(i));
    				alph.set(i, tem);
    			}
                a = alph.get(i).substring(alph.get(i).indexOf(" "));
    		} 
		}
        alph.addAll(nums);
        return alph.toArray(new String[0]);
    }
}