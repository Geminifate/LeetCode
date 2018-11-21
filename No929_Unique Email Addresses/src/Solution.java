import java.util.TreeSet;

public class Solution {
	public int numUniqueEmails(String[] emails) {
		//取出“。”
		//忽略“+”后面的内容
		TreeSet<String> set = new TreeSet();
		String str;
        for (int i = 0; i < emails.length; i++) {
        	str=emails[i].substring(emails[i].indexOf('@'));
        	emails[i]=emails[i].substring(0, emails[i].indexOf('@'));
			if (emails[i].contains(".")) {
				emails[i]=emails[i].replaceAll("\\.", "");
			}
            if (emails[i].contains("+")) {
				emails[i]=emails[i].substring(0, emails[i].indexOf('+'));
			}   
            str=emails[i]+str;
			set.add(str);
		}
        return set.size();
    }
}
