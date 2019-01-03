import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> letterCasePermutation(String S) {
    	List<String> list = new ArrayList<>();
    	ArrayList<Integer> index = new ArrayList();
    	S=S.toLowerCase();
    	list.add(S);
    	for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i)<='z'&&S.charAt(i)>='a') {
				index.add(i);
			}
		}
    	double num = Math.pow(2,index.size());
    	for (int i = 1; i < num; i++) {
    		char[] ss = S.toCharArray();
			int n = 1<<index.size()|i;
			char[] ch=Integer.toBinaryString(n).substring(1).toCharArray();
            System.out.println(Integer.toBinaryString(i));
			for (int j =ch.length-1; j>=0; j--) {
				if (ch[j]=='1') {
					ss[index.get(j)]=(char)(ss[index.get(j)]-32);
				}
			}
			String str =String.copyValueOf(ss);
			list.add(str);
		}
    	return list;
    }
}