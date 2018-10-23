
public class Solution {
	public int addDigits(int num) {
        if (num<10) {
			return num;
		}
		int count=0;
		while (num!=0) {
			count=count+num%10;
			num=num/10;
		}
		count=addDigits(count);
		return count;
    }
}
