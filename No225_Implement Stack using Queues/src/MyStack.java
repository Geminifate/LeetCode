import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
	private Queue<Integer> queue1;
	private Queue<Integer> queue2;
    /** Initialize your data structure here. */
    public MyStack() {
        queue1 = new LinkedList<Integer>();
        queue2 = new LinkedList<Integer>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        queue1.offer(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
    	int answer=0;
        while (queue1.size()>1) {
			queue2.offer(queue1.poll());
		}
        if (queue1.size()==1) {
			answer=queue1.poll();
			while (queue2.size()>0) {
				queue1.offer(queue2.poll());
			}
		}
        return answer;
    }
    
    /** Get the top element. */
    public int top() {
    	int answer=0;
        while (queue1.size()>1) {
			queue2.offer(queue1.poll());
            
		}
        if (queue1.size()==1) {
			answer=queue1.peek();
			queue2.offer(queue1.poll());
			while (queue2.size()>0) {
				queue1.offer(queue2.poll());
			}
		} 
        return answer;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */