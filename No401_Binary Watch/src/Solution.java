import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> readBinaryWatch(int num) {
    	List<String> list = new ArrayList();
        for (int i =0; i < 1024; i++) {
			String str = Integer.toBinaryString(1 << 10 | i).substring(1);
			String ss = str.replaceAll("0", "");
			if (ss.length()==num) {
				int hour=Integer.parseInt(str.substring(0, 4),2);
				int min=Integer.parseInt(str.substring(4),2);
				if (min<10) {
					ss=hour+":0"+min;
				}else {
					ss=hour+":"+min;
				}
				if (hour<12&&min<60) {
					list.add(ss);
				}
			}
		}
       return list;
    }
}