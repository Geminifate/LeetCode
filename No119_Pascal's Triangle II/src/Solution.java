import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<Integer> getRow(int rowIndex) {
		List<Integer> list = new ArrayList();
		list.add(0);
		list.add(1);
		list.add(0);
        if (rowIndex==0) {
			return list.subList(1, list.size()-1);
		}
        for (int i = 1; i <= rowIndex; i++) {
			ArrayList<Integer> li = new ArrayList();
			li.addAll(0, list);
			list.clear();
			list.add(0);
			for (int j = 0; j < li.size()-1; j++) {
				list.add(li.get(j)+li.get(j+1));
			}
			list.add(0);
		}
        return list.subList(1, list.size()-1);
    }
}
