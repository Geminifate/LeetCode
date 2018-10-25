
public class Solution {
	public int getSum(int a, int b) {
		int num1 = a^b;
        int num2 = (a&b)<<1;
        if (num2!=0) {
    	     num1=getSum(num1,num2);
        }
        return num1; 
    }
}
