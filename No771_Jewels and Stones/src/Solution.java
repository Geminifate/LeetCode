public class Solution {
    public int numJewelsInStones(String J, String S) {
        int count=0;
	    char[] ch =J.toCharArray();
	    for (int i = 0; i < ch.length; i++) {
		    for (int k = 0; k < S.length(); k++) {
			    if (S.charAt(k)==ch[i]){
				    count++;
			    }
		    }
	    }   
	    return count;
    }
}