package hashing;
import java.util.HashMap;

public class verticalOrderTree {
		static class Node{
			int data; 
			Node left,right;
			Node(int data){
				this.data=data;
				left=null;
				right=null;
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
		        root.right.left.right = new Node(8); 
		        root.right.right.right = new Node(9); 
		}
}
