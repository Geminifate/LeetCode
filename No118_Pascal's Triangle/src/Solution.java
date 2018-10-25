import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<List<Integer>> generate(int numRows) {
		//如果numRows为0
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if (numRows==0) {
			return list;
		}
		//如果numRows为1
		List<Integer> last = new ArrayList();
		last.add(1);
		list.add(last);
		//如果numRows大于1
		for (int i = 2; i <=numRows; i++) {
			List<Integer> next = new ArrayList();
			next.add(1);
			for (int j = 0; j < last.size()-1; j++) {
				if (numRows==2) {
					continue;
				}
				next.add(last.get(j)+last.get(j+1));
			}
			next.add(1);
			list.add(next);
			last=next;
		}
		return list;
    }
}
/**
 * 以下是Leetcode提供的答案
 */
 class Solution {
	    public List<List<Integer>> generate(int numRows) {
	        List<List<Integer>> triangle = new ArrayList<List<Integer>>();

	        // First base case; if user requests zero rows, they get zero rows.
	        if (numRows == 0) {
	            return triangle;
	        }

	        // Second base case; first row is always [1].
	        triangle.add(new ArrayList<>());
	        triangle.get(0).add(1);

	        for (int rowNum = 1; rowNum < numRows; rowNum++) {
	            List<Integer> row = new ArrayList<>();
	            List<Integer> prevRow = triangle.get(rowNum-1);

	            // The first row element is always 1.
	            row.add(1);

	            // Each triangle element (other than the first and last of each row)
	            // is equal to the sum of the elements above-and-to-the-left and
	            // above-and-to-the-right.
	            for (int j = 1; j < rowNum; j++) {
	                row.add(prevRow.get(j-1) + prevRow.get(j));
	            }

	            // The last row element is always 1.
	            row.add(1);

	            triangle.add(row);
	        }

	        return triangle;
	    }
	}