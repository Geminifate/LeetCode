import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
    public int reverse(int x) {
        int i;
	    int u;
	    int count=0;
        if(x==0)
            return 0;
	    char[] y = Integer.toString(x).toCharArray();
	    for (int k =y.length-1; k>=0; k--) {
				if (y[k]=='0') {
					count++;
					continue;
				}else {
					break;
				}
			}
	        char[] z= new char[y.length-count];
	        if (y[0]=='-') {
				z[0]='-';
				i=1;
				u=1;
			}else{
				i=0;
				u=0;
			}
	        for (int j=y.length-1-count; j>=u; j--) {
	        	z[i]=y[j];
	        	i++;
			} 
	        long a = Long.parseLong(new String(z));
	        if (a>Integer.MAX_VALUE|a<Integer.MIN_VALUE) {
	        	return 0;
	        	}
	        return (int)a;
    }
}

public class MainClass {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int x = Integer.parseInt(line);
            
            int ret = new Solution().reverse(x);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}