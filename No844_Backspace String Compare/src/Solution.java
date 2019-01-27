public class Solution {
    public boolean backspaceCompare(String S, String T) {
    	String s=check(S);
        String t=check(T);
        return t.equals(s);
    }

	private String check(String S) {
		// TODO Auto-generated method stub
		while (S.contains("#")) {
        	if (S.indexOf("#")==0) {
        		S=S.replaceFirst("#", "");
			}else {
				int t=S.indexOf("#")-1;
				S=S.replaceFirst(S.charAt(t)+"#", "");
			}
		}
        return S;
	}
}