import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;
import java.util.TreeSet;

public class Solution {
    public String reverseVowels(String s) {
    	String str = "aoeiuAOEIU";
        ArrayList<Integer> index = new ArrayList();
        ArrayList<Character> val = new ArrayList();
        TreeMap<Integer,Character> map =new TreeMap();
        for (int i = 0; i < s.length(); i++) {
			if (str.contains(""+s.charAt(i))) {
				index.add(i);
				val.add(s.charAt(i));
			}
		}
        char[] ch =s.toCharArray();
        for (int i = 0; i < index.size(); i++) {
			ch[index.get(i)]=val.get(val.size()-1-i);
		}
        return new String(ch,0,ch.length);
    }
}