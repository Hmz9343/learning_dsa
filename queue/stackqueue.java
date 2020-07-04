package queue;
import java.util.*;
public class stackqueue {
	Stack<Integer> stack1=new Stack<Integer>();
	Stack<Integer> stack2=new Stack<Integer>();
	public void enqueue(int x) {
			stack1.push(x);
	}
	public int dequeue() {
		if(stack2.isEmpty()&&stack1.isEmpty()) {
			return -1;
		}
		if(stack2.isEmpty()&&!stack1.isEmpty()) {
			while(!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		System.out.println("Size of Stack:"+stack1.size()+" "+stack2.size());
		int item =stack2.pop();
		return item;
	}
	public static void main(String[] args) {
		stackqueue queue=new stackqueue();
		queue.enqueue(100);
		queue.enqueue(12);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		
		
	}
}
