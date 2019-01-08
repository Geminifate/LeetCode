public class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
    	int count=minutesToTest/minutesToDie+1;
    	int res=(int)(Math.log10(buckets)/Math.log10(count));
    	if ((Math.log10(buckets)%Math.log10(count))==0) {
			return res;
		}
        return res+1;
    }
}