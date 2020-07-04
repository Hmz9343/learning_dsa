package stack;

import java.util.*;
public class reverse {
	static Stack<Integer> stack=new Stack<>();
	static void push_at_bottom(int item) {
		if(stack.isEmpty()){
			stack.push(item);
		}else {
			int x=stack.peek();
			stack.pop();
			push_at_bottom(item);
			stack.push(x);
		}
	}
	static void reverse() {
		if(!stack.isEmpty()) {
			int x=stack.peek();
			stack.pop();
			reverse();
			push_at_bottom(x);
		}
	}
	public static void main(String[] args) {
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println(stack);
		//push_at_bottom(5);
		reverse();
		System.out.println(stack);
		
	}
}
