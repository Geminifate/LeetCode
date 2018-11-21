import java.util.Arrays;

public class Solution {
	public String reverseWords(String s) {
		String[] arr = s.split(" ");
		String ss="";
		char[] ch;
		char temp;
		for (int i = 0; i < arr.length; i++) {
			ch=arr[i].toCharArray();
			for (int j =0; j<ch.length/2 ; j++) {
				temp=ch[j];
				ch[j]=ch[ch.length-1-j];
				ch[ch.length-1-j]=temp;
			}
			ss=ss+String.copyValueOf(ch)+" ";
		}
		return ss.substring(0, ss.length()-1);
    }
}
