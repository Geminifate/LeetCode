import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
	public int calPoints(String[] ops) {
		ArrayList<String> list = new ArrayList();
		int[] grades = new int[ops.length];
		int count=0;
		int index=0;
		for (int i = 0; i < ops.length; i++) {
			if (ops[i].equals("C")) {
				list.remove(list.size()-1);
				continue;
			}
			list.add(ops[i]);
		}
        for (int i = 0; i < list.size(); i++) {
        	switch (list.get(i)) {
			case "+":
				grades[index]=grades[index-1]+grades[index-2];
				break;
			case "D":
				grades[index]=grades[index-1]*2;
				break;
			default:
				grades[index]=Integer.parseInt(list.get(i));
				break;
			}
        	count+=grades[index];
        	index++;
        }
        return count;
    }
}
