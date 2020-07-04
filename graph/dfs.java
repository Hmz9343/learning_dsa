package graph;
import java.util.*;
public class dfs {
	int V;
	LinkedList<Integer> adjList[];
	
	public dfs(int V) {
		V=this.V;
		adjList=new LinkedList[V];
		for(int i=0;i<V;i++) {
			adjList[i]=new LinkedList<Integer>();
		}
	}
	
	void addEdge(int source,int destination) {
		adjList[source].add(destination);
		adjList[destination].add(source);
	}
	void DFS(int source) {
		boolean visited[]=new boolean[V];
		//visited[source]=true;
		DFSUtil(source,visited);
	}
	void DFSUtil(int source,boolean visited[]) {
		
		Iterator<Integer> i=adjList[source].listIterator();
		visited[source]=true;
		while(i.hasNext()) {
			
			i=i.next();
		}
		
		
	}
	public static void main(String[] args) {
		
	}
}
