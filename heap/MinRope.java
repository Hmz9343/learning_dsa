package heap;
import java.util.*;
public class MinRope {
	public static void main(String args[]) {
		PriorityQueue<Integer> rope=new PriorityQueue<Integer>();
		int arr[] = { 4, 3, 2, 6 }; 
        int size = arr.length;
        int i=0;
        while(i<size) {
        	rope.add(arr[i]);
        	i++;
        }
        int n1=0;
        int n2=0;
        int res=0;
        while(rope.size()>1) {
        	n1=rope.poll();
        	if(!rope.isEmpty()) {
        		n2=rope.poll();
        	}
        	int n3=n1+n2;
        	res+=n3;
        	rope.add(n3);
        }
        
        System.out.println(rope.peek());
        System.out.println(res);
        
	}
}
