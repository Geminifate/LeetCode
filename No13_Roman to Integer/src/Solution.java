public class Solution {
	public int romanToInt(String s) {
        char[] ss = s.toCharArray();
        int[] num = new int[ss.length];
        int sum=0;
        for (int i = 0; i < ss.length; i++) {
        	switch (ss[i]){
    		case 'I':
    			num[i]=1;
    			break;
    		case 'V':
    			num[i]=5;
    			break;
    		case 'X':
    			num[i]=10;
    			break;
    		case 'L':
    			num[i]=50;
    			break;
    		case 'C':
    			num[i]=100;
    			break;
    		case 'D':
    			num[i]=500;
    			break;
    		case 'M':
    			num[i]=1000;
    			break;
    		default:
    			break;
    		}
		}
        for (int i = 0; i < num.length; i++) {
			if (i!=num.length-1) {
        		if(num[i]<num[i+1]) {
    				sum=sum-num[i];
    				}else {
    					sum+=num[i];
    				}
			}else {
				sum+=num[i];
			}
		}
		return sum; 
    }
}
