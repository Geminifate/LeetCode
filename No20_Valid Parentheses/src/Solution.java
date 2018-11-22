import java.util.ArrayList;
class Solution {
    public boolean isValid(String s) {
        ArrayList<Character> li = new ArrayList<Character>();
        for (int i = 0; i < s.length(); i++) {
        	if (li.isEmpty()) {
        		li.add(s.charAt(i));
        		continue;
			}
        	if ((int)s.charAt(i)-(int)li.get(li.size()-1)<=2 && (int)s.charAt(i)>(int)li.get(li.size()-1)) {
				if (li.size()==1) {
					li.clear();
				}else {
					li.remove(li.size()-1);
				}
			}else {
				li.add(s.charAt(i));
			}
        	
		}
        if (li.isEmpty()) {
			return true;
        }	
    return false;		
	}
}
