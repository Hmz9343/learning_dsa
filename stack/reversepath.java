package stack;
import java.util.*;
public class reversepath {
	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=null;
			right=null;
		}
	}
	static void display(Node root) {
		if(root==null)
			return;
		display(root.left);
		System.out.print(root.data+" ");
		display(root.right);
		
		
	}
	static void reverse(Node root,int key) {
		if(root==null) {
			return;
		}
		
	}
	static void inordertraversal(Node root) {
		if(root==null) {
			return;
		}
		Stack<Node> stack=new Stack<Node>();
		Node node=root;
		while(node!=null||stack.size()>0) {
			while(node!=null) {
				stack.push(node);
				node=node.left;
			}
			node=stack.pop();
			System.out.println(node.data+" ");
			node=node.right;
		}
	}
	static ArrayList<Node> postOrder(Node root){
			Stack<Node> stack=new Stack<Node>();
			Node node=root;
			while(true) {
				while(node!=null) {
					stack.push(node);
					node=node.left;
				}
				node=stack.pop();
				System.out.println(node.data);
				node=node.right;
			}
	}
	public static void main(String[] args) {
		Node root = new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(3); 
        root.left.left = new Node(4); 
        root.left.right = new Node(5); 
        root.right.left = new Node(6); 
        root.right.right = new Node(7); 
        root.left.left.left = new Node(8); 
        root.left.right.right = new Node(9); 
        root.right.right.left = new Node(10); 
        
        display(root);
	}
}
