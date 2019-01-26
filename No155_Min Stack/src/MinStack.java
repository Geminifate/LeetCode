import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinStack {
	private ArrayList<Integer> list;
	private ArrayList<Integer> list_min;
    /** initialize your data structure here. */
    public MinStack() {
    	list = new ArrayList();
    	list_min = new ArrayList();
    }
    
    public void push(int x) {
        list.add(x);
        list_min.add(x);
		Integer[] tem=list.toArray(new Integer[list_min.size()]);
		Arrays.sort(tem);
		list_min.clear();
		for (int i = 0; i < tem.length; i++) {
			list_min.add(tem[i]);
		}
    }
    
    public void pop() {
    	list_min.remove(list_min.indexOf(list.get(list.size()-1)));
        list.remove(list.size()-1);
    }
    
    public int top() {
        return list.get(list.size()-1);
    }
    
    public int getMin() {
    	return list_min.get(0);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */