import java.util.TreeSet;

public class Solution {
	public int distributeCandies(int[] candies) {
		TreeSet<Integer> set = new TreeSet();
		for (int i = 0; i < candies.length; i++) {
			set.add(candies[i]);
		}
		if (set.size()>(candies.length/2)) {
			return candies.length/2;
		}
		return set.size();
    }
}
