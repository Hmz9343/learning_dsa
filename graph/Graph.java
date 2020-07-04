package graph;
import java.util.*;
public class Graph {
	
	int V;
	LinkedList<Integer> adjList[];
	
	public Graph(int V) {
		V=this.V;
		adjList=new LinkedList[V];
		for(int i=0;i<V;i++) {
			adjList[i]=new LinkedList();
		}
	}
	
	void addEdge(int source,int destination) {
		adjList[source].add(destination);
		adjList[destination].add(source);
	}
	 
	void display() {
		
		for(int i=0;i<V;i++) {
			System.out.println("Adjacency List of list:"+i);
			Iterator<Integer> itr=adjList[i].listIterator();
			while(itr.hasNext()) {
				int n=(int)itr.next();
				System.out.print(n+" ");
			}
			System.out.println();
			}
	}

	public static void main(String[] args) {
		 Graph g = new Graph(4); 
		  
	        g.addEdge(0, 1); 
	        g.addEdge(0, 2); 
	        g.addEdge(1, 2); 
	        g.addEdge(2, 0); 
	        g.addEdge(2, 3); 
	        g.addEdge(3, 3); 
	        
		
	}
}
