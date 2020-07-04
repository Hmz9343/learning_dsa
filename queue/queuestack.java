package queue;
import java.util.LinkedList;
import java.util.Queue;
public class queuestack {
	Queue<Integer> queue=new LinkedList<Integer>();
	public void push_stack(int item) {
		int size=queue.size();
		queue.add(item);
		while(size-->0) {
			int x=queue.remove();
			queue.add(x);
		}
	}
	public int pop_stack() {
		int item=queue.remove();
		return item;
	}
	public static void main(String[] args) {
		queuestack stack=new queuestack();
		stack.push_stack(1);
		stack.push_stack(2);
		stack.push_stack(3);
		
		System.out.println(stack.pop_stack());
		System.out.println(stack.pop_stack());
		
	}
}
