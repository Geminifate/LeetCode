import java.util.ArrayList;
import java.util.TreeMap;

import org.w3c.dom.css.ElementCSSInlineStyle;

public class Solution {
    public boolean lemonadeChange(int[] bills) {
    	TreeMap<Integer,Integer> map = new TreeMap();
    	map.put(5,0);
    	map.put(10,0);
        for (int i = 0; i < bills.length; i++) {
			if (bills[i]==5) {
				map.put(5,map.get(5)+1);
			}else if (bills[i]==10&&map.get(5)>0) {
				map.put(5,map.get(5)-1);
				map.put(10,map.get(10)+1);
			}else if (bills[i]==20&&map.get(10)>0&&map.get(5)>0) {
					map.put(5,map.get(5)-1);
					map.put(10,map.get(10)-1);
			}else if (map.get(5)>2) {
					map.put(5,map.get(5)-3);
			}else {
					return false;
			}
		}
        return true;
    }
}