import java.util.HashSet;
import java.util.Set;

public class Solution {
	public int uniqueMorseRepresentations(String[] words) {
		HashSet<String> MR = new HashSet();
		String[] str ={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		char[] ch;
		
		for (int j = 0; j < words.length; j++) {
			String ss=null;
			ch=words[j].toCharArray();
			for (int i= 0; i < ch.length; i++) {
				ss=ss+str[ch[i]-97];
			}
			System.out.println(ss);
			MR.add(ss);
		}
		return MR.size();
    }
	public static void main(String[] args) {
		Solution s =new Solution();
		String[] words= {"gin", "zen", "gig", "msg"};
		s.uniqueMorseRepresentations(words);
		
	}
}
