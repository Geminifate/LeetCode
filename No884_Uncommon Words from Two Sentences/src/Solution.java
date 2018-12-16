import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

import javax.swing.event.TreeExpansionEvent;

public class Solution {
	public String[] uncommonFromSentences(String A, String B) {
        String[] str = (A+" "+B).split(" ");
        TreeMap<String,Integer> map = new TreeMap();
        TreeSet<String> set = new TreeSet();
        for (int i = 0; i < str.length; i++) {
        	if (map.containsKey(str[i])) {
				map.put(str[i],map.get(str[i])+1);
			}else {
				map.put(str[i],1);
			}
		}
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
		String key = it.next();
		if (map.get(key)==1) {
				set.add(key);
			}
		}
        return set.toArray(new String[0]);
    }
}
