import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Solution {
	public List<String> subdomainVisits(String[] cpdomains) {
		List<String> list = new ArrayList();
        Map<String,Integer> map = new HashMap();
        int val;
        String key;
        int index;
        for (int i = 0; i < cpdomains.length; i++) {
        	index=cpdomains[i].lastIndexOf('.');
        	val=Integer.parseInt(cpdomains[i].substring(0,cpdomains[i].indexOf(' ')));
			for(int j = 0; j <cpdomains[i].split("\\.").length; j++) {
				key=cpdomains[i].substring(index+1);
                System.out.println(key);
				if (map.containsKey(key)) {
					map.put(key,map.get(key)+val);
				}else {
					map.put(key, val);
				}
				if (index!=cpdomains[i].indexOf('.')) {
					index=cpdomains[i].substring(0,index).lastIndexOf('.');
					continue;
				}
				index=cpdomains[i].indexOf(' ');
				System.out.println(key+" "+val);
			}
		}
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
        	key=it.next();
			list.add(map.get(key)+" "+key);			
		}
        return list;
    }
	
}
