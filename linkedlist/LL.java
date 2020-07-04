package linkedlist;
import java.util.*;
public class LL {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	public static void display(Node head) {
		Node curren=head;
		while(curren!=null) {
			System.out.println(curren.data);
			curren=curren.next;
		}
	}
	public static boolean findLoop(Node head) {
		HashSet<Node> hash=new HashSet<Node>();
		Node curren=head;
		while(curren!=null) {
			if(hash.contains(curren)) 
				return true;
			hash.add(curren);
			curren.next=null;
		}
		return false;
	}
	public static void main(String[] args) {
		Node head=new Node(1);
		head.next=new Node(2);
		head.next.next=new Node(3);
		head.next.next.next=new Node(4);
		head.next.next.next.next=new Node(5);
		head.next.next.next.next.next=head.next.next;
		if(findLoop(head))
			System.out.println("Loop found.");
		else
			System.out.println("No Loop");
				
		//display(head);
	}
}
