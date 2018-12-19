import java.util.TreeMap;

public class Solution {
	public int numberOfBoomerangs(int[][] points) {
		int count=0;
		TreeMap<Double,Integer> map;
        for (int i = 0; i < points.length; i++) {
        	map = new TreeMap();
			for (int j = i+1; j < points.length; j++) {
				double a = Math.pow(points[i][0]-points[j][0],2)+Math.pow(points[i][1]-points[j][1],2);
				if (map.containsKey(a)) {
					map.put(a, map.get(a)+1);
					if (map.get(a)==2) {
						count+=2;
					}else {
						count+=2*(map.get(a)-1);
					}
				}else {
					map.put(a, 1);
				}
			}
		}
        return count;
    }
}
