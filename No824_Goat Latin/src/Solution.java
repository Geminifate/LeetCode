public class Solution {
	public String toGoatLatin(String S) {
        String[] str = S.split(" ");
        String ss="";
        String a="";
        for (int i = 0; i < str.length; i++) {
        	String tem=str[i].toLowerCase();
        	a=a+"a";
			if (tem.startsWith("a")|tem.startsWith("o")|tem.startsWith("e")|tem.startsWith("i")|tem.startsWith("u")) {
				ss=ss+str[i]+"ma"+a+" ";
			}else {
				char ch=str[i].charAt(0);
				str[i]=str[i].substring(1)+ch;
				ss=ss+str[i]+"ma"+a+" ";
			}
		}
        return ss.trim();
    }
}
