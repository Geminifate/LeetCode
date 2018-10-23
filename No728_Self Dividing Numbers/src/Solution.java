import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList();
        for (int i = left; i <=right; i++) {
        	list.add(i);
        }
        int num;
        int d;
        for (int i = right; i >=left; i--) {
        	d=i;
        	while(d!=0){
				num=d%10;
				if (num==0) {
					list.remove(i-left);
					break;
				}else if (i%num!=0) {
					list.remove(i-left);
					break;
				}
				d=d/10;
			}
		}
        return list;
    }
}
